package Analizadores;

import java_cup.runtime.*;
import java.util.LinkedList;

%%

%{
    public static LinkedList<TError> TablaEL = new LinkedList<TError>(); 
%}

%public 
%class Analizador_Lexico
%cupsym Simbolos
%cup
%column
%line
%ignorecase

letra=[a-zA-Z]
digito=[0-9]
id={letra}({letra}|{digito}|_)*
numero={digito}+
espacio=[ \t\r\n\f]

%%

"DIM"           { return new Symbol(Simbolos.DIM, yycolumn, yyline, yytext()); }
"INTEGER"       { return new Symbol(Simbolos.INTEGER, yycolumn, yyline, yytext()); }
"STRING"        { return new Symbol(Simbolos.STRING, yycolumn, yyline, yytext()); }
"BOOLEAN"       { return new Symbol(Simbolos.BOOLEAN, yycolumn, yyline, yytext()); }
"IF"            { return new Symbol(Simbolos.IF, yycolumn, yyline, yytext()); }
"THEN"          { return new Symbol(Simbolos.THEN, yycolumn, yyline, yytext()); }
"ELSE"          { return new Symbol(Simbolos.ELSE, yycolumn, yyline, yytext()); }
"END"           { return new Symbol(Simbolos.END, yycolumn, yyline, yytext()); }
"FOR"           { return new Symbol(Simbolos.FOR, yycolumn, yyline, yytext()); }
"NEXT"          { return new Symbol(Simbolos.NEXT, yycolumn, yyline, yytext()); }
"AND"           { return new Symbol(Simbolos.AND, yycolumn, yyline, yytext()); }
"OR"            { return new Symbol(Simbolos.OR, yycolumn, yyline, yytext()); }
"NOT"           { return new Symbol(Simbolos.NOT, yycolumn, yyline, yytext()); }

"<="            { return new Symbol(Simbolos.LESS_EQUAL, yycolumn, yyline, yytext()); }
">="            { return new Symbol(Simbolos.GREATER_EQUAL, yycolumn, yyline, yytext()); }
"<>"            { return new Symbol(Simbolos.NOT_EQUALS, yycolumn, yyline, yytext()); }
"<"             { return new Symbol(Simbolos.LESS_THAN, yycolumn, yyline, yytext()); }
">"             { return new Symbol(Simbolos.GREATER_THAN, yycolumn, yyline, yytext()); }
"="             { return new Symbol(Simbolos.EQUALS, yycolumn, yyline, yytext()); }

"+"             { return new Symbol(Simbolos.PLUS, yycolumn, yyline, yytext()); }
"-"             { return new Symbol(Simbolos.MINUS, yycolumn, yyline, yytext()); }
"*"             { return new Symbol(Simbolos.TIMES, yycolumn, yyline, yytext()); }
"/"             { return new Symbol(Simbolos.DIVIDE, yycolumn, yyline, yytext()); }
"MOD"           { return new Symbol(Simbolos.MOD, yycolumn, yyline, yytext()); }

"("             { return new Symbol(Simbolos.LPAREN, yycolumn, yyline, yytext()); }
")"             { return new Symbol(Simbolos.RPAREN, yycolumn, yyline, yytext()); }
";"             { return new Symbol(Simbolos.SEMICOLON, yycolumn, yyline, yytext()); }
","             { return new Symbol(Simbolos.COMMA, yycolumn, yyline, yytext()); }

{id}            { return new Symbol(Simbolos.Identificador, yycolumn, yyline, yytext()); }
{numero}        { return new Symbol(Simbolos.Numero, yycolumn, yyline, yytext()); }

{espacio}       { /* Ignorar espacios */ }

.               {
    System.out.println("Error Léxico: " + yytext() + " Línea: " + yyline + " Columna: " + yycolumn);
    TError datos = new TError(yytext(), yyline, yycolumn, "Error Léxico", "Símbolo no válido");
    TablaEL.add(datos);
}