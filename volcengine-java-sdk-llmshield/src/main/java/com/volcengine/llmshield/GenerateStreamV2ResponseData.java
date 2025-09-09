package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

// 生成响应数据类
public class GenerateStreamV2ResponseData {
    @JsonProperty("ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JsonProperty("Result")
    private GenerateStreamResult result;

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public GenerateStreamResult getResult() {
        return result;
    }

    public void setResult(GenerateStreamResult result) {
        this.result = result;
    }
}

