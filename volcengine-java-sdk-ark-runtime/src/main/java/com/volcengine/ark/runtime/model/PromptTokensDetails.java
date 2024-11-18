package com.volcengine.ark.runtime.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PromptTokensDetails {

    @JsonProperty("cached_tokens")
    private Integer cachedTokens;

    public Integer getCachedTokens() {
        return cachedTokens;
    }

    public void setCachedTokens(Integer cachedTokens) {
        this.cachedTokens = cachedTokens;
    }

    @Override
    public String toString() {
        return "PromptTokensDetails{" +
                "cachedTokens=" + cachedTokens +
                '}';
    }
}
