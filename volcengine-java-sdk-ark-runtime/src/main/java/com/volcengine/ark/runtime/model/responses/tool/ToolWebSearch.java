package com.volcengine.ark.runtime.model.responses.tool;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.common.UserLocation;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

import java.util.List;

public class ToolWebSearch extends ResponsesTool {

    @JsonProperty("limit")
    private Long limit;

    @JsonProperty("user_location")
    private UserLocation userLocation;

    @JsonProperty("sources")
    private List<String> sources;

    @JsonProperty("max_keyword")
    private Integer maxKeyword;

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public UserLocation getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(UserLocation userLocation) {
        this.userLocation = userLocation;
    }

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public Integer getMaxKeyword() {
        return maxKeyword;
    }

    public void setMaxKeyword(Integer maxKeyword) {
        this.maxKeyword = maxKeyword;
    }

    public ToolWebSearch() {
        super(ResponsesConstants.TOOL_TYPE_WEB_SEARCH);
    }

    @Override
    public String toString() {
        return "ToolWebSearch{" +
                "type='" + getType() + '\'' +
                ", limit=" + limit +
                ", userLocation=" + userLocation +
                ", sources=" + sources +
                ", maxKeyword=" + maxKeyword +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long limit;
        private UserLocation userLocation;
        private List<String> sources;
        private Integer maxKeyword;

        public Builder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public Builder userLocation(UserLocation userLocation) {
            this.userLocation = userLocation;
            return this;
        }

        public Builder sources(List<String> sources) {
            this.sources = sources;
            return this;
        }

        public Builder maxKeyword(Integer maxKeyword) {
            this.maxKeyword = maxKeyword;
            return this;
        }

        public ToolWebSearch build() {
            ToolWebSearch toolWebSearch = new ToolWebSearch();
            toolWebSearch.setLimit(limit);
            toolWebSearch.setUserLocation(userLocation);
            toolWebSearch.setSources(sources);
            toolWebSearch.setMaxKeyword(maxKeyword);
            return toolWebSearch;
        }
    }
}