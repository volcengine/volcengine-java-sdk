package com.volcengine.ark.runtime.model.responses.tool;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponsesToolChoice {
    private String mode;
    private FunctionToolChoice functionToolChoice;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public FunctionToolChoice getFunctionToolChoice() {
        return functionToolChoice;
    }

    public void setFunctionToolChoice(FunctionToolChoice functionToolChoice) {
        this.functionToolChoice = functionToolChoice;
    }

    @Override
    public String toString() {
        return "ResponsesToolChoice{" +
                "mode='" + mode + '\'' +
                ", functionToolChoice=" + functionToolChoice +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String mode;
        private FunctionToolChoice functionToolChoice;

        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        public Builder functionToolChoice(FunctionToolChoice functionToolChoice) {
            this.functionToolChoice = functionToolChoice;
            return this;
        }

        public ResponsesToolChoice build() {
            ResponsesToolChoice responsesToolChoice = new ResponsesToolChoice();
            responsesToolChoice.setMode(mode);
            responsesToolChoice.setFunctionToolChoice(functionToolChoice);
            return responsesToolChoice;
        }
    }
}