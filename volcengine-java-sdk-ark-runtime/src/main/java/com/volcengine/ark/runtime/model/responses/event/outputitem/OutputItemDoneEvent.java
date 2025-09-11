package com.volcengine.ark.runtime.model.responses.event.outputitem;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;
import com.volcengine.ark.runtime.model.responses.item.BaseItem;
import com.volcengine.ark.runtime.model.responses.item.OutputItem;

public class OutputItemDoneEvent extends OutputEvent {

    @JsonProperty("item")
    protected BaseItem item;

    public BaseItem getItem() {
        return item;
    }

    public void setItem(BaseItem item) {
        this.item = item;
    }


    public OutputItemDoneEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_OUTPUT_ITEM_DONE);
    }

    @Override
    public String toString() {
        return "OutputItemDoneEvent{" +
                "item=" + item +
                ", outputIndex=" + outputIndex +
                ", type='" + type + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                '}';
    }
}