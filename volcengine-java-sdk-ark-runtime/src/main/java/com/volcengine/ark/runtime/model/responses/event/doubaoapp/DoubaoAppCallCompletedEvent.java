package com.volcengine.ark.runtime.model.responses.event.doubaoapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.item.doubaoapp.DoubaoAppCallBlock;

import java.util.List;

public class DoubaoAppCallCompletedEvent extends ItemEvent {

    @JsonProperty("feature")
    private String feature;

    @JsonProperty("blocks")
    private List<DoubaoAppCallBlock> blocks;

    public DoubaoAppCallCompletedEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_COMPLETED);
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public List<DoubaoAppCallBlock> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<DoubaoAppCallBlock> blocks) {
        this.blocks = blocks;
    }

    @Override
    public String toString() {
        return "DoubaoAppCallCompletedEvent{" +
                "type='" + getType() + '\'' +
                ", feature='" + feature + '\'' +
                ", blocks=" + blocks +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", sequenceNumber=" + getSequenceNumber() +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private DoubaoAppCallCompletedEvent event = new DoubaoAppCallCompletedEvent();

        public Builder feature(String feature) {
            event.setFeature(feature);
            return this;
        }

        public Builder blocks(List<DoubaoAppCallBlock> blocks) {
            event.setBlocks(blocks);
            return this;
        }

        public DoubaoAppCallCompletedEvent build() {
            return event;
        }
    }
}
