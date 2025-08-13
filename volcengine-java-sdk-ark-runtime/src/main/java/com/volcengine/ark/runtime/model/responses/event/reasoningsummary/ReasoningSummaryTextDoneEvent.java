package com.volcengine.ark.runtime.model.responses.event.reasoningsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;

public class ReasoningSummaryTextDoneEvent extends ItemEvent {
    @JsonProperty("summary_index")
    private Long summaryIndex;

    @JsonProperty("text")
    private String text;

    public Long getSummaryIndex() {
        return summaryIndex;
    }

    public void setSummaryIndex(Long summaryIndex) {
        this.summaryIndex = summaryIndex;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ReasoningSummaryTextDoneEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_REASONING_SUMMARY_TEXT_DONE);
    }

    @Override
    public String toString() {
        return "ReasoningSummaryTextDoneEvent{" +
                "summaryIndex=" + summaryIndex +
                ", text='" + text + '\'' +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                '}';
    }
}