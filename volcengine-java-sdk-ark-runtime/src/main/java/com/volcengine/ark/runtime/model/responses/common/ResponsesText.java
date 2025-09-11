package com.volcengine.ark.runtime.model.responses.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponsesText {
    @JsonProperty("format")
    private ResponsesTextFormat format;

    public ResponsesTextFormat getFormat() {
        return format;
    }

    public void setFormat(ResponsesTextFormat format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "ResponsesText{" +
                "format=" + format +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private ResponsesTextFormat format;

        public Builder format(ResponsesTextFormat format) {
            this.format = format;
            return this;
        }

        public ResponsesText build() {
            ResponsesText responsesText = new ResponsesText();
            responsesText.setFormat(format);
            return responsesText;
        }
    }
}