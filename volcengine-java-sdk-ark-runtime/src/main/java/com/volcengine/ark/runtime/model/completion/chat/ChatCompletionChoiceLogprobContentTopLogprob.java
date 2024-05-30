package com.volcengine.ark.runtime.model.completion.chat;

import java.util.List;

public class ChatCompletionChoiceLogprobContentTopLogprob {
    /**
     * The message content token.
     */
    String token;

    /**
     * The log probability of the message content token.
     */
    double logprob;

    /**
     * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters
     * are represented by multiple tokens and their byte representations must be combined to generate the correct text
     * representation. Can be null if there is no bytes representation for the token.
     */
    List<Integer> bytes;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public double getLogprob() {
        return logprob;
    }

    public void setLogprob(double logprob) {
        this.logprob = logprob;
    }

    public List<Integer> getBytes() {
        return bytes;
    }

    public void setBytes(List<Integer> bytes) {
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        return "ChatCompletionChoiceLogprobContentTopLogprob{" +
                "token='" + token + '\'' +
                ", logprob=" + logprob +
                ", bytes=" + bytes +
                '}';
    }
}
