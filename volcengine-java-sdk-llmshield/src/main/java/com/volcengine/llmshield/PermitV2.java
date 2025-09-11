package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

// 放行信息
public class PermitV2 {
    @JsonProperty("Category")
    private String category;    // 放行分类，保留字段

    @JsonProperty("Label")
    private String label;       // 放行标签

    @JsonProperty("Prob")
    private Double prob;        // 命中放行概率

    @JsonProperty("Matches")
    private List<PermitMatchV2> matches;  // 命中白词表信息

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

    public List<PermitMatchV2> getMatches() {
        return matches;
    }

    public void setMatches(List<PermitMatchV2> matches) {
        this.matches = matches;
    }
}
