package com.volcengine.ark.runtime.model.responses.event.doubaoapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;

public class DoubaoAppCallReasoningSearchSearchingEvent extends ItemEvent {

    @JsonProperty("block_index")
    private Long blockIndex;

    @JsonProperty("searching_state")
    private String searchingState;

    public DoubaoAppCallReasoningSearchSearchingEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_REASONING_SEARCH_SEARCHING);
    }

    public Long getBlockIndex() {
        return blockIndex;
    }

    public void setBlockIndex(Long blockIndex) {
        this.blockIndex = blockIndex;
    }

    public String getSearchingState() {
        return searchingState;
    }

    public void setSearchingState(String searchingState) {
        this.searchingState = searchingState;
    }

    @Override
    public String toString() {
        return "DoubaoAppCallReasoningSearchSearchingEvent{" +
                "type='" + getType() + '\'' +
                ", blockIndex=" + blockIndex +
                ", searchingState='" + searchingState + '\'' +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", sequenceNumber=" + getSequenceNumber() +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private DoubaoAppCallReasoningSearchSearchingEvent event = new DoubaoAppCallReasoningSearchSearchingEvent();

        public Builder blockIndex(Long blockIndex) {
            event.setBlockIndex(blockIndex);
            return this;
        }

        public Builder searchingState(String searchingState) {
            event.setSearchingState(searchingState);
            return this;
        }

        public DoubaoAppCallReasoningSearchSearchingEvent build() {
            return event;
        }
    }
}
