# 目录

- [集成SDK](#集成sdk)
- [环境要求](#环境要求)
- [安全设置访问凭据](#安全设置访问凭据)
  - [环境变量设置](#环境变量设置)
    - [Linux设置](#linux-设置)
    - [Windows设置](#windows-设置)
      - [图形化界面设置](#图形化界面设置)
      - [命令行设置](#命令行设置)
- [访问凭据](#访问凭据)
  - [AK/SK设置](#aksk设置)
  - [STS Token设置](#sts-token设置)
  - [AssumeRole](#assumerole)
- [EndPoint配置](#endpoint配置)
  - [自定义Endpoint](#自定义endpoint)
  - [自定义RegionId](#自定义regionid)
  - [自动化Endpoint寻址](#自动化endpoint寻址)
    - [Endpoint默认寻址逻辑](#endpoint默认寻址)
- [HTTP连接池配置](#http连接池配置)
- [HTTPS请求配置](#https请求配置)
  - [指定Scheme](#指定scheme)
  - [忽略SSL验证](#忽略ssl验证)
- [Http(s)代理配置](#https代理配置)
  - [配置Http(s)代理](#配置https代理)
  - [注意事项](#注意事项)
- [超时配置](#超时配置)
  - [全局超时设置](#全局超时设置client级别)
- [重试机制](#重试机制)
  - [重试代码配置](#重试代码配置)
  - [重试条件](#重试条件)
  - [退避策略](#退避策略)
- [异常处理](#异常处理)
- [Debug机制](#debug机制)

# 集成SDK

在调用接口时，推荐在项目中集成 SDK 的方式进行接入。通过使用 SDK，不仅可以简化开发流程、加快功能集成速度，还能有效降低后期的维护成本。火山引擎 SDK 的集成主要包括以下三个步骤：引入 SDK、配置访问凭证，以及编写接口调用代码。本文将结合常见使用场景，详细说明各步骤的实现方法及注意事项。

# 环境要求

- 运行 SDK需要jdk **Java 1.8.0_131+**. 你可以下载最新的版本： http://developers.sun.com/downloads/.   
- 如果 SDK版本 高于或者等于 **Java 9** 请依赖javax.annotation-api由于在高于或者等于 **Java 9** 中 javax.annotation-api 被移除

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
| VOLCENGINE_SESSION_TOKEN | export VOLCENGINE_SESSION_TOKEN=yourSessionToken       |

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

为保障资源访问安全，火山引擎 SDK 支持三种主流的认证方式：**AK/SK**、**STS 临时凭证** 和 **AssumeRole**。不同认证方式适用于不同场景，开发者可根据业务需求选择合适的方式接入。

环境变量设置可以参考这里:[**环境变量设置**](#环境变量设置)

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


# EndPoint配置

## 自定义Endpoint

> - **默认**  
>   不指定endpoint时，走[自动化Endpoint寻址](#自动化endpoint寻址)

用户可以通过在初始化客户端时指定Endpoint

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

## 自定义RegionId

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

## 自动化Endpoint寻址

> - **默认**  
>   默认支持自动寻址，无需手动指定Endpoint

为了简化用户配置，Vocoengine 提供了灵活的 Endpoint 自动寻址机制。用户无需手动指定服务地址，SDK 会根据服务名称、区域（Region）等信息自动拼接出合理的访问地址，并支持用户自定义DualStack（双栈）支持。  
### Endpoint默认寻址 
**Endpoint默认寻址逻辑**
1. 是否自动寻址Region  
内置自动寻址Region列表代码:[./volcengine-java-sdk-core/src/main/java/com/volcengine/endpoint/DefaultEndpointProvider.java#BOOTSTRAP_REGION](./volcengine-java-sdk-core/src/main/java/com/volcengine/endpoint/DefaultEndpointProvider.java#L25)  
SDK 仅对部分预设区域（如 `cn-beijing-autodriving`、`ap-southeast-2`）或用户配置的区域执行自动寻址；其他区域默认返回Endpoint：`open.volcengineapi.com`。  
用户可通过环境变量 `VOLC_BOOTSTRAP_REGION_LIST_CONF` 或代码中自定义 `customBootstrapRegion` 来扩展控制区域列表。
2. DualStack 支持（IPv6）  
SDK 支持双栈网络（IPv4 + IPv6）访问地址，自动启用条件如下：    
显式传入参数 `setUseDualStack(true)`，或设置环境变量 `VOLC_ENABLE_DUALSTACK=true`，优先级`useDualStack`>`VOLC_ENABLE_DUALSTACK`  
启用后，域名后缀将从 `volcengineapi.com` 切换为 `volcengine-api.com`。
3. 根据服务名和区域自动构造 Endpoint 地址，规则如下：  
**全局服务（如 `CDN`、`IAM`）**  
使用 `<服务名>.volcengineapi.com`（或启用双栈时使用 `volcengine-api.com`）。  
示例：`cdn.volcengineapi.com`  
**区域服务（如 `ECS`、`RDS`）**  
使用 `<服务名>.<区域名>.volcengineapi.com` 作为默认 Endpoint。  
示例：`ecs.cn-beijing.volcengineapi.com`

**代码示例：**

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

# Http连接池配置

> **默认**  
> * `maxIdleConns` - `5`  
> * `keepAliveDurationMs` - `5 * 60 * 1000`  

Java SDK连接池用的是`com.squareup.okhttp.ConnectionPool`，可以通过设置`maxIdleConns`和`keepAliveDurationMs`来控制连接池的行为。

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
    public static void main(String[] args) {
        String regionId = "cn-beijing";
        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getEnvCredentials())
                .setRegion(regionId)
                .setMaxIdleConns(5) // 最大空闲连接数量
                .setKeepAliveDurationMs(5 * 60 * 1000); // 空闲连接存活时间
    }
}
```

# Https请求配置

## 指定scheme

> **默认**  
> * `disableSSL` - `false`(表示https)

Java SDK默认使用https请求，如需使用http请求，可通过设置`disableSSL`为`true`来实现。

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

## 忽略SSL验证

> **默认**  
> * `verifyingSsl` - `true` (表示启用SSL验证)

Java SDK默认启用SSL验证，如需忽略SSL验证，可通过设置`verifyingSsl`为`false`来实现。

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
   public static void main(String[] args) {
      String regionId = "cn-beijing";
      ApiClient apiClient = new ApiClient()
              .setCredentials(Credentials.getEnvCredentials())
              .setRegion(regionId)
              .setVerifyingSsl(false); // 忽略SSL验证
   }  
}

```

# Http(s)代理配置

> **默认**  
> * 无代理

## 配置Http(s)代理

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public static void main(String[] args) {
    String regionId = "cn-beijing";
    ApiClient apiClient = new ApiClient()
            .setCredentials(Credentials.getEnvCredentials())
            .setRegion(regionId)
            .setHttpProxy("http://your_http_proxy:proxy_port") // 设置http代理
            .setHttpsProxy("http://your_https_proxy:proxy_port"); // 设置https代理
}
```

## 注意事项

支持通过以下环境变量配置代理:

http_proxy/HTTP_PROXY, https_proxy/HTTPS_PROXY

优先级：代码指定 > 环境变量

# 超时配置

## 全局超时设置（Client级别）

> **默认(毫秒)**  
> * `connectTimeout` - `10 * 1000` (客户端尝试与服务器建立 TCP 连接的最大等待时间)
> * `writeTimeout` - `10 * 1000` (向服务器发送请求数据过程中单次写入操作的最大等待时间)
> * `readTimeout` - `10 * 1000` (连接建立后，读取服务器响应数据的最大等待时间)



Java SDK Client使用的是`com.squareup.okhttp.OkHttpClient`，可以通过设置`connectTimeout`、`readTimeout`和`writeTimeout`来控制请求的超时时间。  

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

# 重试机制

> **默认**
> * `autoRetry` - `true` (默认开启重试)
> * `minRetryDelayMs` - `300` 
> * `maxRetryDelayMs` - `300 * 1000`
> * `retryCondition`  - `com.volcengine.retryer.DefaultRetryCondition`
> * `backoffStrategy` - `com.volcengine.retryer.ExponentialBackoffStrategy`
> * `retryErrorCode` - `empty set`


请求的处理逻辑内置了网络异常重试逻辑，即当遇到网络异常问题或限流错误时，系统会自动尝试重新发起请求，以确保服务的稳定性和可靠性。若请求因业务逻辑错误而报错，例如参数错误、资源不存在等情况，SDK将不会执行重试操作，这是因为业务层面的错误通常需要应用程序根据具体的错误信息做出相应的处理或调整，而非简单地重复尝试。

## 重试代码配置

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
            .setAutoRetry(true) // 开启重试
            .setNumMaxRetries(3) // 最大重试次数
            .setMinRetryDelayMs(1000) // 最小重试间隔
            .setMaxRetryDelayMs(3000) // 最大重试间隔
            .setRetryCondition(new DefaultRetryCondition()) // 重试条件
            .setBackoffStrategy(new ExponentialBackoffStrategy()) // 重试间隔策略
            .addRetryErrorCode("InvalidAuthorization") // 重试错误码
                /*.addRetryErrorCodes(new HashSet<String>(){{
                    add("InvalidAuthorization");
                    add("InvalidAccessKeyId");
                 }})*/
            ;
  }

}

```

## 重试条件
重试条件定义了哪些情况下需要进行重试。SDK内置了默认的重试条件，用户也可以根据自己的业务需求，自定义重试条件。
### 默认重试条件
默认重试条件`DefaultRetryCondition`，其中包含以下重试条件：
1. 网络错误会进行重试
2. 服务端限流错误会进行重试
3. 包含客户自定义的错误码`retryErrorCodes`

### 自定义重试条件
用户可以根据自己的业务需求，自定义重试条件。

**代码示例：**
1. 继承基类RetryCondition 实现 `boolean shouldRetry(ApiResponse response, Exception error)`
```java
import com.volcengine.retryer.RetryCondition;

public abstract class CustomRetryCondition extends RetryCondition {
    @Override
    public boolean shouldRetry(ApiResponse response, Exception error) {
        // #................实现自己逻辑
        return false;
    }
}
```
2. 复用默认DefaultRetryCondition逻辑
```java
import com.volcengine.retryer.DefaultRetryCondition;

public class CustomRetryCondition extends DefaultRetryCondition{
   @Override
  public boolean shouldRetry(ApiResponse response, Exception error) {
      boolean shouldRetry = super.shouldRetry(response, error);
      // #................实现自己逻辑
      return false;
  }

}
```

## 退避策略
退避策略定义了在重试时，每次重试之间的延迟时间。SDK内置了默认的退避策略，用户也可以根据自己的业务需求，自定义退避策略。
> **默认**
> * ExponentialWithRandomJitterBackoffStrategy
### 内置退避策略
| 策略名称 | 说明 | 公式（边界值：`minRetryDelay` 最小延迟时间，`maxRetryDelay` 最大延迟时间；<br/>`n`:重试次数）               |
| -------- | ---- |-----------------------------------------------------------------------------------|
| `NoBackoffStrategy` | 不使用退避。每次重试立即执行，零延时。 | `delay=0.0`                                                                       |
| `ExponentialBackoffStrategy` | 每次重试延时按 2ⁿ 级数增长，受最小/最大延时约束。可快速降低请求频率。 | `delay=min(minRetryDelay*2ⁿ, maxRetryDelay)`                                      |
| `ExponentialWithRandomJitterBackoffStrategy` |    在 [base, 2·base] 之间取值：始终 ≥ base，抖动幅度与基线等宽。 | `base = min(minRetryDelay · 2ⁿ,  maxRetryDelay )`  <br/>`delay = base + U(0, base)` |

### 自定义退避策略
用户可以根据自己的需求，自定义退避策略。

**代码示例：**
1. 继承基类`BackoffStrategy`，实现函数`public long computeDelay(int retryCount)`
```java
import com.volcengine.retryer.BackoffStrategy;

class CustomBackoffStrategy extends BackoffStrategy {
    public long computeDelay(int retryCount){
        long minRetryDelayMs = this.minRetryDelayMs;
        long maxRetryDelayMs = this.maxRetryDelayMs;
        // ....实现自己逻辑
        return 0;
    }
}
```
2. 也可以复用内置退避策略`ExponentialBackoffStrategy`或`ExponentialWithRandomJitterBackoffStrategy`
```java
import com.volcengine.retryer.ExponentialWithDecayBackoffStrategy;
 
class CustomBackoffStrategy extends ExponentialWithDecayBackoffStrategy{
   public long computeDelay(int retryCount){
      long base = super.computeDelay(retryCount); // 调用父类的实现
      long minRetryDelayMs = this.minRetryDelayMs;
      long maxRetryDelayMs = this.maxRetryDelayMs;
      // ....实现自己逻辑
      return 0;
  }
}
```

# 异常处理

在调用接口时，可能会返回不同类型的错误。客户可根据具体的错误类型和错误码，采取有针对性的处理策略。例如，对于网络异常可选择重试，对于业务逻辑错误则应根据错误信息进行参数调整或业务逻辑修正，从而提升系统的健壮性和用户体验。

错误分类：


| 错误类型       | 错误描述                             | 返回错误类型                                                                                            | 说明                      |
|------------| ------------------------------------ |---------------------------------------------------------------------------------------------------|-------------------------|
| 1. 客户端错误   | 请求未到达服务端，对参数作验证       | ApiException                                                                                      | 详情参见代码示例                        |
| 2. 网络/超时错误 | DNS解析错误或请求超时                | `SocketTimeoutException` `UnknownHostException` <br/> `UnknownServiceException` `SocketException` |      详情参见代码示例                   |
| 3. 服务端错误   | 请求成功到达服务器，返回业务逻辑错误 | ApiException                                                                                      | 可以获取到requestId进行问题排查，详情参见代码示例 |
| 4. 其它错误    | 未包含在前4中错误的其它错误处理      | Exception                                                                                         | 无详情参见代码示例                       |

**代码示例：**

```java
import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.CreateKeyPairRequest;
import com.volcengine.ecs.model.CreateKeyPairResponse;
import com.volcengine.sign.Credentials;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import com.volcengine.model.Error;
import org.apache.commons.lang.StringUtils;

public class SampleCode {
    public static void main(String[] args) {
        String region = "cn-beijing";
        ApiClient apiClient = null;
  
        try {
          apiClient = new ApiClient()
                  .setCredentials(Credentials.getEnvCredentials())
                  .setRegion(region)
          ;
        }catch (Exception e) {
          System.out.println("1. 客户端错误: " + e.getMessage());
        }

        EcsApi api = new EcsApi(apiClient);

        CreateKeyPairRequest createKeyPairRequest = new CreateKeyPairRequest();
        createKeyPairRequest.setKeyPairName("ssh_key_pair");

        try {
            CreateKeyPairResponse response = api.createKeyPair(createKeyPairRequest);
            System.out.println(response);
        } catch (ApiException e) {
            Throwable cause = e.getCause();
            if(cause == null){
                if (e.getCode() == 0 &&  !StringUtils.isEmpty(e.getMessage())) {
                  System.out.println("1. 客户端错误: " + e.getMessage());
                }
            }else {
                if (cause instanceof SocketTimeoutException ||
                        cause instanceof UnknownHostException ||
                        cause instanceof UnknownServiceException ||
                        cause instanceof SocketException
                ) {
                    System.out.println("2. 网络/超时错误: " + cause.getMessage());
                }else {
                    System.out.println("4. 其它错误: " + cause.getMessage());
                }
            }

            if (e.getResponseMetadata() != null && e.getResponseMetadata().getError()!= null) {
                Error error = e.getResponseMetadata().getError();
                System.out.println("3. 服务端错误: code: " + error.getCode() + ", message: " + error.getMessage() + ", requestId: " + e.getResponseMetadata().getRequestId());
            }

        } catch (Exception e){
            System.out.println("4. 其它错误: " + e.getMessage());
        }

    }

}
```


# Debug机制

为便于客户在处理请求时进行问题排查和调试，SDK 支持日志功能，并提供多种日志级别设置。客户可根据实际需求配置日志级别，获取详细的请求与响应信息，以提升排障效率和系统可 observability（可观测性）。

> **默认**
> * `debugging` - `false` (表示不开启debug模式)

Java SDK使用的是`com.squareup.okhttp.OkHttpClient`，可以通过设置`debugging`来开启debug模式。

```java
import com.volcengine.ApiClient;
import com.volcengine.sign.Credentials;

public class SampleCode {
  public static void main(String[] args) {
      String regionId = "cn-beijing";
      ApiClient apiClient = new ApiClient()
              .setCredentials(Credentials.getEnvCredentials())
              .setRegion(regionId)
              .setDebugging(true);
  }
}

```
