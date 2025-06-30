/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexico;

/**
 *
 * @author Carlos
 */
public enum Token {
    ERROR,
    Identificador,
    Numero,
    Reservadas,
    PLUS,
    MINUS,
    TIMES,
    ASSIGN,
    EQUALS,
    INT,
    ID,
        // Palabras reservadas de Visual Basic
    DIM,
    INTEGER,
    STRING,
    BOOLEAN,
    IF,
    THEN,
    ELSE,
    END,
    FOR,
    NEXT,
    
    // Operadores aritméticos
    DIVIDE,         // /
    MOD,            // Mod
    
    // Operadores relacionales


    NOT_EQUALS,     // <>
    LESS_THAN,      // <
    GREATER_THAN,   // >
    LESS_EQUAL,     // <=
    GREATER_EQUAL,  // >=
    
    // Operadores lógicos
    AND,            // And
    OR,             // Or
    NOT,            // Not
    
    // Delimitadores
    LPAREN,         // (
    RPAREN,         // )
    SEMICOLON,      // ;
    COMMA           // 
    // Otros tokens que definas...
}  

