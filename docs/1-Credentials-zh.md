[← 概览](0-Overview-zh.md) | 访问凭据[(English)](1-Credentials.md) | [Endpoint 配置 →](2-Endpoint-zh.md)

---

# 安全设置访问凭据

为了防止访问凭据泄露，建议不要在代码中以明文形式硬编码访问凭据。火山引擎提供了多种安全的凭据加载方式，比如将凭据存储到环境变量中。

## 环境变量设置

### Linux 设置

> ⚠️ **注意事项**
>
> **使用export命令配置的临时环境变量仅当前会话有效，当会话退出之后所设置的环境变量将会丢失。若需长期保留环境变量，可将export命令配置到对应操作系统的启动配置文件中**。


| Key                     | 命令                                                   |
|-------------------------| ------------------------------------------------------ |
| VOLCENGINE_ACCESS_KEY   | export VOLCENGINE_ACCESS_KEY=yourAccessKeyID         |
| VOLCENGINE_SECRET_KEY   | export VOLCENGINE_SECRET_KEY=yourSecretAccessKey |
| VOLCENGINE_SESSION_TOKEN | export VOLCENGINE_SESSION_TOKEN=yourSessionToken       |

**验证是否设置成功：** 执行echo $VOLCENGINE_ACCESS_KEY命令，如果返回正确的AccessKey ID，则说明配置成功。

### Windows 设置

下面提供了**图形化界面设置**和**命令行设置**两种方式。
**验证是否设置成功：**
单击**开始**（或快捷键：**Win+R**）> **运行**（输入 cmd）> **确定**（或按 Enter 键），打开命令提示符，执行echo %VOLCENGINE_ACCESS_KEY%、echo %VOLCENGINE_SECRET_KEY%、echo %VOLCENGINE_SESSION_TOKEN%命令。若返回正确的值，则说明配置成功。

#### 图形化界面设置

以下为Windows 10中通过图形用户界面设置环境变量的步骤。
在桌面右键单击**此电脑**，选择**属性>高级系统设置>环境变量>系统变量/用户变量>新建**，完成以下配置：


| 变量             | 示例                                                  |
| ---------------- | ----------------------------------------------------- |
| AccessKey Id     | 变量名：VOLCENGINE_ACCESS_KEY<br />变量值：*****     |
| AccessKey Secret | 变量名：VOLCENGINE_SECRET_KEY<br />变量值：***** |
| Session Token    | 变量名：VOLCENGINE_SESSION_TOKEN<br />变量值：*****     |

#### 命令行设置

以管理员身份打开命令提示符，并使用以下命令在系统中新增环境变量。

复制
setx VOLCENGINE_ACCESS_KEY yourAccessKeyID /M
setx VOLCENGINE_SECRET_KEY yourAccessKeySecret /M
setx VOLCENGINE_SESSION_TOKEN yourSessionToken /M

> ⚠️ 注意事项
>
> 其中/M表示系统级环境变量，设置用户级环境变量时可以不携带该参数。

# 访问凭据

火山引擎 Java SDK 支持显式凭证和 `CredentialProvider` 自动解析两种方式。

