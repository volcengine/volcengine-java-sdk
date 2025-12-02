package com.volcengine.ark.runtime.model.responses.event.doubaoapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;

public class DoubaoAppCallReasoningSearchInProgressEvent extends ItemEvent {

    @JsonProperty("block_index")
    private Long blockIndex;

    public DoubaoAppCallReasoningSearchInProgressEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_REASONING_SEARCH_IN_PROGRESS);
    }

    public Long getBlockIndex() {
        return blockIndex;
    }

    public void setBlockIndex(Long blockIndex) {
        this.blockIndex = blockIndex;
    }

    @Override
    public String toString() {
        return "DoubaoAppCallReasoningSearchInProgressEvent{" +
                "type='" + getType() + '\'' +
                ", blockIndex=" + blockIndex +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", sequenceNumber=" + getSequenceNumber() +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private DoubaoAppCallReasoningSearchInProgressEvent event = new DoubaoAppCallReasoningSearchInProgressEvent();

        public Builder blockIndex(Long blockIndex) {
            event.setBlockIndex(blockIndex);
            return this;
        }

        public DoubaoAppCallReasoningSearchInProgressEvent build() {
            return event;
        }
    }
}
