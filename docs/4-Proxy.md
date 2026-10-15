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

### Bypass Selected Hosts

Use `apiClient.setNoProxy("localhost,127.0.0.1,example.com,.internal.test:443,[::1]")` to bypass the SDK-managed proxy for matching destinations. Entries are comma-separated and whitespace is trimmed. Host matching ignores case and a trailing DNS dot.

- `example.com` matches the domain and its subdomains; `.example.com` and `*.example.com` match subdomains only.
- IPv4/IPv6 literals match the address exactly, without DNS resolution. A port restricts the match; bracket IPv6 when including a port. Omitted request ports use HTTP 80 or HTTPS 443.
- `*` bypasses all destinations. URLs, CIDR ranges and other wildcard patterns are unsupported and ignored.
- `null` uses nonempty `NO_PROXY`, then `no_proxy`; `""` explicitly disables environment bypass rules. A non-null code setting replaces environment rules.

This setting applies to the SDK-managed `ProxySelector`, including proxies obtained from `HTTP_PROXY` / `HTTPS_PROXY`. Explicit transport proxies and STS provider proxies (including client fallback) take precedence. A business client's bypass rules are not copied into STS provider options; AssumeRole's original internal ApiClient selector uses its own bypass configuration.

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

HTTPS STS requests with an explicit HTTP proxy (from the provider or client fallback) use a private, bounded CONNECT handshake compatible with OkHttp 2.7.5, whether or not the proxy URL includes credentials. This supports proxies that close the connection after a 407 response. Credentials are sent only after a Basic challenge and never on the HTTPS origin request. Missing or rejected credentials preserve HTTP status 407 and are not retried by the default SDK retry policy. Connection-refused errors identify the proxy address and remain retryable network failures. This branch does not follow redirects. TLS-to-proxy (`https://` proxy URLs), SOCKS, and other non-HTTP proxy protocols are unsupported.

When an AssumeRole provider proxy override is removed, the original SDK proxy settings use the current HTTP/HTTPS scheme, regardless of whether the scheme changed before or after removal. Caller-supplied proxy selectors are restored unchanged.

### Snapshot Migration

Code that relied on updating a shared source provider must rebind each affected client after changing the source role, source credentials, proxy, TLS, expiry, or retry settings: call `apiClient.setCredentialProvider(credentialProvider)` again, or bind a replacement provider for constructor-only settings. Setting the source AssumeRole provider's expiration time to `0` no longer forces an existing binding to refresh. An already signed request and its retries keep the original binding. Separate client caches may increase STS calls compared with sharing the source provider's cache.

AssumeRole's internal ApiClient snapshot isolates the SDK retry count, backoff delay bounds, and `retryErrorCodes` set between the source and each binding. Custom strategies retain their runtime types; additional mutable references require overriding `BackoffStrategy.copy()` / `RetryCondition.copy()`, calling `super.copy()`, and copying those fields on the result. This does not promise deep copies of arbitrary JSON helpers, interceptors, TLS factories, or other caller-owned objects. OIDC/SAML snapshot their retry count and interval; OIDC token-file contents are still read at refresh time.

For supported error-code set copies and the `copyRetryErrorCodes()` extension hook, see [Retry](6-Retry.md#copying-retry-error-code-sets).

---

[← Transport](3-Transport.md) | Proxy[(中文)](4-Proxy-zh.md) | [Timeout →](5-Timeout.md)
