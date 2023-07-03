package com.volcengine.model;

import com.google.gson.annotations.SerializedName;

/**
 * xuyaming@bytedance.com
 * 2023/7/3 18:09
 */
public  abstract class AbstractResponse {
    @SerializedName("ResponseMetadata")
    protected ResponseMetadata responseMetadata;

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }
}
