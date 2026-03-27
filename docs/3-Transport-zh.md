[← Endpoint 配置](2-Endpoint-zh.md) | Transport[(English)](3-Transport.md) | [超时配置 →](4-Timeout-zh.md)

---

# Http连接池配置

> **默认**
> * `maxIdleConns` - `5`
> * `keepAliveDurationMs` - `5 * 60 * 1000`

Java SDK连接池用的是`com.squareup.okhttp.ConnectionPool`，可以通过设置`maxIdleConns`和`keepAliveDurationMs`来控制连接池的行为。

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

# Https请求配置

## 指定scheme

> **默认**
> * `disableSSL` - `false`(表示https)

Java SDK默认使用https请求，如需使用http请求，可通过设置`disableSSL`为`true`来实现。

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

## 忽略SSL验证

> **默认**
> * `verifyingSsl` - `true` (表示启用SSL验证)

Java SDK默认启用SSL验证，如需忽略SSL验证，可通过设置`verifyingSsl`为`false`来实现。

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

# Http(s)代理配置

> **默认**
> * 无代理

## 配置Http(s)代理

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public static void main(String[] args) {
    String regionId = "cn-beijing";
    ApiClient apiClient = new ApiClient()
            .setCredentials(Credentials.getEnvCredentials())
            .setRegion(regionId)
            .setHttpProxy("http://your_http_proxy:proxy_port") // 设置http代理
            .setHttpsProxy("http://your_https_proxy:proxy_port"); // 设置https代理
}
```

## 注意事项

支持通过以下环境变量配置代理:

http_proxy/HTTP_PROXY, https_proxy/HTTPS_PROXY

优先级：代码指定 > 环境变量

---

[← Endpoint 配置](2-Endpoint-zh.md) | Transport[(English)](3-Transport.md) | [超时配置 →](4-Timeout-zh.md)
