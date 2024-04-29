package com.weixiao;

import java.util.List;
import java.util.Map;

/**
 * @Date 2024/1/26 11:11
 * @Created by weixiao
 */
public class WxClass implements WxCallable {
    final String name;
    final WxClass superclass;
    private final Map<String, WxFunction> methods;

    WxClass(String name, WxClass superclass, Map<String, WxFunction> methods) {
        this.name = name;
        this.superclass = superclass;
        this.methods = methods;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int paramSize() {
        WxFunction initializer = findMethod("init");
        if (initializer == null) return 0;
        return initializer.paramSize();
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        WxInstance instance = new WxInstance(this);
        WxFunction initializer = findMethod("init");
        if (initializer != null) {
            initializer.bind(instance).call(interpreter, arguments);
        }

        return instance;
    }

    public WxFunction findMethod(String name) {
        if (methods.containsKey(name)) {
            return methods.get(name);
        }

        if (superclass != null) {
            return superclass.findMethod(name);
        }

        return null;
    }
}
