package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type"
)
@JsonSubTypes({
        // Message types
        @JsonSubTypes.Type(value = BaseMessageItem.class, name = ResponsesConstants.ITEM_TYPE_MESSAGE),

        // Function call types
        @JsonSubTypes.Type(value = ItemFunctionToolCall.class, name = ResponsesConstants.ITEM_TYPE_FUNCTION_CALL),
        @JsonSubTypes.Type(value = ItemFunctionToolCallOutput.class, name = ResponsesConstants.ITEM_TYPE_FUNCTION_CALL_OUTPUT),

        // Other types
        @JsonSubTypes.Type(value = ItemReasoning.class, name = ResponsesConstants.ITEM_TYPE_REASONING),
        @JsonSubTypes.Type(value = ItemReference.class, name = ResponsesConstants.ITEM_TYPE_ITEM_REFERENCE),
        @JsonSubTypes.Type(value = ItemWebSearchCall.class, name = ResponsesConstants.ITEM_TYPE_WEB_SEARCH_CALL),
        @JsonSubTypes.Type(value = ItemImageProcess.class, name = ResponsesConstants.ITEM_TYPE_IMAGE_PROCESS),

        // MCP types
        @JsonSubTypes.Type(value = ItemMCPApprovalRequest.class, name = ResponsesConstants.ITEM_TYPE_MCP_APPROVAL_REQUEST),
        @JsonSubTypes.Type(value = ItemMCPApprovalResponse.class, name = ResponsesConstants.ITEM_TYPE_MCP_APPROVAL_RESPONSE),
        @JsonSubTypes.Type(value = ItemMCPListTools.class, name = ResponsesConstants.ITEM_TYPE_MCP_LIST_TOOLS),
        @JsonSubTypes.Type(value = ItemMCPCall.class, name = ResponsesConstants.ITEM_TYPE_MCP_CALL),
})
public class BaseItem {
    @JsonProperty("type")
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BaseItem(String type) {
        this.type = type;
    }
}