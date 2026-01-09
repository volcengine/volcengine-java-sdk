package com.volcengine.ark.runtime.model.content.generation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateContentGenerationTaskRequest {

    @JsonProperty("model")
    private String model;

    @JsonProperty("content")
    private List<Content> content;

    @JsonProperty("callback_url")
    private String callbackUrl;

    @JsonProperty("return_last_frame")
    private Boolean returnLastFrame;

    @JsonProperty("service_tier")
    private String serviceTier;

    @JsonProperty("execution_expires_after")
    private Long executionExpiresAfter;

    @JsonProperty("generate_audio")
    private Boolean generateAudio;

    @JsonProperty("camera_fixed")
    private Boolean cameraFixed;

    @JsonProperty("watermark")
    private Boolean watermark;

    @JsonProperty("seed")
    private Long seed;

    @JsonProperty("resolution")
    private String resolution;

    @JsonProperty("ratio")
    private String ratio;

    @JsonProperty("duration")
    private Long duration;

    @JsonProperty("frames")
    private Long frames;

    @JsonProperty("draft")
    private Boolean draft;

    public CreateContentGenerationTaskRequest() {
    }

    public CreateContentGenerationTaskRequest(String model, List<Content> content) {
        this.model = model;
        this.content = content;
    }

    public CreateContentGenerationTaskRequest(String model, List<Content> content, String callbackUrl, Boolean returnLastFrame) {
        this.model = model;
        this.content = content;
        this.callbackUrl = callbackUrl;
        this.returnLastFrame = returnLastFrame;
    }

    public CreateContentGenerationTaskRequest(String model, List<Content> content, String callbackUrl, Boolean returnLastFrame, String serviceTier, Long executionExpiresAfter, Boolean generateAudio, Boolean cameraFixed, Boolean watermark, Long seed, String resolution, String ratio, Long duration, Long frames, Boolean draft) {
        this.model = model;
        this.content = content;
        this.callbackUrl = callbackUrl;
        this.returnLastFrame = returnLastFrame;
        this.serviceTier = serviceTier;
        this.executionExpiresAfter = executionExpiresAfter;
        this.generateAudio = generateAudio;
        this.cameraFixed = cameraFixed;
        this.watermark = watermark;
        this.seed = seed;
        this.resolution = resolution;
        this.ratio = ratio;
        this.duration = duration;
        this.frames = frames;
        this.draft = draft;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public Boolean getReturnLastFrame() {
        return returnLastFrame;
    }

    public void setReturnLastFrame(Boolean returnLastFrame) {
        this.returnLastFrame = returnLastFrame;
    }

    public String getServiceTier() {
        return serviceTier;
    }

    public void setServiceTier(String serviceTier) {
        this.serviceTier = serviceTier;
    }

    public Long getExecutionExpiresAfter() {
        return executionExpiresAfter;
    }

    public void setExecutionExpiresAfter(Long executionExpiresAfter) {
        this.executionExpiresAfter = executionExpiresAfter;
    }

    public Boolean getGenerateAudio() {
        return generateAudio;
    }

    public void setGenerateAudio(Boolean generateAudio) {
        this.generateAudio = generateAudio;
    }

    public Boolean getCameraFixed() {
        return cameraFixed;
    }

    public void setCameraFixed(Boolean cameraFixed) {
        this.cameraFixed = cameraFixed;
    }
     public Boolean getWatermark() {
        return watermark;
    }

    public void setWatermark(Boolean watermark) {
        this.watermark = watermark;
    }
     public Long getSeed() {
        return seed;
    }

    public void setSeed(Long seed) {
        this.seed = seed;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
     public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }
     public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }
     public Long getFrames() {
        return frames;
    }

    public void setFrames(Long frames) {
        this.frames = frames;
    }
     public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    @Override
    public String toString() {
        return "CreateContentGenerationTaskRequest{" +
                "model='" + model + '\'' +
                ", content=" + content +
                ", callbackUrl='" + callbackUrl + '\'' +
                ", returnLastFrame=" + returnLastFrame +
                ", serviceTier='" + serviceTier + '\'' +
                ", executionExpiresAfter=" + executionExpiresAfter +
                ", generateAudio=" + generateAudio +
                ", cameraFixed=" + cameraFixed +
                ", watermark=" + watermark +
                ", seed=" + seed +
                ", resolution='" + resolution + '\'' +
                ", ratio='" + ratio + '\'' +
                ", duration=" + duration +
                ", frames=" + frames +
                ", draft=" + draft +
                '}';
    }

    public static CreateContentGenerationTaskRequest.Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String model;
        private List<Content> content;
        private String callbackUrl;
        private Boolean returnLastFrame;
        private String serviceTier;
        private Long executionExpiresAfter;
        private Boolean generateAudio;
        private Boolean cameraFixed;
        private Boolean watermark;
        private Long seed;
        private String resolution;
        private String ratio;
        private Long duration;
        private Long frames;
        private Boolean draft;

        private Builder() {
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder content(List<Content> content) {
            this.content = content;
            return this;
        }

        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }

        public Builder returnLastFrame(Boolean returnLastFrame) {
            this.returnLastFrame = returnLastFrame;
            return this;
        }

        public Builder serviceTier(String serviceTier) {
            this.serviceTier = serviceTier;
            return this;
        }

        public Builder executionExpiresAfter(Long executionExpiresAfter) {
            this.executionExpiresAfter = executionExpiresAfter;
            return this;
        }

        public Builder generateAudio(Boolean generateAudio) {
            this.generateAudio = generateAudio;
            return this;
        }

        public Builder cameraFixed(Boolean cameraFixed) {
            this.cameraFixed = cameraFixed;
            return this;
        }

        public Builder watermark(Boolean watermark) {
            this.watermark = watermark;
            return this;
        }

        public Builder seed(Long seed) {
            this.seed = seed;
            return this;
        }

        public Builder resolution(String resolution) {
            this.resolution = resolution;
            return this;
        }

        public Builder ratio(String ratio) {
            this.ratio = ratio;
            return this;
        }

        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        public Builder frames(Long frames) {
            this.frames = frames;
            return this;
        }

        public Builder draft(Boolean draft) {
            this.draft = draft;
            return this;
        }

        public CreateContentGenerationTaskRequest build() {
            CreateContentGenerationTaskRequest createContentGenerationTaskRequest = new CreateContentGenerationTaskRequest();
            createContentGenerationTaskRequest.setModel(model);
            createContentGenerationTaskRequest.setContent(content);
            createContentGenerationTaskRequest.setCallbackUrl(callbackUrl);
            createContentGenerationTaskRequest.setReturnLastFrame(returnLastFrame);
            createContentGenerationTaskRequest.setServiceTier(serviceTier);
            createContentGenerationTaskRequest.setExecutionExpiresAfter(executionExpiresAfter);
            createContentGenerationTaskRequest.setGenerateAudio(generateAudio);
            createContentGenerationTaskRequest.setCameraFixed(cameraFixed);
            createContentGenerationTaskRequest.setWatermark(watermark);
            createContentGenerationTaskRequest.setSeed(seed);
            createContentGenerationTaskRequest.setResolution(resolution);
            createContentGenerationTaskRequest.setRatio(ratio);
            createContentGenerationTaskRequest.setDuration(duration);
            createContentGenerationTaskRequest.setFrames(frames);
            createContentGenerationTaskRequest.setDraft(draft);
            return createContentGenerationTaskRequest;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Content {

        @JsonProperty("type")
        private String type;

        @JsonProperty("text")
        private String text;

        @JsonProperty("image_url")
        private ImageUrl imageUrl;

        @JsonProperty("role")
        private String role;

        @JsonProperty("draft_task")
        private DraftTask draftTask;

        public Content() {
        }

        public Content(String type, String text, ImageUrl imageUrl, String role, DraftTask draftTask) {
            this.type = type;
            this.text = text;
            this.imageUrl = imageUrl;
            this.role = role;
            this.draftTask = draftTask;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public ImageUrl getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(ImageUrl imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public DraftTask getDraftTask() {
            return draftTask;
        }

        public void setDraftTask(DraftTask draftTask) {
            this.draftTask = draftTask;
        }

        @Override
        public String toString() {
            return "Content{" +
                    "type='" + type + '\'' +
                    ", text='" + text + '\'' +
                    ", imageUrl=" + imageUrl +
                    ", role=" + role +
                    ", draftTask=" + draftTask +
                    '}';
        }

        public static Content.Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String type;
            private String text;
            private ImageUrl imageUrl;
            private String role;
            private DraftTask draftTask;

            private Builder() {
            }

            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Builder imageUrl(ImageUrl imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Builder draftTask(DraftTask draftTask) {
                this.draftTask = draftTask;
                return this;
            }

            public Content build() {
                Content content = new Content();
                content.setType(type);
                content.setText(text);
                content.setImageUrl(imageUrl);
                content.setRole(role);
                content.setDraftTask(draftTask);
                return content;
            }
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ImageUrl {

        @JsonProperty("url")
        private String url;

        public ImageUrl() {
        }

        public ImageUrl(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public String toString() {
            return "ImageUrl{" +
                    "url='" + url + '\'' +
                    '}';
        }

        public static ImageUrl.Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String url;

            private Builder() {
            }

            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ImageUrl build() {
                ImageUrl imageUrl = new ImageUrl();
                imageUrl.setUrl(url);
                return imageUrl;
            }
        }
    }

   @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DraftTask {

        @JsonProperty("id")
        private String id;

        public DraftTask() {
        }

        public DraftTask(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "DraftTask{" +
                    "id='" + id + '\'' +
                    '}';
        }

        public static DraftTask.Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String id;

            private Builder() {
            }

            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public DraftTask build() {
                DraftTask draftTask = new DraftTask();
                draftTask.setId(id);
                return draftTask;
            }
        }
    }
}
