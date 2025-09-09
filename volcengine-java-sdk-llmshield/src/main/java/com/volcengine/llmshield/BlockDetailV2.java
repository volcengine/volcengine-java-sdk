package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// 拦截详情
// 忽略“无属性”的问题，允许序列化
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockDetailV2 {
    // 空结构
}
