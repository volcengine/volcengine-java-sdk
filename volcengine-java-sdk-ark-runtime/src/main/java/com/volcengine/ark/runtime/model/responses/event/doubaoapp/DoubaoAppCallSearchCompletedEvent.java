package com.volcengine.ark.runtime.model.responses.event.doubaoapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.item.doubaoapp.DoubaoAppSearchResult;

import java.util.List;

public class DoubaoAppCallSearchCompletedEvent extends ItemEvent {

    @JsonProperty("block_index")
    private Long blockIndex;

    @JsonProperty("summary")
    private String summary;

    @JsonProperty("queries")
    private List<String> queries;

    @JsonProperty("results")
    private List<DoubaoAppSearchResult> results;

    public DoubaoAppCallSearchCompletedEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_DOUBAO_APP_CALL_SEARCH_COMPLETED);
    }

    public Long getBlockIndex() {
        return blockIndex;
    }

    public void setBlockIndex(Long blockIndex) {
        this.blockIndex = blockIndex;
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

    @Override
    public String toString() {
        return "DoubaoAppCallSearchCompletedEvent{" +
                "type='" + getType() + '\'' +
                ", blockIndex=" + blockIndex +
                ", summary='" + summary + '\'' +
                ", queries=" + queries +
                ", results=" + results +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", sequenceNumber=" + getSequenceNumber() +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private DoubaoAppCallSearchCompletedEvent event = new DoubaoAppCallSearchCompletedEvent();

        public Builder blockIndex(Long blockIndex) {
            event.setBlockIndex(blockIndex);
            return this;
        }

        public Builder summary(String summary) {
            event.setSummary(summary);
            return this;
        }

        public Builder queries(List<String> queries) {
            event.setQueries(queries);
            return this;
        }

        public Builder results(List<DoubaoAppSearchResult> results) {
            event.setResults(results);
            return this;
        }

        public DoubaoAppCallSearchCompletedEvent build() {
            return event;
        }
    }
}
