package com.volcengine.ark.runtime.model.multimodalembeddings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MultimodalEmbeddingInput {

    private String type;

    private String text;

    MultimodalEmbeddingInput.MultiModalEmbeddingContentPartImageURL imageUrl;

    MultimodalEmbeddingInput.MultiModalEmbeddingContentPartVideoURL videoUrl;

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

    public MultimodalEmbeddingInput.MultiModalEmbeddingContentPartImageURL getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(MultimodalEmbeddingInput.MultiModalEmbeddingContentPartImageURL imageUrl) {
        this.imageUrl = imageUrl;
    }

    public MultimodalEmbeddingInput.MultiModalEmbeddingContentPartVideoURL getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(MultimodalEmbeddingInput.MultiModalEmbeddingContentPartVideoURL videoUrl) {
        this.videoUrl = videoUrl;
    }

    public static MultimodalEmbeddingInput.Builder builder() {
        return new MultimodalEmbeddingInput.Builder();
    }

    @Override
    public String toString() {
        return "MultiModalEmbeddingInput{" +
                "type='" + type + '\'' +
                ", text='" + text + '\'' +
                ", imageUrl=" + imageUrl +
                ", videoUrl=" + videoUrl +
                '}';
    }

    public static class MultiModalEmbeddingContentPartImageURL {
        String url;

        String detail;

        public MultiModalEmbeddingContentPartImageURL(String url, String detail) {
            this.url = url;
            this.detail = detail;
        }

        public MultiModalEmbeddingContentPartImageURL(String url) {
            this.url = url;
        }

        public MultiModalEmbeddingContentPartImageURL() {
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        @Override
        public String toString() {
            return "MultiModalEmbeddingContentPartImageURL{" +
                    "url='" + url + '\'' +
                    ", detail='" + detail + '\'' +
                    '}';
        }
    }

    public static class MultiModalEmbeddingContentPartVideoURL {
        String url;
        double fps;

        public MultiModalEmbeddingContentPartVideoURL(String url, double fps) {
            this.url = url;
            this.fps = fps;
        }
        public MultiModalEmbeddingContentPartVideoURL(String url) {
            this.url = url;
        }
        public MultiModalEmbeddingContentPartVideoURL() {}

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public double getFps() {
            return fps;
        }

        public void setFps(double fps) {
            this.fps = fps;
        }

        @Override
        public String toString() {
            return "MultiModalEmbeddingContentPartVideoURL{" +
                    "url='" + url + '\'' +
                    ", fps=" + fps +
                    '}';
        }
    }

    public static final class Builder {
        private String type;
        private String text;
        private MultimodalEmbeddingInput.MultiModalEmbeddingContentPartImageURL imageUrl;
        private MultimodalEmbeddingInput.MultiModalEmbeddingContentPartVideoURL videoUrl;

        public MultimodalEmbeddingInput.Builder type(String type) {
            this.type = type;
            return this;
        }

        public MultimodalEmbeddingInput.Builder text(String text) {
            this.text = text;
            return this;
        }

        public MultimodalEmbeddingInput.Builder imageUrl(MultimodalEmbeddingInput.MultiModalEmbeddingContentPartImageURL imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public MultimodalEmbeddingInput.Builder videoUrl(MultimodalEmbeddingInput.MultiModalEmbeddingContentPartVideoURL videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }

        public MultimodalEmbeddingInput build() {
            MultimodalEmbeddingInput multiModalEmbeddingInput = new MultimodalEmbeddingInput();
            multiModalEmbeddingInput.setType(type);
            multiModalEmbeddingInput.setText(text);
            multiModalEmbeddingInput.setImageUrl(imageUrl);
            multiModalEmbeddingInput.setVideoUrl(videoUrl);
            return multiModalEmbeddingInput;
        }
    }
}
