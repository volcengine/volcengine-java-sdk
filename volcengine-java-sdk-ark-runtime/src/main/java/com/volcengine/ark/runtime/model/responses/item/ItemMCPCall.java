package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemMCPCall extends BaseItem implements InputItem, OutputItem {

    @JsonProperty("id")
    private String id;

    @JsonProperty("server_label")
    private String serverLabel;

    @JsonProperty("approval_request_id")
    private String approvalRequestId;

    @JsonProperty("arguments")
    private String arguments;

    @JsonProperty("error")
    private String error;

    @JsonProperty("name")
    private String name;

    @JsonProperty("output")
    private String output;

    public ItemMCPCall() {
        super(ResponsesConstants.ITEM_TYPE_MCP_CALL);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServerLabel() {
        return serverLabel;
    }

    public void setServerLabel(String serverLabel) {
        this.serverLabel = serverLabel;
    }

    public String getApprovalRequestId() {
        return approvalRequestId;
    }

    public void setApprovalRequestId(String approvalRequestId) {
        this.approvalRequestId = approvalRequestId;
    }

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "ItemMCPCall{" +
                "id='" + id + '\'' +
                ", serverLabel='" + serverLabel + '\'' +
                ", approvalRequestId='" + approvalRequestId + '\'' +
                ", arguments='" + arguments + '\'' +
                ", error='" + error + '\'' +
                ", name='" + name + '\'' +
                ", output='" + output + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String output;
        private String name;
        private String error;
        private String arguments;
        private String approvalRequestId;
        private String serverLabel;
        private String id;

        private Builder() {
        }

        public Builder output(String output) {
            this.output = output;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder error(String error) {
            this.error = error;
            return this;
        }

        public Builder arguments(String arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder approvalRequestId(String approvalRequestId) {
            this.approvalRequestId = approvalRequestId;
            return this;
        }

        public Builder serverLabel(String serverLabel) {
            this.serverLabel = serverLabel;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public ItemMCPCall build() {
            ItemMCPCall itemMCPCall = new ItemMCPCall();
            itemMCPCall.setOutput(output);
            itemMCPCall.setName(name);
            itemMCPCall.setError(error);
            itemMCPCall.setArguments(arguments);
            itemMCPCall.setApprovalRequestId(approvalRequestId);
            itemMCPCall.setServerLabel(serverLabel);
            itemMCPCall.setId(id);
            return itemMCPCall;
        }
    }
}
