package com.volcengine.ark.runtime.model.responses.event;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemEvent extends OutputEvent {
    @JsonProperty("item_id")
    protected String itemId;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public ItemEvent(String type) {
        super(type);
    }
}
