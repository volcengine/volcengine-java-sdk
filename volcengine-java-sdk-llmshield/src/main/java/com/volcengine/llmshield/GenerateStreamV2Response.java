package com.volcengine.llmshield;

import java.io.InputStream;

// 生成响应类
public  class GenerateStreamV2Response {
    private InputStream reader;

    public GenerateStreamV2Response(InputStream reader) {
        this.reader = reader;
    }

    public InputStream getReader() {
        return reader;
    }

    public void setReader(InputStream reader) {
        this.reader = reader;
    }
}