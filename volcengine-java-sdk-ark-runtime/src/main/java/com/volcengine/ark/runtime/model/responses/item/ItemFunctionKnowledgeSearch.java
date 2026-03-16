package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemFunctionKnowledgeSearch extends BaseItem implements InputItem, OutputItem {

    @JsonProperty("queries")
    private List<String> queries;

    @JsonProperty("knowledge_resource_id")
    private String knowledgeResourceId;

    @JsonProperty("status")
    private String status;

    @JsonProperty("id")
    private String id;

    public ItemFunctionKnowledgeSearch() {
        super(ResponsesConstants.ITEM_TYPE_KNOWLEDGE_SEARCH_CALL);
    }

    public List<String> getQueries() {
        return queries;
    }

    public void setQueries(List<String> queries) {
        this.queries = queries;
    }

    public String getKnowledgeResourceId() {
        return knowledgeResourceId;
    }

    public void setKnowledgeResourceId(String knowledgeResourceId) {
        this.knowledgeResourceId = knowledgeResourceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ItemFunctionKnowledgeSearch{" +
                "type='" + getType() + '\'' +
                ", queries=" + queries +
                ", knowledgeResourceId='" + knowledgeResourceId + '\'' +
                ", status='" + status + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private List<String> queries;
        private String knowledgeResourceId;
        private String status;
        private String id;

        public Builder queries(List<String> queries) {
            this.queries = queries;
            return this;
        }

        public Builder knowledgeResourceId(String knowledgeResourceId) {
            this.knowledgeResourceId = knowledgeResourceId;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public ItemFunctionKnowledgeSearch build() {
            ItemFunctionKnowledgeSearch itemFunctionKnowledgeSearch = new ItemFunctionKnowledgeSearch();
            itemFunctionKnowledgeSearch.setQueries(queries);
            itemFunctionKnowledgeSearch.setKnowledgeResourceId(knowledgeResourceId);
            itemFunctionKnowledgeSearch.setStatus(status);
            itemFunctionKnowledgeSearch.setId(id);
            return itemFunctionKnowledgeSearch;
        }
    }
}
