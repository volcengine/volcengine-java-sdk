package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

// 风险匹配信息
public class RiskMatchV2 {
    @JsonProperty("Word")
    private String word;        // 命中词

    @JsonProperty("Action")
    private UserAction action;  // 命中动作

    @JsonProperty("Source")
    private MatchSource source; // 命中词来源

    @JsonProperty("RuleID")
    private String ruleID;    // 规则ID

    // Getters and Setters
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public UserAction getAction() {
        return action;
    }

    public void setAction(UserAction action) {
        this.action = action;
    }

    public MatchSource getSource() {
        return source;
    }

    public void setSource(MatchSource source) {
        this.source = source;
    }

    public String getRuleID() {
        return ruleID;
    }

    public void setRuleID(String ruleID) {
        this.ruleID = ruleID;
    }
}
