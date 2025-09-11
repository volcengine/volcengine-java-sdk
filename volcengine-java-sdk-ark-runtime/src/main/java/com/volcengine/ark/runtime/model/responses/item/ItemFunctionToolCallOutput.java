package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemFunctionToolCallOutput extends BaseItem implements InputItem {
    @JsonProperty("output")
    private String output;

    @JsonProperty("call_id")
    private String callId;

    @JsonProperty("id")
    private String id;

    @JsonProperty("status")
    private String status;

    public ItemFunctionToolCallOutput() {
        super(ResponsesConstants.ITEM_TYPE_FUNCTION_CALL_OUTPUT);
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
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
        return "ItemFunctionToolCallOutput{" +
                "output='" + output + '\'' +
                ", callId='" + callId + '\'' +
                ", type='" + getType() + '\'' +
                ", id='" + id + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String output;
        private String callId;
        private String id;
        private String status;

        public Builder output(String output) {
            this.output = output;
            return this;
        }

        public Builder callId(String callId) {
            this.callId = callId;
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

        public ItemFunctionToolCallOutput build() {
            ItemFunctionToolCallOutput itemFunctionToolCallOutput = new ItemFunctionToolCallOutput();
            itemFunctionToolCallOutput.setOutput(output);
            itemFunctionToolCallOutput.setCallId(callId);
            itemFunctionToolCallOutput.setId(id);
            itemFunctionToolCallOutput.setStatus(status);
            return itemFunctionToolCallOutput;
        }
    }
}