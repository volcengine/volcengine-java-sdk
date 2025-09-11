package com.volcengine.ark.runtime.model.responses.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReasoningSummaryPart {
    @JsonProperty("type")
    private String type;

    @JsonProperty("text")
    private String text;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ReasoningSummaryPart{" +
                "type='" + type + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String type;
        private String text;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public ReasoningSummaryPart build() {
            ReasoningSummaryPart reasoningSummaryPart = new ReasoningSummaryPart();
            reasoningSummaryPart.setType(type);
            reasoningSummaryPart.setText(text);
            return reasoningSummaryPart;
        }
    }
}