package com.volcengine.ark.runtime.model.files;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListFilesResponse {
    @JsonProperty(value = "object")
    private String object;

    @JsonProperty(value = "data")
    private List<FileMeta> data;

    @JsonProperty(value = "has_more")
    private Boolean hasMore;

    @JsonProperty(value = "first_id")
    private String firstId;

    @JsonProperty(value = "last_id")
    private String lastId;

    public ListFilesResponse() {
    }

    @Override
    public String toString() {
        return "ListFilesResponse{" +
                "object='" + object + '\'' +
                ", data=" + data +
                ", hasMore=" + hasMore +
                ", firstId='" + firstId + '\'' +
                ", lastId='" + lastId + '\'' +
                '}';
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<FileMeta> getData() {
        return data;
    }

    public void setData(List<FileMeta> data) {
        this.data = data;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
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

    public static final class ListFilesResponseBuilder {
        private String object;
        private List<FileMeta> data;
        private Boolean hasMore;
        private String firstId;
        private String lastId;

        private ListFilesResponseBuilder() {
        }

        public static ListFilesResponseBuilder aListFilesResponse() {
            return new ListFilesResponseBuilder();
        }

        public ListFilesResponseBuilder object(String object) {
            this.object = object;
            return this;
        }

        public ListFilesResponseBuilder data(List<FileMeta> data) {
            this.data = data;
            return this;
        }

        public ListFilesResponseBuilder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        public ListFilesResponseBuilder firstId(String firstId) {
            this.firstId = firstId;
            return this;
        }

        public ListFilesResponseBuilder lastId(String lastId) {
            this.lastId = lastId;
            return this;
        }

        public ListFilesResponse build() {
            ListFilesResponse listFilesResponse = new ListFilesResponse();
            listFilesResponse.setObject(object);
            listFilesResponse.setData(data);
            listFilesResponse.setHasMore(hasMore);
            listFilesResponse.setFirstId(firstId);
            listFilesResponse.setLastId(lastId);
            return listFilesResponse;
        }
    }
}
