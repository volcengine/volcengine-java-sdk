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
| `setProxyUrl(String)` | HTTP forward proxy for reaching STS, format `http://[user:password@]host:port`, with an explicit port in `1..65535`. Supports Basic authentication, including HTTPS CONNECT. No TLS-to-proxy or SOCKS support. Explicit provider settings take precedence over the bound client's explicit proxy. | empty (client fallback, then original transport behavior) |
| `setCaFile(String)` | Path to a custom CA bundle (PEM) used to verify the STS server certificate. Empty together with `insecureSkipVerify=false` restores the original transport TLS settings, possibly custom. JVM default trust applies only if those settings were not customized. | empty (no provider CA override) |
| `setInsecureSkipVerify(boolean)` | When `true`, skips STS TLS certificate-chain and hostname verification. **Debugging only** (self-signed cert / intercepting proxy); never enable in production. | `false` |

> ⚠️ **Notes**
>
> 1. All three parameters are optional. Without an explicit provider or client proxy, OIDC/SAML retain URLConnection proxy selection, including JVM `http.proxyHost` / `http.proxyPort` and `https.proxyHost` / `https.proxyPort` system properties. They do not parse `HTTP_PROXY` / `HTTPS_PROXY` or their lowercase variants. AssumeRole retains its original ApiClient proxy selection, including supported proxy environment variables. Environment variables are not copied into provider options.
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

For these three exact built-in classes supplied directly through `CredentialProvider`, `ApiClient` lazily snapshots provider configuration on first credential access. Each client owns a separate credential cache and refresh lock; the supplied provider is never updated with client fallback. The fallback uses the client's explicitly configured `httpProxy` or `httpsProxy` according to the **STS URL**, not the business API scheme.

Configure the source provider before first access. `setHttpProxy`, `setHttpsProxy`, or `setCredentialProvider` invalidates that client's binding for future requests; an already signed request retains its binding through retries. To apply later source-provider changes, call `setCredentialProvider` again. Custom providers, subclasses, and the default credential chain retain their existing identity and are not recursively copied or given this fallback.

AssumeRole preserves its existing endpoint, region, source credentials, custom TLS factory, client keys and timeouts. Changing `insecureSkipVerify` or replacing/clearing `caFile` reconciles provider-owned TLS overrides. Only an empty `caFile` together with `insecureSkipVerify=false` removes all provider TLS overrides and restores the original transport TLS settings, including any custom factory. JVM default trust applies only if the original settings were not customized. Removing proxy credentials also removes the provider-owned proxy authentication override.

Authenticated HTTPS STS requests through an HTTP proxy use a private, bounded CONNECT handshake compatible with OkHttp 2.7.5, including a proxy that closes its 407 response connection. Credentials are sent only after a Basic challenge and never on the HTTPS origin request; rejected credentials stop authentication. This branch does not follow redirects. TLS-to-proxy (`https://` proxy URLs), SOCKS, and other non-HTTP proxy protocols are unsupported.

### Snapshot Migration

Code that relied on updating a shared source provider must rebind each affected client after changing the source role, source credentials, proxy, TLS, expiry, or retry settings: call `apiClient.setCredentialProvider(credentialProvider)` again, or bind a replacement provider for constructor-only settings. Setting the source AssumeRole provider's expiration time to `0` no longer forces an existing binding to refresh. An already signed request and its retries keep the original binding. Separate client caches may increase STS calls compared with sharing the source provider's cache.

AssumeRole's internal ApiClient snapshot isolates the SDK retry count, backoff delay bounds, and `retryErrorCodes` set between the source and each binding. Custom strategies retain their runtime types; additional mutable references require overriding `BackoffStrategy.copy()` / `RetryCondition.copy()`, calling `super.copy()`, and copying those fields on the result. This does not promise deep copies of arbitrary JSON helpers, interceptors, TLS factories, or other caller-owned objects. OIDC/SAML snapshot their retry count and interval; OIDC token-file contents are still read at refresh time.

---

[← Transport](3-Transport.md) | Proxy[(中文)](4-Proxy-zh.md) | [Timeout →](5-Timeout.md)
