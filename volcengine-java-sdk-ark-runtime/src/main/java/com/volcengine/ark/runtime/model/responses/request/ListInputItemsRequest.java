package com.volcengine.ark.runtime.model.responses.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ListInputItemsRequest {
    @JsonProperty("response_id")
    private String responseId;

    @JsonProperty("after")
    private String after;

    @JsonProperty("before")
    private String before;

    @JsonProperty("limit")
    private Integer limit;

    @JsonProperty("order")
    private String order;

    @JsonProperty("include")
    private List<String> include;

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public List<String> getInclude() {
        return include;
    }

    public void setInclude(List<String> include) {
        this.include = include;
    }

    @Override
    public String toString() {
        return "ListInputItemsRequest{" +
                "responseId='" + responseId + '\'' +
                ", after='" + after + '\'' +
                ", before='" + before + '\'' +
                ", limit=" + limit +
                ", order='" + order + '\'' +
                ", include=" + include +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String responseId;
        private String after;
        private String before;
        private Integer limit;
        private String order;
        private List<String> include;

        public Builder responseId(String responseId) {
            this.responseId = responseId;
            return this;
        }

        public Builder after(String after) {
            this.after = after;
            return this;
        }

        public Builder before(String before) {
            this.before = before;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder order(String order) {
            this.order = order;
            return this;
        }

        public Builder include(List<String> include) {
            this.include = include;
            return this;
        }

        public ListInputItemsRequest build() {
            ListInputItemsRequest listInputItemsRequest = new ListInputItemsRequest();
            listInputItemsRequest.setResponseId(responseId);
            listInputItemsRequest.setAfter(after);
            listInputItemsRequest.setBefore(before);
            listInputItemsRequest.setLimit(limit);
            listInputItemsRequest.setOrder(order);
            listInputItemsRequest.setInclude(include);
            return listInputItemsRequest;
        }
    }
}