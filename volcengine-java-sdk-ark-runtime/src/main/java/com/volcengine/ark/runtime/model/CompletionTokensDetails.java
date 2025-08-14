package com.volcengine.ark.runtime.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CompletionTokensDetails {
    @JsonProperty("reasoning_tokens")
    private Integer reasoningTokens;

    @JsonProperty("provisioned_tokens")
    private Integer provisionedTokens;

    public Integer getReasoningTokens() {
        return reasoningTokens;
    }

    public void setReasoningTokens(Integer reasoningTokens) {
        this.reasoningTokens = reasoningTokens;
    }

    public Integer getProvisionedTokens() {
        return provisionedTokens;
    }

    public void setProvisionedTokens(Integer provisionedTokens) {
        this.provisionedTokens = provisionedTokens;
    }

    @Override
    public String toString() {
        return "CompletionTokensDetails{" +
                "reasoningTokens=" + reasoningTokens +
                ", provisionedTokens=" + provisionedTokens +
                '}';
    }
}
