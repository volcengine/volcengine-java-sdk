package com.volcengine.ark.runtime.model.files;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.request.CreateResponsesRequest;

import java.io.File;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UploadFileRequest {

    @JsonProperty(value = "file")
    private File file;
    @JsonProperty(value = "purpose")
    private String purpose;
    @JsonProperty(value = "expire_at")
    private Integer expireAt;

    @JsonProperty(value = "preprocess_configs")
    private PreprocessConfigs preprocessConfigs;

    @Override
    public String toString() {
        return "UploadFileRequest{" +
                "file=" + file +
                ", purpose='" + purpose + '\'' +
                ", expireAt=" + expireAt +
                ", preprocessConfigs=" + preprocessConfigs +
                '}';
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Integer getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(Integer expireAt) {
        this.expireAt = expireAt;
    }

    public PreprocessConfigs getPreprocessConfigs() {
        return preprocessConfigs;
    }

    public void setPreprocessConfigs(PreprocessConfigs preprocessConfigs) {
        this.preprocessConfigs = preprocessConfigs;
    }

    public static UploadFileRequestBuilder builder() {
        return new UploadFileRequestBuilder();
    }

    public static final class UploadFileRequestBuilder {
        private File file;
        private String purpose;
        private Integer expireAt;
        private PreprocessConfigs preprocessConfigs;

        private UploadFileRequestBuilder() {
        }

        public static UploadFileRequestBuilder anUploadFileRequest() {
            return new UploadFileRequestBuilder();
        }

        public UploadFileRequestBuilder file(File file) {
            this.file = file;
            return this;
        }

        public UploadFileRequestBuilder purpose(String purpose) {
            this.purpose = purpose;
            return this;
        }

        public UploadFileRequestBuilder expireAt(Integer expireAt) {
            this.expireAt = expireAt;
            return this;
        }

        public UploadFileRequestBuilder preprocessConfigs(PreprocessConfigs preprocessConfigs) {
            this.preprocessConfigs = preprocessConfigs;
            return this;
        }

        public UploadFileRequest build() {
            UploadFileRequest uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setFile(file);
            uploadFileRequest.setPurpose(purpose);
            uploadFileRequest.setExpireAt(expireAt);
            uploadFileRequest.setPreprocessConfigs(preprocessConfigs);
            return uploadFileRequest;
        }
    }
}
