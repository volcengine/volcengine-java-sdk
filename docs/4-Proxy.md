[← Transport](3-Transport.md) | Proxy[(中文)](4-Proxy-zh.md) | [Timeout →](5-Timeout.md)

---

## HTTP(S) Proxy

> **Default**
>
> No proxy.

### Configure HTTP(S) Proxy

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
    public static void main(String[] args) {
        String regionId = "cn-beijing";
        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getEnvCredentials())
                .setRegion(regionId)
                .setHttpProxy("http://your_http_proxy:proxy_port")
                .setHttpsProxy("http://your_https_proxy:proxy_port");
    }
}
```

### Notes

The following environment variables are supported:

- `http_proxy` / `HTTP_PROXY`
- `https_proxy` / `HTTPS_PROXY`

Priority: code > environment variables.

---

[← Transport](3-Transport.md) | Proxy[(中文)](4-Proxy-zh.md) | [Timeout →](5-Timeout.md)
