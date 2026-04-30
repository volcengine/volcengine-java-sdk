[← Overview](0-Overview.md) | Credentials[(中文)](1-Credentials-zh.md) | [Endpoint →](2-Endpoint.md)

---

# Securely Configure Access Credentials

To prevent credential leakage, do not hardcode credentials in plaintext in your code. Volcengine provides multiple secure ways to load credentials, such as environment variables.

## Environment Variable Setup

### Linux

> ⚠️ **Note**
>
> Environment variables configured with `export` are only effective for the current session. They will be lost when the session ends. To persist them, add the exports to your shell startup scripts.

| Key | Command |
|---|---|
| `VOLCENGINE_ACCESS_KEY` | `export VOLCENGINE_ACCESS_KEY=yourAccessKeyID` |
| `VOLCENGINE_SECRET_KEY` | `export VOLCENGINE_SECRET_KEY=yourSecretAccessKey` |
| `VOLCENGINE_SESSION_TOKEN` | `export VOLCENGINE_SESSION_TOKEN=yourSessionToken` |

**Verify**: run `echo $VOLCENGINE_ACCESS_KEY`. If it returns the correct value, the configuration is effective.

### Windows

Two options are provided: **GUI setup** and **command line setup**.

**Verify**: open Command Prompt and run `echo %VOLCENGINE_ACCESS_KEY%`, `echo %VOLCENGINE_SECRET_KEY%`, `echo %VOLCENGINE_SESSION_TOKEN%`. If the returned values are correct, the configuration is effective.

#### GUI Setup

On Windows 10, right-click **This PC** -> **Properties** -> **Advanced system settings** -> **Environment Variables** -> **System variables/User variables** -> **New**, then set:

| Variable | Example |
|---|---|
| AccessKey Id | Name: `VOLCENGINE_ACCESS_KEY` <br/> Value: `*****` |
| AccessKey Secret | Name: `VOLCENGINE_SECRET_KEY` <br/> Value: `*****` |
| Session Token | Name: `VOLCENGINE_SESSION_TOKEN` <br/> Value: `*****` |

#### Command Line Setup

Run Command Prompt as Administrator, and add environment variables:

```
setx VOLCENGINE_ACCESS_KEY yourAccessKeyID /M
setx VOLCENGINE_SECRET_KEY yourAccessKeySecret /M
setx VOLCENGINE_SESSION_TOKEN yourSessionToken /M
```

> ⚠️ Note
>
> `/M` means system-level variables. You may omit it for user-level variables.

# Credentials

Volcengine Java SDK supports explicit credentials and `CredentialProvider`-based automatic resolution.

