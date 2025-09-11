package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

// 替换详情
public class ReplaceDetailV2 {
    @JsonProperty("Replacement")
    private MessageV2 replacement;  // 替换内容

    // Getters and Setters
    public MessageV2 getReplacement() {
        return replacement;
    }

    public void setReplacement(MessageV2 replacement) {
        this.replacement = replacement;
    }
}
