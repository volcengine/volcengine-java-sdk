package com.volcengine.ark.runtime.model.responses.tool;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

import java.util.Map;

public class ToolKnowledgeSearch extends ResponsesTool {

    @JsonProperty("knowledge_resource_id")
    private String knowledgeResourceId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("limit")
    private Long limit;

    @JsonProperty("dense_weight")
    private Double denseWeight;

    @JsonProperty("doc_filter")
    private Map<String, Object> docFilter;

    @JsonProperty("ranking_options")
    private Map<String, Object> rankingOptions;

    @JsonProperty("max_keyword")
    private Integer maxKeyword;

    public ToolKnowledgeSearch() {
        super(ResponsesConstants.TOOL_TYPE_KNOWLEDGE_SEARCH);
    }

    public String getKnowledgeResourceId() {
        return knowledgeResourceId;
    }

    public void setKnowledgeResourceId(String knowledgeResourceId) {
        this.knowledgeResourceId = knowledgeResourceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public Double getDenseWeight() {
        return denseWeight;
    }

    public void setDenseWeight(Double denseWeight) {
        this.denseWeight = denseWeight;
    }

    public Map<String, Object> getDocFilter() {
        return docFilter;
    }

    public void setDocFilter(Map<String, Object> docFilter) {
        this.docFilter = docFilter;
    }

    public Map<String, Object> getRankingOptions() {
        return rankingOptions;
    }

    public void setRankingOptions(Map<String, Object> rankingOptions) {
        this.rankingOptions = rankingOptions;
    }

    public Integer getMaxKeyword() {
        return maxKeyword;
    }

    public void setMaxKeyword(Integer maxKeyword) {
        this.maxKeyword = maxKeyword;
    }

    @Override
    public String toString() {
        return "ToolKnowledgeSearch{" +
                "type='" + getType() + '\'' +
                ", knowledgeResourceId='" + knowledgeResourceId + '\'' +
                ", description='" + description + '\'' +
                ", limit=" + limit +
                ", denseWeight=" + denseWeight +
                ", docFilter=" + docFilter +
                ", rankingOptions=" + rankingOptions +
                ", maxKeyword=" + maxKeyword +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String knowledgeResourceId;
        private String description;
        private Long limit;
        private Double denseWeight;
        private Map<String, Object> docFilter;
        private Map<String, Object> rankingOptions;
        private Integer maxKeyword;

        public Builder knowledgeResourceId(String knowledgeResourceId) {
            this.knowledgeResourceId = knowledgeResourceId;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public Builder denseWeight(Double denseWeight) {
            this.denseWeight = denseWeight;
            return this;
        }

        public Builder docFilter(Map<String, Object> docFilter) {
            this.docFilter = docFilter;
            return this;
        }

        public Builder rankingOptions(Map<String, Object> rankingOptions) {
            this.rankingOptions = rankingOptions;
            return this;
        }

        public Builder maxKeyword(Integer maxKeyword) {
            this.maxKeyword = maxKeyword;
            return this;
        }

        public ToolKnowledgeSearch build() {
            ToolKnowledgeSearch toolKnowledgeSearch = new ToolKnowledgeSearch();
            toolKnowledgeSearch.setKnowledgeResourceId(knowledgeResourceId);
            toolKnowledgeSearch.setDescription(description);
            toolKnowledgeSearch.setLimit(limit);
            toolKnowledgeSearch.setDenseWeight(denseWeight);
            toolKnowledgeSearch.setDocFilter(docFilter);
            toolKnowledgeSearch.setRankingOptions(rankingOptions);
            toolKnowledgeSearch.setMaxKeyword(maxKeyword);
            return toolKnowledgeSearch;
        }
    }
}
