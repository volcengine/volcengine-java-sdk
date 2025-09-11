package com.volcengine.ark.runtime.model.responses.event.mcp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;

public class MCPCallCompletedEvent extends OutputEvent {

    @JsonProperty("item_id")
    private String itemId;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public MCPCallCompletedEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_MCP_CALL_COMPLETED);
    }

    @Override
    public String toString() {
        return "MCPCallCompletedEvent{" +
                "itemId='" + itemId + '\'' +
                ", outputIndex=" + outputIndex +
                ", type='" + type + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                '}';
    }
}
