package com.volcengine.ark.runtime.model.responses.event.doubaoapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;

public class DoubaoAppCallFailedEvent extends ItemEvent {

    @JsonProperty("error_message")
    private String errorMessage;

    public DoubaoAppCallFailedEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_FAILED);
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "DoubaoAppCallFailedEvent{" +
                "type='" + getType() + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", sequenceNumber=" + getSequenceNumber() +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private DoubaoAppCallFailedEvent event = new DoubaoAppCallFailedEvent();

        public Builder errorMessage(String errorMessage) {
            event.setErrorMessage(errorMessage);
            return this;
        }

        public DoubaoAppCallFailedEvent build() {
            return event;
        }
    }
}
