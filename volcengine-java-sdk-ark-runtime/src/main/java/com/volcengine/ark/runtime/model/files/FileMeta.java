package com.volcengine.ark.runtime.model.files;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.exception.ArkAPIError.ArkErrorDetails;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FileMeta {
    /**
     * The file identifier, which can be referenced in the API endpoints.
     * 文件标识符,可以在 API 接口中引用。
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The object type, which is always "file".
     * 对象类型，始终为 "file"
     */
    @JsonProperty(value = "object")
    private String object;

    /**
     * The size of the file in bytes.
     * 文件的字节大小
     */
    @JsonProperty(value = "bytes")
    private Integer bytes;

    /**
     * The unix timestamp for when the file was created.
     * 文件创建的 Unix 时间戳，默认转换为 UTC 时间。
     */
    @JsonProperty(value = "created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String createdTime;

    /**
     * The unix timestamp for when the file will expire.
     * 文件过期的 Unix 时间戳，默认转换为 UTC 时间。
     */
    @JsonProperty(value = "expire_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String expireTime;

    /**
     * The name of the file.
     * 文件名
     */
    @JsonProperty(value = "filename")
    private String filename;

    /**
     * The intended purpose of the file. Currently, only "user_data" is supported.
     * 文件的预期用途。目前只支持 "user_data"。
     */
    @JsonProperty(value = "purpose")
    private String purpose;

    /**
     * The current status of the file, which can be either uploaded, processed, pending, error, deleting or deleted.
     * 文件的当前状态，可以是"processing", "active", "failed".
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Additional details about the status of the file. If the file is in the error state, this will include a message describing the error.
     * 关于文件状态的额外详细信息。如果文件处于错误状态，这将包括描述错误的消息。
     */
    @JsonProperty(value = "error")
    private ArkErrorDetails error;

    @JsonProperty(value = "preprocess_configs")
    private PreprocessConfigs preprocessConfigs;

    public FileMeta() {
    }


    @Override
    public String toString() {
        return "FileMeta{" +
                "id='" + id + '\'' +
                ", object='" + object + '\'' +
                ", bytes=" + bytes +
                ", createdTime='" + createdTime + '\'' +
                ", expireTime='" + expireTime + '\'' +
                ", filename='" + filename + '\'' +
                ", purpose='" + purpose + '\'' +
                ", status='" + status + '\'' +
                ", error=" + error +
                ", preprocessConfigs=" + preprocessConfigs +
                '}';
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Integer getBytes() {
        return bytes;
    }

    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArkErrorDetails getError() {
        return error;
    }

    public void setError(ArkErrorDetails error) {
        this.error = error;
    }

    public PreprocessConfigs getPreprocessConfigs() {
        return preprocessConfigs;
    }

    public void setPreprocessConfigs(PreprocessConfigs preprocessConfigs) {
        this.preprocessConfigs = preprocessConfigs;
    }

    public static final class FileBuilder {
        private String id;
        private String object;
        private Integer bytes;
        private String createdTime;
        private String expireTime;
        private String filename;
        private String purpose;
        private String status;
        private ArkErrorDetails error;
        private PreprocessConfigs preprocessConfigs;

        private FileBuilder() {
        }

        public static FileBuilder aFile() {
            return new FileBuilder();
        }

        public FileBuilder id(String id) {
            this.id = id;
            return this;
        }

        public FileBuilder object(String object) {
            this.object = object;
            return this;
        }

        public FileBuilder bytes(Integer bytes) {
            this.bytes = bytes;
            return this;
        }

        public FileBuilder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public FileBuilder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        public FileBuilder filename(String filename) {
            this.filename = filename;
            return this;
        }

        public FileBuilder purpose(String purpose) {
            this.purpose = purpose;
            return this;
        }

        public FileBuilder status(String status) {
            this.status = status;
            return this;
        }

        public FileBuilder error(ArkErrorDetails error) {
            this.error = error;
            return this;
        }

        public FileBuilder preprocessConfigs(PreprocessConfigs preprocessConfigs) {
            this.preprocessConfigs = preprocessConfigs;
            return this;
        }

        public FileMeta build() {
            FileMeta fileMeta = new FileMeta();
            fileMeta.setId(id);
            fileMeta.setObject(object);
            fileMeta.setBytes(bytes);
            fileMeta.setCreatedTime(createdTime);
            fileMeta.setExpireTime(expireTime);
            fileMeta.setFilename(filename);
            fileMeta.setPurpose(purpose);
            fileMeta.setStatus(status);
            fileMeta.setError(error);
            fileMeta.setPreprocessConfigs(preprocessConfigs);
            return fileMeta;
        }
    }
}
