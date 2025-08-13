package com.volcengine.ark.runtime.model.responses.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.outputtext.AnnotationAddedEvent;
import com.volcengine.ark.runtime.model.responses.event.contentpart.ContentPartAddedEvent;
import com.volcengine.ark.runtime.model.responses.event.contentpart.ContentPartDoneEvent;
import com.volcengine.ark.runtime.model.responses.event.functioncall.FunctionCallArgumentsDeltaEvent;
import com.volcengine.ark.runtime.model.responses.event.functioncall.FunctionCallArgumentsDoneEvent;
import com.volcengine.ark.runtime.model.responses.event.imageprocess.ImageProcessCallInProgressEvent;
import com.volcengine.ark.runtime.model.responses.event.imageprocess.ImageProcessCallProcessingEvent;
import com.volcengine.ark.runtime.model.responses.event.imageprocess.ImageProcessCallCompletedEvent;
import com.volcengine.ark.runtime.model.responses.event.imageprocess.ImageProcessCallFailedEvent;
import com.volcengine.ark.runtime.model.responses.event.outputitem.OutputItemAddedEvent;
import com.volcengine.ark.runtime.model.responses.event.outputitem.OutputItemDoneEvent;
import com.volcengine.ark.runtime.model.responses.event.outputtext.OutputTextDeltaEvent;
import com.volcengine.ark.runtime.model.responses.event.outputtext.OutputTextDoneEvent;
import com.volcengine.ark.runtime.model.responses.event.reasoningsummary.ReasoningSummaryPartAddedEvent;
import com.volcengine.ark.runtime.model.responses.event.reasoningsummary.ReasoningSummaryPartDoneEvent;
import com.volcengine.ark.runtime.model.responses.event.reasoningsummary.ReasoningSummaryTextDeltaEvent;
import com.volcengine.ark.runtime.model.responses.event.reasoningsummary.ReasoningSummaryTextDoneEvent;
import com.volcengine.ark.runtime.model.responses.event.response.*;
import com.volcengine.ark.runtime.model.responses.event.websearch.WebSearchCallInProgressEvent;
import com.volcengine.ark.runtime.model.responses.event.websearch.WebSearchCallSearchingEvent;
import com.volcengine.ark.runtime.model.responses.event.websearch.WebSearchCallCompletedEvent;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ResponseCreatedEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_CREATED),
        @JsonSubTypes.Type(value = ResponseInProgressEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_IN_PROGRESS),
        @JsonSubTypes.Type(value = ResponseCompletedEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_COMPLETED),
        @JsonSubTypes.Type(value = ResponseFailedEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_FAILED),
        @JsonSubTypes.Type(value = ResponseInCompleteEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_INCOMPLETE),
        @JsonSubTypes.Type(value = OutputItemAddedEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_OUTPUT_ITEM_ADDED),
        @JsonSubTypes.Type(value = OutputItemDoneEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_OUTPUT_ITEM_DONE),
        @JsonSubTypes.Type(value = ContentPartAddedEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_CONTENT_PART_ADDED),
        @JsonSubTypes.Type(value = ContentPartDoneEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_CONTENT_PART_DONE),
        @JsonSubTypes.Type(value = OutputTextDeltaEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_OUTPUT_TEXT_DELTA),
        @JsonSubTypes.Type(value = OutputTextDoneEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_OUTPUT_TEXT_DONE),
        @JsonSubTypes.Type(value = AnnotationAddedEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_OUTPUT_TEXT_ANNOTATION_ADDED),
        @JsonSubTypes.Type(value = ReasoningSummaryTextDeltaEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_REASONING_SUMMARY_TEXT_DELTA),
        @JsonSubTypes.Type(value = ReasoningSummaryTextDoneEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_REASONING_SUMMARY_TEXT_DONE),
        @JsonSubTypes.Type(value = ReasoningSummaryPartAddedEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_REASONING_SUMMARY_PART_ADDED),
        @JsonSubTypes.Type(value = ReasoningSummaryPartDoneEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_REASONING_SUMMARY_PART_DONE),
        @JsonSubTypes.Type(value = FunctionCallArgumentsDeltaEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_FUNCTION_CALL_ARGUMENTS_DELTA),
        @JsonSubTypes.Type(value = FunctionCallArgumentsDoneEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_FUNCTION_CALL_ARGUMENTS_DONE),
        @JsonSubTypes.Type(value = ErrorEvent.class, name = ResponsesConstants.EVENT_TYPE_ERROR),
        @JsonSubTypes.Type(value = WebSearchCallInProgressEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_WEB_SEARCH_CALL_IN_PROGRESS),
        @JsonSubTypes.Type(value = WebSearchCallSearchingEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_WEB_SEARCH_CALL_SEARCHING),
        @JsonSubTypes.Type(value = WebSearchCallCompletedEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_WEB_SEARCH_CALL_COMPLETED),
        @JsonSubTypes.Type(value = ImageProcessCallInProgressEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_IMAGE_PROCESS_CALL_IN_PROGRESS),
        @JsonSubTypes.Type(value = ImageProcessCallProcessingEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_IMAGE_PROCESS_CALL_PROGRESSING),
        @JsonSubTypes.Type(value = ImageProcessCallCompletedEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_IMAGE_PROCESS_CALL_COMPLETED),
        @JsonSubTypes.Type(value = ImageProcessCallFailedEvent.class, name = ResponsesConstants.EVENT_TYPE_RESPONSE_IMAGE_PROCESS_CALL_FAILED)
})
public abstract class StreamEvent {

    @JsonProperty("type")
    protected String type;

    @JsonProperty("sequence_number")
    protected Long sequenceNumber;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "type='" + type + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                '}';
    }

    public StreamEvent(String type) {
        this.type = type;
    }
}