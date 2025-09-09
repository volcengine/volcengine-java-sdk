package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

// 决策详情
public class DecisionDetailV2 {
    @JsonProperty("BlockDetail")
    private BlockDetailV2 blockDetail;  // 拦截详情

    @JsonProperty("ReplaceDetail")
    private ReplaceDetailV2 replaceDetail;  // 替换详情

    // Getters and Setters
    public BlockDetailV2 getBlockDetail() {
        return blockDetail;
    }

    public void setBlockDetail(BlockDetailV2 blockDetail) {
        this.blockDetail = blockDetail;
    }

    public ReplaceDetailV2 getReplaceDetail() {
        return replaceDetail;
    }

    public void setReplaceDetail(ReplaceDetailV2 replaceDetail) {
        this.replaceDetail = replaceDetail;
    }
}
