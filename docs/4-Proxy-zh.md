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
| `setProxyUrl(String)` | 访问 STS 的 HTTP 正向代理，格式 `http://[user:password@]host:port`。支持 Basic 认证及 HTTPS CONNECT，Provider 显式设置优先于绑定客户端的代理。 | 空（保留原传输行为） |
| `setCaFile(String)` | 自定义 CA 证书（PEM 文件路径），用于校验 STS 服务端证书。留空时使用 JVM 默认信任库。 | 空（使用系统根证书） |
| `setInsecureSkipVerify(boolean)` | 为 `true` 时跳过 STS TLS 证书链与主机名校验。**仅限联调**（自签证书 / 代理拦截），生产环境禁用。 | `false` |

> ⚠️ **注意事项**
>
> 1. 三个参数均为选填；Provider 和客户端均未指定代理时保留原传输行为：OIDC/SAML 使用 JVM URLConnection 代理选择，AssumeRole 保留其 ApiClient 传输。不会将环境变量写入 Provider 配置。
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

对上述三个内置类，`ApiClient` 在首次访问凭证时创建配置快照，每个客户端拥有独立凭证缓存和刷新锁，不向源 Provider 回写 fallback。客户端 fallback 按 **STS URL** 的协议选择 `httpProxy` 或 `httpsProxy`，不使用业务 API 的协议。

请在首次访问前配置源 Provider。调用 `setHttpProxy`、`setHttpsProxy` 或 `setCredentialProvider` 后，该客户端的后续请求重新绑定，已签名请求及其重试继续使用原绑定。源 Provider 后续配置变更需再次调用 `setCredentialProvider` 才能应用。自定义 Provider、子类及默认凭证链保持原对象契约，不递归复制或注入该 fallback。

AssumeRole 保留原 endpoint、region、源凭证、自定义 TLS factory、客户端证书密钥及超时。关闭 `insecureSkipVerify`、替换/清空 `caFile`、移除代理凭据都会撤销相应的 Provider 覆盖；清空后恢复调用方原设置，原设置也可能是自定义配置。

HTTPS 认证代理使用兼容 OkHttp 2.7.5 的私有、有次数上限的 CONNECT 握手，支持代理在返回 407 后关闭连接。仅收到 Basic challenge 后发送代理凭据，不向 HTTPS 业务请求传递代理认证头，错误凭据终止认证。该分支不跟随重定向，不支持 TLS-to-proxy（`https://` 代理 URL）及非 HTTP 代理协议。

---

[← Transport](3-Transport-zh.md) | 代理配置[(English)](4-Proxy.md) | [超时配置 →](5-Timeout-zh.md)
