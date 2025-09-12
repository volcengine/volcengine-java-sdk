package com.volcengine.ark.runtime.model.images.generation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.content.generation.CreateContentGenerationTaskResult;

import java.util.List;

public class ImagesResponse {

    @JsonProperty("model")
    private String model;

    @JsonProperty("created")
    private Integer created;

    @JsonProperty("data")
    private List<Image> data;

    @JsonProperty("usage")
    private Usage usage;

    @JsonProperty("error")
    private Error error;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public List<Image> getData() {
        return data;
    }

    public void setData(List<Image> data) {
        this.data = data;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Image {

        @JsonProperty("url")
        private String url;

        @JsonProperty("b64_json")
        private String b64Json;

        @JsonProperty("size")
        private String size;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getB64Json() {
            return b64Json;
        }

        public void setB64Json(String b64Json) {
            this.b64Json = b64Json;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return "Image{" +
                    "url=" + url +
                    "b64Json=" + b64Json +
                    "size=" + size +
                    '}';
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Usage {

        @JsonProperty("generated_images")
        private Integer generatedImages;

        public Integer getGeneratedImages() {
            return generatedImages;
        }

        public void setGeneratedImages(Integer generatedImages) {
            this.generatedImages = generatedImages;
        }

        @Override
        public String toString() {
            return "Usage{" +
                    "generatedImages=" + generatedImages +
                    '}';
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Error {

        @JsonProperty("code")
        private String code;

        @JsonProperty("message")
        private String message;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return "Error{" +
                    "code=" + code +
                    "message=" + message +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ImagesResponse{" +
                "model='" + model + '\'' +
                "created=" + created +
                "data=" + data +
                "usage=" + usage +
                "error=" + error +
                '}';
    }

    public static class Builder {
        private String model;
        private Integer created;
        private List<Image> data;
        private Usage usage;
        private Error error;

        private Builder() {
        }

        public ImagesResponse.Builder model(String model) {
            this.model = model;
            return this;
        }

        public ImagesResponse.Builder created(Integer created) {
            this.created = created;
            return this;
        }

        public ImagesResponse.Builder data(List<Image> data) {
            this.data = data;
            return this;
        }

        public ImagesResponse.Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        public ImagesResponse.Builder error(Error error) {
            this.error = error;
            return this;
        }

        public ImagesResponse build() {
            ImagesResponse imagesResponse = new ImagesResponse();
            imagesResponse.setModel(model);
            imagesResponse.setCreated(created);
            imagesResponse.setData(data);
            imagesResponse.setUsage(usage);
            imagesResponse.setError(error);
            return imagesResponse;
        }
    }
}
