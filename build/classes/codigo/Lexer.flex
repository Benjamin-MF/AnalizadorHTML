package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L = [a-zA-Z]
L2 = [a-zA-ZáéíóúÁÉÍÓÚñÑÜü]
D = [0-9]

TEXTO_GENERAL = {L}+  |  {L}+ " " {L}+ 
NUMERO = {D}+
CaracterVariado = {L2}*{D}*
correo = {CaracterVariado}* "@" {L2}+"."{L2}+"."{L2}+
Decimal = {D}+ "." {D}+
Comilla = "\"" | "&quot;" 
espacio = [ \t \r \n]+

%{
    public String Lexeme;
%}
%%

"INI_HTML" {Lexeme = yytext(); return INICIO_HTML;}
"ENCABEZADO_INI" {Lexeme = yytext(); return INICIO_ENCABEZADO;}
"TIT" {Lexeme = yytext(); return TITULO;}
"TIT_FIN" {Lexeme = yytext(); return FINAL_TITULO;}
"ENCABEZADO_FIN" {Lexeme = yytext(); return FINAL_ENCABEZADO;}
"TABLA_IN" {Lexeme = yytext(); return INICIO_TABLA;}
"CUERPO_INI" {Lexeme = yytext(); return INICIO_CUERPO;}
"FILA COLUMNA" {Lexeme = yytext();return FILA_INICIO;}
"FILA_FIN" {Lexeme = yytext(); return FINAL_FILA;}
"COLUMNA" {Lexeme = yytext(); return COLUMNA;}
"COLUMNA_FIN" {Lexeme = yytext(); return COLUMNA_FIN;}
"TABLA_FIN" {Lexeme = yytext(); return FINAL_TABLA;}
"NEGRITA" {Lexeme = yytext(); return TEXTO_FUERTE;}
"NEGRITA_FIN" {Lexeme = yytext(); return TEXTO_FUERTE_FIN;}
"IMPRIMIR" {Lexeme = yytext(); return SALIDA_TEXTO;}
"LISTA_IN" {Lexeme = yytext(); return INICIO_LISTA;}
"ENLACE" {Lexeme = yytext(); return ENLACE_WEB;}
"IMAGEN_IN" {Lexeme = yytext(); return INICIO_IMAGEN;}
"NOMBRE" {Lexeme = yytext(); return NOMBRE_ELEMENTO;}
"ANCHO" {Lexeme = yytext(); return MEDIDA_ANCHO;}
"ALTURA" {Lexeme = yytext(); return MEDIDA_ALTURA;}
"IMAGEN_FIN" {Lexeme = yytext(); return FINAL_IMAGEN;}
"FIN_HTML" {Lexeme = yytext(); return FINAL_HTML;}
"BORDE" {Lexeme = yytext(); return BORDE_TABLA;}
"CUERPO_FIN" {Lexeme = yytext(); return FINAL_CUERPO;}
"LISTA_FIN" {Lexeme = yytext(); return FINAL_LISTA;}
"SALTO_LINEA" {Lexeme = yytext(); return SALTO_LINEA;}
"DIALOGO_INI" {Lexeme = yytext(); return INICIO_DIALOGO;}
"DIALOGO_FIN" {Lexeme = yytext(); return FINAL_DIALOGO;}
"PARRAFO_INI" {Lexeme = yytext(); return INICIO_PARRAFO;}
"PARRAFO_FIN" {Lexeme = yytext(); return FINAL_PARRAFO;}
"LINEA_DIVISORA" {Lexeme = yytext(); return LINEA_DIVISORA;}
"ETIQUETA_INI" {Lexeme = yytext(); return INICIO_ETIQUETA;}
"ETIQUETA_FIN" {Lexeme = yytext(); return FINAL_ETIQUETA;}
"E_LISTA_INI" {Lexeme = yytext(); return INICIO_ELEMENTO_LISTA;}
"E_LISTA_FIN" {Lexeme = yytext(); return FINAL_ELEMENTO_LISTA;}
"MENU_INI" {Lexeme = yytext(); return INICIO_MENU;}
"MENU_FIN" {Lexeme = yytext(); return FINAL_MENU;}
{NUMERO} {Lexeme = yytext(); return NUMERO_ENTERO;}
{Decimal} {Lexeme = yytext(); return NUMERO_DECIMAL;}
{correo} {Lexeme = yytext(); return CORREO_ELECTRONICO;}
{TEXTO_GENERAL} {Lexeme = yytext(); return CADENA_NO_ESPECIFICA;}
{Comilla} {Lexeme = yytext(); return Comilla;}
 ( "www" "." {L}+ "." {L}+ ) | 
 ( "www" "." {L}+ "." {L}+ "/" {L}+ "." {L}+)  {Lexeme=yytext(); return URL;}
"(" {Lexeme = yytext(); return PARENTESIS_APERTURA;}
")" {Lexeme = yytext(); return PARENTESIS_CIERRE;}
"*" {Lexeme = yytext(); return SIGNO_MULTIPLICACION;}
"+" {Lexeme = yytext(); return SIGNO_SUMA;}
"-" {Lexeme = yytext(); return SIGNO_RESTA;}
";" {Lexeme = yytext(); return PUNTO_COMA;}
"=" {Lexeme = yytext(); return SIGNO_IGUAL;}
":" {Lexeme = yytext(); return DOS_PUNTOS;}

{espacio} {/*Ignore*/}
 . {return Error;}