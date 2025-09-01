package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

// 风险信息
public class RiskV2 {
    @JsonProperty("Category")
    private String category;    // 风险分类

    @JsonProperty("Label")
    private String label;       // 风险标签

    @JsonProperty("Prob")
    private Double prob;        // 风险概率

    @JsonProperty("Matches")
    private List<RiskMatchV2> matches;  // 命中词表信息

    // Getters and Setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getProb() {
        return prob;
    }

    public void setProb(Double prob) {
        this.prob = prob;
    }

    public List<RiskMatchV2> getMatches() {
        return matches;
    }

    public void setMatches(List<RiskMatchV2> matches) {
        this.matches = matches;
    }
}
