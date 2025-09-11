package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.content.ReasoningSummaryPart;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemReasoning extends BaseItem implements OutputItem {
    @JsonProperty("id")
    private String id;

    @JsonProperty("summary")
    private List<ReasoningSummaryPart> summary;

    @JsonProperty("status")
    private String status;

    public ItemReasoning() {
        super(ResponsesConstants.ITEM_TYPE_REASONING);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ReasoningSummaryPart> getSummary() {
        return summary;
    }

    public void setSummary(List<ReasoningSummaryPart> summary) {
        this.summary = summary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ItemReasoning{" +
                "id='" + id + '\'' +
                ", type='" + getType() + '\'' +
                ", summary=" + summary +
                ", status='" + status + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String id;
        private List<ReasoningSummaryPart> summary;
        private String status;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder summary(List<ReasoningSummaryPart> summary) {
            this.summary = summary;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ItemReasoning build() {
            ItemReasoning itemReasoning = new ItemReasoning();
            itemReasoning.setId(id);
            itemReasoning.setSummary(summary);
            itemReasoning.setStatus(status);
            return itemReasoning;
        }
    }
}