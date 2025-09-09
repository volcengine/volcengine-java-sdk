package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 生成过程的总结信息类
 * 用于记录生成过程中的资源消耗情况
 */
public class GenerateSummarizeV2 {
    // 消耗的token数量
    @JsonProperty("TokenCost")
    private long tokenCost;

    // 消耗的时长（毫秒）
    @JsonProperty("TimeCostMS")
    private long timeCostMS;

    // 无参构造函数，用于JSON反序列化
    public GenerateSummarizeV2() {}

    // Getter和Setter方法
    public long getTokenCost() {
        return tokenCost;
    }

    public void setTokenCost(long tokenCost) {
        this.tokenCost = tokenCost;
    }

    public long getTimeCostMS() {
        return timeCostMS;
    }

    public void setTimeCostMS(long timeCostMS) {
        this.timeCostMS = timeCostMS;
    }
}

