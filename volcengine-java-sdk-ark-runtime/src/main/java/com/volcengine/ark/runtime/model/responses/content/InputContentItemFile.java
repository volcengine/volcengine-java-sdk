package com.volcengine.ark.runtime.model.responses.content;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

public class InputContentItemFile extends InputContentItem{

    public InputContentItemFile() {
        super(ResponsesConstants.CONTENT_ITEM_TYPE_INPUT_FILE);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileData() {
        return fileData;
    }

    public void setFileData(String fileData) {
        this.fileData = fileData;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @JsonProperty("file_url")
    private String fileUrl;

    @JsonProperty("file_id")
    private String fileId;

    @JsonProperty("file_data")
    private String fileData;

    @JsonProperty("filename")
    private String fileName;

    @Override
    public String toString() {
        return "InputContentItemFile{" +
                "fileUrl='" + fileUrl + '\'' +
                ", fileId='" + fileId + '\'' +
                ", fileData='" + fileData + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }

    public static final class InputContentItemFileBuilder {
        private String fileUrl;
        private String fileId;
        private String fileData;
        private String fileName;

        private InputContentItemFileBuilder() {
        }

        public static InputContentItemFileBuilder anInputContentItemFile() {
            return new InputContentItemFileBuilder();
        }

        public InputContentItemFileBuilder fileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }

        public InputContentItemFileBuilder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        public InputContentItemFileBuilder fileData(String fileData) {
            this.fileData = fileData;
            return this;
        }

        public InputContentItemFileBuilder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public InputContentItemFile build() {
            InputContentItemFile inputContentItemFile = new InputContentItemFile();
            inputContentItemFile.setFileUrl(fileUrl);
            inputContentItemFile.setFileId(fileId);
            inputContentItemFile.setFileData(fileData);
            inputContentItemFile.setFileName(fileName);
            return inputContentItemFile;
        }
    }
}
