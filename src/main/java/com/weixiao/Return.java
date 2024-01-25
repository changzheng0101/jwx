package com.weixiao;

/**
 * @Date 2024/1/25 10:58
 * @Created by weixiao
 */
class Return extends RuntimeException {
    final Object value;

    Return(Object value) {
        super(null, null, false, false);
        this.value = value;
    }
}
