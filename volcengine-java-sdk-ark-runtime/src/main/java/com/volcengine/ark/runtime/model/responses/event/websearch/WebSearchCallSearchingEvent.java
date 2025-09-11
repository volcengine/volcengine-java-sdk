package com.volcengine.ark.runtime.model.responses.event.websearch;

import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;

public class WebSearchCallSearchingEvent extends ItemEvent {

    public WebSearchCallSearchingEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_WEB_SEARCH_CALL_SEARCHING);
    }

    @Override
    public String toString() {
        return "ResponseWebSearchCallSearchingEvent{" +
                "type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                '}';
    }


}