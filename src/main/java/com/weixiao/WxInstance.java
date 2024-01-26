package com.weixiao;

/**
 * @Date 2024/1/26 11:16
 * @Created by weixiao
 */
public class WxInstance {
    private WxClass klass;

    WxInstance(WxClass klass) {
        this.klass = klass;
    }

    @Override
    public String toString() {
        return klass.name + " instance";
    }
}
