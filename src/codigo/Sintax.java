
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintax extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\025\000\002\002\004\000\002\002\003\000\002\014" +
    "\006\000\002\015\005\000\002\017\005\000\002\016\005" +
    "\000\002\016\005\000\002\020\005\000\002\024\005\000" +
    "\002\005\005\000\002\007\006\000\002\006\006\000\002" +
    "\023\003\000\002\004\005\000\002\021\006\000\002\022" +
    "\003\000\002\022\003\000\002\022\003\000\002\022\003" +
    "\000\002\022\003\000\002\022\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\027\000\004\004\004\001\002\000\004\005\011\001" +
    "\002\000\004\002\000\001\002\000\004\002\007\001\002" +
    "\000\004\002\001\001\002\000\006\012\020\062\017\001" +
    "\002\000\004\006\012\001\002\000\004\040\015\001\002" +
    "\000\004\010\014\001\002\000\006\012\ufffe\062\ufffe\001" +
    "\002\000\004\007\016\001\002\000\004\010\ufffd\001\002" +
    "\000\004\064\025\001\002\000\006\012\020\062\017\001" +
    "\002\000\004\031\022\001\002\000\004\002\uffff\001\002" +
    "\000\004\033\024\001\002\000\006\031\ufffc\033\ufffc\001" +
    "\002\000\004\040\030\001\002\000\004\063\027\001\002" +
    "\000\006\031\ufffb\033\ufffb\001\002\000\004\065\031\001" +
    "\002\000\004\063\ufffa\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\027\000\006\002\005\014\004\001\001\000\004\015" +
    "\007\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\016\020\001\001\000\004\017\012\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\020\025\001" +
    "\001\000\004\016\022\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    
    public String resultado="";
    private Symbol s;
    
    public void syntax_error(Symbol s){
        //this.s = s;
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
        
        
    }

    public Symbol getS(){
        return this.s;
}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action_part00000000(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIAL EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIAL ::= ESTRUCTURA_HTML 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIAL",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // ESTRUCTURA_HTML ::= INICIO_HTML ENCABEZADO ESTRUCTURA_CUERPO FINAL_HTML 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
                                    resultado = "<HTML>\n" + String.valueOf(b) + "</HTML> \n"; 
                                
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA_HTML",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // ENCABEZADO ::= INICIO_ENCABEZADO ESTRUCTURA_TITULO FINAL_ENCABEZADO 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
                                   RESULT = "<head> \n" + String.valueOf(c) + "</head> \n";
                                
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ENCABEZADO",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // ESTRUCTURA_TITULO ::= TITULO CADENA_NO_ESPECIFICA FINAL_TITULO 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		
                RESULT = "<title> \n" + String.valueOf(a) + "</title> \n";
            
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA_TITULO",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // ESTRUCTURA_CUERPO ::= INICIO_CUERPO ESTRUCTURA_CUERPO FINAL_CUERPO 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		
                RESULT = "<body> \n" + String.valueOf(a) + "</body> \n";
            
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA_CUERPO",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // ESTRUCTURA_CUERPO ::= INICIO_DIALOGO ESTRUCTURA_PARRAFO FINAL_DIALOGO 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		
                RESULT = "<dialog> \n" + String.valueOf(a) + "</dialog>";
            
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA_CUERPO",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // ESTRUCTURA_PARRAFO ::= INICIO_PARRAFO CADENA_NO_ESPECIFICA FINAL_PARRAFO 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
                RESULT = "<p> \n" + String.valueOf(c) + "</p> \n";
            
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA_PARRAFO",14, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // ESTRUCTURA_ETIQUETA ::= INICIO_ETIQUETA CADENA_NO_ESPECIFICA FINAL_ETIQUETA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
                RESULT = "<label> \n" + String.valueOf(b) + "</label> \n";
            
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA_ETIQUETA",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // ESTRUCTURA_TABLA ::= INICIO_TABLA ESTRUCTURA_FILA FINAL_TABLA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
                RESULT = "<table> \n" + String.valueOf(b) + "</table> \n";
            
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA_TABLA",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // ESTRUCTURA_FILA ::= FILA_INICIO ESTRUCTURA_COLUMNA FINAL_FILA ESTRUCTURA_TABLA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		
                RESULT = "<tr> \n" + String.valueOf(b) + "</tr> \n" + String.valueOf(c);
            
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA_FILA",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // ESTRUCTURA_COLUMNA ::= COLUMNA CONTENIDO COLUMNA_FIN ESTRUCTURA_FILA 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
                RESULT = "<td> \n"+ String.valueOf(b)  + "</td>" + String.valueOf(c);
            
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA_COLUMNA",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // LINEA ::= LINEA_DIVISORA 
            {
              Object RESULT =null;
		 RESULT = "<hr> \n"; 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LINEA",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // LISTA ::= INICIO_LISTA ESTRUCTURA_LISTA FINAL_LISTA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
                    RESULT = "<ol> \n" + String.valueOf(b) + "</ol> \n";
                
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LISTA",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // ESTRUCTURA_LISTA ::= INICIO_ELEMENTO_LISTA CADENA_NO_ESPECIFICA FINAL_ELEMENTO_LISTA LISTA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		
                    RESULT = "<li> " + String.valueOf(b) + "</li> \n" + String.valueOf(d);
                
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA_LISTA",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // CONTENIDO ::= CADENA_NO_ESPECIFICA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONTENIDO",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // CONTENIDO ::= NUMERO_DECIMAL 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONTENIDO",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // CONTENIDO ::= NUMERO_ENTERO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONTENIDO",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // CONTENIDO ::= CORREO_ELECTRONICO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONTENIDO",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // CONTENIDO ::= URL 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONTENIDO",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // CONTENIDO ::= ENLACE_WEB 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONTENIDO",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintax$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
              return CUP$Sintax$do_action_part00000000(
                               CUP$Sintax$act_num,
                               CUP$Sintax$parser,
                               CUP$Sintax$stack,
                               CUP$Sintax$top);
    }
}

}
