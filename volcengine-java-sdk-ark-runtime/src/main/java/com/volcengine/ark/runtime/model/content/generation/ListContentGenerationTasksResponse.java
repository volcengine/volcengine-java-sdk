package com.volcengine.ark.runtime.model.content.generation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.stream.Collectors;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListContentGenerationTasksResponse {

    @JsonProperty("total")
    private int total;

    @JsonProperty("items")
    private List<Item> items;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Item {

        @JsonProperty("id")
        private String id;

        @JsonProperty("model")
        private String model;

        @JsonProperty("status")
        private String status;

        @JsonProperty("failure_reason")
        private String failureReason;

        @JsonProperty("content")
        private List<Content> content;

        @JsonProperty("usage")
        private Usage usage;

        @JsonProperty("created_at")
        private long createdAt;

        @JsonProperty("updated_at")
        private long updatedAt;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getFailureReason() {
            return failureReason;
        }

        public void setFailureReason(String failureReason) {
            this.failureReason = failureReason;
        }

        public List<Content> getContent() {
            return content;
        }

        public void setContent(List<Content> content) {
            this.content = content;
        }

        public Usage getUsage() {
            return usage;
        }

        public void setUsage(Usage usage) {
            this.usage = usage;
        }

        public long getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(long createdAt) {
            this.createdAt = createdAt;
        }

        public long getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(long updatedAt) {
            this.updatedAt = updatedAt;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Content {

            @JsonProperty("video_url")
            private String videoUrl;

            public String getVideoUrl() {
                return videoUrl;
            }

            public void setVideoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
            }

            @Override
            public String toString() {
                return "Content{" +
                        "videoUrl='" + videoUrl + '\'' +
                        '}';
            }
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Usage {

            @JsonProperty("completion_tokens")
            private int completionTokens;

            public int getCompletionTokens() {
                return completionTokens;
            }

            public void setCompletionTokens(int completionTokens) {
                this.completionTokens = completionTokens;
            }

            @Override
            public String toString() {
                return "Usage{" +
                        "completionTokens=" + completionTokens +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "Item{" +
                    "id='" + id + '\'' +
                    ", model='" + model + '\'' +
                    ", status='" + status + '\'' +
                    ", failureReason='" + failureReason + '\'' +
                    ", content=" + (content != null ? content.stream().map(Content::toString).collect(Collectors.joining(", ")) : "null") +
                    ", usage=" + usage +
                    ", createdAt=" + createdAt +
                    ", updatedAt=" + updatedAt +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ListContentGenerationTasksResponse{" +
                "total=" + total +
                ", items=" + (items != null ? items.stream().map(Item::toString).collect(Collectors.joining(", ")) : "null") +
                '}';
    }
}
