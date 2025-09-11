package com.volcengine.ark.runtime.model.responses.event.reasoningsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;
import com.volcengine.ark.runtime.model.responses.content.ReasoningSummaryPart;

public class ReasoningSummaryPartDoneEvent extends ItemEvent {
    @JsonProperty("summary_index")
    private Long summaryIndex;

    @JsonProperty("part")
    private ReasoningSummaryPart part;

    public Long getSummaryIndex() {
        return summaryIndex;
    }

    public void setSummaryIndex(Long summaryIndex) {
        this.summaryIndex = summaryIndex;
    }

    public ReasoningSummaryPart getPart() {
        return part;
    }

    public void setPart(ReasoningSummaryPart part) {
        this.part = part;
    }

    public ReasoningSummaryPartDoneEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_REASONING_SUMMARY_PART_DONE);
    }

    @Override
    public String toString() {
        return "ReasoningSummaryPartDoneEvent{" +
                "summaryIndex=" + summaryIndex +
                ", part=" + part +
                ", itemId='" + itemId + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                '}';
    }
}