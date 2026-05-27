[← Endpoint](2-Endpoint.md) | Transport[(中文)](3-Transport-zh.md) | [Proxy →](4-Proxy.md)

---

## HTTP Connection Pool

> **Default**
>
> - `maxIdleConns`: `5`
> - `keepAliveDurationMs`: `5 * 60 * 1000`

The Java SDK uses `com.squareup.okhttp.ConnectionPool`. You can adjust the pool behavior via these two parameters.

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
    public static void main(String[] args) {
        String regionId = "cn-beijing";
        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getEnvCredentials())
                .setRegion(regionId)
                .setMaxIdleConns(5)
                .setKeepAliveDurationMs(5 * 60 * 1000);
    }
}
```

## HTTPS Request Configuration

### Specify Scheme

> **Default**
>
> - `disableSSL`: `false` (HTTPS)

Set `disableSSL=true` to use HTTP.

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

### Ignore SSL Verification

> **Default**
>
> - `verifyingSsl`: `true`

Set `verifyingSsl=false` to skip SSL verification.

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
    public static void main(String[] args) {
        String regionId = "cn-beijing";
        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getEnvCredentials())
                .setRegion(regionId)
                .setVerifyingSsl(false);
    }
}
```

---

[← Endpoint](2-Endpoint.md) | Transport[(中文)](3-Transport-zh.md) | [Proxy →](4-Proxy.md)
