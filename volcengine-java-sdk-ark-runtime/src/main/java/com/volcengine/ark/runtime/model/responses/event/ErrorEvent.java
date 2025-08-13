package com.volcengine.ark.runtime.model.responses.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

public class ErrorEvent extends StreamEvent {
    @JsonProperty("code")
    private String code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("param")
    private String param;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public ErrorEvent() {
        super(ResponsesConstants.EVENT_TYPE_ERROR);
    }

    @Override
    public String toString() {
        return "ErrorEvent{" +
                "type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", param='" + param + '\'' +
                '}';
    }

}