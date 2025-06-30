package analizadorlexico;
import static analizadorlexico.Token.*;
%%
// Palabras reservadas (case insensitive)
(?i:dim)            { return DIM; }
(?i:integer)        { return INTEGER; }
(?i:string)         { return STRING; }
(?i:boolean)        { return BOOLEAN; }
(?i:if)             { return IF; }
(?i:then)           { return THEN; }
(?i:else)           { return ELSE; }
(?i:end)            { return END; }
(?i:for)            { return FOR; }
(?i:next)           { return NEXT; }

// Operadores aritméticos
"+"                 { return PLUS; }
"-"                 { return MINUS; }
"*"                 { return TIMES; }
"/"                 { return DIVIDE; }
(?i:mod)            { return MOD; }

// Operadores relacionales
"<>"                { return NOT_EQUALS; }
"<="                { return LESS_EQUAL; }
">="                { return GREATER_EQUAL; }
"="                 { return EQUALS; }
"<"                 { return LESS_THAN; }
">"                 { return GREATER_THAN; }

// Operadores lógicos
(?i:and)            { return AND; }
(?i:or)             { return OR; }
(?i:not)            { return NOT; }

// Delimitadores
"("                 { return LPAREN; }
")"                 { return RPAREN; }
";"                 { return SEMICOLON; }
","                 { return COMMA; }

// Identificadores y números
[a-zA-Z][a-zA-Z0-9_]*  { lexeme = yytext(); return Identificador; }
[0-9]+              { lexeme = yytext(); return Numero; }

// Espacios en blanco (ignorar)
[ \t\r\n]+          { /* ignore */ }

. {return ERROR;}

