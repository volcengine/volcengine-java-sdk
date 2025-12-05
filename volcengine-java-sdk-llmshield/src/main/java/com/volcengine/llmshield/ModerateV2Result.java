package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

// 审核结果结构
public class ModerateV2Result {
    @JsonProperty("MsgID")
    private String msgID;       // 消息ID，表示请求的唯一标识

    @JsonProperty("RiskInfo")
    private RiskInfoV2 riskInfo;  // 风险信息

    @JsonProperty("Decision")
    private DecisionV2 decision;  // 决策

    @JsonProperty("PermitInfo")
    private PermitInfoV2 permitInfo;  // 放行信息

    @JsonProperty("ContentInfo")
    private String contentInfo;  // 提交内容信息

    @JsonProperty("Degraded")
    private boolean degraded;   // 是否降级

    @JsonProperty("DegradeReason")
    private String degradeReason;  // 降级原因

//    @JsonProperty("DebugInfo")
//    private Map<String, String> debugInfo;  // 内部调试信息，仅在debug模式下返回

    // Getters and Setters
    public String getMsgID() {
        return msgID;
    }

    public void setMsgID(String msgID) {
        this.msgID = msgID;
    }

    public RiskInfoV2 getRiskInfo() {
        return riskInfo;
    }

    public void setRiskInfo(RiskInfoV2 riskInfo) {
        this.riskInfo = riskInfo;
    }

    public DecisionV2 getDecision() {
        return decision;
    }

    public void setDecision(DecisionV2 decision) {
        this.decision = decision;
    }

    public PermitInfoV2 getPermitInfo() {
        return permitInfo;
    }

    public void setPermitInfo(PermitInfoV2 permitInfo) {
        this.permitInfo = permitInfo;
    }

    public String getContentInfo() { return contentInfo; }

    public void setContentInfo(String contentInfo) { this.contentInfo = contentInfo;}

    public boolean isDegraded() {
        return degraded;
    }

    public void setDegraded(boolean degraded) {
        this.degraded = degraded;
    }

    public String getDegradeReason() {
        return degradeReason;
    }

    public void setDegradeReason(String degradeReason) {
        this.degradeReason = degradeReason;
    }

//    public Map<String, String> getDebugInfo() {
//        return debugInfo;
//    }

//    public void setDebugInfo(Map<String, String> debugInfo) {
//        this.debugInfo = debugInfo;
//    }
}
