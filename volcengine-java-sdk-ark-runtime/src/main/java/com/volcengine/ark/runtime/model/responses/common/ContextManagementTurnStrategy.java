package com.volcengine.ark.runtime.model.responses.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContextManagementTurnStrategy {
    @JsonProperty("type")
    private String type;

    @JsonProperty("value")
    private Integer value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ContextManagementTurnStrategy{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String type;
        private Integer value;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder value(Integer value) {
            this.value = value;
            return this;
        }

        public ContextManagementTurnStrategy build() {
            ContextManagementTurnStrategy strategy = new ContextManagementTurnStrategy();
            strategy.setType(type);
            strategy.setValue(value);
            return strategy;
        }
    }
}
