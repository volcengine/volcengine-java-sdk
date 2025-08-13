package com.volcengine.ark.runtime.model.responses.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.item.BaseItem;
import com.volcengine.ark.runtime.model.responses.item.InputItem;

import java.util.List;

public class ListInputItemsResponse {
    @JsonProperty("object")
    private String object;

    @JsonProperty("data")
    private List<BaseItem> data;

    @JsonProperty("first_id")
    private String firstId;

    @JsonProperty("last_id")
    private String lastId;

    @JsonProperty("has_more")
    private Boolean hasMore;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<BaseItem> getData() {
        return data;
    }

    public void setData(List<BaseItem> data) {
        this.data = data;
    }

    public String getFirstId() {
        return firstId;
    }

    public void setFirstId(String firstId) {
        this.firstId = firstId;
    }

    public String getLastId() {
        return lastId;
    }

    public void setLastId(String lastId) {
        this.lastId = lastId;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    @Override
    public String toString() {
        return "ListInputItemsResponse{" +
                "object='" + object + '\'' +
                ", data=" + data +
                ", firstId='" + firstId + '\'' +
                ", lastId='" + lastId + '\'' +
                ", hasMore=" + hasMore +
                '}';
    }
}