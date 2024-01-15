package com.weixiao;

/**
 * @Date 2024/1/15 21:30
 * @Created by weixiao
 */
class RuntimeError extends RuntimeException {
    final Token token;

    RuntimeError(Token token, String message) {
        super(message);
        this.token = token;
    }
}
