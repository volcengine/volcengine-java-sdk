package com.volcengine.ark.runtime.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PromptTokensDetails {

    @JsonProperty("cached_tokens")
    private Integer cachedTokens;

    @JsonProperty("provisioned_tokens")
    private Integer provisionedTokens;

    @JsonProperty("audio_tokens")
    private Integer audioTokens;

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

    public Integer getAudioTokens() {
        return audioTokens;
    }

    public void setAudioTokens(Integer audioTokens) {
        this.audioTokens = audioTokens;
    }

    @Override
    public String toString() {
        return "PromptTokensDetails{" +
                "cachedTokens=" + cachedTokens +
                ", provisionedTokens=" + provisionedTokens +
                ", audioTokens=" + audioTokens +
                '}';
    }
}