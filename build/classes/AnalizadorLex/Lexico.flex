package AnalizadorLex;
import static AnalizadorLex.Tokens.*;
%%
%class Lexico
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t \r]+
%{
    public String lexemas;
%}
%%
/* Integer */
(int) {lexemas=yytext(); return Int;}

/* Double */
(double) {lexemas=yytext(); return Double;}

/* Char */
(char) {lexemas=yytext(); return Char;}

/* Float */
(float) {lexemas=yytext(); return Float;}

/* Const */
(const) {lexemas=yytext(); return Const;}

/* Long */
(long) {lexemas=yytext(); return Long;}

/* Union */
(union) {lexemas=yytext(); return Union;}

/* Struct */
(struct) {lexemas=yytext(); return Struct;}

/* Short */
(short) {lexemas=yytext(); return Short;}

/* Unsigned */
(unsigned) {lexemas=yytext(); return Unsigned;}

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexemas=yytext(); return Comillas;}

/* Tipos de datos */
( byte | int | char | long | float | double | const | long | union | short | unsigned | struct ) {lexemas=yytext(); return T_dato;}

/* Tipo de dato String */
( String ) {lexemas=yytext(); return Cadena;}

/* Palabra reservada If */
( if ) {lexemas=yytext(); return If;}

/* Palabra reservada TypeDef */
( typedef) {lexemas=yytext(); return TypeDef;}

/* Palabra reservada Enum */
( enum ) {lexemas=yytext(); return Enum;}

/* Palabra reservada PrintF */
( printf ) {lexemas=yytext(); return PrintF;}

/* Palabra reservada ScanF */
( scanf ) {lexemas=yytext(); return ScanF;}

/* Palabra reservada Cin*/
( cin ) {lexemas=yytext(); return Cin;}

/* Palabra reservada Cout*/
( cout ) {lexemas=yytext(); return Cout;}

/* Palabra reservada Extern */
( extern ) {lexemas=yytext(); return Extern;}

/* Palabra reservada GoTo */
( goto ) {lexemas=yytext(); return GoTo;}

/* Palabra reservada Register */
( register ) {lexemas=yytext(); return Register;}

/* Palabra reservada Else */
( else ) {lexemas=yytext(); return Else;}

/* Palabra reservada While */
( while ) {lexemas=yytext(); return While;}

/* Palabra reservada do */
( do ) {lexemas=yytext(); return Do;}

/* Palabra reservada For */
( for ) {lexemas=yytext(); return For;}

/* Palabra reservada Switch */
( switch ) {lexemas=yytext(); return Switch;}

/* Palabra reservada Case */
( case ) {lexemas=yytext(); return Case;}

/* Palabra reservada Default */
( default ) {lexemas=yytext(); return Default;}

/* Palabra reservada Break */
( break ) {lexemas=yytext(); return Break;}

/* Palabra reservada Continue */
( continue ) {lexemas=yytext(); return Continue;}

/* Operador Igual */
( "=" ) {lexemas=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexemas=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexemas=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexemas=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {lexemas=yytext(); return Division;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexemas=yytext(); return Op_logico;}

/* Operadores de incremento */
( "++" | "--" ) {lexemas=yytext(); return Op_incremento;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexemas = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexemas = yytext(); return Op_atribucion;}

/* Operadores Booleanos */
( true | false ) {lexemas = yytext(); return Op_booleano;}

/* Parentesis de apertura */
( "(" ) {lexemas=yytext(); return Parent_a;}

/* Parentesis de cierre */
( ")" ) {lexemas=yytext(); return Parent_c;}

/* Llave de apertura */
( "{" ) {lexemas=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexemas=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexemas=yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexemas=yytext(); return Corchete_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexemas=yytext(); return Main;}

/* Palabra reservada Return */
( "return" ) {lexemas=yytext(); return Return;}

/* Punto */
( "." ) {lexemas=yytext(); return Punto;}

/* Coma */
( "," ) {lexemas=yytext(); return Coma;}

/* P_Coma */
( ";" ) {lexemas=yytext(); return P_Coma;}

/* Identificador */
{L}({L}|{D})* {lexemas=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexemas=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}

