package com.volcengine.ark.runtime.model.content.generation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.stream.Collectors;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetContentGenerationTaskResponse {

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

    @JsonProperty("subdivisionlevel")
    private String subdivisionlevel;

    @JsonProperty("fileformat")
    private String fileformat;

    @JsonProperty("frames")
    private java.lang.Long frames;

    @JsonProperty("framespersecond")
    private java.lang.Long framespersecond;

    @JsonProperty("created_at")
    private java.lang.Long createdAt;

    @JsonProperty("updated_at")
    private java.lang.Long updatedAt;

	@JsonProperty("seed")
	private java.lang.Long seed;

	@JsonProperty("revised_prompt")
	private String revisedPrompt;

    @JsonProperty("service_tier")
    private String serviceTier;

    @JsonProperty("execution_expires_after")
    private java.lang.Long executionExpiresAfter;

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

    public void setError(ContentGenerationError error) {
        this.error = error;
    }

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

    public String getSubdivisionLevel() {
        return subdivisionlevel;
    }

    public void setSubdivisionLevel(String subdivisionlevel) {
        this.subdivisionlevel = subdivisionlevel;
    }

    public String getFileFormat() {
        return fileformat;
    }

    public void setFileFormat(String fileformat) {
        this.fileformat = fileformat;
    }

    public java.lang.Long getFrames() {
        return frames;
    }

    public void setFrames(java.lang.Long frames) {
        this.frames = frames;
    }

    public java.lang.Long getFramesPerSecond() {
        return framespersecond;
    }

    public void setFramesPerSecond(java.lang.Long framespersecond) {
        this.framespersecond = framespersecond;
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

	public java.lang.Long getSeed() {
        return seed;
    }

    public void setSeed(java.lang.Long seed) {
        this.seed = seed;
    }

	public String getRevisedPrompt() {
        return revisedPrompt;
    }

    public void setRevisedPrompt(String revisedPrompt) {
        this.revisedPrompt = revisedPrompt;
    }

    public String getServiceTier() {
        return serviceTier;
    }

    public void setServiceTier(String serviceTier) {
        this.serviceTier = serviceTier;
    }

    public java.lang.Long getExecutionExpiresAfter() {
        return executionExpiresAfter;
    }

    public void setExecutionExpiresAfter(java.lang.Long executionExpiresAfter) {
        this.executionExpiresAfter = executionExpiresAfter;
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

        @JsonProperty("last_frame_url")
        private String lastFrameUrl;

        public String getLastFrameUrl() {
            return lastFrameUrl;
        }

        public void setLastFrameUrl(String lastFrameUrl) {
            this.lastFrameUrl = lastFrameUrl;
        }

        @JsonProperty("file_url")
        private String fileUrl;

        public String getFileUrl() {
            return fileUrl;
        }

        public void setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
        }

        @Override
        public String toString() {
            return "Content{" +
                    "videoUrl='" + videoUrl + '\'' +
                    ", lastFrameUrl='" + lastFrameUrl + '\'' +
                    ", fileUrl='" + fileUrl + '\'' +
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
        return "GetContentGenerationTaskResponse{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", status='" + status + '\'' +
                ", error='" + error + '\'' +
                ", content=" + (content != null ? content.toString() : "null") +
                ", usage=" + usage +
                ", subdivisionlevel=" + subdivisionlevel +
                ", fileformat=" + fileformat +
                ", frames=" + frames +
                ", framespersecond=" + framespersecond +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
				", seed=" + seed +
				", revisedPrompt=" + revisedPrompt +
                ", serviceTier='" + serviceTier + '\'' +
                ", executionExpiresAfter=" + executionExpiresAfter +
                '}';
    }
}
