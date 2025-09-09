package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

/**
 * xuyaming@bytedance.com
 * 2022/3/18 15:22
 */
public class Error {
    @JsonProperty("CodeN")
    private Integer codeN;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Message")
    private String message;

    public Integer getCodeN() {
        return codeN;
    }

    public void setCodeN(Integer codeN) {
        this.codeN = codeN;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
