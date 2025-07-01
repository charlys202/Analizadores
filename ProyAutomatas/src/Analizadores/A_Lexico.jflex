/*------------  1ra Área: Código de Usuario ---------*/
//------> Paquete e importaciones
package Analizadores;

import java_cup.runtime.*;
import java.util.LinkedList;

%{
    public static LinkedList<TError> TablaEL = new LinkedList<TError>(); 
%}

%public 
%class Analizador_Lexico
%cupsym Simbolos
%cup
%column
%full
%ignorecase
%line
%unicode

%%

letra      = [a-zA-Z]
digito     = [0-9]
id         = {letra}({letra}|{digito}|_)*
numero     = {digito}+

espacio    = [ \t\r\n\f]

/*------------  3ra Área: Reglas Léxicas ---------*/

// Palabras clave
<YYINITIAL> "DIM"           { return new Symbol(Simbolos.DIM, yycolumn, yyline, yytext()); }
<YYINITIAL> "INTEGER"       { return new Symbol(Simbolos.INTEGER, yycolumn, yyline, yytext()); }
<YYINITIAL> "STRING"        { return new Symbol(Simbolos.STRING, yycolumn, yyline, yytext()); }
<YYINITIAL> "BOOLEAN"       { return new Symbol(Simbolos.BOOLEAN, yycolumn, yyline, yytext()); }
<YYINITIAL> "IF"            { return new Symbol(Simbolos.IF, yycolumn, yyline, yytext()); }
<YYINITIAL> "THEN"          { return new Symbol(Simbolos.THEN, yycolumn, yyline, yytext()); }
<YYINITIAL> "ELSE"          { return new Symbol(Simbolos.ELSE, yycolumn, yyline, yytext()); }
<YYINITIAL> "END"           { return new Symbol(Simbolos.END, yycolumn, yyline, yytext()); }
<YYINITIAL> "FOR"           { return new Symbol(Simbolos.FOR, yycolumn, yyline, yytext()); }
<YYINITIAL> "NEXT"          { return new Symbol(Simbolos.NEXT, yycolumn, yyline, yytext()); }
<YYINITIAL> "AND"           { return new Symbol(Simbolos.AND, yycolumn, yyline, yytext()); }
<YYINITIAL> "OR"            { return new Symbol(Simbolos.OR, yycolumn, yyline, yytext()); }
<YYINITIAL> "NOT"           { return new Symbol(Simbolos.NOT, yycolumn, yyline, yytext()); }

// Operadores aritméticos
<YYINITIAL> "+"             { return new Symbol(Simbolos.PLUS, yycolumn, yyline, yytext()); }
<YYINITIAL> "-"             { return new Symbol(Simbolos.MINUS, yycolumn, yyline, yytext()); }
<YYINITIAL> "*"             { return new Symbol(Simbolos.TIMES, yycolumn, yyline, yytext()); }
<YYINITIAL> "/"             { return new Symbol(Simbolos.DIVIDE, yycolumn, yyline, yytext()); }
<YYINITIAL> "MOD"           { return new Symbol(Simbolos.MOD, yycolumn, yyline, yytext()); }

// Operadores relacionales
<YYINITIAL> "="             { return new Symbol(Simbolos.EQUALS, yycolumn, yyline, yytext()); }
<YYINITIAL> "<>"            { return new Symbol(Simbolos.NOT_EQUALS, yycolumn, yyline, yytext()); }
<YYINITIAL> "<="            { return new Symbol(Simbolos.LESS_EQUAL, yycolumn, yyline, yytext()); }
<YYINITIAL> ">="            { return new Symbol(Simbolos.GREATER_EQUAL, yycolumn, yyline, yytext()); }
<YYINITIAL> "<"             { return new Symbol(Simbolos.LESS_THAN, yycolumn, yyline, yytext()); }
<YYINITIAL> ">"             { return new Symbol(Simbolos.GREATER_THAN, yycolumn, yyline, yytext()); }

// Delimitadores
<YYINITIAL> "("             { return new Symbol(Simbolos.LPAREN, yycolumn, yyline, yytext()); }
<YYINITIAL> ")"             { return new Symbol(Simbolos.RPAREN, yycolumn, yyline, yytext()); }
<YYINITIAL> ";"             { return new Symbol(Simbolos.SEMICOLON, yycolumn, yyline, yytext()); }
<YYINITIAL> ","             { return new Symbol(Simbolos.COMMA, yycolumn, yyline, yytext()); }

// Identificadores y números
<YYINITIAL> {id}            { return new Symbol(Simbolos.Identificador, yycolumn, yyline, yytext()); }
<YYINITIAL> {numero}        { return new Symbol(Simbolos.Numero, yycolumn, yyline, yytext()); }

// Espacios en blanco (ignorar)
<YYINITIAL> {espacio}       { /* Ignorar espacios, tabs y saltos de línea */ }

// Errores léxicos
<YYINITIAL> .               {
    System.out.println("Error Léxico: " + yytext() + " Línea: " + yyline + " Columna: " + yycolumn);
    TError datos = new TError(yytext(), yyline, yycolumn, "Error Léxico", "Símbolo no válido");
    TablaEL.add(datos);
}
