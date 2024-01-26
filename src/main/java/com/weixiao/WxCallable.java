package com.weixiao;

import java.util.List;

public interface WxCallable {
    int arity();

    Object call(Interpreter interpreter, List<Object> arguments);
}
