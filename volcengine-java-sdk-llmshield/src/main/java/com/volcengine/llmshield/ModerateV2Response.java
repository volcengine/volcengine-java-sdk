package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

// 审核响应结构
public class ModerateV2Response {
    // 定义全局复用的静态ObjectMapper
    private static final ObjectMapper GLOBAL_MAPPER = new ObjectMapper();

    // 静态代码块中初始化配置（仅执行一次）
    static {
        GLOBAL_MAPPER.enable(SerializationFeature.INDENT_OUTPUT);
        // 可在此处添加其他全局配置
        // GLOBAL_MAPPER.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }

    @JsonProperty("ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JsonProperty("Result")
    private ModerateV2Result result;

    // Getters and Setters
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public ModerateV2Result getResult() {
        return result;
    }

    public void setResult(ModerateV2Result result) {
        this.result = result;
    }

    // 重写toString方法，返回JSON格式
    @Override
    public String toString() {
        try {
            // 复用全局静态mapper，避免重复创建实例
            return GLOBAL_MAPPER.writeValueAsString(this);
        } catch (Exception e) {
            return super.toString();
        }
    }
}
