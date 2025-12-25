package com.volcengine.ark.runtime.model.responses.item.doubaoapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = DoubaoAppCallBlockOutputText.class, name = "output_text"),
        @JsonSubTypes.Type(value = DoubaoAppCallBlockReasoningText.class, name = "reasoning_text"),
        @JsonSubTypes.Type(value = DoubaoAppCallBlockSearch.class, name = "search"),
        @JsonSubTypes.Type(value = DoubaoAppCallBlockReasoningSearch.class, name = "reasoning_search")
})
public abstract class DoubaoAppCallBlock {

    @JsonProperty("type")
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DoubaoAppCallBlock() {
    }

    public DoubaoAppCallBlock(String type) {
        this.type = type;
    }
}
