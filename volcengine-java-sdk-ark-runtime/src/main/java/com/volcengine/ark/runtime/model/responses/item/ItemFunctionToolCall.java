package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemFunctionToolCall extends BaseItem implements InputItem, OutputItem {
    @JsonProperty("arguments")
    private String arguments;

    @JsonProperty("call_id")
    private String callId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("status")
    private String status;

    public ItemFunctionToolCall() {
        super(ResponsesConstants.ITEM_TYPE_FUNCTION_CALL);
    }

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ItemFunctionToolCall{" +
                "arguments='" + arguments + '\'' +
                ", callId='" + callId + '\'' +
                ", name='" + name + '\'' +
                ", type='" + getType() + '\'' +
                ", id='" + id + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String arguments;
        private String callId;
        private String name;
        private String id;
        private String status;

        public Builder arguments(String arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder callId(String callId) {
            this.callId = callId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ItemFunctionToolCall build() {
            ItemFunctionToolCall itemFunctionToolCall = new ItemFunctionToolCall();
            itemFunctionToolCall.setArguments(arguments);
            itemFunctionToolCall.setCallId(callId);
            itemFunctionToolCall.setName(name);
            itemFunctionToolCall.setId(id);
            itemFunctionToolCall.setStatus(status);
            return itemFunctionToolCall;
        }
    }
}