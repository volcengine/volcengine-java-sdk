package com.volcengine.llmshield;
import com.fasterxml.jackson.annotation.JsonCreator;
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

    // 反序列化：根据传入的数字 value 匹配枚举（核心补充）
    @JsonCreator
    public static DecisionTypeV2 fromValue(long value) {
        for (DecisionTypeV2 type : DecisionTypeV2.values()) {
            if (type.value == value) {
                return type;
            }
        }
        // 匹配失败时的兜底（避免空指针，可抛异常/返回默认值）
        throw new IllegalArgumentException("无效的 DecisionTypeV2 值: " + value);
        // 或返回默认值：return PASS;
    }
}
