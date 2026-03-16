package com.volcengine.ark.runtime.model.responses.event.knowledgesearch;

import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;

public class KnowledgeSearchCallCompletedEvent extends ItemEvent {

    public KnowledgeSearchCallCompletedEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_KNOWLEDGE_SEARCH_CALL_COMPLETED);
    }

    @Override
    public String toString() {
        return "KnowledgeSearchCallCompletedEvent{" +
                "type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                '}';
    }
}
