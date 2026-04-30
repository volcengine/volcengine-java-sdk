[← Credentials](1-Credentials.md) | Endpoint[(中文)](2-Endpoint-zh.md) | [Transport →](3-Transport.md)

---

# Endpoint Configuration

## Custom Endpoint

> - **Default**: if `endpoint` is not specified, the SDK uses [Automatic Endpoint Resolution](#automatic-endpoint-resolution).

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
    public static void main(String[] args) {
        String region = "cn-beijing";
        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getEnvCredentials())
                .setRegion(region)
                .setEndpoint("<example>.<regionId>.volcengineapi.com");
    }
}
```

## Custom RegionId

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
    public static void main(String[] args) {
        String regionId = "cn-beijing";
        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getEnvCredentials())
                .setRegion(regionId);
    }
}
```

## Automatic Endpoint Resolution

Volcengine provides a flexible endpoint resolution mechanism. The SDK automatically builds the endpoint based on service name and region, and supports DualStack.

### Default Endpoint Resolution

1. Whether region is in the bootstrap list.
   - Built-in list: `./volcengine-java-sdk-core/src/main/java/com/volcengine/endpoint/DefaultEndpointProvider.java#BOOTSTRAP_REGION`.
   - Only predefined regions (e.g., `cn-beijing-autodriving`, `ap-southeast-2`) or user-configured regions are auto-resolved; others fall back to `open.volcengineapi.com`.
   - You can extend the list via env var `VOLC_BOOTSTRAP_REGION_LIST_CONF` or `customBootstrapRegion`.
2. DualStack support (IPv6)
   - Enable via `setUseDualStack(true)` or env var `VOLC_ENABLE_DUALSTACK=true`.
   - When enabled, the suffix changes from `volcengineapi.com` to `volcengine-api.com`.
3. Construct endpoint:
   - Global services: `<service>.volcengineapi.com`.
   - Regional services: `<service>.<region>.volcengineapi.com`.

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;
import java.util.HashSet;

public class SampleCode {
    public static void main(String[] args) {
        String regionId = "cn-beijing";
        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getEnvCredentials())
                .setRegion(regionId)
                .setUseDualStack(true)
                .setCustomBootstrapRegion(new HashSet<String>() {{
                    add("custom_example_region1");
                    add("custom_example_region2");
                }});
    }
}
```

### Standard Endpoint Resolution

| Global service | DualStack | Format |
|---|---|---|
| Yes | Yes | `{Service}.volcengine-api.com` |
| Yes | No  | `{Service}.volcengineapi.com` |
| No  | Yes | `{Service}.{region}.volcengine-api.com` |
| No  | No  | `{Service}.{region}.volcengineapi.com` |

Whether a service is global depends on the service itself and cannot be changed. See: `./volcengine-java-sdk-core/src/main/java/com/volcengine/endpoint/StandardEndpointProvider.java#SERVICE_INFOS`.

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;
import com.volcengine.endpoint.StandardEndpointProvider;

public class SampleCode {
    public static void main(String[] args) {
        String regionId = "cn-beijing";
        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getEnvCredentials())
                .setEndpointResolver(new StandardEndpointProvider())
                .setRegion(regionId)
                .setUseDualStack(true);
    }
}
```

---

[← Credentials](1-Credentials.md) | Endpoint[(中文)](2-Endpoint-zh.md) | [Transport →](3-Transport.md)
