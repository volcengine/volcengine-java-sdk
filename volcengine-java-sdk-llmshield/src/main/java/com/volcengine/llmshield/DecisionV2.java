package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

// 决策信息
public class DecisionV2 {
    @JsonProperty("DecisionType")
    private DecisionTypeV2 decisionType;  // 决策类型

    @JsonProperty("DecisionDetail")
    private DecisionDetailV2 detail;  // 决策详情

    @JsonProperty("DecisionStrategyID")
    private String decisionStrategyID;  // 决策策略ID

    @JsonProperty("HitStrategyIDs")
    private List<String> hitStrategyIDs;  // 命中策略ID列表

    // Getters and Setters
    public DecisionTypeV2 getDecisionType() {
        return decisionType;
    }

    public void setDecisionType(DecisionTypeV2 decisionType) {
        this.decisionType = decisionType;
    }

    public DecisionDetailV2 getDetail() {
        return detail;
    }

    public void setDetail(DecisionDetailV2 detail) {
        this.detail = detail;
    }

    public String getDecisionStrategyID() {
        return decisionStrategyID;
    }

    public void setDecisionStrategyID(String decisionStrategyID) {
        this.decisionStrategyID = decisionStrategyID;
    }

    public List<String> getHitStrategyIDs() {
        return hitStrategyIDs;
    }

    public void setHitStrategyIDs(List<String> hitStrategyIDs) {
        this.hitStrategyIDs = hitStrategyIDs;
    }
}
