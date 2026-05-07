package com.volcengine.ark.runtime.model.responses.event.agenttoolcall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;

public class AgentToolCallInProgressEvent extends ItemEvent {

    @JsonProperty("name")
    private String name;

    public AgentToolCallInProgressEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_AGENT_TOOL_CALL_IN_PROGRESS);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AgentToolCallInProgressEvent{" +
                "type='" + getType() + '\'' +
                ", name='" + name + '\'' +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", sequenceNumber=" + getSequenceNumber() +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private AgentToolCallInProgressEvent event = new AgentToolCallInProgressEvent();

        public Builder name(String name) {
            event.setName(name);
            return this;
        }

        public AgentToolCallInProgressEvent build() {
            return event;
        }
    }
}
