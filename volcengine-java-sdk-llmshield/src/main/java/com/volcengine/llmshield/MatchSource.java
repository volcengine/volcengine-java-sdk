package com.volcengine.llmshield;
import com.fasterxml.jackson.annotation.JsonValue;
// 匹配来源枚举
public enum MatchSource {
    UNKNOWN(0),                 // 未知，或检出模块未显式指定来源
    GLOBAL_CONTENTLIB(1),       // 全局内容库
    ADMIN_CONTENTLIB(2),        // 租户黑白名单库
    USER_CONTENTLIB(3);         // 用户自定义词库

    private final long value;

    MatchSource(long value) {
        this.value = value;
    }
    @JsonValue
    public long getValue() {
        return value;
    }
}
