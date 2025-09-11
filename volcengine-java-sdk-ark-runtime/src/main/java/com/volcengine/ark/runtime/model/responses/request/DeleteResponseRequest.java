package com.volcengine.ark.runtime.model.responses.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteResponseRequest {
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
        return "DeleteResponseRequest{" +
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

        public DeleteResponseRequest build() {
            DeleteResponseRequest deleteResponseRequest = new DeleteResponseRequest();
            deleteResponseRequest.setResponseId(responseId);
            return deleteResponseRequest;
        }
    }
}