package com.volcengine.ark.runtime.model.responses.event.knowledgesearch;

import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;

public class KnowledgeSearchCallSearchingEvent extends ItemEvent {

    public KnowledgeSearchCallSearchingEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_KNOWLEDGE_SEARCH_CALL_SEARCHING);
    }

    @Override
    public String toString() {
        return "KnowledgeSearchCallSearchingEvent{" +
                "type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                '}';
    }
}
