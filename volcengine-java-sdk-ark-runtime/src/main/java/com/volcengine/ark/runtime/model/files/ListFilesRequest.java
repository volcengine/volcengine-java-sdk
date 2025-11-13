package com.volcengine.ark.runtime.model.files;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListFilesRequest {
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @JsonProperty(value = "after")
    private String after;

    @JsonProperty(value = "limit")
    private Integer limit;

    @JsonProperty(value = "order")
    private String order;

    @JsonProperty(value = "purpose")
    private String purpose;

    @Override
    public String toString() {
        return "ListFilesRequest{" +
                "after='" + after + '\'' +
                ", limit=" + limit +
                ", order='" + order + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }

    public ListFilesRequest() {
    }

    public static final class ListFilesRequestBuilder {
        private String after;
        private Integer limit;
        private String order;
        private String purpose;

        private ListFilesRequestBuilder() {
        }

        public static ListFilesRequestBuilder aListFilesRequest() {
            return new ListFilesRequestBuilder();
        }

        public ListFilesRequestBuilder after(String after) {
            this.after = after;
            return this;
        }

        public ListFilesRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ListFilesRequestBuilder order(String order) {
            this.order = order;
            return this;
        }

        public ListFilesRequestBuilder purpose(String purpose) {
            this.purpose = purpose;
            return this;
        }

        public ListFilesRequest build() {
            ListFilesRequest listFilesRequest = new ListFilesRequest();
            listFilesRequest.setAfter(after);
            listFilesRequest.setLimit(limit);
            listFilesRequest.setOrder(order);
            listFilesRequest.setPurpose(purpose);
            return listFilesRequest;
        }
    }
}