You can refer to: [Environment Variable Setup](#environment-variable-setup)

## Credential Providers Overview

| Provider | Purpose                                   | Auto Refresh | Typical Scenario |
|---|-------------------------------------------|---|---|
| `StaticCredentialProvider` | Static AK/SK(/Token)                      | No | Long-lived server credentials |
| `StsAssumeRoleProvider` | STS AssumeRole                            | Yes | IAM role-based temporary credentials |
| `OidcCredentialProvider` | STS AssumeRoleWithOIDC                    | Yes | OIDC federation |
| `SamlCredentialProvider` | STS AssumeRoleWithSAML                    | Yes | SAML federation |
| `EnvironmentVariableCredentialProvider` | Read AK/SK(/Token) from env               | No | CI/CD and container env injection |
| `CLIConfigCredentialProvider` | Read from `$HOME/.volcengine/config.json` | Depends on mode | Reuse CLI profile and login state |
| `EcsRoleCredentialProvider` | Read from ECS IMDS                        | Yes | ECS instance role credentials |
| `DefaultCredentialProvider` | Default chain wrapper                     | Depends on delegated provider | No AK/SK in application code |

## Supported VOLCENGINE Environment Variables

- Basic credentials:
  - `VOLCENGINE_ACCESS_KEY`
  - `VOLCENGINE_SECRET_KEY`
  - `VOLCENGINE_SESSION_TOKEN`
- OIDC:
  - `VOLCENGINE_OIDC_ROLE_TRN`
  - `VOLCENGINE_OIDC_TOKEN_FILE`
  - `VOLCENGINE_OIDC_ROLE_SESSION_NAME`
  - `VOLCENGINE_OIDC_ROLE_POLICY`
  - `VOLCENGINE_OIDC_STS_ENDPOINT`
- CLI config:
  - `VOLCENGINE_CLI_CONFIG_FILE`
  - `VOLCENGINE_PROFILE`
- ECS metadata:
  - `VOLCENGINE_ECS_METADATA`
  - `VOLCENGINE_ECS_METADATA_DISABLED`

## AK/SK

AK/SK is a pair of permanent access keys created in the Volcengine console. The SDK signs each request to authenticate.

> ⚠️ Notes
>
> 1. Do not embed or expose AK/SK in client-side applications.
> 2. Use a configuration center or environment variables.
> 3. Follow least privilege principles.

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
    public static void main(String[] args) {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        // 1. Using static AK/SK may leak credentials; do not use in production.
        Credentials akSkCredential = Credentials.getCredentials(ak, sk);
        // 2. Recommended in production: read from env vars: VOLCENGINE_ACCESS_KEY / VOLCENGINE_SECRET_KEY
        // Credentials akSkCredential = Credentials.getEnvCredentials();

        ApiClient apiClient = new ApiClient()
            .setCredentials(akSkCredential)
            .setRegion(region);
    }
}
```

## STS Token

STS (Security Token Service) provides temporary credentials (temporary AK/SK and Token).

> ⚠️ Notes
>
> 1. Least privilege.
> 2. Use a reasonable TTL. Shorter is safer; avoid exceeding 1 hour.

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
    public static void main(String[] args) {
        String ak = "Your AK";
        String sk = "Your SK";
        String sessionToken = "Your Session Token";
        String region = "cn-beijing";

        Credentials sessionTokenCredential = Credentials.getCredentials(ak, sk, sessionToken);
        // Credentials sessionTokenCredential = Credentials.getEnvCredentials();

        ApiClient apiClient = new ApiClient()
            .setCredentials(sessionTokenCredential)
            .setRegion(region);
    }
}
```

## StaticCredentialProvider

To wrap static AK/SK(/Token) in the `Provider` form (so the API style matches the dynamic providers), use `StaticCredentialProvider`:

```java
import com.volcengine.ApiClient;
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.StaticCredentialProvider;

public class SampleCode {
    public static void main(String[] args) {
        // sessionToken may be null (long-lived AK/SK scenario)
        StaticCredentialProvider staticProvider = new StaticCredentialProvider(
            "Your AK",
            "Your SK",
            "Your Session Token");

        CredentialProvider credentialProvider = new CredentialProvider(staticProvider);

        ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion("cn-beijing");
    }
}
```

## AssumeRole

AssumeRole supports dynamic credentials with auto refresh.

> ⚠️ Notes
>
> 1. Least privilege.
> 2. Choose a reasonable TTL; maximum is 12 hours.
> 3. Use fine-grained roles and policies.

```java
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.StsAssumeRoleProvider;

public class SampleCode {
    public static void main(String[] args) {
        String region = "cn-beijing";
        StsAssumeRoleProvider stsAssumeRoleProvider = new StsAssumeRoleProvider(
            "YourAccessKey",
            "YourSecretKey",
            "YourRoleName",
            "YourAccountId");

        // Optional fields
        stsAssumeRoleProvider.setHost("sts.volcengineapi.com");
        stsAssumeRoleProvider.setRegion("cn-north-1");
        stsAssumeRoleProvider.setDurationSeconds(3600);
        stsAssumeRoleProvider.setExpireBufferSeconds(60);
        stsAssumeRoleProvider.setSchema("https");
        CredentialProvider credentialProvider = new CredentialProvider(stsAssumeRoleProvider);

        ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion(region);
    }
}
```

## OIDC (AssumeRoleWithOIDC)

`OidcCredentialProvider` gets temporary credentials from STS via OIDC token.

