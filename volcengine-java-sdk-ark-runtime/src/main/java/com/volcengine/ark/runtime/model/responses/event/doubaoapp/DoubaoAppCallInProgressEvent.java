package com.volcengine.ark.runtime.model.responses.event.doubaoapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;

public class DoubaoAppCallInProgressEvent extends ItemEvent {

    @JsonProperty("feature")
private String feature;

    public DoubaoAppCallInProgressEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_DOUBAO_APP_CALL_IN_PROGRESS);
    }

    public String getFeature() {
    return feature;
}

public void setFeature(String feature) {
    this.feature = feature;
}

    @Override
    public String toString() {
        return "DoubaoAppCallInProgressEvent{" +
                "type='" + getType() + '\'' +
                ", feature='feature'" +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", sequenceNumber=" + getSequenceNumber() +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private DoubaoAppCallInProgressEvent event = new DoubaoAppCallInProgressEvent();

        public Builder feature(String feature) {
    event.setFeature(feature);
    return this;
}

        public DoubaoAppCallInProgressEvent build() {
            return event;
        }
    }
}
