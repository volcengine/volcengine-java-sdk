package com.volcengine.model;

import com.google.gson.annotations.SerializedName;

/**
 * @Author: xuyaming@bytedance.com
 * @Date: 2022/3/18 15:22
 */
public class Error {
    @SerializedName("CodeN")
    private Integer codeN;
    @SerializedName("Code")
    private String code;
    @SerializedName("Message")
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
