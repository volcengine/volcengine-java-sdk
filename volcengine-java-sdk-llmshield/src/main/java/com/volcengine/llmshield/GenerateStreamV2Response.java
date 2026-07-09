package com.volcengine.llmshield;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

// 生成响应类
public class GenerateStreamV2Response implements Closeable {
    private final InputStream reader;
    // 使用 Closeable 抽象上层依赖，便于未来切换底层 HTTP client（OkHttp / JDK HttpClient 等）时上层 API 兼容不破。
    private final Closeable response;

    public GenerateStreamV2Response(InputStream reader, Closeable response) {
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
        try {
            if (reader != null) {
                reader.close();
            }
        } finally {
            if (response != null) {
                response.close();
            }
        }
    }
}
