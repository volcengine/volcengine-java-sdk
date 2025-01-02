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

    public CreateContentGenerationTaskRequest() {
    }

    public CreateContentGenerationTaskRequest(String model, List<Content> content) {
        this.model = model;
        this.content = content;
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

    @Override
    public String toString() {
        return "CreateContentGenerationTaskRequest{" +
                "model='" + model + '\'' +
                ", content=" + content +
                '}';
    }

    public static CreateContentGenerationTaskRequest.Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String model;
        private List<Content> content;

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

        public CreateContentGenerationTaskRequest build() {
            CreateContentGenerationTaskRequest createContentGenerationTaskRequest = new CreateContentGenerationTaskRequest();
            createContentGenerationTaskRequest.setModel(model);
            createContentGenerationTaskRequest.setContent(content);
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

        public Content() {
        }

        public Content(String type, String text, ImageUrl imageUrl) {
            this.type = type;
            this.text = text;
            this.imageUrl = imageUrl;
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

        @Override
        public String toString() {
            return "Content{" +
                    "type='" + type + '\'' +
                    ", text='" + text + '\'' +
                    ", imageUrl=" + imageUrl +
                    '}';
        }

        public static Content.Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String type;
            private String text;
            private ImageUrl imageUrl;

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

            public Content build() {
                Content content = new Content();
                content.setType(type);
                content.setText(text);
                content.setImageUrl(imageUrl);
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
