package com.volcengine.ark.runtime.model.completion.chat;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ChatCompletionChoiceLogprobContent {

    /**
     * The token chosen.
     */
    String token;

    /**
     * The log probability of this token, if it is within the top 20 most likely
     * tokens.
     *
     * Otherwise, the value `-9999.0` is used to signify that the token is very
     * unlikely.
     */
    @JsonProperty("logprob")
    Double logprob;

    /**
     * A list of integers representing the UTF-8 bytes representation of the token.
     *
     * Useful in instances where characters are represented by multiple tokens and
     * their byte representations must be combined to generate the correct text
     * representation. Can be `null` if there is no bytes representation for the token.
     */
    @JsonProperty("bytes")
    List<Integer> bytes;

    /*
     * The list of most likely tokens and their log probability information, as requested via 'top_logprobs'.
     */
    @JsonProperty("top_logprobs")
    List<ChatCompletionChoiceLogprobContentTopLogprob> topLogprobs;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Double getLogprob() {
        return logprob;
    }

    public void setLogprob(Double logprob) {
        this.logprob = logprob;
    }

    public List<Integer> getBytes() {
        return bytes;
    }

    public void setBytes(List<Integer> bytes) {
        this.bytes = bytes;
    }

    public List<ChatCompletionChoiceLogprobContentTopLogprob> getTopLogprobs() {
        return topLogprobs;
    }

    public void setTopLogprobs(List<ChatCompletionChoiceLogprobContentTopLogprob> topLogprobs) {
        this.topLogprobs = topLogprobs;
    }

    @Override
    public String toString() {
        return "ChatCompletionChoiceLogprobContent{" +
                "token='" + token + '\'' +
                ", logprob=" + logprob +
                ", bytes=" + bytes +
                ", topLogprobs=" + topLogprobs +
                '}';
    }
}
