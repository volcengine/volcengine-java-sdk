package com.volcengine.ark.runtime.model.responses.event.doubaoapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;

public class DoubaoAppCallSearchInProgressEvent extends ItemEvent {

    @JsonProperty("block_index")
    private Long blockIndex;

    public DoubaoAppCallSearchInProgressEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_DOUBAO_APP_CALL_SEARCH_IN_PROGRESS);
    }

    public Long getBlockIndex() {
        return blockIndex;
    }

    public void setBlockIndex(Long blockIndex) {
        this.blockIndex = blockIndex;
    }

    @Override
    public String toString() {
        return "DoubaoAppCallSearchInProgressEvent{" +
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

        private DoubaoAppCallSearchInProgressEvent event = new DoubaoAppCallSearchInProgressEvent();

        public Builder blockIndex(Long blockIndex) {
            event.setBlockIndex(blockIndex);
            return this;
        }

        public DoubaoAppCallSearchInProgressEvent build() {
            return event;
        }
    }
}
