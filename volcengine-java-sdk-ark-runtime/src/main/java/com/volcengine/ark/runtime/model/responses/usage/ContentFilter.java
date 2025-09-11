package com.volcengine.ark.runtime.model.responses.usage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContentFilter {
    @JsonProperty("type")
    private String type;

    @JsonProperty("details")
    private String details;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "ContentFilter{" +
                "type='" + type + '\'' +
                ", details='" + details + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String type;
        private String details;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder details(String details) {
            this.details = details;
            return this;
        }

        public ContentFilter build() {
            ContentFilter contentFilter = new ContentFilter();
            contentFilter.setType(type);
            contentFilter.setDetails(details);
            return contentFilter;
        }
    }
}