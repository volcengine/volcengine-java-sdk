package com.volcengine.llmshield;
import com.fasterxml.jackson.annotation.JsonValue;
// 内容类型枚举
public enum ContentTypeV2 {
    TEXT(1),        // 文本
    AUDIO(2),       // 音频
    IMAGE(3),       // 图片
    VIDEO(4),       // 视频
    FILE(5);        // 文件

    private final long value;

    ContentTypeV2(long value) {
        this.value = value;
    }

    @JsonValue
    public long getValue() {
        return value;
    }
}
