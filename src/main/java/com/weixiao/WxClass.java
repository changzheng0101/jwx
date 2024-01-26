package com.weixiao;

import java.util.List;
import java.util.Map;

/**
 * @Date 2024/1/26 11:11
 * @Created by weixiao
 */
public class WxClass implements WxCallable {
    final String name;
    private final Map<String, WxFunction> methods;

    WxClass(String name, Map<String, WxFunction> methods) {
        this.name = name;
        this.methods = methods;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int arity() {
        return 0;
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        WxInstance instance = new WxInstance(this);
        return instance;
    }

    public WxFunction findMethod(String name) {
        if (methods.containsKey(name)) {
            return methods.get(name);
        }

        return null;
    }
}
