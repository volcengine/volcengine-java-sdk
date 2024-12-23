package com.volcengine.ark.runtime.model.content.generation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetContentGenerationTaskRequest {

    @JsonProperty("taskId")
    private String taskId;

    public GetContentGenerationTaskRequest() {
    }

    public GetContentGenerationTaskRequest(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public String toString() {
        return "GetContentGenerationTaskRequest{" +
                "taskId='" + taskId + '\'' +
                '}';
    }

    public static GetContentGenerationTaskRequest.Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String taskId;

        private Builder() {
        }

        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public GetContentGenerationTaskRequest build() {
            GetContentGenerationTaskRequest request = new GetContentGenerationTaskRequest();
            request.setTaskId(taskId);
            return request;
        }
    }
}
