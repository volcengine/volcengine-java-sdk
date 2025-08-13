package com.volcengine.ark.runtime.model.responses.event.outputitem;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;
import com.volcengine.ark.runtime.model.responses.item.BaseItem;

public class OutputItemAddedEvent extends OutputEvent {
    @JsonProperty("item")
    protected BaseItem item;

    public BaseItem getItem() {
        return item;
    }

    public void setItem(BaseItem item) {
        this.item = item;
    }


    public OutputItemAddedEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_OUTPUT_ITEM_ADDED);
    }

    @Override
    public String toString() {
        return "OutputItemAddedEvent{" +
                "item=" + item +
                ", outputIndex=" + outputIndex +
                ", type='" + type + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                '}';
    }
}
