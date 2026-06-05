[← Endpoint 配置](2-Endpoint-zh.md) | Transport[(English)](3-Transport.md) | [代理配置 →](4-Proxy-zh.md)

---

## HTTP 连接池配置

> **默认**
>
> - `maxIdleConns` - `5`
> - `keepAliveDurationMs` - `5 * 60 * 1000`

Java SDK 连接池用的是 `com.squareup.okhttp.ConnectionPool`，可以通过设置 `maxIdleConns` 和 `keepAliveDurationMs` 来控制连接池的行为。

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
    public static void main(String[] args) {
        String regionId = "cn-beijing";
        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getEnvCredentials())
                .setRegion(regionId)
                .setMaxIdleConns(5) // 最大空闲连接数量
                .setKeepAliveDurationMs(5 * 60 * 1000); // 空闲连接存活时间
    }
}
```

## HTTPS 请求配置

### 指定 scheme

> **默认**
>
> - `disableSSL` - `false`（表示 HTTPS）

Java SDK 默认使用 HTTPS 请求，如需使用 HTTP 请求，可通过设置 `disableSSL` 为 `true` 来实现。

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
    public static void main(String[] args) {
        String regionId = "cn-beijing";
        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getEnvCredentials())
                .setRegion(regionId)
                .setDisableSSL(false);
    }
}
```

### 忽略 SSL 验证

> **默认**
>
> - `verifyingSsl` - `true`（表示启用 SSL 验证）

Java SDK 默认启用 SSL 验证，如需忽略 SSL 验证，可通过设置 `verifyingSsl` 为 `false` 来实现。

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
    public static void main(String[] args) {
        String regionId = "cn-beijing";
        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getEnvCredentials())
                .setRegion(regionId)
                .setVerifyingSsl(false); // 忽略SSL验证
    }
}
```

---

[← Endpoint 配置](2-Endpoint-zh.md) | Transport[(English)](3-Transport.md) | [代理配置 →](4-Proxy-zh.md)
