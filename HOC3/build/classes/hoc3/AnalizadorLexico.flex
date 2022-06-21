package hoc3;
import java_cup.runtime.*;
import java.io.Reader;

%% //Inicio
%class AnalizadorLexico
%line // Habilita contador de lineas
%column //Contador de columnas
%char //Contador de caracteres
%cup //Compatibilidad con java cup

//Lo siguiente sera parte de la clase analizador lexico
%{
    public SymbolHoc s;//nodo
    public int TipSimb;//que tipo de simbolo
    
    TablaSimbolos ListaSimb = new TablaSimbolos();
    /*Se crean objetos de tipo Symbol*/
    private Symbol symbol(int type){//token
        return new Symbol(type, yyline, yycolumn);//token y lexema
    }
    private Symbol symbol(int type, Object value){//requiere el valor del atributo
        return new Symbol(type, yyline, yycolumn,value);//lexemas y atributos
    }
%}

//Definicione regulares
Letra=[a-zA-Z]
Digito=[0-9]
%%

//Expresiones regulares
[ \t\n]+                          { ;}//descartamos
";"                             {return symbol(AnalizadorSintacticoSym.SEMIC);}
{Digito}+(\.{Digito}+)?         {return symbol(AnalizadorSintacticoSym.NUM,new Float(yytext()));}
"="                             {return symbol(AnalizadorSintacticoSym.OpAsig);}
"/"                             {return symbol(AnalizadorSintacticoSym.OpDiv);}
"*"                             {return symbol(AnalizadorSintacticoSym.OpProd);}
"-"                             {return symbol(AnalizadorSintacticoSym.OpResta);}
"+"                             {return symbol(AnalizadorSintacticoSym.OpSuma);}
")"                             {return symbol(AnalizadorSintacticoSym.ParDer);}
"("                             {return symbol(AnalizadorSintacticoSym.ParIzq);}
\^                             {return symbol(AnalizadorSintacticoSym.OpPotencia);}//operador
{Letra}({Letra}|{Digito})*  {
                                s = ListaSimb.lookup(yytext());
                                if(s == null)//Se agrega como var no inicializada
                                    s = ListaSimb.install(yytext(),EnumTipoSymbol.UNDEF,(float)0.0);
                                switch(s.TipoSymbol){
                                case UNDEF:
                                        TipSimb = AnalizadorSintacticoSym.VAR;
                                        break;
                                case VAR: 
                                        TipSimb = AnalizadorSintacticoSym.VAR;
                                        break;
                                case BLTIN:
                                        TipSimb = AnalizadorSintacticoSym.BLTIN;
                                        break;
                                case CONST_PREDEF:
                                        TipSimb = AnalizadorSintacticoSym.CONST_PRED;
                                        break;
                                }return symbol(TipSimb, s);//Return Token, Objeto s
}

. {return symbol(AnalizadorSintacticoSym.error);}