package com.volcengine.ark.runtime.model.responses.event.doubaoapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;

public class DoubaoAppCallOutputTextDeltaEvent extends ItemEvent {

    @JsonProperty("block_index")
    private Long blockIndex;

    @JsonProperty("delta")
    private String delta;

    public DoubaoAppCallOutputTextDeltaEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_OUTPUT_TEXT_DELTA);
    }

    public Long getBlockIndex() {
        return blockIndex;
    }

    public void setBlockIndex(Long blockIndex) {
        this.blockIndex = blockIndex;
    }

    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }

    @Override
    public String toString() {
        return "DoubaoAppCallOutputTextDeltaEvent{" +
                "type='" + getType() + '\'' +
                ", blockIndex=" + blockIndex +
                ", delta='" + delta + '\'' +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", sequenceNumber=" + getSequenceNumber() +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private DoubaoAppCallOutputTextDeltaEvent event = new DoubaoAppCallOutputTextDeltaEvent();

        public Builder blockIndex(Long blockIndex) {
            event.setBlockIndex(blockIndex);
            return this;
        }

        public Builder delta(String delta) {
            event.setDelta(delta);
            return this;
        }

        public DoubaoAppCallOutputTextDeltaEvent build() {
            return event;
        }
    }
}
