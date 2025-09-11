package com.volcengine.ark.runtime.model.responses.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponsesThinking {
    @JsonProperty("type")
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ResponsesThinking{" +
                "type='" + type + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String type;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ResponsesThinking build() {
            ResponsesThinking responsesThinking = new ResponsesThinking();
            responsesThinking.setType(type);
            return responsesThinking;
        }
    }
}