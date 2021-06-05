package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char

L=[a-zA-Z_]+
L2 = [a-zA-ZáéíóúÁÉÍÓÚñÑÜü]
D=[0-9]+
NUMERO = {D}+
Decimal = {D}+ "." {D}+
CaracterVariado = {L2}*{D}*
correo = {CaracterVariado}* "@" {L2}+"."{L2}+"."{L2}+
TEXTO_GENERAL = {L}+  |  {L}+ " " {L}+ 
Comilla = "\"" | "&quot;" 
espacio=[ ,\t,\r,\n]+

%{
    private Symbol symbol (int type, Object value){
        return new Symbol (type, yyline, yycolumn, value);
    }

    private Symbol symbol (int type){
        return new Symbol (type, yyline, yycolumn);
    }
%}
%%

"INI_HTML" {return new Symbol (sym.INICIO_HTML, yychar, yyline, yytext());}
"ENCABEZADO_INI" {return new Symbol(sym.INICIO_ENCABEZADO, yychar, yyline, yytext());}
"TIT" { return new Symbol (sym.TITULO, yychar, yyline, yytext());}
"TIT_FIN" {return new Symbol(sym.FINAL_TITULO, yychar, yyline, yytext());}
"ENCABEZADO_FIN" {return new Symbol(sym.FINAL_ENCABEZADO, yychar, yyline, yytext());}
"TABLA_IN" {return new Symbol(sym.INICIO_TABLA, yychar, yyline, yytext());}
"CUERPO_INI" {return new Symbol(sym.INICIO_CUERPO, yychar, yyline, yytext());}
"FILA COLUMNA" {return new Symbol(sym.FILA_INICIO, yychar, yyline, yytext());}
"FILA_FIN" {return new Symbol ( sym.FINAL_FILA, yychar, yyline, yytext());}
"COLUMNA" {return new Symbol(sym.COLUMNA, yychar, yyline, yytext());}
"COLUMNA_FIN" {return new Symbol(sym.COLUMNA_FIN, yychar, yyline, yytext());}
"TABLA_FIN" {return new Symbol(sym.FINAL_TABLA, yychar, yyline, yytext());}
"NEGRITA" {return new Symbol(sym.TEXTO_FUERTE, yychar, yyline, yytext());}
"NEGRITA_FIN" {return new Symbol(sym.TEXTO_FUERTE_FIN, yychar, yyline, yytext());}   
"LISTA_IN" {return new Symbol(sym.INICIO_LISTA, yychar, yyline, yytext());}
"ENLACE" {return new Symbol (sym.ENLACE_WEB, yychar, yyline, yytext());}
"IMAGEN_IN" {return new Symbol ( sym.INICIO_IMAGEN, yychar, yyline, yytext());}
"NOMBRE" {return new Symbol (sym.NOMBRE_ELEMENTO, yychar, yyline, yytext());}
"ANCHO" {return new Symbol(sym.MEDIDA_ANCHO, yychar, yyline, yytext());}
"ALTURA" {return new Symbol (sym.MEDIDA_ALTURA, yychar, yyline, yytext());}
"IMAGEN_FIN" {return new Symbol (sym.FINAL_IMAGEN, yychar, yyline, yytext());}
"FIN_HTML" {return new Symbol (sym.FINAL_HTML, yychar, yyline, yytext());}
"LINEA_DIVISORA" {return new Symbol (sym.LINEA_DIVISORA, yychar, yyline, yytext());}
"ETIQUETA_INI" {return new Symbol (sym.INICIO_ETIQUETA, yychar, yyline, yytext());}
"ETIQUETA_FIN" {return new Symbol (sym.FINAL_ETIQUETA, yychar, yyline, yytext());}
"BORDE" {return new Symbol(sym.BORDE_TABLA, yychar, yyline, yytext());}
"CUERPO_FIN" {return new Symbol(sym.FINAL_CUERPO, yychar, yyline, yytext());}
"LISTA_FIN" {return new Symbol (sym.FINAL_LISTA, yychar, yyline, yytext());}
"SALTO_LINEA" {return new Symbol (sym.SALTO_LINEA, yychar, yyline, yytext());}
"DIALOGO_INI" {return new Symbol (sym.INICIO_DIALOGO, yychar, yyline, yytext());}
"DIALOGO_FIN" {return new Symbol (sym.FINAL_DIALOGO, yychar, yyline, yytext());}
"PARRAFO_INI" {return new Symbol (sym.INICIO_PARRAFO, yychar, yyline, yytext());}
"PARRAFO_FIN" {return new Symbol (sym.FINAL_PARRAFO, yychar, yyline, yytext());}
"E_LISTA_INI" {return new Symbol (sym.INICIO_ELEMENTO_LISTA, yychar, yyline, yytext());}
"E_LISTA_FIN" {return new Symbol (sym.FINAL_ELEMENTO_LISTA, yychar, yyline, yytext());}
"MENU_INI" {return new Symbol (sym.INICIO_MENU, yychar, yyline, yytext());}
"MENU_FIN" {return new Symbol (sym.FINAL_MENU, yychar, yyline, yytext());}
{NUMERO} {return new Symbol (sym.NUMERO_ENTERO, yychar, yyline, yytext());}
{Decimal} {return new Symbol (sym.NUMERO_DECIMAL, yychar, yyline, yytext());}
{correo} {return new Symbol (sym.CORREO_ELECTRONICO, yychar, yyline, yytext());}
{TEXTO_GENERAL} {return new Symbol (sym.CADENA_NO_ESPECIFICA, yychar, yyline, yytext());}
{Comilla} {return new Symbol(sym.Comilla, yychar, yyline, yytext());}
 ( "www" "." {L}+ "." {L}+ ) | 
 ( "www" "." {L}+ "." {L}+ "/" {L}+ "." {L}+)  {return new Symbol(sym.URL, yychar, yyline, yytext());}
"(" {return new Symbol(sym.PARENTESIS_APERTURA, yychar, yyline, yytext());}
")" {return new Symbol(sym.PARENTESIS_CIERRE, yychar, yyline, yytext());}
"*" {return new Symbol(sym.SIGNO_MULTIPLICACION, yychar, yyline, yytext());}
"+" {return new Symbol (sym.SIGNO_SUMA, yychar, yyline, yytext());}
"-" {return new Symbol (sym.SIGNO_RESTA, yychar, yyline, yytext());}
";" {return new Symbol (sym.PUNTO_COMA, yychar, yyline, yytext());}
"=" {return new Symbol (sym.SIGNO_IGUAL, yychar, yyline, yytext());}
":" {return new Symbol (sym.DOS_PUNTOS, yychar, yyline, yytext());}

{espacio} {/*Ignore*/}
 . {return new Symbol (sym.Error, yychar, yyline, yytext());}