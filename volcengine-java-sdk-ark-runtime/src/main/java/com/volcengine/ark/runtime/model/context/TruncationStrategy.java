package com.volcengine.ark.runtime.model.context;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TruncationStrategy {

    @JsonProperty("type")
    private String type;

    @JsonProperty("last_history_tokens")
    private Integer lastHistoryTokens;

    @JsonProperty("rolling_tokens")
    private Boolean rollingTokens;

    public TruncationStrategy() {
    }

    public TruncationStrategy(String type, Integer lastHistoryTokens) {
        this.type = type;
        this.lastHistoryTokens = lastHistoryTokens;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLastHistoryTokens() {
        return lastHistoryTokens;
    }

    public void setLastHistoryTokens(Integer lastHistoryTokens) {
        this.lastHistoryTokens = lastHistoryTokens;
    }

    public Boolean getRollingTokens() {
        return rollingTokens;
    }

    public void setRollingTokens(Boolean rollingTokens) {
        this.rollingTokens = rollingTokens;
    }

    @Override
    public String toString() {
        return "TruncationStrategy{" +
                "type='" + type + '\'' +
                ", lastHistoryTokens=" + lastHistoryTokens +
                ", rollingTokens=" + rollingTokens +
                '}';
    }

    public static TruncationStrategy.Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer lastHistoryTokens;
        private String type;
        private Boolean rollingTokens;

        private Builder() {
        }

        public Builder lastHistoryTokens(Integer LastHistoryTokens) {
            this.lastHistoryTokens = LastHistoryTokens;
            return this;
        }

        public Builder type(String Type) {
            this.type = Type;
            return this;
        }

        public Builder rollingTokens(Boolean RollingTokens) {
            this.rollingTokens = RollingTokens;
            return this;
        }

        public TruncationStrategy build() {
            TruncationStrategy truncationStrategy = new TruncationStrategy();
            truncationStrategy.setLastHistoryTokens(lastHistoryTokens);
            truncationStrategy.setType(type);
            truncationStrategy.setRollingTokens(rollingTokens);
            return truncationStrategy;
        }
    }
}
