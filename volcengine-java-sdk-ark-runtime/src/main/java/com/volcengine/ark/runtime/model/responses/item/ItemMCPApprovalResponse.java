package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemMCPApprovalResponse extends BaseItem implements InputItem {

    @JsonProperty("approve")
    private Boolean approve;

    @JsonProperty("approval_request_id")
    private String approvalRequestId;

    public ItemMCPApprovalResponse(String type) {
        super(ResponsesConstants.ITEM_TYPE_MCP_APPROVAL_RESPONSE);
    }

    public Boolean getApprove() {
        return approve;
    }

    public void setApprove(Boolean approve) {
        this.approve = approve;
    }

    public String getApprovalRequestId() {
        return approvalRequestId;
    }

    public void setApprovalRequestId(String approvalRequestId) {
        this.approvalRequestId = approvalRequestId;
    }

    @Override
    public String toString() {
        return "ItemMCPApprovalResponse{" +
                "approve=" + approve +
                ", approvalRequestId='" + approvalRequestId + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private Boolean approve;
        private String approvalRequestId;

        private Builder() {
        }

        public Builder approve(Boolean approve) {
            this.approve = approve;
            return this;
        }

        public Builder approvalRequestId(String approvalRequestId) {
            this.approvalRequestId = approvalRequestId;
            return this;
        }

        public ItemMCPApprovalResponse build() {
            ItemMCPApprovalResponse itemMCPApprovalResponse = new ItemMCPApprovalResponse(null);
            itemMCPApprovalResponse.setApprove(approve);
            itemMCPApprovalResponse.setApprovalRequestId(approvalRequestId);
            return itemMCPApprovalResponse;
        }
    }
}
