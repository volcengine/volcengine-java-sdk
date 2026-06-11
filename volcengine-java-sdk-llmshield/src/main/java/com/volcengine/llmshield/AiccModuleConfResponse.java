package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

// AICC 模块配置响应结构
public class AiccModuleConfResponse {
    private static final ObjectMapper MAPPER = new ObjectMapper()
            .enable(SerializationFeature.INDENT_OUTPUT);

    @JsonProperty("ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JsonProperty("Result")
    private AiccModuleConfResult result;

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public AiccModuleConfResult getResult() {
        return result;
    }

    public void setResult(AiccModuleConfResult result) {
        this.result = result;
    }

    @Override
    public String toString() {
        try {
            return MAPPER.writeValueAsString(this);
        } catch (Exception e) {
            return super.toString();
        }
    }
}
