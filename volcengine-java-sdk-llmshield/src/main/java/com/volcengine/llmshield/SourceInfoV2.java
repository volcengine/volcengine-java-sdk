package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

// 风险来源信息
public class SourceInfoV2 {
    @JsonProperty("Source")
    private String source;  // 风险来源

    @JsonProperty("SourceDetail")
    private Map<String, String> sourceDetail;  // 风险来源详情

    // Getters and Setters
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Map<String, String> getSourceDetail() {
        return sourceDetail;
    }

    public void setSourceDetail(Map<String, String> sourceDetail) {
        this.sourceDetail = sourceDetail;
    }
}
