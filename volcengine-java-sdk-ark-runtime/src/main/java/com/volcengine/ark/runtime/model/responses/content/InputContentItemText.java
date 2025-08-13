package com.volcengine.ark.runtime.model.responses.content;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

public class InputContentItemText extends InputContentItem {

    @JsonProperty("text")
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public InputContentItemText() {
        super(ResponsesConstants.CONTENT_ITEM_TYPE_INPUT_TEXT);
    }

    @Override
    public String toString() {
        return "InputContentItemText {\n{" +
                "type='" + getType() + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String text;

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public InputContentItemText build() {
            InputContentItemText responsesContentItemText = new InputContentItemText();
            responsesContentItemText.setText(text);
            return responsesContentItemText;
        }
    }
}