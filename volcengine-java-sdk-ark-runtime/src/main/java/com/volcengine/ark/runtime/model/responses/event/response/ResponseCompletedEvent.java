package com.volcengine.ark.runtime.model.responses.event.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.StreamEvent;
import com.volcengine.ark.runtime.model.responses.response.ResponseObject;

public class ResponseCompletedEvent extends StreamEvent {
    @JsonProperty("response")
    private ResponseObject response;

    public ResponseObject getResponse() {
        return response;
    }

    public void setResponse(ResponseObject response) {
        this.response = response;
    }

    public ResponseCompletedEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_COMPLETED);
    }

    @Override
    public String toString() {
        return "ResponseCompletedEvent{" +
                "type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                ", response=" + response +
                '}';
    }


}