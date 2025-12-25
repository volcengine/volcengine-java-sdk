package com.volcengine.ark.runtime.model.responses.event.doubaoapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.item.doubaoapp.DoubaoAppCallBlock;

public class DoubaoAppCallBlockAddedEvent extends ItemEvent {

    @JsonProperty("block")
    private DoubaoAppCallBlock block;

    public DoubaoAppCallBlockAddedEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_DOUBAO_APP_CALL_BLOCK_ADDED);
    }

    public DoubaoAppCallBlock getBlock() {
        return block;
    }

    public void setBlock(DoubaoAppCallBlock block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "DoubaoAppCallBlockAddedEvent{" +
                "type='" + getType() + '\'' +
                ", block=" + block +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", sequenceNumber=" + getSequenceNumber() +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private DoubaoAppCallBlockAddedEvent event = new DoubaoAppCallBlockAddedEvent();

        public Builder block(DoubaoAppCallBlock block) {
            event.setBlock(block);
            return this;
        }

        public DoubaoAppCallBlockAddedEvent build() {
            return event;
        }
    }
}
