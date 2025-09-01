package com.volcengine.llmshield;
import com.fasterxml.jackson.annotation.JsonValue;
// 决策类型枚举
public enum DecisionTypeV2 {
    PASS(1),        // 通过
    BLOCK(2),       // 拦截
    MARK(3),        // 标记
    REPLACE(4) ,    // 替换
    OPTIMIZE(5);     // 替换

    private final long value;

    DecisionTypeV2(long value) {
        this.value = value;
    }
    @JsonValue
    public long getValue() {
        return value;
    }
}
