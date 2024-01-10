package com.weixiao;

/**
 * @Date 2024/1/10 16:30
 * @Created by weixiao
 */

class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line; // [location]

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
