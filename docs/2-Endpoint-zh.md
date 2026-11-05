[← 访问凭据](1-Credentials-zh.md) | Endpoint 配置[(English)](2-Endpoint.md) | [Transport →](3-Transport-zh.md)

---

## EndPoint 配置

> **默认**
>
> 不指定 Endpoint 时，走 [自动化 Endpoint 寻址](#自动化-endpoint-寻址)。

### 自定义 Endpoint

用户可以通过在初始化客户端时指定 Endpoint：

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

### 自定义 RegionId

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

### 自动化 Endpoint 寻址

> **默认**
>
> 默认支持自动寻址，无需手动指定 Endpoint。

为了简化用户配置，Volcengine 提供了灵活的 Endpoint 自动寻址机制。用户无需手动指定服务地址，SDK 会根据服务名称、区域（Region）等信息自动拼接出合理的访问地址，并支持用户自定义 DualStack（双栈）。

#### Endpoint 默认寻址

##### 寻址逻辑

1. **是否自动寻址 Region**

    内置自动寻址 Region 列表代码：[`./volcengine-java-sdk-core/src/main/java/com/volcengine/endpoint/DefaultEndpointProvider.java#BOOTSTRAP_REGION`](./volcengine-java-sdk-core/src/main/java/com/volcengine/endpoint/DefaultEndpointProvider.java#L25)

    SDK 仅对部分预设区域（如 `cn-beijing-autodriving`、`ap-southeast-2`）或用户配置的区域执行自动寻址；其他区域默认返回 Endpoint：`open.volcengineapi.com`。

    用户可通过环境变量 `VOLC_BOOTSTRAP_REGION_LIST_CONF` 或代码中自定义 `customBootstrapRegion` 来扩展控制区域列表。

2. **DualStack 支持（IPv6）**

    SDK 支持双栈网络（IPv4 + IPv6）访问地址，自动启用条件如下：显式传入参数 `setUseDualStack(true)`，或设置环境变量 `VOLC_ENABLE_DUALSTACK=true`。优先级：`useDualStack` > `VOLC_ENABLE_DUALSTACK`。

    启用后，域名后缀将从 `volcengineapi.com` 切换为 `volcengine-api.com`。

3. **根据服务名和区域自动构造 Endpoint 地址**

    - **全局服务（如 `CDN`、`IAM`）**：使用 `<服务名>.volcengineapi.com`（或启用双栈时使用 `volcengine-api.com`）。示例：`cdn.volcengineapi.com`。
    - **区域服务（如 `ECS`、`RDS`）**：使用 `<服务名>.<区域名>.volcengineapi.com` 作为默认 Endpoint。示例：`ecs.cn-beijing.volcengineapi.com`。

##### 代码示例

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
                .setUseDualStack(true) // 定义是否启用双栈网络（IPv4 + IPv6）访问地址，默认false；也可以使用环境变量VOLC_ENABLE_DUALSTACK=true
                .setCustomBootstrapRegion(new HashSet<String>() {{
                    add("custom_example_region1");
                    add("custom_example_region2");
                }}); // 自定义自动寻址Region列表；也可以使用环境变量VOLC_BOOTSTRAP_REGION_LIST_CONF
    }
}
```

##### region / service 合法性校验

自动寻址会把 service 和 region 拼进访问域名（如 `{service}.{region}.volcengineapi.com`）。为防止通过 region 或 service 把请求指向其他主机（SSRF），SDK 会在拼接域名之前校验这两个值，对默认寻址、标准寻址和自定义 `EndpointResolver` 都生效。

**校验规则**：非空的 region / service 必须是单个合法的主机名标签：

- 只能包含 ASCII 字母、数字、`-` 和 `_`；
- 以字母开头；
- 不以 `-` 或 `_` 结尾。

`null` 和空字符串不在本校验范围内，沿用各入口原有的处理逻辑；纯空白字符串（如 `" "`）不是空字符串，会被判为非法。`cn-beijing@127.0.0.1`、`cn/beijing`、`evil.com#`、`x:443` 这类值都会被拒绝（`.` 同样不允许）。

**校验时机与覆盖入口**：

- 客户端请求：未设置 Endpoint 时，`ResolveEndpointInterceptor` 在调用 `EndpointResolver#endpointFor`（包括通过 `setEndpointResolver(...)` 设置的自定义 resolver）之前校验。该拦截器在构建请求和签名之前执行，因此校验失败时请求既不会被签名，也不会被发送。
- `UniversalApi`（`doCall` / `doCallWithHttpInfo`）：未设置 Endpoint 时，在把 service name 写入请求路径之前校验 `UniversalRequest` 的 service name 和 `ApiClient` 的 region。
- 直接调用 `DefaultEndpointProvider#endpointFor` 或 `StandardEndpointProvider#endpointFor` 时同样会校验，并直接抛出 `EndpointValidationException`。`StandardEndpointProvider` 先执行原有的非空检查（空白值仍报 `region must not be null.` / `service must not be null.`），再执行本校验。
- RDS IAM 鉴权 Token（`ConnectUtils.buildAuthToken`）：未设置 Endpoint 时通过 `StandardEndpointProvider` 寻址，region 非法时抛出 `EndpointValidationException`。
- SSO 凭证：访问 `cloudidentity-oauth.{region}.volces.com` / `cloudidentity-portal.{region}.volces.com` 之前校验 region。配置的 region 为 `null`、空字符串或纯空白时使用默认值 `cn-beijing`；否则先 trim，再校验 trim 后的值。校验失败时凭证获取以 `ApiException` 失败，错误消息中包含 `InvalidRegion`。

