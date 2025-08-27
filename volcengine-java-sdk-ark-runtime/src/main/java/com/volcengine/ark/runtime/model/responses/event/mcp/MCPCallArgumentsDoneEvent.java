package com.volcengine.ark.runtime.model.responses.event.mcp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;

public class MCPCallArgumentsDoneEvent extends OutputEvent {

    @JsonProperty("item_id")
    private String itemId;

    @JsonProperty("arguments")
    private String arguments;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public MCPCallArgumentsDoneEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_MCP_CALL_ARGUMENTS_DONE);
    }

    @Override
    public String toString() {
        return "MCPCallArgumentsDoneEvent{" +
                "itemId='" + itemId + '\'' +
                ", arguments='" + arguments + '\'' +
                ", outputIndex=" + outputIndex +
                ", type='" + type + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                '}';
    }
}
