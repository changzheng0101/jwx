package com.weixiao;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date 2024/1/16 9:46
 * @Created by weixiao
 * store all variables
 */
public class Environment {
    private final Map<String, Object> values = new HashMap<>();

    // allow redefine a variable
    void define(String name, Object value) {
        values.put(name, value);
    }

    Object get(Token name) {
        if (values.containsKey(name.lexeme)) {
            return values.get(name.lexeme);
        }

        throw new RuntimeError(name,
                "Undefined variable '" + name.lexeme + "'.");
    }

}
