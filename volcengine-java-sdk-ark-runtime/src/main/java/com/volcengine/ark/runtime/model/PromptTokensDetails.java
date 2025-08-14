package com.volcengine.ark.runtime.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PromptTokensDetails {

    @JsonProperty("cached_tokens")
    private Integer cachedTokens;

    @JsonProperty("provisioned_tokens")
    private Integer provisionedTokens;

    public Integer getCachedTokens() {
        return cachedTokens;
    }

    public void setCachedTokens(Integer cachedTokens) {
        this.cachedTokens = cachedTokens;
    }

    public Integer getProvisionedTokens() {
        return provisionedTokens;
    }

    public void setProvisionedTokens(Integer provisionedTokens) {
        this.provisionedTokens = provisionedTokens;
    }

    @Override
    public String toString() {
        return "PromptTokensDetails{" +
                "cachedTokens=" + cachedTokens +
                ", provisionedTokens=" + provisionedTokens +
                '}';
    }
}