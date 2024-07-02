package com.volcengine.ark.runtime.model.tokenization;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tokenization {

    Integer index;

    String object;

    Integer totalTokens;

    List<Integer> tokenIds;

    List<List<Integer>> offsetMapping;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Integer getTotalTokens() {
        return totalTokens;
    }

    public void setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
    }

    public List<Integer> getTokenIds() {
        return tokenIds;
    }

    public void setTokenIds(List<Integer> tokenIds) {
        this.tokenIds = tokenIds;
    }

    public List<List<Integer>> getOffsetMapping() {
        return offsetMapping;
    }

    public void setOffsetMapping(List<List<Integer>> offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    @Override
    public String toString() {
        return "Tokenization{" +
                "index=" + index +
                ", object='" + object + '\'' +
                ", totalTokens=" + totalTokens +
                ", tokenIds=" + tokenIds +
                ", offsetMapping=" + offsetMapping +
                '}';
    }
}
