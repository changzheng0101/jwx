package com.weixiao;

import java.util.List;

/**
 * @Date 2024/1/25 10:04
 * @Created by weixiao
 * when you declare a function create an Object like this
 */
public class WxFunction implements WxCallable {
    private final Stmt.Function declaration;
    // store parent env of current func
    private final Environment closure;
    private final boolean isInitializer;

    public WxFunction(Stmt.Function declaration, Environment closure, boolean isInitializer) {
        this.declaration = declaration;
        this.closure = closure;
        this.isInitializer = isInitializer;
    }

    @Override
    public int paramSize() {
        return declaration.params.size();
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        // each call get a new environment
        Environment environment = new Environment(closure);
        for (int i = 0; i < declaration.params.size(); i++) {
            environment.define(declaration.params.get(i).lexeme,
                    arguments.get(i));
        }
        try {
            interpreter.executeBlock(declaration.body, environment);
        } catch (Return returnValue) {
            if (isInitializer) return closure.getAt(0, "this");

            return returnValue.value;
        }

        if (isInitializer) return closure.getAt(0, "this");
        return null;
    }

    @Override
    public String toString() {
        return "<fn " + declaration.name.lexeme + ">";
    }

    // add this to env
    public WxFunction bind(WxInstance instance) {
        Environment environment = new Environment(closure);
        environment.define("this", instance);
        return new WxFunction(declaration, environment, isInitializer);
    }
}
