package com.volcengine.ark.runtime.model.responses.usage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InputTokensDetails {
    @JsonProperty("cached_tokens")
    private Long cachedTokens;
    
    @JsonProperty("audio_tokens")
    private Long audioTokens;

    public Long getCachedTokens() {
        return cachedTokens;
    }

    public void setCachedTokens(Long cachedTokens) {
        this.cachedTokens = cachedTokens;
    }

    public Long getAudioTokens() {
        return audioTokens;
    }

    public void setAudioTokens(Long audioTokens) {
        this.audioTokens = audioTokens;
    }
}