package com.volcengine.llmshield;

import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

// 生成响应类
public class GenerateStreamV2Response implements Closeable {
    private final InputStream reader;
    private final CloseableHttpResponse response;

    public GenerateStreamV2Response(InputStream reader, CloseableHttpResponse response) {
        this.reader = reader;
        this.response = response;
    }

    public InputStream getReader() {
        return reader;
    }

    public void setReader(InputStream reader) {
        // 不允许修改，保持只读
    }

    /**
     * 关闭响应流，释放 HTTP 连接回连接池
     * 用户读取完流后必须调用此方法，否则会导致连接池泄露
     */
    @Override
    public void close() throws IOException {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                // 忽略流关闭异常，继续关闭 response
            }
        }
        if (response != null) {
            response.close();
        }
    }
}
