package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonValue;

// 用户动作枚举
public enum UserAction {
    PASS(1),        // 放行
    BLOCK(2),       // 拦截
    MARK(3),        // 标记
    REPLACE(4);     // 替换

    private final long value;

    UserAction(long value) {
        this.value = value;
    }
    @JsonValue
    public long getValue() {
        return value;
    }
}