环境变量设置可以参考这里:[**环境变量设置**](#环境变量设置)

## CredentialProvider 总览

| Provider | 用途                                 | 是否自动刷新 | 典型场景 |
|---|------------------------------------|---|---|
| `StaticCredentialProvider` | 静态 AK/SK(/Token)                   | 否 | 服务端长期凭证 |
| `StsAssumeRoleProvider` | STS AssumeRole                     | 是 | 角色扮演临时凭证 |
| `OidcCredentialProvider` | STS AssumeRoleWithOIDC             | 是 | OIDC 联邦身份 |
| `SamlCredentialProvider` | STS AssumeRoleWithSAML             | 是 | SAML 联邦身份 |
| `EnvironmentVariableCredentialProvider` | 从环境变量读取 AK/SK(/Token)              | 否 | CI/CD、容器注入 |
| `CLIConfigCredentialProvider` | 读取 `$HOME/.volcengine/config.json` | 取决于 mode | 复用 CLI 配置和登录态 |
| `EcsRoleCredentialProvider` | 从 ECS IMDS 获取凭证                    | 是 | ECS 实例角色 |
| `DefaultCredentialProvider` | 默认凭证链包装                            | 取决于代理 Provider | 业务代码不写 AK/SK |

## 已支持的 VOLCENGINE 环境变量

- 基础凭证：
  - `VOLCENGINE_ACCESS_KEY`
  - `VOLCENGINE_SECRET_KEY`
  - `VOLCENGINE_SESSION_TOKEN`
- OIDC：
  - `VOLCENGINE_OIDC_ROLE_TRN`
  - `VOLCENGINE_OIDC_TOKEN_FILE`
  - `VOLCENGINE_OIDC_ROLE_SESSION_NAME`
  - `VOLCENGINE_OIDC_ROLE_POLICY`
  - `VOLCENGINE_OIDC_STS_ENDPOINT`
- CLI 配置：
  - `VOLCENGINE_CLI_CONFIG_FILE`
  - `VOLCENGINE_PROFILE`
- ECS 元数据：
  - `VOLCENGINE_ECS_METADATA`
  - `VOLCENGINE_ECS_METADATA_DISABLED`

## AK、SK设置

AK/SK 是由火山引擎用户在控制台创建的一对永久访问密钥。SDK 使用该密钥对每次请求进行签名，从而完成身份验证。

> ⚠️ 注意事项
>
> 1. 不得在客户端嵌入或暴露 AK/SK。
> 2. 推荐使用配置中心或环境变量存储密钥。
> 3. 配置合理的最小权限访问策略。

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
  public static void main(String[] args) {
      String ak = "Your AK";
      String sk = "Your SK";
      String region = "cn-beijing";

      // 1. 输入静态ak和sk可能泄漏会导致AK/SK泄漏，生产环境不能这样使用
      Credentials akSkCredential = Credentials.getCredentials(ak, sk);
      // 2. 推荐使用环境变量获取AK/SK，避免代码泄漏;会读取环境变量中：VOLCENGINE_ACCESS_KEY、VOLCENGINE_SECRET_KEY
      //Credentials akSkCredential = Credentials.getEnvCredentials();

      ApiClient apiClient = new ApiClient()
              .setCredentials(akSkCredential)
              .setRegion(region);
  }
}
```

## STS Token设置

STS（Security Token Service）是火山引擎提供的临时访问凭证机制。开发者通过服务端调用 STS 接口获取临时凭证（临时 AK、SK 和 Token），有效期可配置，适用于安全要求较高的场景。

> ⚠️ 注意事项
>
> 1. 最小权限： 仅授予调用方访问所需资源的最小权限，避免使用 * 通配符授予全资源、全操作权限。
> 2. 设置合理的有效期: 请根据实际情况设置合理有效期，越短越安全，建议不要超过1小时。

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
  public static void main(String[] args) {
      String ak = "Your AK";
      String sk = "Your SK";
      String sessionToken = "Your Session Token";
      String region = "cn-beijing";

      // 1. 输入静态AK/SK、Session Token可能泄漏会导致AK/SK、Session Token泄漏，生产环境不能这样使用
      Credentials sessionTokenCredential = Credentials.getCredentials(ak, sk, sessionToken);
      // 2. 推荐使用环境变量获取AK/SK、Session Token避免代码泄漏;会读取环境变量中：VOLCENGINE_ACCESS_KEY、VOLCENGINE_SECRET_KEY和VOLCENGINE_SESSION_TOKEN
      //Credentials sessionTokenCredential = Credentials.getEnvCredentials();

      ApiClient apiClient = new ApiClient()
              .setCredentials(sessionTokenCredential)
              .setRegion(region);
  }
}

```

## AssumeRole

动态访问凭证信息，支持动态刷新，在STS临时Token过期前60S会进行自动的刷新，避免临界时间点Token过期

> ⚠️ 注意事项
>
> 1. 最小权限： 仅授予调用方访问所需资源的最小权限，避免使用 * 通配符授予全资源、全操作权限。
> 2. 设置合理的有效期: 请根据实际情况设置合理有效期，越短越安全，最长不能超过12小时。
> 3. 细粒度角色: 角色应绑定精细的访问控制策略，仅允许访问特定服务、资源、操作，防止角色滥用。

