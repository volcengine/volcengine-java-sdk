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

## Proxy / TLS for STS Credential Providers

The `setHttpProxy` / `setHttpsProxy` above apply to the `ApiClient` used for **business API requests**. In contrast, `StsAssumeRoleProvider`, `OidcCredentialProvider`, and `SamlCredentialProvider` issue their own requests to STS when **fetching temporary credentials**. Each of these providers therefore exposes proxy and TLS parameters for reaching STS, matching the Go SDK's `ProxyURL` / `CAFile` / `InsecureSkipVerify`.

| Setter | Description | Default |
|---|---|---|
| `setProxyUrl(String)` | HTTP forward proxy for reaching STS, format `http://[user:password@]host:port`. Supports Basic authentication, including HTTPS CONNECT. Explicit provider settings take precedence over the bound client's proxy. | empty (original transport behavior) |
| `setCaFile(String)` | Path to a custom CA bundle (PEM) used to verify the STS server certificate. When empty, the JVM default trust store is used. | empty (system trust store) |
| `setInsecureSkipVerify(boolean)` | When `true`, skips STS TLS certificate-chain and hostname verification. **Debugging only** (self-signed cert / intercepting proxy); never enable in production. | `false` |

> ⚠️ **Notes**
>
> 1. All three parameters are optional. Without an explicit provider or client proxy, the original transport behavior applies: OIDC/SAML retain JVM URLConnection proxy selection; AssumeRole retains its ApiClient transport. Environment variables are not copied into provider options.
> 2. `InsecureSkipVerify` disables certificate verification and exposes you to MITM risk. Never enable it in production.
> 3. When both `CAFile` and `InsecureSkipVerify` are set, `InsecureSkipVerify` takes precedence (verification is skipped entirely).

```java
import com.volcengine.ApiClient;
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.StsAssumeRoleProvider;

public class SampleCode {
    public static void main(String[] args) {
        StsAssumeRoleProvider stsProvider = new StsAssumeRoleProvider(
            "YourAccessKey", "YourSecretKey", "YourRoleName", "YourAccountId");

        // Reach STS through a forward proxy with Basic auth
        stsProvider.setProxyUrl("http://user:pass@10.0.0.1:8080");
        // Verify the STS server certificate against a custom CA bundle
        stsProvider.setCaFile("/path/to/ca.pem");
        // Skip TLS verification in a debugging environment (never in production)
        // stsProvider.setInsecureSkipVerify(true);

        CredentialProvider credentialProvider = new CredentialProvider(stsProvider);
        ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion("cn-beijing");
    }
}
```

`OidcCredentialProvider` and `SamlCredentialProvider` expose the exact same three setters: `setProxyUrl`, `setCaFile`, and `setInsecureSkipVerify`.

### Binding and Updates

For these three built-in classes, `ApiClient` lazily snapshots provider configuration on first credential access. Each client owns a separate credential cache and refresh lock; the supplied provider is never updated with client fallback. The fallback uses `httpProxy` or `httpsProxy` according to the **STS URL**, not the business API scheme.

Configure the source provider before first access. `setHttpProxy`, `setHttpsProxy`, or `setCredentialProvider` invalidates that client's binding for future requests; an already signed request retains its binding through retries. To apply later source-provider changes, call `setCredentialProvider` again. Custom providers, subclasses, and the default credential chain retain their existing identity and are not recursively copied or given this fallback.

AssumeRole preserves its existing endpoint, region, source credentials, custom TLS factory, client keys and timeouts. Disabling `insecureSkipVerify`, replacing/clearing `caFile`, or removing proxy credentials reconciles prior provider-owned overrides. Clearing overrides restores the original caller settings, which may themselves be custom.

Authenticated HTTPS proxies use a private, bounded CONNECT handshake compatible with OkHttp 2.7.5, including a proxy that closes its 407 response connection. Credentials are sent only after a Basic challenge and never on the HTTPS origin request; rejected credentials stop authentication. This branch does not follow redirects. TLS-to-proxy (`https://` proxy URLs) and non-HTTP proxy protocols are unsupported.

---

[← Transport](3-Transport.md) | Proxy[(中文)](4-Proxy-zh.md) | [Timeout →](5-Timeout.md)
