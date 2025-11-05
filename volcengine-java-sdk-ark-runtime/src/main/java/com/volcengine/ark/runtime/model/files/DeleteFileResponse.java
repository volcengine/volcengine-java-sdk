package com.volcengine.ark.runtime.model.files;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteFileResponse {

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "DeleteFileResponse{" +
                "object='" + object + '\'' +
                ", id='" + id + '\'' +
                ", deleted=" + deleted +
                '}';
    }

    @JsonProperty(value = "object")
    private String object;

    @JsonProperty(value = "id")
    private String id;

    @JsonProperty(value = "deleted")
    private Boolean deleted;

    public DeleteFileResponse() {
    }
}
