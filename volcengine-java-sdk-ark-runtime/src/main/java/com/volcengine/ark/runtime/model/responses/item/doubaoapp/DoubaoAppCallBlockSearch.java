package com.volcengine.ark.runtime.model.responses.item.doubaoapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

import java.util.List;

public class DoubaoAppCallBlockSearch extends DoubaoAppCallBlock {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type = ResponsesConstants.DOBAO_APP_BLOCK_TYPE_SEARCH;

    @JsonProperty("summary")
    private String summary;

    @JsonProperty("queries")
    private List<String> queries;

    @JsonProperty("results")
    private List<DoubaoAppSearchResult> results;

    @JsonProperty("status")
    private String status;

    @JsonProperty("parent_id")
    private String parentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<String> getQueries() {
        return queries;
    }

    public void setQueries(List<String> queries) {
        this.queries = queries;
    }

    public List<DoubaoAppSearchResult> getResults() {
        return results;
    }

    public void setResults(List<DoubaoAppSearchResult> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public DoubaoAppCallBlockSearch() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String id;
        private String summary;
        private List<String> queries;
        private List<DoubaoAppSearchResult> results;
        private String status;
        private String parentId;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        public Builder queries(List<String> queries) {
            this.queries = queries;
            return this;
        }

        public Builder results(List<DoubaoAppSearchResult> results) {
            this.results = results;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public DoubaoAppCallBlockSearch build() {
            DoubaoAppCallBlockSearch search = new DoubaoAppCallBlockSearch();
            search.setId(id);
            search.setSummary(summary);
            search.setQueries(queries);
            search.setResults(results);
            search.setStatus(status);
            search.setParentId(parentId);
            return search;
        }
    }

    @Override
    public String toString() {
        return "DoubaoAppCallBlockSearch{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", summary='" + summary + '\'' +
                ", queries=" + queries +
                ", results=" + results +
                ", status='" + status + '\'' +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
