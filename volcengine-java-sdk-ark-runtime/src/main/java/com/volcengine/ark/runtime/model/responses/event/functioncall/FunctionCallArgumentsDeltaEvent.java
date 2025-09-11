package com.volcengine.ark.runtime.model.responses.event.functioncall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;

public class FunctionCallArgumentsDeltaEvent extends ItemEvent {
    @JsonProperty("delta")
    private String delta;

    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }

    public FunctionCallArgumentsDeltaEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_FUNCTION_CALL_ARGUMENTS_DELTA);
    }

    @Override
    public String toString() {
        return "FunctionCallArgumentsDeltaEvent{" +
                "delta='" + delta + '\'' +
                ", itemId='" + itemId + '\'' +
                ", outputIndex=" + outputIndex +
                ", type='" + type + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                '}';
    }
}