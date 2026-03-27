[← Transport](3-Transport.md) | Timeout[(中文)](4-Timeout-zh.md) | [Retry →](5-Retry.md)

---

# Timeouts

## Global Timeouts (Client Level)

> **Default (milliseconds)**
> - `connectTimeout`: `10 * 1000`
> - `writeTimeout`: `10 * 1000`
> - `readTimeout`: `10 * 1000`

The Java SDK client uses `com.squareup.okhttp.OkHttpClient`. Configure timeouts via these parameters.

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

[← Transport](3-Transport.md) | Timeout[(中文)](4-Timeout-zh.md) | [Retry →](5-Retry.md)
