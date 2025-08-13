package com.volcengine.ark.runtime.model.responses.usage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OutputTokensDetails {
    @JsonProperty("reasoning_tokens")
    private Long reasoningTokens;

    public Long getReasoningTokens() {
        return reasoningTokens;
    }

    public void setReasoningTokens(Long reasoningTokens) {
        this.reasoningTokens = reasoningTokens;
    }
}