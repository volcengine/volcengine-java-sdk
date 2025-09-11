package com.volcengine.ark.runtime.model.responses.event.outputtext;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;

public class OutputTextDoneEvent extends ItemEvent {
    @JsonProperty("content_index")
    private Long contentIndex;
    @JsonProperty("text")
    private String text;

    public Long getContentIndex() {
        return contentIndex;
    }

    public void setContentIndex(Long contentIndex) {
        this.contentIndex = contentIndex;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public OutputTextDoneEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_OUTPUT_TEXT_DONE);
    }

    @Override
    public String toString() {
        return "OutputTextDoneEvent{" +
                "contentIndex=" + contentIndex +
                ", text='" + text + '\'' +
                ", itemId='" + itemId + '\'' +
                ", outputIndex=" + outputIndex +
                ", type='" + type + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                '}';
    }
}