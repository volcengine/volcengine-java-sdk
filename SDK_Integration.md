English | [中文](SDK_Integration_zh.md)

# Table of Contents

- [SDK Integration](#sdk-integration)
- [Requirements](#requirements)
- [Securely Configure Access Credentials](#securely-configure-access-credentials)
  - [Environment Variable Setup](#environment-variable-setup)
    - [Linux](#linux)
    - [Windows](#windows)
      - [GUI Setup](#gui-setup)
      - [Command Line Setup](#command-line-setup)
- [Credentials](#credentials)
  - [Credential Providers Overview](#credential-providers-overview)
  - [Supported VOLCENGINE Environment Variables](#supported-volcengine-environment-variables)
  - [AK/SK](#aksk)
  - [STS Token](#sts-token)
  - [AssumeRole](#assumerole)
  - [OIDC (AssumeRoleWithOIDC)](#oidc-assumerolewithoidc)
  - [Environment Variable Credential Provider](#environment-variable-credential-provider)
  - [CLI Config Credential Provider](#cli-config-credential-provider)
  - [ECS Role Credential Provider](#ecs-role-credential-provider)
  - [Default Credential Provider](#default-credential-provider)
- [Endpoint Configuration](#endpoint-configuration)
  - [Custom Endpoint](#custom-endpoint)
  - [Custom RegionId](#custom-regionid)
  - [Automatic Endpoint Resolution](#automatic-endpoint-resolution)
    - [Default Endpoint Resolution](#default-endpoint-resolution)
    - [Standard Endpoint Resolution](#standard-endpoint-resolution)
- [HTTP Connection Pool](#http-connection-pool)
- [HTTPS Request Configuration](#https-request-configuration)
  - [Specify Scheme](#specify-scheme)
  - [Ignore SSL Verification](#ignore-ssl-verification)
- [HTTP(S) Proxy](#https-proxy)
  - [Configure HTTP(S) Proxy](#configure-https-proxy)
  - [Notes](#notes)
- [Timeouts](#timeouts)
  - [Global Timeouts (Client Level)](#global-timeouts-client-level)
- [Retries](#retries)
  - [Retry Code Configuration](#retry-code-configuration)
  - [Retry Conditions](#retry-conditions)
  - [Backoff Strategy](#backoff-strategy)
- [Error Handling](#error-handling)
- [Debugging](#debugging)
  - [Enable Debug Mode](#enable-debug-mode)

# SDK Integration

When calling APIs, it is recommended to integrate the SDK in your project. Using the SDK simplifies development, speeds up integration, and reduces long-term maintenance costs. Volcengine SDK integration typically includes three steps: importing the SDK, configuring access credentials, and writing API call code. This document explains common scenarios and best practices.

# Requirements

- The SDK requires **Java 1.8.0_131+**. Download from: http://developers.sun.com/downloads/.
- If your Java version is **Java 9 or later**, add `javax.annotation-api` because it was removed from JDK 9+.

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

| Provider | Purpose | Auto Refresh | Typical Scenario |
|---|---|---|---|
| `StaticCredentialProvider` | Static AK/SK(/Token) | No | Long-lived server credentials |
| `StsAssumeRoleProvider` | STS AssumeRole | Yes | IAM role-based temporary credentials |
| `OidcCredentialProvider` | STS AssumeRoleWithOIDC | Yes | OIDC federation |
| `EnvironmentVariableCredentialProvider` | Read AK/SK(/Token) from env | No | CI/CD and container env injection |
| `CLIConfigCredentialProvider` | Read from `~/.volcengine/config.json` | Depends on mode | Reuse CLI profile and login state |
| `EcsRoleCredentialProvider` | Read from ECS IMDS | Yes | ECS instance role credentials |
| `DefaultCredentialProvider` | Default chain wrapper | Depends on delegated provider | No AK/SK in application code |

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
    stsAssumeRoleProvider.setTimeout(30);
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
    oidcProvider.setDurationSeconds(3600);
    oidcProvider.setExpireBufferSeconds(60);

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

`CLIConfigCredentialProvider` reads `~/.volcengine/config.json` by default.

- Config path priority: constructor `configPath` > `VOLCENGINE_CLI_CONFIG_FILE` > `~/.volcengine/config.json`
- Profile priority: constructor `profileName` > `VOLCENGINE_PROFILE` > `current` in config > `default`

Supported profile `mode`:

- `AK` / empty
- `StsToken`
- `RamRoleArn` (delegates to `StsAssumeRoleProvider`)
- `OIDC` (delegates to `OidcCredentialProvider`)
- `EcsRole` (delegates to `EcsRoleCredentialProvider`)
- `SSO`

> Mode matching is case-insensitive.

```java
import com.volcengine.ApiClient;
import com.volcengine.auth.CLIConfigCredentialProvider;
import com.volcengine.auth.CredentialProvider;

public class SampleCode {
  public static void main(String[] args) {
    CLIConfigCredentialProvider cliProvider =
            new CLIConfigCredentialProvider("prod", "~/.volcengine/config.json");
    CredentialProvider credentialProvider = new CredentialProvider(cliProvider);

    ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion("cn-beijing");
  }
}
```

## ECS Role Credential Provider

`EcsRoleCredentialProvider` reads temporary credentials from ECS IMDS.

- Role name priority: constructor arg > `VOLCENGINE_ECS_METADATA` > error (no auto-detect)
- Disable switch: `VOLCENGINE_ECS_METADATA_DISABLED=true`

```java
import com.volcengine.ApiClient;
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.EcsRoleCredentialProvider;

public class SampleCode {
  public static void main(String[] args) throws Exception {
    CredentialProvider credentialProvider =
            new CredentialProvider(EcsRoleCredentialProvider.create("your-ecs-role-name"));

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

# HTTP Connection Pool

> **Default**
> - `maxIdleConns`: 5
> - `keepAliveDurationMs`: `5 * 60 * 1000`

The Java SDK uses `com.squareup.okhttp.ConnectionPool`. You can adjust the pool behavior via these two parameters.

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
    public static void main(String[] args) {
        String regionId = "cn-beijing";
        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getEnvCredentials())
                .setRegion(regionId)
                .setMaxIdleConns(5)
                .setKeepAliveDurationMs(5 * 60 * 1000);
    }
}
```

# HTTPS Request Configuration

## Specify Scheme

> **Default**: `disableSSL=false` (HTTPS)

Set `disableSSL=true` to use HTTP.

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
    public static void main(String[] args) {
        String regionId = "cn-beijing";
        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getEnvCredentials())
                .setRegion(regionId)
                .setDisableSSL(false);
    }
}
```

## Ignore SSL Verification

> **Default**: `verifyingSsl=true`

Set `verifyingSsl=false` to skip SSL verification.

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
   public static void main(String[] args) {
      String regionId = "cn-beijing";
      ApiClient apiClient = new ApiClient()
              .setCredentials(Credentials.getEnvCredentials())
              .setRegion(regionId)
              .setVerifyingSsl(false);
   }
}
```

# HTTP(S) Proxy

> **Default**: no proxy

## Configure HTTP(S) Proxy

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public static void main(String[] args) {
    String regionId = "cn-beijing";
    ApiClient apiClient = new ApiClient()
            .setCredentials(Credentials.getEnvCredentials())
            .setRegion(regionId)
            .setHttpProxy("http://your_http_proxy:proxy_port")
            .setHttpsProxy("http://your_https_proxy:proxy_port");
}
```

## Notes

Supported environment variables:

- `http_proxy`/`HTTP_PROXY`, `https_proxy`/`HTTPS_PROXY`

Priority: code > environment variables.

# Timeouts

## Global Timeouts (Client Level)

> **Default (milliseconds)**
> - `connectTimeout`: `10 * 1000`
> - `writeTimeout`: `10 * 1000`
> - `readTimeout`: `10 * 1000`

The Java SDK client uses `com.squareup.okhttp.OkHttpClient`. Configure timeouts via these parameters.

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
  public static void main(String[] args) {
    String regionId = "cn-beijing";
    ApiClient apiClient = new ApiClient()
            .setCredentials(Credentials.getEnvCredentials())
            .setRegion(regionId)
            .setConnectTimeout(10 * 1000)
            .setReadTimeout(15 * 1000)
            .setWriteTimeout(15 * 1000);
  }
}
```

# Retries

> **Default**
> - `autoRetry`: `true`
> - `minRetryDelayMs`: `300`
> - `maxRetryDelayMs`: `300 * 1000`
> - `retryCondition`: `com.volcengine.retryer.DefaultRetryCondition`
> - `backoffStrategy`: `com.volcengine.retryer.ExponentialBackoffStrategy`
> - `retryErrorCode`: empty set

The SDK retries on network errors and throttling. Business logic errors are not retried.

## Retry Code Configuration

```java
import com.volcengine.ApiClient;
import com.volcengine.retryer.DefaultRetryCondition;
import com.volcengine.retryer.ExponentialBackoffStrategy;
import com.volcengine.sign.Credentials;

public class SampleCode {
  public static void main(String[] args) {
    String region = "cn-beijing";

    ApiClient apiClient = new ApiClient()
            .setCredentials(Credentials.getEnvCredentials())
            .setRegion(region)
            .setDebugging(true)
            .setAutoRetry(true)
            .setNumMaxRetries(3)
            .setMinRetryDelayMs(1000)
            .setMaxRetryDelayMs(3000)
            .setRetryCondition(new DefaultRetryCondition())
            .setBackoffStrategy(new ExponentialBackoffStrategy())
            .addRetryErrorCode("InvalidAuthorization");
  }
}
```

## Retry Conditions

The default retry condition includes:

1. Retry on network errors.
2. Retry on server throttling errors.
3. Retry on user-specified error codes (`retryErrorCodes`).

## Backoff Strategy

Built-in strategies:

| Name | Description | Formula |
|---|---|---|
| `NoBackoffStrategy` | No backoff, retry immediately | `delay=0.0` |
| `ExponentialBackoffStrategy` | Exponential backoff with bounds | `delay=min(minRetryDelay*2^n, maxRetryDelay)` |
| `ExponentialWithRandomJitterBackoffStrategy` | Exponential with jitter | `base=min(minRetryDelay*2^n, maxRetryDelay)`; `delay=base+U(0,base)` |

# Error Handling

Errors are categorized as client errors, network/timeout errors, server errors, and other errors. (See the original Chinese guide for complete code samples.)

# Debugging

## Enable Debug Mode

> **Default**: `debug=false`

Java SDK logging uses SLF4J. Configure your own logging settings. Example:

```xml
<!-- enable debug logs -->
<logger name="com.volcengine.sdkcore" level="debug"/>
```
