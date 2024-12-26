package com.volcengine.ark.runtime.model.content.generation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListContentGenerationTasksRequest {

    @JsonProperty("page_num")
    private int pageNum;

    @JsonProperty("page_size")
    private int pageSize;

    private String status;
    private String model;
    private List<String> taskIds;

    public ListContentGenerationTasksRequest() {
    }

    public ListContentGenerationTasksRequest(int pageNum, int pageSize, String status, String model, List<String> taskIds) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.status = status;
        this.model = model;
        this.taskIds = taskIds;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
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
        private int pageNum;
        private int pageSize;
        private String status;
        private String model;
        private final List<String> taskIds = new ArrayList<>();

        public Builder pageNum(int pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        public Builder pageSize(int pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder status(TaskStatus status) {
            this.status = status.toString();
            return this;
        }

        public Builder model(String model) {
            this.model = model;
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
            return new ListContentGenerationTasksRequest(pageNum, pageSize, status, model, taskIds);
        }
    }
}
