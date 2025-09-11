package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemReference extends BaseItem implements InputItem {
    @JsonProperty("id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ItemReference() {
        super(ResponsesConstants.ITEM_TYPE_ITEM_REFERENCE);
    }

    @Override
    public String toString() {
        return "ItemReference{" +
                "id='" + id + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String id;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public ItemReference build() {
            ItemReference itemReference = new ItemReference();
            itemReference.setId(id);
            return itemReference;
        }
    }
}