Reference: https://www.volcengine.com/docs/6257/1494877

Explicit parameter example:

```java
import com.volcengine.ApiClient;
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.OidcCredentialProvider;

public class SampleCode {
    public static void main(String[] args) {
        String region = "cn-beijing";

        OidcCredentialProvider oidcProvider = new OidcCredentialProvider(
            "trn:iam::1234567890:role/oidc-role", // roleTrn
            null,                                 // roleSessionName (optional)
            "/var/run/secrets/oidc/token",        // oidcTokenFile
            null,                                 // rolePolicy (optional)
            "sts.volcengineapi.com"               // stsEndpoint (optional)
        );
        // Optional setters
        oidcProvider.setDurationSeconds(3600);          // Credential TTL in seconds, default: 3600
        oidcProvider.setExpireBufferSeconds(60);         // Expire buffer in seconds, default: 300
        oidcProvider.setSchema("https");                // STS scheme, default: https
        oidcProvider.setMaxRetries(3);                  // Retry attempts, default: 3, 0 disables retry
        oidcProvider.setRetryIntervalMs(1000);          // Retry interval in ms, default: 1000

        CredentialProvider credentialProvider = new CredentialProvider(oidcProvider);
        ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion(region);
    }
}
```

Environment-variable example:

```java
import com.volcengine.ApiClient;
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.OidcCredentialProvider;

public class SampleCode {
    public static void main(String[] args) throws Exception {
        // Required:
        // VOLCENGINE_OIDC_ROLE_TRN
        // VOLCENGINE_OIDC_TOKEN_FILE
        OidcCredentialProvider oidcProvider = OidcCredentialProvider.fromEnvironment();
        CredentialProvider credentialProvider = new CredentialProvider(oidcProvider);

        ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion("cn-beijing");
    }
}
```

## SAML (AssumeRoleWithSAML)

`SamlCredentialProvider` exchanges a SAML 2.0 assertion (returned by your IdP) for temporary STS credentials via `AssumeRoleWithSAML`. Credentials are auto-refreshed before expiration.

> ⚠️ Notes
>
> 1. Least privilege.
> 2. Reasonable TTL; recommended ≤ 1 hour.
> 3. `samlAssertion` is the base64-encoded SAML Response returned by your IdP.

```java
import com.volcengine.ApiClient;
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.SamlCredentialProvider;

public class SampleCode {
    public static void main(String[] args) {
        SamlCredentialProvider samlProvider = new SamlCredentialProvider(
            "trn:iam::1234567890:role/YourRoleName",           // roleTrn
            "trn:iam::1234567890:saml-provider/MyIdp",         // samlProviderTrn
            "BASE64_ENCODED_SAML_RESPONSE_FROM_IDP",           // samlAssertion
            null,                                              // rolePolicy (optional)
            null                                               // stsEndpoint (optional, uses default)
        );
        // Optional setters
        samlProvider.setDurationSeconds(3600);          // Credential TTL in seconds, default: 3600
        samlProvider.setExpireBufferSeconds(300);        // Expire buffer in seconds, default: 300
        samlProvider.setSchema("https");                // STS scheme, default: https
        samlProvider.setMaxRetries(3);                  // Retry attempts, default: 3, 0 disables retry
        samlProvider.setRetryIntervalMs(1000);          // Retry interval in ms, default: 1000

        CredentialProvider credentialProvider = new CredentialProvider(samlProvider);
        ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion("cn-beijing");
    }
}
```

## Environment Variable Credential Provider

`EnvironmentVariableCredentialProvider` reads:

- `VOLCENGINE_ACCESS_KEY`
- `VOLCENGINE_SECRET_KEY`
- `VOLCENGINE_SESSION_TOKEN` (optional)

```java
import com.volcengine.ApiClient;
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.EnvironmentVariableCredentialProvider;

public class SampleCode {
    public static void main(String[] args) {
        CredentialProvider credentialProvider =
            new CredentialProvider(new EnvironmentVariableCredentialProvider());

        ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion("cn-beijing");
    }
}
```

