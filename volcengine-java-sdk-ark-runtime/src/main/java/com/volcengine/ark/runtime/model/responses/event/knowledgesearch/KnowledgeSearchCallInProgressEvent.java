package com.volcengine.ark.runtime.model.responses.event.knowledgesearch;

import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;

public class KnowledgeSearchCallInProgressEvent extends ItemEvent {

    public KnowledgeSearchCallInProgressEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_KNOWLEDGE_SEARCH_CALL_IN_PROGRESS);
    }

    @Override
    public String toString() {
        return "KnowledgeSearchCallInProgressEvent{" +
                "type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                '}';
    }
}
