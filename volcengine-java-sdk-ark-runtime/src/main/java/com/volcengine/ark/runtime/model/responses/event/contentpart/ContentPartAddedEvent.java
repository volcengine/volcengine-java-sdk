package com.volcengine.ark.runtime.model.responses.event.contentpart;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.content.OutputContentItem;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;

public class ContentPartAddedEvent extends ItemEvent {
    @JsonProperty("content_index")
    private Long contentIndex;

    @JsonProperty("part")
    private OutputContentItem part;

    public Long getContentIndex() {
        return contentIndex;
    }

    public void setContentIndex(Long contentIndex) {
        this.contentIndex = contentIndex;
    }

    public OutputContentItem getPart() {
        return part;
    }

    public void setPart(OutputContentItem part) {
        this.part = part;
    }

    public ContentPartAddedEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_CONTENT_PART_ADDED);
    }

    @Override
    public String toString() {
        return "ContentPartAddedEvent{" +
                "type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", contentIndex=" + contentIndex +
                ", part=" + part +
                '}';
    }


}