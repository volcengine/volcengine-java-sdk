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

    @JsonProperty("max_window_tokens")
    private Integer maxWindowTokens;

    @JsonProperty("rolling_window_tokens")
    private Integer rollingWindowTokens;

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

    public Integer getMaxWindowTokens() {
        return maxWindowTokens;
    }

    public void setMaxWindowTokens(Integer maxWindowTokens) {
        this.maxWindowTokens = maxWindowTokens;
    }

    public Integer getRollingWindowTokens() {
        return rollingWindowTokens;
    }

    public void setRollingWindowTokens(Integer rollingWindowTokens) {
        this.rollingWindowTokens = rollingWindowTokens;
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
        private Integer maxWindowTokens;
        private Integer rollingWindowTokens;

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

        public Builder maxWindowTokens(Integer MaxWindowTokens) {
            this.maxWindowTokens = MaxWindowTokens;
            return this;
        }

        public Builder rollingWindowTokens(Integer RollingWindowTokens) {
            this.rollingWindowTokens = RollingWindowTokens;
            return this;
        }

        public TruncationStrategy build() {
            TruncationStrategy truncationStrategy = new TruncationStrategy();
            truncationStrategy.setLastHistoryTokens(lastHistoryTokens);
            truncationStrategy.setType(type);
            truncationStrategy.setRollingTokens(rollingTokens);
            truncationStrategy.setMaxWindowTokens(maxWindowTokens);
            truncationStrategy.setRollingWindowTokens(rollingWindowTokens);
            return truncationStrategy;
        }
    }
}
