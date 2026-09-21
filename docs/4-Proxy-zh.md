[← Transport](3-Transport-zh.md) | 代理配置[(English)](4-Proxy.md) | [超时配置 →](5-Timeout-zh.md)

---

## HTTP(S) 代理配置

> **默认**
>
> 无代理。

### 配置 HTTP(S) 代理

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
    public static void main(String[] args) {
        String regionId = "cn-beijing";
        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getEnvCredentials())
                .setRegion(regionId)
                .setHttpProxy("http://your_http_proxy:proxy_port") // 设置http代理
                .setHttpsProxy("http://your_https_proxy:proxy_port"); // 设置https代理
    }
}
```

### 注意事项

支持通过以下环境变量配置代理：

- `http_proxy` / `HTTP_PROXY`
- `https_proxy` / `HTTPS_PROXY`

优先级：代码指定 > 环境变量。

---

## STS 凭证 Provider 的代理 / TLS 配置

上文的 `setHttpProxy` / `setHttpsProxy` 作用于**业务 API 请求**的 `ApiClient`。而 `StsAssumeRoleProvider`、`OidcCredentialProvider`、`SamlCredentialProvider` 在**获取临时凭证**时会独立向 STS 发起请求，因此这三个 Provider 各自提供了访问 STS 的代理与 TLS 参数，与 Go SDK 的 `ProxyURL` / `CAFile` / `InsecureSkipVerify` 保持一致。

| 参数 | 说明 | 默认值 |
|---|---|---|
| `setProxyUrl(String)` | 访问 STS 的 HTTP 正向代理，格式 `http://[user:password@]host:port`，必须显式填写 `1..65535` 范围内的端口。支持 Basic 认证及 HTTPS CONNECT，不支持 TLS-to-proxy 或 SOCKS。Provider 显式设置优先于绑定客户端的显式代理。 | 空（客户端 fallback，然后保留原传输行为） |
| `setCaFile(String)` | 自定义 CA 证书（PEM 文件路径），用于校验 STS 服务端证书。为空且 `insecureSkipVerify=false` 时恢复原传输 TLS 设置，原设置可能是自定义配置；仅原设置未定制时才使用 JVM 默认信任库。 | 空（无 Provider CA 覆盖） |
| `setInsecureSkipVerify(boolean)` | 为 `true` 时跳过 STS TLS 证书链与主机名校验。**仅限联调**（自签证书 / 代理拦截），生产环境禁用。 | `false` |

> ⚠️ **注意事项**
>
> 1. 三个参数均为选填；Provider 和客户端均未显式指定代理时，OIDC/SAML 保留 URLConnection 代理选择，包括 JVM `http.proxyHost` / `http.proxyPort` 和 `https.proxyHost` / `https.proxyPort` 系统属性，不解析 `HTTP_PROXY` / `HTTPS_PROXY` 及其小写环境变量。AssumeRole 保留原 ApiClient 的代理选择，包括其支持的代理环境变量。不会将环境变量写入 Provider 配置。
> 2. `InsecureSkipVerify` 会关闭证书校验，存在中间人风险，切勿在生产环境启用。
> 3. `CAFile` 与 `InsecureSkipVerify` 同时设置时，`InsecureSkipVerify` 优先（直接跳过校验）。

```java
import com.volcengine.ApiClient;
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.StsAssumeRoleProvider;

public class SampleCode {
    public static void main(String[] args) {
        StsAssumeRoleProvider stsProvider = new StsAssumeRoleProvider(
            "YourAccessKey", "YourSecretKey", "YourRoleName", "YourAccountId");

        // 通过带 Basic 认证的正向代理访问 STS
        stsProvider.setProxyUrl("http://user:pass@10.0.0.1:8080");
        // 使用自定义 CA 证书校验 STS 服务端证书
        stsProvider.setCaFile("/path/to/ca.pem");
        // 联调环境下跳过 TLS 校验（生产禁用）
        // stsProvider.setInsecureSkipVerify(true);

        CredentialProvider credentialProvider = new CredentialProvider(stsProvider);
        ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion("cn-beijing");
    }
}
```

`OidcCredentialProvider` 与 `SamlCredentialProvider` 使用完全相同的三个 setter：`setProxyUrl`、`setCaFile`、`setInsecureSkipVerify`。

### 绑定和配置更新

对通过 `CredentialProvider` 直接传入的上述三个精确内置类型，`ApiClient` 在首次访问凭证时创建配置快照，每个客户端拥有独立凭证缓存和刷新锁，不向源 Provider 回写 fallback。客户端 fallback 按 **STS URL** 的协议选择客户端显式设置的 `httpProxy` 或 `httpsProxy`，不使用业务 API 的协议。

请在首次访问前配置源 Provider。调用 `setHttpProxy`、`setHttpsProxy` 或 `setCredentialProvider` 后，该客户端的后续请求重新绑定，已签名请求及其重试继续使用原绑定。源 Provider 后续配置变更需再次调用 `setCredentialProvider` 才能应用。自定义 Provider、子类及默认凭证链保持原对象契约，不递归复制或注入该 fallback。

AssumeRole 保留原 endpoint、region、源凭证、自定义 TLS factory、客户端证书密钥及超时。修改 `insecureSkipVerify` 或替换/清空 `caFile` 会调整 Provider TLS 覆盖。仅当 `caFile` 为空且 `insecureSkipVerify=false` 时，才撤销全部 Provider TLS 覆盖并恢复原传输 TLS 设置，包括原自定义 factory；仅原设置未定制时才使用 JVM 默认信任库。移除代理凭据也会撤销 Provider 的代理认证覆盖。

HTTPS STS 请求经带认证的 HTTP 代理转发时，使用兼容 OkHttp 2.7.5 的私有、有次数上限的 CONNECT 握手，支持代理在返回 407 后关闭连接。仅收到 Basic challenge 后发送代理凭据，不向 HTTPS 源站请求传递代理认证头，错误凭据终止认证。该分支不跟随重定向，不支持 TLS-to-proxy（`https://` 代理 URL）、SOCKS 及其他非 HTTP 代理协议。

### 快照迁移说明

历史上依赖共享源 Provider 热更新的代码，在修改源对象的角色、源凭证、代理、TLS、到期或重试设置后，必须对每个受影响客户端重新绑定：再次调用 `apiClient.setCredentialProvider(credentialProvider)`，仅能通过构造参数设置的字段则需绑定新的 Provider。将源 AssumeRole Provider 的到期时间设为 `0` 不再强制已有绑定刷新。已签名请求及其重试继续使用原绑定。与共享源 Provider 缓存相比，独立的客户端缓存可能增加 STS 请求量。

AssumeRole 内部 ApiClient 的快照在源对象与各绑定之间隔离 SDK 重试次数、退避时间上下限和 `retryErrorCodes` 集合。自定义策略保留运行时类型；额外可变引用需通过重写 `BackoffStrategy.copy()` / `RetryCondition.copy()`、调用 `super.copy()` 并复制结果中的相应字段来隔离。这不承诺深复制任意 JSON helper、拦截器、TLS factory 或其他调用方对象。OIDC/SAML 会快照重试次数和间隔；OIDC Token 文件内容仍在刷新时读取。

---

[← Transport](3-Transport-zh.md) | 代理配置[(English)](4-Proxy.md) | [超时配置 →](5-Timeout-zh.md)
