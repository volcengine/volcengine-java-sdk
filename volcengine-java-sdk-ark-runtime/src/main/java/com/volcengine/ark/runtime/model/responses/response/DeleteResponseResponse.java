package com.volcengine.ark.runtime.model.responses.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteResponseResponse {
    @JsonProperty("id")
    private String id;

    @JsonProperty("object")
    private String object;

    @JsonProperty("deleted")
    private Boolean deleted;

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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "DeleteResponseResponse{" +
                "id='" + id + '\'' +
                ", object='" + object + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}