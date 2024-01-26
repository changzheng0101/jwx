package com.weixiao;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date 2024/1/26 11:16
 * @Created by weixiao
 */
public class WxInstance {
    private WxClass klass;
    private final Map<String, Object> fields = new HashMap<>();

    WxInstance(WxClass klass) {
        this.klass = klass;
    }

    @Override
    public String toString() {
        return klass.name + " instance";
    }

    Object get(Token name) {
        if (fields.containsKey(name.lexeme)) {
            return fields.get(name.lexeme);
        }

        WxFunction method = klass.findMethod(name.lexeme);
        if (method != null) return method;

        throw new RuntimeError(name,
                "Undefined property '" + name.lexeme + "'.");
    }

    public void set(Token name, Object value) {
        fields.put(name.lexeme, value);
    }
}
