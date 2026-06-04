package com.volcengine.ark.runtime.model.files;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    /**
     * URL provides an alternative file source (http/https or tos:// scheme).
     * Mutually exclusive with the binary file field.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * TOS specifies the user-owned TOS bucket destination.
     * Required when url is provided; optional with binary file upload.
     */
    @JsonProperty(value = "tos")
    private TosStorage tos;

    @Override
    public String toString() {
        return "UploadFileRequest{" +
                "file=" + file +
                ", purpose='" + purpose + '\'' +
                ", expireAt=" + expireAt +
                ", preprocessConfigs=" + preprocessConfigs +
                ", url='" + url + '\'' +
                ", tos=" + tos +
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TosStorage getTos() {
        return tos;
    }

    public void setTos(TosStorage tos) {
        this.tos = tos;
    }

    public static UploadFileRequestBuilder builder() {
        return new UploadFileRequestBuilder();
    }

    public static final class UploadFileRequestBuilder {
        private File file;
        private String purpose;
        private Integer expireAt;
        private PreprocessConfigs preprocessConfigs;
        private String url;
        private TosStorage tos;

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

        public UploadFileRequestBuilder url(String url) {
            this.url = url;
            return this;
        }

        public UploadFileRequestBuilder tos(TosStorage tos) {
            this.tos = tos;
            return this;
        }

        public UploadFileRequest build() {
            UploadFileRequest uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setFile(file);
            uploadFileRequest.setPurpose(purpose);
            uploadFileRequest.setExpireAt(expireAt);
            uploadFileRequest.setPreprocessConfigs(preprocessConfigs);
            uploadFileRequest.setUrl(url);
            uploadFileRequest.setTos(tos);
            return uploadFileRequest;
        }
    }
}
