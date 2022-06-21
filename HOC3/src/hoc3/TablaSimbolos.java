package hoc3;
//Manejar e implementar la lista(Buscar-Agregar) 

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TablaSimbolos {

    List<SymbolHoc> ListaSimbolos;//SymbolHoc Nodos

    public TablaSimbolos() {
        ListaSimbolos = new LinkedList<>();
        //Se inicializa
        this.init();//Agrega a la lista los nodos correspondientes a la lista const-funpredef
    }

    public SymbolHoc lookup(String name) {//Funcion de busqueda
        SymbolHoc s;
        Iterator it = ListaSimbolos.iterator();
        while (it.hasNext()) {//recorremos la lista
            s = (SymbolHoc) it.next();
            if (s.name.equals(name)) {
                return s;
            }
        }
        return null;
    }
//Agregar un nodo con las caract de name type val - VAR UNDEF CONST

    public SymbolHoc install(String name, EnumTipoSymbol type, float val) {
        SymbolHoc s;
        s = new SymbolHoc();
        s.SetSymbol(name, type, val);
        ListaSimbolos.add(s);
        return s;
    }
//Agregar Nodo Func Predefinida

    public SymbolHoc install(String name, EnumTipoSymbol type, EnumBLTIN funcPredef) {
        SymbolHoc s;
        s = new SymbolHoc();
        s.SetSymbol(name, type, funcPredef);
        ListaSimbolos.add(s);
        return s;
    }

    private void init() {
        ListaSimbolos.clear();
        InitConstPredef();
        InitFuncPredef();
    }

    private void InitConstPredef() {
        SymbolHoc s;
        float val;
        //Agregamos constantes
        //Pi
        s = new SymbolHoc();
        val = (float) 3.141592653589;
        s.SetSymbol("PI", EnumTipoSymbol.CONST_PREDEF, val);
        ListaSimbolos.add(s);
        //e
        s = new SymbolHoc();
        val = (float) 2.71828128459;
        s.SetSymbol("E", EnumTipoSymbol.CONST_PREDEF, val);
        ListaSimbolos.add(s);
        //Gamma
        s = new SymbolHoc();
        val = (float) 0.577221564901;
        s.SetSymbol("GAMMA", EnumTipoSymbol.CONST_PREDEF, val);
        ListaSimbolos.add(s);
        //Gamma
        s = new SymbolHoc();
        val = (float) 57.2957795130;
        s.SetSymbol("DEG", EnumTipoSymbol.CONST_PREDEF, val);
        ListaSimbolos.add(s);
        //Phi
        s = new SymbolHoc();
        val = (float) 1.6180334989;
        s.SetSymbol("PHI", EnumTipoSymbol.CONST_PREDEF, val);
        ListaSimbolos.add(s);
    }
    //Funciones predefinidas BLTIN
    private void InitFuncPredef(){
        SymbolHoc s;
        
        s = new SymbolHoc();
        s.SetSymbol("sin", EnumTipoSymbol.BLTIN, EnumBLTIN.SIN);
        ListaSimbolos.add(s);
        
        s = new SymbolHoc();//Instancia
        s.SetSymbol("cos", EnumTipoSymbol.BLTIN, EnumBLTIN.COS);
        ListaSimbolos.add(s);
        
        s = new SymbolHoc();
        s.SetSymbol("atan", EnumTipoSymbol.BLTIN, EnumBLTIN.ATAN);
        ListaSimbolos.add(s);
        
        s = new SymbolHoc();
        s.SetSymbol("log", EnumTipoSymbol.BLTIN, EnumBLTIN.LOG);
        ListaSimbolos.add(s);
        
        s = new SymbolHoc();
        s.SetSymbol("log10", EnumTipoSymbol.BLTIN, EnumBLTIN.LOG10);
        ListaSimbolos.add(s);
        
        s = new SymbolHoc();
        s.SetSymbol("exp", EnumTipoSymbol.BLTIN, EnumBLTIN.EXP);
        ListaSimbolos.add(s);
        
        s = new SymbolHoc();
        s.SetSymbol("sqrt", EnumTipoSymbol.BLTIN, EnumBLTIN.SQRT);
        ListaSimbolos.add(s);
        
        s = new SymbolHoc();
        s.SetSymbol("int", EnumTipoSymbol.BLTIN, EnumBLTIN.INT);
        ListaSimbolos.add(s);
        
        s = new SymbolHoc();
        s.SetSymbol("abs", EnumTipoSymbol.BLTIN, EnumBLTIN.ABS);
        ListaSimbolos.add(s);
    }
}
