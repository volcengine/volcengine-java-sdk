package com.volcengine.ark.runtime.model.responses.event.functioncall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;

public class FunctionCallArgumentsDoneEvent extends ItemEvent {
    @JsonProperty("arguments")
    private String arguments;

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public FunctionCallArgumentsDoneEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_FUNCTION_CALL_ARGUMENTS_DONE);
    }

    @Override
    public String toString() {
        return "FunctionCallArgumentsDoneEvent{" +
                "arguments='" + arguments + '\'' +
                ", itemId='" + itemId + '\'' +
                ", outputIndex=" + outputIndex +
                ", type='" + type + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                '}';
    }
}