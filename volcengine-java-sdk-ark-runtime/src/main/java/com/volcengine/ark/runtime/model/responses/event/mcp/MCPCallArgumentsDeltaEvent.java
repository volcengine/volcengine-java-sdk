package com.volcengine.ark.runtime.model.responses.event.mcp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;

public class MCPCallArgumentsDeltaEvent extends OutputEvent {

    @JsonProperty("item_id")
    private String itemId;

    @JsonProperty("delta")
    private String delta;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }

    public MCPCallArgumentsDeltaEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_MCP_CALL_ARGUMENTS_DELTA);
    }

    @Override
    public String toString() {
        return "MCPCallArgumentsDeltaEvent{" +
                "itemId='" + itemId + '\'' +
                ", delta='" + delta + '\'' +
                ", outputIndex=" + outputIndex +
                ", type='" + type + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                '}';
    }
}
