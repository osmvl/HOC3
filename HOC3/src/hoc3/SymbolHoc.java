package hoc3;
//Especificacion del nodo
public class SymbolHoc {

    public String name;//Nombre del simbolo cos sin pi...
    //Bandera que indique de lo que esta guardado en el nodo
    public EnumTipoSymbol TipoSymbol;//VAR, UNDEF, BLTIN, const_predef
    public float val;//Variable constante
    public EnumBLTIN FuncPredef;//Campo funcion predefinida

    public SymbolHoc() {//Inicializar
        name = "";
        val = 0;
    }

    public SymbolHoc(String nombre, EnumTipoSymbol TipSimbolo, float valor) {
        name = nombre;//nombre nodo PI SEN COS
        TipoSymbol = TipSimbolo;//var, undef o contante predef
        val = valor;//
    }

    public SymbolHoc(String nombre, EnumTipoSymbol TipSimbolo, EnumBLTIN func) {
        name = nombre;//nombre nodo
        TipoSymbol = TipSimbolo;//var, undef o contante predef
        FuncPredef = func;//
    }
//Objeto creado
    public void SetSymbol(String nombre, EnumTipoSymbol TipSimbolo, float valor) {
        name = nombre;
        TipoSymbol = TipSimbolo;
        val = valor;
    }
    
    public void SetSymbol(String nombre, EnumTipoSymbol TipSimbolo, EnumBLTIN func) {
        name = nombre;
        TipoSymbol = TipSimbolo;
        FuncPredef = func;
    }
}
