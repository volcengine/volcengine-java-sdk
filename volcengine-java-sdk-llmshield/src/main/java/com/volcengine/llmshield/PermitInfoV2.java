package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

// 放行信息集合
public class PermitInfoV2 {
    @JsonProperty("Permits")
    private List<PermitV2> permits;  // 放行命中信息

    // Getters and Setters
    public List<PermitV2> getPermits() {
        return permits;
    }

    public void setPermits(List<PermitV2> permits) {
        this.permits = permits;
    }
}
