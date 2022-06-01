package com.craftinginterpreters.lox;

/**
 * Write a description of class Token here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line; 

    Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        return type + " " + lexeme + " " + literal;
    }
}