package com.volcengine.ark.runtime.model.content.generation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteContentGenerationTaskRequest {

    @JsonProperty("taskId")
    private String taskId;

    public DeleteContentGenerationTaskRequest() {
    }

    public DeleteContentGenerationTaskRequest(String taskId) {
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

    public static DeleteContentGenerationTaskRequest.Builder builder() {
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

        public DeleteContentGenerationTaskRequest build() {
            DeleteContentGenerationTaskRequest request = new DeleteContentGenerationTaskRequest();
            request.setTaskId(taskId);
            return request;
        }
    }
}
