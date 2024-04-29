package com.weixiao;

import java.util.List;

public interface WxCallable {
    // 返回参数个数
    int paramSize();

    Object call(Interpreter interpreter, List<Object> arguments);
}
