package com.volcengine.ark.runtime.model.multimodalembeddings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MultimodalEmbeddingPromptTokensDetails {

    @JsonProperty("text_tokens")
    private Integer textTokens;

    @JsonProperty("image_tokens")
    private Integer imageTokens;

    public Integer getImageTokens() {
        return imageTokens;
    }

    public void setImageTokens(Integer imageTokens) {
        this.imageTokens = imageTokens;
    }

    public Integer getTextTokens() {
        return textTokens;
    }

    public void setTextTokens(Integer textTokens) {
        this.textTokens = textTokens;
    }

    @Override
    public String toString() {
        return "PromptTokensDetails{" +
                " textTokens=" + textTokens +
                ", imageTokens=" + imageTokens +
                '}';
    }
}
