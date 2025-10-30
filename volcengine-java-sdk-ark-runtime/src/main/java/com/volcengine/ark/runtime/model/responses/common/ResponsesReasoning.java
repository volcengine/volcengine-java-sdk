package com.volcengine.ark.runtime.model.responses.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponsesReasoning {

    @JsonProperty("effort")
    private String effort;

    public String getEffort() {
        return effort;
    }

    public void setEffort(String effort) {
        this.effort = effort;
    }



    @Override
    public String toString() {
        return "ResponseReasoning{" +
                "effort='" + effort + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String effort;

        public Builder effort(String effort) {
            this.effort = effort;
            return this;
        }

        public ResponsesReasoning build() {
            ResponsesReasoning responsesReasoning = new ResponsesReasoning();
            responsesReasoning.setEffort(effort);
            return responsesReasoning;
        }
    }
}