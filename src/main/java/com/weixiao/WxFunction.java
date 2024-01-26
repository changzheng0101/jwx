package com.weixiao;

import java.util.List;

/**
 * @Date 2024/1/25 10:04
 * @Created by weixiao
 * when you declare a function create an Object like this
 */
public class WxFunction implements WxCallable {
    private final Stmt.Function declaration;
    // store var declare in func
    private final Environment closure;

    public WxFunction(Stmt.Function declaration, Environment closure) {
        this.declaration = declaration;
        this.closure = closure;
    }

    @Override
    public int arity() {
        return declaration.params.size();
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        Environment environment = new Environment(closure);
        for (int i = 0; i < declaration.params.size(); i++) {
            environment.define(declaration.params.get(i).lexeme,
                    arguments.get(i));
        }
        // each call get a new environment
        try {
            interpreter.executeBlock(declaration.body, environment);
        } catch (Return returnValue) {
            return returnValue.value;
        }
        return null;
    }

    @Override
    public String toString() {
        return "<fn " + declaration.name.lexeme + ">";
    }
}
