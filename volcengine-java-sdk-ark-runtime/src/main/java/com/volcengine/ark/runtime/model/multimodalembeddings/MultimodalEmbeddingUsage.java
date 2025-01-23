package com.volcengine.ark.runtime.model.multimodalembeddings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MultimodalEmbeddingUsage {
    /**
     * The number of prompt tokens used.
     */
    @JsonProperty("prompt_tokens")
    private long promptTokens;

    /**
     * The number of total tokens used
     */
    @JsonProperty("total_tokens")
    private long totalTokens;

    @JsonProperty("prompt_tokens_details")
    private MultimodalEmbeddingPromptTokensDetails promptTokensDetails;

    public MultimodalEmbeddingUsage(long promptTokens, long completionTokens, long totalTokens) {
        this.promptTokens = promptTokens;
        this.totalTokens = totalTokens;
    }

    public MultimodalEmbeddingUsage(long promptTokens, long completionTokens, long totalTokens, MultimodalEmbeddingPromptTokensDetails promptTokensDetails) {
        this.promptTokens = promptTokens;
        this.totalTokens = totalTokens;
        this.promptTokensDetails = promptTokensDetails;
    }

    public MultimodalEmbeddingUsage() {
    }

    public long getPromptTokens() {
        return promptTokens;
    }

    public void setPromptTokens(long promptTokens) {
        this.promptTokens = promptTokens;
    }

    public long getTotalTokens() {
        return totalTokens;
    }

    public void setTotalTokens(long totalTokens) {
        this.totalTokens = totalTokens;
    }

    public MultimodalEmbeddingPromptTokensDetails getPromptTokensDetails() {
        return promptTokensDetails;
    }

    public void setPromptTokensDetails(MultimodalEmbeddingPromptTokensDetails promptTokensDetails) {
        this.promptTokensDetails = promptTokensDetails;
    }

    @Override
    public String toString() {
        return "Usage{" +
                "promptTokens=" + promptTokens +
                ", totalTokens=" + totalTokens +
                ", promptTokensDetails=" + promptTokensDetails +
                '}';
    }
}
