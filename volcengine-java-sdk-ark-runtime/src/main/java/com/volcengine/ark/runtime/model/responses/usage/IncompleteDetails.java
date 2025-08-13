package com.volcengine.ark.runtime.model.responses.usage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IncompleteDetails {
    @JsonProperty("reason")
    private String reason;

    @JsonProperty("content_filter")
    private ContentFilter contentFilter;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ContentFilter getContentFilter() {
        return contentFilter;
    }

    public void setContentFilter(ContentFilter contentFilter) {
        this.contentFilter = contentFilter;
    }

    @Override
    public String toString() {
        return "IncompleteDetails{" +
                "reason='" + reason + '\'' +
                ", contentFilter=" + contentFilter +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String reason;
        private ContentFilter contentFilter;

        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        public Builder contentFilter(ContentFilter contentFilter) {
            this.contentFilter = contentFilter;
            return this;
        }

        public IncompleteDetails build() {
            IncompleteDetails incompleteDetails = new IncompleteDetails();
            incompleteDetails.setReason(reason);
            incompleteDetails.setContentFilter(contentFilter);
            return incompleteDetails;
        }
    }
}