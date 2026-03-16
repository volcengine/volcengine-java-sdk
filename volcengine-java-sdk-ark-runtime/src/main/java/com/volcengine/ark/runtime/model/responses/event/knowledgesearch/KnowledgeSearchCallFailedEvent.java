package com.volcengine.ark.runtime.model.responses.event.knowledgesearch;

import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;

public class KnowledgeSearchCallFailedEvent extends ItemEvent {

    public KnowledgeSearchCallFailedEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_KNOWLEDGE_SEARCH_CALL_FAILED);
    }

    @Override
    public String toString() {
        return "KnowledgeSearchCallFailedEvent{" +
                "type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                '}';
    }
}
