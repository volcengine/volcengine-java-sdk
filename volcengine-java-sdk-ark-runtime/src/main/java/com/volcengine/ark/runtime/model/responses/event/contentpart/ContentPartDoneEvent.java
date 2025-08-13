package com.volcengine.ark.runtime.model.responses.event.contentpart;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.content.OutputContentItem;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;

public class ContentPartDoneEvent extends ItemEvent {
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

    public ContentPartDoneEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_CONTENT_PART_DONE);
    }

    @Override
    public String toString() {
        return "ContentPartDoneEvent{" +
                "type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", contentIndex=" + contentIndex +
                ", part=" + part +
                '}';
    }


}