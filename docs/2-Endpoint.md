[← Credentials](1-Credentials.md) | Endpoint[(中文)](2-Endpoint-zh.md) | [Transport →](3-Transport.md)

---

## Endpoint Configuration

> **Default**
>
> If `Endpoint` is not specified, the SDK uses [Automatic Endpoint Resolution](#automatic-endpoint-resolution).

### Custom Endpoint

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

### Custom RegionId

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

### Automatic Endpoint Resolution

Volcengine provides a flexible endpoint resolution mechanism. The SDK automatically builds the endpoint based on service name and region, and supports DualStack.

#### Default Endpoint Resolution

##### Resolution Logic

1. **Whether the region is in the bootstrap list**

    Built-in list: [`./volcengine-java-sdk-core/src/main/java/com/volcengine/endpoint/DefaultEndpointProvider.java#BOOTSTRAP_REGION`](./volcengine-java-sdk-core/src/main/java/com/volcengine/endpoint/DefaultEndpointProvider.java#L25).

    Only predefined regions (e.g., `cn-beijing-autodriving`, `ap-southeast-2`) or user-configured regions are auto-resolved; others fall back to `open.volcengineapi.com`.

    You can extend the list via env var `VOLC_BOOTSTRAP_REGION_LIST_CONF` or `customBootstrapRegion`.

2. **DualStack support (IPv6)**

    Enable via `setUseDualStack(true)` or env var `VOLC_ENABLE_DUALSTACK=true`. Priority: `useDualStack` > `VOLC_ENABLE_DUALSTACK`.

    When enabled, the suffix changes from `volcengineapi.com` to `volcengine-api.com`.

3. **Construct endpoint based on service name and region**

    - **Global services (e.g., `CDN`, `IAM`)**: `<service>.volcengineapi.com` (or `volcengine-api.com` when DualStack is enabled). Example: `cdn.volcengineapi.com`.
    - **Regional services (e.g., `ECS`, `RDS`)**: `<service>.<region>.volcengineapi.com` is used as the default endpoint. Example: `ecs.cn-beijing.volcengineapi.com`.

##### Code Example

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

##### Region and service validation

Automatic endpoint resolution places the service and region in the endpoint host (for example `{service}.{region}.volcengineapi.com`). To prevent a region or service from redirecting the request to a different host (SSRF), the SDK validates both values before any host is built. This applies to the default resolver, the standard resolver and any custom `EndpointResolver`.

**Rules**: a non-empty region or service must be a single valid host name label:

- only ASCII letters, digits, `-` and `_`;
- starts with a letter;
- does not end with `-` or `_`.

`null` and the empty string are not covered by this check and keep the existing handling of each entry point; a whitespace-only string (such as `" "`) is not empty and is rejected. Values such as `cn-beijing@127.0.0.1`, `cn/beijing`, `evil.com#` or `x:443` are rejected (`.` is not allowed either).

**When and where it applies**:

- Client requests: when no endpoint is set, `ResolveEndpointInterceptor` validates before calling `EndpointResolver#endpointFor` (including a custom resolver set with `setEndpointResolver(...)`). This interceptor runs before the request is built and signed, so a request that fails validation is neither signed nor sent.
- `UniversalApi` (`doCall` / `doCallWithHttpInfo`): when no endpoint is set, the service name of the `UniversalRequest` and the region of the `ApiClient` are validated before the service name is written into the request path.
- Calling `DefaultEndpointProvider#endpointFor` or `StandardEndpointProvider#endpointFor` directly also validates, and throws `EndpointValidationException` directly. `StandardEndpointProvider` runs its existing non-blank check first (blank values still fail with `region must not be null.` / `service must not be null.`), then this validation.
- RDS IAM auth token (`ConnectUtils.buildAuthToken`): when no endpoint is set, the endpoint is resolved with `StandardEndpointProvider`, and an invalid region throws `EndpointValidationException`.
- SSO credentials: the region is validated before `cloudidentity-oauth.{region}.volces.com` / `cloudidentity-portal.{region}.volces.com` is called. A `null`, empty or whitespace-only configured region falls back to `cn-beijing`; any other value is trimmed first and the trimmed value is validated. On failure, retrieving the credentials fails with an `ApiException` whose message contains `InvalidRegion`.

**When it is skipped**: when a non-blank endpoint is set on the `ApiClient` with `setEndpoint(...)`, neither `ResolveEndpointInterceptor` nor `UniversalApi` runs this validation and the endpoint is used as is; the explicitly configured endpoint itself is not restricted by these rules.

**Errors**:

- A validation failure throws `com.volcengine.endpoint.EndpointValidationException`, which extends `IllegalArgumentException`. `getCode()` returns the error code `InvalidRegion` or `InvalidService` (constants `EndpointValidation.ERR_CODE_INVALID_REGION` / `EndpointValidation.ERR_CODE_INVALID_SERVICE`), `getErrorMessage()` returns the message without the code, and `getMessage()` looks like `InvalidRegion: invalid region "..."...`. When both values are invalid, the service is reported first.
- When triggered by an API call (including `UniversalApi`), it is wrapped in `com.volcengine.ApiException`: `getCode()` is `400`, `getCause()` is the original `EndpointValidationException`, and `getResponseMetadata().getError().getCode()` is `InvalidRegion` / `InvalidService`. No request was sent, so there is no RequestId.
- Synchronous calls throw this `ApiException`; asynchronous calls (such as `describeRegionsAsync`) deliver it to `ApiCallback#onFailure` with a `statusCode` argument of `0`, so use `e.getCode()` for the status code.

```java
import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.DescribeRegionsRequest;
import com.volcengine.endpoint.EndpointValidation;
import com.volcengine.model.Error;
import com.volcengine.sign.Credentials;

public class SampleCode {
    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getEnvCredentials())
                .setRegion("cn-beijing@127.0.0.1"); // invalid region
        EcsApi api = new EcsApi(apiClient);
        try {
            api.describeRegions(new DescribeRegionsRequest());
        } catch (ApiException e) {
            Error error = e.getResponseMetadata() == null ? null : e.getResponseMetadata().getError();
            if (e.getCode() == 400 && error != null
                    && EndpointValidation.ERR_CODE_INVALID_REGION.equals(error.getCode())) {
                // The request was neither signed nor sent.
                System.out.println("invalid region: " + error.getMessage());
            }
        }
    }
}
```

**Behavior change**:

- On the client request path, a region with leading or trailing whitespace (such as `"cn-beijing "`) is no longer accepted and fails with `InvalidRegion`. Previously the SDK did not reject it, but the request was always signed with the untrimmed value, so the server rejected such requests anyway. Remove the surrounding whitespace from the region.
- The region configured for SSO credentials is still trimmed first, then validated.
- The `ApiException` wrapping above applies only to failures of this validation. Once a value passes it, exceptions thrown by the resolver itself (for example `InvalidRegion: invalid region [...]` for a well-formed but unsupported region, or `ServiceNotFound: ...` for an unregistered service, from `StandardEndpointProvider`) reach the caller unchanged, as before, and are not wrapped.
- New public validation helpers: `EndpointValidation.validateRegion(String)`, `EndpointValidation.validateService(String)`, `EndpointValidation.validateServiceAndRegion(String, String)`, the constants `EndpointValidation.ERR_CODE_INVALID_REGION` and `EndpointValidation.ERR_CODE_INVALID_SERVICE`, and `EndpointValidationException` (`getCode()`, `getErrorMessage()`, `toApiException()`). Custom `EndpointResolver` implementations can reuse them.

#### Standard Endpoint Resolution

##### Resolution Rules

| Global service | DualStack | Format |
|---|---|---|
| Yes | Yes | `{Service}.volcengine-api.com` |
| Yes | No  | `{Service}.volcengineapi.com` |
| No  | Yes | `{Service}.{region}.volcengine-api.com` |
| No  | No  | `{Service}.{region}.volcengineapi.com` |

Whether a service is global depends on the service itself and cannot be changed. See: [`./volcengine-java-sdk-core/src/main/java/com/volcengine/endpoint/StandardEndpointProvider.java#SERVICE_INFOS`](./volcengine-java-sdk-core/src/main/java/com/volcengine/endpoint/StandardEndpointProvider.java#L142).

##### Code Example

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
