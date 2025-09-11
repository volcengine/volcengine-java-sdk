package com.volcengine.ark.runtime.model.responses.event.mcp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;

public class MCPListToolCompletedEvent extends OutputEvent {

    @JsonProperty("item_id")
    private String itemId;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public MCPListToolCompletedEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_MCP_LIST_TOOLS_COMPLETED);
    }

    @Override
    public String toString() {
        return "MCPListToolCompletedEvent{" +
                "itemId='" + itemId + '\'' +
                ", outputIndex=" + outputIndex +
                ", type='" + type + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                '}';
    }
}