```java
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.StsAssumeRoleProvider;

public class SampleCode {
  public static void main(String[] args) {
    String region = "cn-beijing";
    StsAssumeRoleProvider stsAssumeRoleProvider = new StsAssumeRoleProvider(
            "YourAccessKey",  // 子账号AK
            "YourSecretKey",            // 子账号SK
            "YourRoleName",             // 扮演角色名称
            "YourAccountId");           // 被扮演的主账号ID，即角色所属的主账号ID

    // 选填字段
    stsAssumeRoleProvider.setHost("sts.volcengineapi.com"); // STS服务地址，默认: sts.volcengineapi.com
    stsAssumeRoleProvider.setRegion("cn-north-1"); // STS服务区域, 默认: cn-north-1
    stsAssumeRoleProvider.setTimeout(30); // STS请求过期时间，单位秒,默认: 30秒
    stsAssumeRoleProvider.setDurationSeconds(3600); // STS临时凭证过期时长，单位为秒，默认: 3600秒
    stsAssumeRoleProvider.setExpireBufferSeconds(60); // STS 过期缓冲时间，单位为秒。在到期前提前多少秒刷新凭证，以避免过期期间的调用失败，默认: 60s
    stsAssumeRoleProvider.setSchema("https"); // STS服务协议，默认: https
    CredentialProvider credentialProvider = new CredentialProvider(stsAssumeRoleProvider);

    ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion(region);
  }

}
```

## OIDC（AssumeRoleWithOIDC）

`OidcCredentialProvider` 通过 OIDC Token 调用 STS 获取临时凭证。

参考文档：https://www.volcengine.com/docs/6257/1494877

显式参数示例：

```java
import com.volcengine.ApiClient;
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.OidcCredentialProvider;

public class SampleCode {
  public static void main(String[] args) {
    String region = "cn-beijing";

    OidcCredentialProvider oidcProvider = new OidcCredentialProvider(
            "trn:iam::1234567890:role/oidc-role", // roleTrn
            null,                                 // roleSessionName（可选）
            "/var/run/secrets/oidc/token",        // oidcTokenFile
            null,                                 // rolePolicy（可选）
            "sts.volcengineapi.com"               // stsEndpoint（可选）
    );
    // 选填字段
    oidcProvider.setDurationSeconds(3600);          // 临时凭证有效期（秒），默认: 3600
    oidcProvider.setExpireBufferSeconds(60);         // 过期缓冲时间（秒），默认: 300
    oidcProvider.setSchema("https");                // STS 协议，默认: https
    oidcProvider.setMaxRetries(3);                  // 重试次数，默认: 3，0 表示不重试
    oidcProvider.setRetryIntervalMs(1000);          // 重试间隔（毫秒），默认: 1000

    CredentialProvider credentialProvider = new CredentialProvider(oidcProvider);
    ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion(region);
  }
}
```

环境变量示例：

```java
import com.volcengine.ApiClient;
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.OidcCredentialProvider;

public class SampleCode {
  public static void main(String[] args) throws Exception {
    // 必填：
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

## SAML（AssumeRoleWithSAML）

`SamlCredentialProvider` 通过 SAML 2.0 IdP 返回的 SAML 断言调用 STS `AssumeRoleWithSAML` 接口换取临时凭证，并在到期前自动刷新。

> ⚠️ 注意事项
>
> 1. 最小权限原则。
> 2. 合理的有效期；建议不超过 1 小时。
> 3. `samlAssertion` 为 IdP 返回的 base64 编码的 SAML Response。

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
            null,                                              // rolePolicy（选填）
            null                                               // stsEndpoint（选填，使用默认值）
    );
    // 选填字段
    samlProvider.setDurationSeconds(3600);          // 临时凭证有效期（秒），默认: 3600
    samlProvider.setExpireBufferSeconds(300);        // 过期缓冲时间（秒），默认: 300
    samlProvider.setSchema("https");                // STS 协议，默认: https
    samlProvider.setMaxRetries(3);                  // 重试次数，默认: 3，0 表示不重试
    samlProvider.setRetryIntervalMs(1000);          // 重试间隔（毫秒），默认: 1000

    CredentialProvider credentialProvider = new CredentialProvider(samlProvider);
    ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion("cn-beijing");
  }
}
```

