package com.volcengine.ark.runtime.model.responses.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = InputContentItemText.class, name = ResponsesConstants.CONTENT_ITEM_TYPE_INPUT_TEXT),
        @JsonSubTypes.Type(value = InputContentItemImage.class, name = ResponsesConstants.CONTENT_ITEM_TYPE_INPUT_IMAGE),
        @JsonSubTypes.Type(value = InputContentItemVideo.class, name = ResponsesConstants.CONTENT_ITEM_TYPE_INPUT_VIDEO),
})
public abstract class InputContentItem {
    @JsonProperty("type")
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public InputContentItem(String type) {
        this.type = type;
    }
}