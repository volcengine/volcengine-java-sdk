package com.volcengine.ark.runtime.model.responses.event.outputtext;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;

public class OutputTextDeltaEvent extends ItemEvent {
    @JsonProperty("content_index")
    private Long contentIndex;
    @JsonProperty("delta")
    private String delta;

    public Long getContentIndex() {
        return contentIndex;
    }

    public void setContentIndex(Long contentIndex) {
        this.contentIndex = contentIndex;
    }

    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }

    public OutputTextDeltaEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_OUTPUT_TEXT_DELTA);
    }

    @Override
    public String toString() {
        return "OutputTextDeltaEvent{" +
                "contentIndex=" + contentIndex +
                ", delta='" + delta + '\'' +
                ", itemId='" + itemId + '\'' +
                ", outputIndex=" + outputIndex +
                ", type='" + type + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                '}';
    }
}