## 环境变量凭证 Provider

`EnvironmentVariableCredentialProvider` 读取：

- `VOLCENGINE_ACCESS_KEY`
- `VOLCENGINE_SECRET_KEY`
- `VOLCENGINE_SESSION_TOKEN`（可选）

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

## CLI 配置凭证 Provider

`CLIConfigCredentialProvider` 默认读取 `$HOME/.volcengine/config.json`。

- 配置文件优先级：构造参数 `configPath` > `VOLCENGINE_CLI_CONFIG_FILE` > `$HOME/.volcengine/config.json`
- Profile 优先级：构造参数 `profileName` > `VOLCENGINE_PROFILE` > 配置里的 `current` > `default`

支持的 profile `mode`：

- `AK` / 空值
- `StsToken`
- `RamRoleArn`（委托给 `StsAssumeRoleProvider`）
- `OIDC`（委托给 `OidcCredentialProvider`）
- `EcsRole`（委托给 `EcsRoleCredentialProvider`）
- `SSO`

> mode 不区分大小写。

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

## ECS Role 凭证 Provider

`EcsRoleCredentialProvider` 从 ECS IMDS 获取临时凭证。

- RoleName 优先级：构造参数 > `VOLCENGINE_ECS_METADATA` > 从 IMDS 自动检测
- 禁用开关：`VOLCENGINE_ECS_METADATA_DISABLED=true`

```java
import com.volcengine.ApiClient;
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.EcsRoleCredentialProvider;

public class SampleCode {
  public static void main(String[] args) throws Exception {
    EcsRoleCredentialProvider ecsProvider = EcsRoleCredentialProvider.create("your-ecs-role-name");
    // 选填字段
    ecsProvider.setMaxRetries(3);                   // 重试次数，默认: 3，0 表示不重试
    ecsProvider.setRetryIntervalMs(1000);           // 重试间隔（毫秒），默认: 1000
    ecsProvider.setConnectTimeoutMs(1000);           // 连接超时（毫秒），默认: 1000
    ecsProvider.setReadTimeoutMs(1000);              // 读取超时（毫秒），默认: 1000
    ecsProvider.setExpireBufferSeconds(300);          // 过期缓冲时间（秒），默认: 300

    CredentialProvider credentialProvider = new CredentialProvider(ecsProvider);
    ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion("cn-beijing");
  }
}
```

## 默认凭证 Provider

当 `credentials` 和 `credentialProvider` 均未设置时，SDK 自动使用 `DefaultCredentialProvider`，无需手动配置。

如需自定义参数（如 `roleName`），也可显式指定。

默认链顺序：

1. `EnvironmentVariableCredentialProvider`
2. `OidcCredentialProvider`（从 OIDC 环境变量读取）
3. `CLIConfigCredentialProvider`
4. `EcsRoleCredentialProvider`

`reuseLastProviderEnabled` 默认值为 `true`。

```java
import com.volcengine.ApiClient;
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.DefaultCredentialProvider;

public class SampleCode {
  public static void main(String[] args) {
    DefaultCredentialProvider defaultProvider = DefaultCredentialProvider.builder()
            .reuseLastProviderEnabled(true)
            .roleName(null) // 可选：ECS provider 使用
            .build();
    // 或：DefaultCredentialProvider defaultProvider = DefaultCredentialProvider.create();

    CredentialProvider credentialProvider = new CredentialProvider(defaultProvider);
    ApiClient apiClient = new ApiClient()
            .setCredentialProvider(credentialProvider)
            .setRegion("cn-beijing");
  }
}
```

---

[← 概览](0-Overview-zh.md) | 访问凭据[(English)](1-Credentials.md) | [Endpoint 配置 →](2-Endpoint-zh.md)
