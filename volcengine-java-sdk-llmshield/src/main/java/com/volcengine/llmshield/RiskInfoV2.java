package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

// 风险信息集合
public class RiskInfoV2 {
    @JsonProperty("Risks")
    private List<RiskV2> risks;  // 风险信息

    // Getters and Setters
    public List<RiskV2> getRisks() {
        return risks;
    }

    public void setRisks(List<RiskV2> risks) {
        this.risks = risks;
    }
}
