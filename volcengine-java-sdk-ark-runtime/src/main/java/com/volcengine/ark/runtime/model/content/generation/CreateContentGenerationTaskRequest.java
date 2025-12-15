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

        public CreateContentGenerationTaskRequest build() {
            CreateContentGenerationTaskRequest createContentGenerationTaskRequest = new CreateContentGenerationTaskRequest();
            createContentGenerationTaskRequest.setModel(model);
            createContentGenerationTaskRequest.setContent(content);
            createContentGenerationTaskRequest.setCallbackUrl(callbackUrl);
            createContentGenerationTaskRequest.setReturnLastFrame(returnLastFrame);
            createContentGenerationTaskRequest.setServiceTier(serviceTier);
            createContentGenerationTaskRequest.setExecutionExpiresAfter(executionExpiresAfter);
            createContentGenerationTaskRequest.setGenerateAudio(generateAudio);
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

        public Content() {
        }

        public Content(String type, String text, ImageUrl imageUrl, String role) {
            this.type = type;
            this.text = text;
            this.imageUrl = imageUrl;
            this.role = role;
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

        @Override
        public String toString() {
            return "Content{" +
                    "type='" + type + '\'' +
                    ", text='" + text + '\'' +
                    ", imageUrl=" + imageUrl +
                    ", role=" + role +
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

            public Content build() {
                Content content = new Content();
                content.setType(type);
                content.setText(text);
                content.setImageUrl(imageUrl);
                content.setRole(role);
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
}
