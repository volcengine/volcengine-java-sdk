package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemMCPApprovalRequest extends BaseItem implements InputItem, OutputItem {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("arguments")
    private String arguments;

    @JsonProperty("server_label")
    private String serverLabel;

    public ItemMCPApprovalRequest(String type) {
        super(ResponsesConstants.ITEM_TYPE_MCP_APPROVAL_REQUEST);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public String getServerLabel() {
        return serverLabel;
    }

    public void setServerLabel(String serverLabel) {
        this.serverLabel = serverLabel;
    }


    @Override
    public String toString() {
        return "ItemMCPApprovalRequest{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", arguments='" + arguments + '\'' +
                ", serverLabel='" + serverLabel + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String id;
        private String name;
        private String arguments;
        private String serverLabel;

        private Builder() {
        }

        public static Builder anItemMCPApprovalRequest() {
            return new Builder();
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder arguments(String arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder serverLabel(String serverLabel) {
            this.serverLabel = serverLabel;
            return this;
        }

        public ItemMCPApprovalRequest build() {
            ItemMCPApprovalRequest itemMCPApprovalRequest = new ItemMCPApprovalRequest(null);
            itemMCPApprovalRequest.setId(id);
            itemMCPApprovalRequest.setName(name);
            itemMCPApprovalRequest.setArguments(arguments);
            itemMCPApprovalRequest.setServerLabel(serverLabel);
            return itemMCPApprovalRequest;
        }
    }
}
