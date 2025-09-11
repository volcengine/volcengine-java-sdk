package com.volcengine.ark.runtime.model.responses.content;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.tool.websearch.Annotation;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

import java.util.List;

public class OutputContentItemText extends OutputContentItem {

    @JsonProperty("text")
    private String text;

    @JsonProperty("annotations")
    private List<Annotation> annotations;

    public OutputContentItemText() {
        super(ResponsesConstants.CONTENT_ITEM_TYPE_OUTPUT_TEXT);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Annotation> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<Annotation> annotations) {
        this.annotations = annotations;
    }

    @Override
    public String toString() {
        return "OutputContentItemText{" +
                "type='" + getType() + '\'' +
                ", text='" + text + '\'' +
                ", annotations=" + annotations +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String text;
        private List<Annotation> annotations;


        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public Builder annotations(List<Annotation> annotations) {
            this.annotations = annotations;
            return this;
        }

        public OutputContentItemText build() {
            OutputContentItemText outputContentItemText = new OutputContentItemText();
            outputContentItemText.setText(text);
            outputContentItemText.setAnnotations(annotations);
            return outputContentItemText;
        }
    }
}