## CLI Config Credential Provider

`CLIConfigCredentialProvider` reads `$HOME/.volcengine/config.json` by default.

- Config path priority: constructor `configPath` > `VOLCENGINE_CLI_CONFIG_FILE` > `$HOME/.volcengine/config.json`
- Profile priority: constructor `profileName` > `VOLCENGINE_PROFILE` > `current` in config > `default`

Supported profile `mode`:

- `AK` / empty
- `StsToken`
- `RamRoleArn` (delegates to `StsAssumeRoleProvider`)
  - Required: `access-key`, `secret-key`, `role-name`, `account-id`
  - Optional: `session-token` — when the source `access-key` / `secret-key` are
    themselves STS temporaries (e.g. issued by SSO/OIDC), this token is forwarded
    to the chained AssumeRole call as `X-Security-Token`.
- `OIDC` (delegates to `OidcCredentialProvider`)
- `EcsRole` (delegates to `EcsRoleCredentialProvider`)
- `SSO`

> Mode matching is case-insensitive.

```java
import com.volcengine.ApiClient;
import com.volcengine.auth.CLIConfigCredentialProvider;
import com.volcengine.auth.CredentialProvider;

import java.nio.file.Paths;

public class SampleCode {
    public static void main(String[] args) {
        CLIConfigCredentialProvider cliProvider =
            new CLIConfigCredentialProvider("prod", Paths.get(System.getProperty("user.home"), ".volcengine", "config.json").toString());
        CredentialProvider credentialProvider = new CredentialProvider(cliProvider);

        ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion("cn-beijing");
    }
}
```

## ECS Role Credential Provider

`EcsRoleCredentialProvider` reads temporary credentials from ECS IMDS.

- Role name priority: constructor arg > `VOLCENGINE_ECS_METADATA` > auto-detect from IMDS
- Disable switch: `VOLCENGINE_ECS_METADATA_DISABLED=true`

```java
import com.volcengine.ApiClient;
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.EcsRoleCredentialProvider;

public class SampleCode {
    public static void main(String[] args) throws Exception {
        EcsRoleCredentialProvider ecsProvider = EcsRoleCredentialProvider.create("your-ecs-role-name");
        // Optional setters
        ecsProvider.setMaxRetries(3);                   // Retry attempts, default: 3, 0 disables retry
        ecsProvider.setRetryIntervalMs(1000);           // Retry interval in ms, default: 1000
        ecsProvider.setConnectTimeoutMs(1000);           // Connect timeout in ms, default: 1000
        ecsProvider.setReadTimeoutMs(1000);              // Read timeout in ms, default: 1000
        ecsProvider.setExpireBufferSeconds(300);          // Expire buffer in seconds, default: 300

        CredentialProvider credentialProvider = new CredentialProvider(ecsProvider);
        ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion("cn-beijing");
    }
}
```

## Default Credential Provider

When `credentials` and `credentialProvider` are both unset, the SDK automatically uses `DefaultCredentialProvider` — no manual configuration is needed.

You can also explicitly set it if you need to customize options (e.g., `roleName`).

Default chain order:

1. `EnvironmentVariableCredentialProvider`
2. `OidcCredentialProvider` (from OIDC env vars)
3. `CLIConfigCredentialProvider`
4. `EcsRoleCredentialProvider`

`reuseLastProviderEnabled` is `true` by default.

```java
import com.volcengine.ApiClient;
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.DefaultCredentialProvider;

public class SampleCode {
    public static void main(String[] args) {
        DefaultCredentialProvider defaultProvider = DefaultCredentialProvider.builder()
            .reuseLastProviderEnabled(true)
            .roleName(null) // optional: used by ECS provider
            .build();
        // Or: DefaultCredentialProvider defaultProvider = DefaultCredentialProvider.create();

        CredentialProvider credentialProvider = new CredentialProvider(defaultProvider);
        ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion("cn-beijing");
    }
}
```

---

[← Overview](0-Overview.md) | Credentials[(中文)](1-Credentials-zh.md) | [Endpoint →](2-Endpoint.md)
