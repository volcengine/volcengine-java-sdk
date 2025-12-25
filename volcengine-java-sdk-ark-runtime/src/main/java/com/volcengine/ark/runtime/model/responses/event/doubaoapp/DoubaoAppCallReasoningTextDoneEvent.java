package com.volcengine.ark.runtime.model.responses.event.doubaoapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;

public class DoubaoAppCallReasoningTextDoneEvent extends ItemEvent {

    @JsonProperty("block_index")
    private Long blockIndex;

    @JsonProperty("text")
    private String text;

    public DoubaoAppCallReasoningTextDoneEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_DOUBAO_APP_CALL_REASONING_TEXT_DONE);
    }

    public Long getBlockIndex() {
        return blockIndex;
    }

    public void setBlockIndex(Long blockIndex) {
        this.blockIndex = blockIndex;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "DoubaoAppCallReasoningTextDoneEvent{" +
                "type='" + getType() + '\'' +
                ", blockIndex=" + blockIndex +
                ", text='" + text + '\'' +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", sequenceNumber=" + getSequenceNumber() +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private DoubaoAppCallReasoningTextDoneEvent event = new DoubaoAppCallReasoningTextDoneEvent();

        public Builder blockIndex(Long blockIndex) {
            event.setBlockIndex(blockIndex);
            return this;
        }

        public Builder text(String text) {
            event.setText(text);
            return this;
        }

        public DoubaoAppCallReasoningTextDoneEvent build() {
            return event;
        }
    }
}
