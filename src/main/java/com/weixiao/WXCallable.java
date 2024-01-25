package com.weixiao;

import java.util.List;

public interface WXCallable {
    int arity();

    Object call(Interpreter interpreter, List<Object> arguments);
}
