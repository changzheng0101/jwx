package com.weixiao;

/**
 * @Date 2024/1/10 16:30
 * @Created by weixiao
 */

class Token {
    final TokenType type;
    final String lexeme; // 分词，就是一个个分开后的token
    final Object literal; // 真正存放的数值，对于有些token，这个字段可能为空
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
