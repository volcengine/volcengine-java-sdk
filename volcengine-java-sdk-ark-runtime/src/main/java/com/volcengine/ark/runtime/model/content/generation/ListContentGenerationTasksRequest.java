package com.volcengine.ark.runtime.model.content.generation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListContentGenerationTasksRequest {

    @JsonProperty("page_num")
    private int pageNum;

    @JsonProperty("page_size")
    private int pageSize;

    private Map<String, String> filters;

    public ListContentGenerationTasksRequest() {
    }

    public ListContentGenerationTasksRequest(int pageNum, int pageSize, Map<String, String> filters) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.filters = filters;
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

    public Map<String, String> getFilters() {
        return filters;
    }

    public void setFilters(Map<String, String> filters) {
        this.filters = filters;
    }

    @Override
    public String toString() {
        return "ListContentGenerationTasksRequest{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", filters=" + filters +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int pageNum;
        private int pageSize;
        private Map<String, String> filters = new HashMap<>();

        public Builder pageNum(int pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        public Builder pageSize(int pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder filter(Filter filter) {
            this.filters.putAll(filter.build());
            return this;
        }

        public ListContentGenerationTasksRequest build() {
            return new ListContentGenerationTasksRequest(pageNum, pageSize, filters);
        }
    }

    public static class Filter {
        private String status;
        private List<String> taskIds = new ArrayList<>();
        private String model;

        public static Filter.Builder builder() {
            return new Filter.Builder();
        }

        public Map<String, String> build() {
            Map<String, String> filterMap = new HashMap<>();
            if (status != null) filterMap.put("filter.status", status);
            if (taskIds != null && !taskIds.isEmpty()) {
                List<String> taskIdsList = new ArrayList<>();
                for (String taskId : taskIds) {
                    taskIdsList.add("filter.task_ids=" + taskId);
                }
                filterMap.put("", String.join("&", taskIdsList));
            }
            if (model != null) filterMap.put("filter.model", model);
            return filterMap;
        }

        public static class Builder {
            private final Filter filter = new Filter();

            public Builder status(TaskStatus status) {
                filter.status = status.toString();
                return this;
            }

            public Builder taskIds(List<String> taskIds) {
                filter.taskIds = new ArrayList<>(taskIds);
                return this;
            }

            public Builder addTaskId(String taskId) {
                filter.taskIds.add(taskId);
                return this;
            }

            public Builder model(String model) {
                filter.model = model;
                return this;
            }

            public Filter build() {
                return filter;
            }
        }
    }
}
