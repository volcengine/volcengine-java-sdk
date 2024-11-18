package com.volcengine.ark.runtime.model.context;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TruncationStrategy {

    public static final String TRUNCATION_STRATEGY_TYPE_LAST_HISTORY_TOKENS = "last_history_tokens";

    @JsonProperty("type")
    private String Type;

    @JsonProperty("last_history_tokens")
    private Integer LastHistoryTokens;

    public TruncationStrategy() {
    }

    public TruncationStrategy(String type, Integer lastHistoryTokens) {
        Type = type;
        LastHistoryTokens = lastHistoryTokens;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Integer getLastHistoryTokens() {
        return LastHistoryTokens;
    }

    public void setLastHistoryTokens(Integer lastHistoryTokens) {
        LastHistoryTokens = lastHistoryTokens;
    }

    @Override
    public String toString() {
        return "TruncationStrategy{" +
                "Type='" + Type + '\'' +
                ", LastHistoryTokens=" + LastHistoryTokens +
                '}';
    }

    public static TruncationStrategy.Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer LastHistoryTokens;
        private String Type;

        private Builder() {
        }

        public Builder LastHistoryTokens(Integer LastHistoryTokens) {
            this.LastHistoryTokens = LastHistoryTokens;
            return this;
        }

        public Builder Type(String Type) {
            this.Type = Type;
            return this;
        }

        public TruncationStrategy build() {
            TruncationStrategy truncationStrategy = new TruncationStrategy();
            truncationStrategy.setLastHistoryTokens(LastHistoryTokens);
            truncationStrategy.setType(Type);
            return truncationStrategy;
        }
    }
}
