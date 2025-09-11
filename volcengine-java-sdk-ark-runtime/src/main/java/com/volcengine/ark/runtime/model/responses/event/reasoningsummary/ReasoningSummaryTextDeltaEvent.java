package com.volcengine.ark.runtime.model.responses.event.reasoningsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;

public class ReasoningSummaryTextDeltaEvent extends ItemEvent {
    @JsonProperty("summary_index")
    private Long summaryIndex;

    @JsonProperty("delta")
    private String delta;

    public Long getSummaryIndex() {
        return summaryIndex;
    }

    public void setSummaryIndex(Long summaryIndex) {
        this.summaryIndex = summaryIndex;
    }

    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }

    public ReasoningSummaryTextDeltaEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_REASONING_SUMMARY_TEXT_DELTA);
    }

    @Override
    public String toString() {
        return "ReasoningSummaryTextDeltaEvent{" +
                "summaryIndex=" + summaryIndex +
                ", delta='" + delta + '\'' +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                '}';
    }
}