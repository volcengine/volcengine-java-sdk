package com.volcengine.model;

import com.google.gson.annotations.SerializedName;

/**
 * xuyaming@bytedance.com
 * 2022/3/18 15:21
 */
public class VolcstackResponse<T> {
    @SerializedName("ResponseMetadata")
    private ResponseMetadata responseMetadata;
    @SerializedName("Result")
    private T result;

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
