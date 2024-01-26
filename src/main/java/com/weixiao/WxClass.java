package com.weixiao;

import java.util.List;

/**
 * @Date 2024/1/26 11:11
 * @Created by weixiao
 */
public class WxClass implements WxCallable {
    final String name;

    WxClass(String name) {
        this.name = name;
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
}
