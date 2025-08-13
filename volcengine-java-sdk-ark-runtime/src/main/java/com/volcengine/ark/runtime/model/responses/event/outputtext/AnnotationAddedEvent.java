package com.volcengine.ark.runtime.model.responses.event.outputtext;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.tool.websearch.Annotation;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;

import java.awt.*;

public class AnnotationAddedEvent extends ItemEvent {
    @JsonProperty("content_index") private Long contentIndex;
    @JsonProperty("delta") private String delta;
    @JsonProperty("text") private String text;
    @JsonProperty("annotation_index") private Long annotationIndex;
    @JsonProperty("annotation") private Annotation annotation;

    public Long getContentIndex() { return contentIndex; }
    public void setContentIndex(Long contentIndex) { this.contentIndex = contentIndex; }
    public String getDelta() { return delta; }
    public void setDelta(String delta) { this.delta = delta; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public Long getAnnotationIndex() { return annotationIndex; }
    public void setAnnotationIndex(Long annotationIndex) { this.annotationIndex = annotationIndex; }
    public Annotation getAnnotation() { return annotation; }
    public void setAnnotation(Annotation annotation) { this.annotation = annotation; }

    public AnnotationAddedEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_OUTPUT_TEXT_ANNOTATION_ADDED);
    }

    @Override
    public String toString() {
        return "AnnotationAddedEvent{" +
                "type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", contentIndex=" + contentIndex +
                ", delta='" + delta + '\'' +
                ", text='" + text + '\'' +
                ", annotationIndex=" + annotationIndex +
                ", annotation=" + annotation +
                '}';
    }


}