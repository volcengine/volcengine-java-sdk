package com.volcengine.ark.runtime.model.images.generation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerateImagesRequest {

    @JsonProperty("model")
    private String model;

    @JsonProperty("prompt")
    private String prompt;

    @JsonProperty("image")
    private String image;

    @JsonProperty("response_format")
    private String responseFormat;

    @JsonProperty("seed")
    private Integer seed;

    @JsonProperty("guidance_scale")
    private Double guidanceScale;

    @JsonProperty("size")
    private String size;

    @JsonProperty("watermark")
    private Boolean watermark;

    @JsonProperty("optimize_prompt")
    private Boolean optimizePrompt;

    public GenerateImagesRequest() {
    }

    public GenerateImagesRequest(String model, String prompt, String image, String responseFormat, Integer seed, Double guidanceScale, String size, Boolean watermark, Boolean optimizePrompt) {
        this.model = model;
        this.prompt = prompt;
        this.image = image;
        this.responseFormat = responseFormat;
        this.seed = seed;
        this.guidanceScale = guidanceScale;
        this.size = size;
        this.watermark = watermark;
        this.optimizePrompt = optimizePrompt;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrompt() {
        return this.prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getResponseFormat() {
        return this.responseFormat;
    }

    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }

    public Integer getSeed() {
        return this.seed;
    }

    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public Double getGuidanceScale() {
        return this.guidanceScale;
    }

    public void setGuidanceScale(Double guidanceScale) {
        this.guidanceScale = guidanceScale;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Boolean getWatermark() {
        return this.watermark;
    }

    public void setWatermark(Boolean watermark) {
        this.watermark = watermark;
    }

    public Boolean getOptimizePrompt() {
        return this.optimizePrompt;
    }

    public void setOptimizePrompt(Boolean optimizePrompt) {
        this.optimizePrompt = optimizePrompt;
    }

    @Override
    public String toString() {
        return "GenerateImagesRequest{" +
                "model='" + model + '\'' +
                ", prompt=" + prompt +
                ", image=" + image +
                ", responseFormat=" + responseFormat +
                ", seed=" + seed +
                ", guidanceScale=" + guidanceScale +
                ", size=" + size +
                ", watermark=" + watermark +
                ", optimizePrompt=" + optimizePrompt +
                '}';
    }

    public static GenerateImagesRequest.Builder builder() {
        return new GenerateImagesRequest.Builder();
    }

    public static class Builder {
        private String model;
        private String prompt;
        private String image;
        private String responseFormat;
        private Integer seed;
        private Double guidanceScale;
        private String size;
        private Boolean watermark;
        private Boolean optimizePrompt;

        private Builder() {
        }

        public GenerateImagesRequest.Builder model(String model) {
            this.model = model;
            return this;
        }

        public GenerateImagesRequest.Builder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        public GenerateImagesRequest.Builder image(String image) {
            this.image = image;
            return this;
        }

        public GenerateImagesRequest.Builder responseFormat(String responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }

        public GenerateImagesRequest.Builder seed(Integer seed) {
            this.seed = seed;
            return this;
        }

        public GenerateImagesRequest.Builder guidanceScale(Double guidanceScale) {
            this.guidanceScale = guidanceScale;
            return this;
        }

        public GenerateImagesRequest.Builder size(String size) {
            this.size = size;
            return this;
        }

        public GenerateImagesRequest.Builder watermark(Boolean watermark) {
            this.watermark = watermark;
            return this;
        }

        public GenerateImagesRequest.Builder optimizePrompt(Boolean optimizePrompt) {
            this.optimizePrompt = optimizePrompt;
            return this;
        }

        public GenerateImagesRequest build() {
            GenerateImagesRequest generateImagesRequest = new GenerateImagesRequest();
            generateImagesRequest.setModel(model);
            generateImagesRequest.setPrompt(prompt);
            generateImagesRequest.setImage(image);
            generateImagesRequest.setResponseFormat(responseFormat);
            generateImagesRequest.setSeed(seed);
            generateImagesRequest.setGuidanceScale(guidanceScale);
            generateImagesRequest.setSize(size);
            generateImagesRequest.setWatermark(watermark);
            generateImagesRequest.setOptimizePrompt(optimizePrompt);
            return generateImagesRequest;
        }
    }
}
