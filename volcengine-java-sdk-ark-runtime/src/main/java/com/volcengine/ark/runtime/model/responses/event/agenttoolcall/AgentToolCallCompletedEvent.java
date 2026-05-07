package com.volcengine.ark.runtime.model.responses.event.agenttoolcall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;

public class AgentToolCallCompletedEvent extends ItemEvent {

    @JsonProperty("name")
    private String name;

    public AgentToolCallCompletedEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_AGENT_TOOL_CALL_COMPLETED);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AgentToolCallCompletedEvent{" +
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
        private AgentToolCallCompletedEvent event = new AgentToolCallCompletedEvent();

        public Builder name(String name) {
            event.setName(name);
            return this;
        }

        public AgentToolCallCompletedEvent build() {
            return event;
        }
    }
}