**何时跳过**：`ApiClient` 通过 `setEndpoint(...)` 设置了非空白的 Endpoint 时，`ResolveEndpointInterceptor` 和 `UniversalApi` 都不做本校验，直接使用该 Endpoint；显式设置的 Endpoint 本身也不受上述规则限制。

**错误类型**：

- 校验失败抛出 `com.volcengine.endpoint.EndpointValidationException`，它继承 `IllegalArgumentException`。`getCode()` 返回错误码 `InvalidRegion` 或 `InvalidService`（常量 `EndpointValidation.ERR_CODE_INVALID_REGION` / `EndpointValidation.ERR_CODE_INVALID_SERVICE`），`getErrorMessage()` 返回不含错误码的错误信息，`getMessage()` 形如 `InvalidRegion: invalid region "..."...`。service 和 region 都非法时先报 service。
- 通过 API 调用（包括 `UniversalApi`）触发时，该异常会被包装为 `com.volcengine.ApiException`：`getCode()` 为 `400`，`getCause()` 为原始的 `EndpointValidationException`，`getResponseMetadata().getError().getCode()` 为 `InvalidRegion` / `InvalidService`。请求没有发出，因此没有 RequestId。
- 同步调用直接抛出该 `ApiException`；异步调用（如 `describeRegionsAsync`）通过 `ApiCallback#onFailure` 回调该异常，回调参数 `statusCode` 为 `0`，状态码请以 `e.getCode()` 为准。

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
                .setRegion("cn-beijing@127.0.0.1"); // 非法 region
        EcsApi api = new EcsApi(apiClient);
        try {
            api.describeRegions(new DescribeRegionsRequest());
        } catch (ApiException e) {
            Error error = e.getResponseMetadata() == null ? null : e.getResponseMetadata().getError();
            if (e.getCode() == 400 && error != null
                    && EndpointValidation.ERR_CODE_INVALID_REGION.equals(error.getCode())) {
                // 请求未签名、未发送
                System.out.println("invalid region: " + error.getMessage());
            }
        }
    }
}
```

**与旧版本不同**：

- 客户端请求路径上，带首尾空白的 region（如 `"cn-beijing "`）不再被接受，会直接以 `InvalidRegion` 失败。此前 SDK 不会拒绝这类值，但签名使用的始终是未 trim 的原值，这类请求本就会被服务端拒绝。请去掉 region 的首尾空白。
- SSO 凭证配置的 region 仍会先 trim，再校验。
- 上述 `ApiException` 包装只针对本校验失败。通过本校验后，resolver 自身抛出的异常（例如 `StandardEndpointProvider` 对标签合法但不支持的 region 抛出的 `InvalidRegion: invalid region [...]`、对未注册服务抛出的 `ServiceNotFound: ...`）与此前一致，原样抛给调用方，不做包装。
- 新增公开的校验工具：`EndpointValidation.validateRegion(String)`、`EndpointValidation.validateService(String)`、`EndpointValidation.validateServiceAndRegion(String, String)`，常量 `EndpointValidation.ERR_CODE_INVALID_REGION`、`EndpointValidation.ERR_CODE_INVALID_SERVICE`，以及 `EndpointValidationException`（`getCode()`、`getErrorMessage()`、`toApiException()`）。自定义 `EndpointResolver` 可以复用这些方法。

#### Endpoint 标准寻址

##### 标准寻址规则

| Global 服务 | 双栈 | 格式 |
|---|---|---|
| 是 | 是 | `{Service}.volcengine-api.com` |
| 是 | 否 | `{Service}.volcengineapi.com` |
| 否 | 是 | `{Service}.{region}.volcengine-api.com` |
| 否 | 否 | `{Service}.{region}.volcengineapi.com` |

是否 Global 服务由具体调用的服务决定，不可修改。可以参考列表：[`./volcengine-java-sdk-core/src/main/java/com/volcengine/endpoint/StandardEndpointProvider.java#SERVICE_INFOS`](./volcengine-java-sdk-core/src/main/java/com/volcengine/endpoint/StandardEndpointProvider.java#L142)。

##### 代码示例

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;
import java.util.HashSet;
import com.volcengine.endpoint.StandardEndpointProvider;

public class SampleCode {
    public static void main(String[] args) {
        String regionId = "cn-beijing";
        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getEnvCredentials())
                .setEndpointResolver(new StandardEndpointProvider()) // 设置标准寻址
                .setRegion(regionId) // 设置region
                .setUseDualStack(true); // 设置是否双栈
    }
}
```

---

[← 访问凭据](1-Credentials-zh.md) | Endpoint 配置[(English)](2-Endpoint.md) | [Transport →](3-Transport-zh.md)
