package com.volcengine.ark.runtime.model.content.generation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListContentGenerationTasksRequest {

    @JsonProperty("page_num")
    private java.lang.Integer pageNum;

    @JsonProperty("page_size")
    private java.lang.Integer pageSize;

    private String status;
    private String model;
    private List<String> taskIds;
    private String serviceTier;

    public ListContentGenerationTasksRequest() {
    }

    public ListContentGenerationTasksRequest(java.lang.Integer pageNum, java.lang.Integer pageSize, String status, String model, List<String> taskIds) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.status = status;
        this.model = model;
        this.taskIds = taskIds;
    }

    public java.lang.Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(java.lang.Integer pageNum) {
        this.pageNum = pageNum;
    }

    public java.lang.Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<String> getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
    }

    public String getServiceTier() {
        return serviceTier;
    }

    public void setServiceTier(String serviceTier) {
        this.serviceTier = serviceTier;
    }

    @Override
    public String toString() {
        return "ListContentGenerationTasksRequest{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", status='" + status + '\'' +
                ", model='" + model + '\'' +
                ", taskIds=" + taskIds +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private java.lang.Integer pageNum;
        private java.lang.Integer pageSize;
        private String status;
        private String model;
        private final List<String> taskIds = new ArrayList<>();
        private String serviceTier;

        public Builder pageNum(java.lang.Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        public Builder pageSize(java.lang.Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder status(String status) {
            this.status = status.toString();
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder serviceTier(String serviceTier) {
            this.serviceTier = serviceTier;
            return this;
        }

        public Builder taskIds(List<String> taskIds) {
            this.taskIds.clear();
            this.taskIds.addAll(taskIds);
            return this;
        }

        public Builder addTaskId(String taskId) {
            this.taskIds.add(taskId);
            return this;
        }

        public ListContentGenerationTasksRequest build() {
            ListContentGenerationTasksRequest req = new ListContentGenerationTasksRequest(pageNum, pageSize, status, model, taskIds);
            req.setServiceTier(serviceTier);
            return req;
        }
    }
}
