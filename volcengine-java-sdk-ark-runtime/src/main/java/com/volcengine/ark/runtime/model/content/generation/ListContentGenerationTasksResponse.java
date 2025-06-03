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

        @JsonProperty("error")
        private ContentGenerationError error;

        @JsonProperty("content")
        private Content content;

        @JsonProperty("usage")
        private Usage usage;

        @JsonProperty("created_at")
        private java.lang.Long createdAt;

        @JsonProperty("updated_at")
        private java.lang.Long updatedAt;

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

        public ContentGenerationError getError() {
            return error;
        }

        public void setError(ContentGenerationError error) { this.error = error; }

        public Content getContent() {
            return content;
        }

        public void setContent(Content content) {
            this.content = content;
        }

        public Usage getUsage() {
            return usage;
        }

        public void setUsage(Usage usage) {
            this.usage = usage;
        }

        public java.lang.Long getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(java.lang.Long createdAt) {
            this.createdAt = createdAt;
        }

        public java.lang.Long getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(java.lang.Long updatedAt) {
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

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class ContentGenerationError {

            @JsonProperty("message")
            private String message;

            @JsonProperty("code")
            private String code;

            public String getMessage() { return message;}

            public void setMessage(String message) { this.message = message; }

            public String getCode() { return code;}

            public void setCode(String code) { this.code = code; }

            @Override
            public String toString() {
                return "Error{" +
                        "message='" + message + '\'' +
                        ", code='" + code + '\'' +
                        "}";
            }
        }

        @Override
        public String toString() {
            return "Item{" +
                    "id='" + id + '\'' +
                    ", model='" + model + '\'' +
                    ", status='" + status + '\'' +
                    ", error='" + error + '\'' +
                    ", content=" + (content != null ? content.toString() : "null") +
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
