[← Transport](3-Transport-zh.md) | 超时配置[(English)](4-Timeout.md) | [重试机制 →](5-Retry-zh.md)

---

# 超时配置

## 全局超时设置（Client级别）

> **默认(毫秒)**
> * `connectTimeout` - `10 * 1000` (客户端尝试与服务器建立 TCP 连接的最大等待时间)
> * `writeTimeout` - `10 * 1000` (向服务器发送请求数据过程中单次写入操作的最大等待时间)
> * `readTimeout` - `10 * 1000` (连接建立后，读取服务器响应数据的最大等待时间)



Java SDK Client使用的是`com.squareup.okhttp.OkHttpClient`，可以通过设置`connectTimeout`、`readTimeout`和`writeTimeout`来控制请求的超时时间。

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
    public static void main(String[] args) {
        String regionId = "cn-beijing";
        ApiClient apiClient = new ApiClient()
            .setCredentials(Credentials.getEnvCredentials())
            .setRegion(regionId)
            .setConnectTimeout(10 * 1000)
            .setReadTimeout(15 * 1000)
            .setWriteTimeout(15 * 1000);
    }
}
```

---

[← Transport](3-Transport-zh.md) | 超时配置[(English)](4-Timeout.md) | [重试机制 →](5-Retry-zh.md)
