package com.volcengine.ark.runtime.model.responses.usage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Usage {
    @JsonProperty("input_tokens")
    private Long inputTokens;

    @JsonProperty("output_tokens")
    private Long outputTokens;

    @JsonProperty("total_tokens")
    private Long totalTokens;

    @JsonProperty("input_tokens_details")
    private InputTokensDetails inputTokensDetails;

    @JsonProperty("output_tokens_details")
    private OutputTokensDetails outputTokensDetails;

    public Long getInputTokens() {
        return inputTokens;
    }

    public void setInputTokens(Long inputTokens) {
        this.inputTokens = inputTokens;
    }

    public Long getOutputTokens() {
        return outputTokens;
    }

    public void setOutputTokens(Long outputTokens) {
        this.outputTokens = outputTokens;
    }

    public Long getTotalTokens() {
        return totalTokens;
    }

    public void setTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
    }

    public InputTokensDetails getInputTokensDetails() {
        return inputTokensDetails;
    }

    public void setInputTokensDetails(InputTokensDetails inputTokensDetails) {
        this.inputTokensDetails = inputTokensDetails;
    }

    public OutputTokensDetails getOutputTokensDetails() {
        return outputTokensDetails;
    }

    public void setOutputTokensDetails(OutputTokensDetails outputTokensDetails) {
        this.outputTokensDetails = outputTokensDetails;
    }

    @Override
    public String toString() {
        return "Usage{" +
                "inputTokens=" + inputTokens +
                ", outputTokens=" + outputTokens +
                ", totalTokens=" + totalTokens +
                ", inputTokensDetails=" + inputTokensDetails +
                ", outputTokensDetails=" + outputTokensDetails +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long inputTokens;
        private Long outputTokens;
        private Long totalTokens;
        private InputTokensDetails inputTokensDetails;
        private OutputTokensDetails outputTokensDetails;

        public Builder inputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }

        public Builder outputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }

        public Builder totalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }

        public Builder inputTokensDetails(InputTokensDetails inputTokensDetails) {
            this.inputTokensDetails = inputTokensDetails;
            return this;
        }

        public Builder outputTokensDetails(OutputTokensDetails outputTokensDetails) {
            this.outputTokensDetails = outputTokensDetails;
            return this;
        }

        public Usage build() {
            Usage usage = new Usage();
            usage.setInputTokens(inputTokens);
            usage.setOutputTokens(outputTokens);
            usage.setTotalTokens(totalTokens);
            usage.setInputTokensDetails(inputTokensDetails);
            usage.setOutputTokensDetails(outputTokensDetails);
            return usage;
        }
    }
}