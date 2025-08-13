package com.volcengine.ark.runtime.model.responses.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetResponseRequest {
    @JsonProperty("response_id")
    private String responseId;

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    @Override
    public String toString() {
        return "GetResponseRequest{" +
                "responseId='" + responseId + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String responseId;

        public Builder responseId(String responseId) {
            this.responseId = responseId;
            return this;
        }

        public GetResponseRequest build() {
            GetResponseRequest getResponseRequest = new GetResponseRequest();
            getResponseRequest.setResponseId(responseId);
            return getResponseRequest;
        }
    }
}