[← 超时配置](5-Timeout-zh.md) | 重试机制[(English)](6-Retry.md) | [异常处理 →](7-ErrorHandling-zh.md)

---

## 重试机制

> **默认**
>
> - `autoRetry` - `true`（默认开启重试）
> - `minRetryDelayMs` - `300`
> - `maxRetryDelayMs` - `300 * 1000`
> - `retryCondition` - `com.volcengine.retryer.DefaultRetryCondition`
> - `backoffStrategy` - `com.volcengine.retryer.ExponentialWithRandomJitterBackoffStrategy`
> - `retryErrorCode` - 自定义集合默认为空，内置错误码仍生效

SDK 会重试明确的网络、限流和超时错误。凭证过期仅在本次签名使用可刷新的 SDK 自有 STS 缓存时默认触发重试。参数错误、资源不存在和普通响应格式错误没有其他明确的可重试条件时不会重试。

### 重试代码配置

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

### 重试条件

重试条件定义了哪些情况下需要进行重试。SDK 内置了默认的重试条件，用户也可以根据自己的业务需求，自定义重试条件。

#### 默认重试条件

cause 链会穿过包装异常和嵌套 `ApiException`，按对象身份防循环，最多检查 256 个节点，识别超时、DNS、连接和 socket 原因。`ReadError` / `SerializationError` 只有明确可重试的 cause 或独立 HTTP 状态规则才重试；普通 `IOException` 或 JSON 格式错误本身不触发重试。带 cause 的 `RequestError` 也要求明确原因。suppressed 仅用于打印诊断，不触发重试。

内置瞬时错误码为 `RequestError`、`RequestTimeout`、`ResponseTimeout`、`RequestTimeoutException`、`ProvisionedThroughputExceededException`、`Throttling`、`ThrottlingException`、`RequestLimitExceeded`、`RequestThrottled`、`RequestThrottledException`、`TooManyRequestsException`、`PriorRequestNotComplete`、`TransactionInProgressException`。客户 `retryErrorCodes` 在此基础上扩展，通用响应根层的字符串 `errorcode` 也参与匹配。异常没有非空业务码时，默认条件从已保存的正文中宽容读取字符串错误码，不改写异常，也不重读响应流。

`ExpiredToken`、`ExpiredTokenException`、`RequestExpired`、`InvalidAccessKey` 仅在本次签名使用可刷新的 SDK 自有 STS 缓存时默认触发重试，并使实际签名缓存失效；请求期间客户端重新绑定 provider 也不会刷新错误的缓存。覆盖直接 AssumeRole/OIDC/SAML、默认链 OIDC，以及直接或默认链中的内置 CLI provider 的 STS 委托。CLI 刷新会重新读取配置并重建委托；下次签名取得新凭证，刷新失败保留旧缓存并继续要求刷新。静态凭证、环境变量 AK、CLI AK 模式、客户 provider 和 provider 子类不会仅因这四个码默认重试。STS 交换也不会仅因这些码重复发送已过期的源 AK、OIDC token 或 SAML 断言。独立的网络、限流、429/5xx 规则仍生效，OIDC/SAML 保留全部 5xx 规则。客户显式配置的错误码和自定义重试策略保持原有分派，公共 `Provider` 接口无需增加方法。同步与异步执行相同规则。

默认重试条件 `DefaultRetryCondition`，其中包含以下重试条件：

1. 网络错误会进行重试。
2. 服务端限流错误会进行重试。
3. 包含客户自定义的错误码 `retryErrorCodes`。响应没有错误码时不查询该集合；集合为 null 时仅禁用自定义错误码匹配，不影响状态码和网络异常重试。通用 Map 的 `ResponseMetadata.Error.Code` 仅在值为字符串时参与匹配；其他类型会被忽略，返回的 Map 不变。

HTTP `429`、`500`、`502`、`503`、`504` 会按默认条件重试，包括 HTML 或非标准 JSON 错误正文。最终抛出的 `ApiException`（或异步 `onFailure` 的异常）保留最后一次失败的状态码、响应头、原始正文 / 已读片段、可用的元数据与 RequestId、底层 cause。`ErrorUtils.PrintError` 输出已保存快照，也包括成功解析后退避失败的前次响应，无需重读正文。

退避计算或等待失败时停止重试，`getCause()` 是当前退避 / 等待异常；已有响应异常的诊断字段保留，前次异常通过 `getSuppressed()` 获取。已成功解析的响应触发重试时，保留其状态码、响应头与可用元数据，包括 `AbstractResponse` 元数据及通用 Map 中可解析的 `ResponseMetadata`。正文非空 RequestId 优先于响应头；诊断元数据转换失败不会覆盖退避 cause。已消费的成功正文不会重新读取，`getResponseBody()` 为 null。没有响应时状态码仍为 `0`。等待被中断时恢复当前线程的中断标记。同步与异步均返回当前退避失败异常。

#### 自定义重试条件

用户可以根据自己的业务需求，自定义重试条件。

基类 `RetryCondition` 默认初始化一个可修改的空 `retryErrorCodes` 集合。子类只需实现 `shouldRetry` 即可通过 `setRetryCondition` 安装；此前配置的错误码会加入该条件。合并 null 或空来源集合时不操作，显式添加错误码时初始化为 null 的目标集合，已有集合的匹配与复制语义保持不变。

**代码示例：**

1. 继承基类 `RetryCondition`，实现 `boolean shouldRetry(ApiResponse response, ApiException error)`：

    ```java
    import com.volcengine.retryer.RetryCondition;
    import com.volcengine.ApiException;
    import com.volcengine.ApiResponse;

    public abstract class CustomRetryCondition extends RetryCondition {
        @Override
        public boolean shouldRetry(ApiResponse response, ApiException error) {
            // #................实现自己逻辑
            return false;
        }
    }
    ```

2. 复用默认 `DefaultRetryCondition` 逻辑：

    ```java
    import com.volcengine.retryer.DefaultRetryCondition;
    import com.volcengine.ApiException;
    import com.volcengine.ApiResponse;

    public class CustomRetryCondition extends DefaultRetryCondition{
        @Override
        public boolean shouldRetry(ApiResponse response, ApiException error) {
            boolean shouldRetry = super.shouldRetry(response, error);
            // #................实现自己逻辑
            return false;
        }

    }
    ```

### 重试错误码集合的复制

`RetryCondition.copy()`（包括 AssumeRole Provider 绑定时的复制）会隔离 `retryErrorCodes`。`SortedSet` 保留比较器及大小写不敏感等匹配规则；普通 `HashSet`、`LinkedHashSet` 保留类型和遍历行为。其他可序列化集合通过 Java 序列化连同底层状态一起复制，例如 `Collections.newSetFromMap(new TreeMap<>(String.CASE_INSENSITIVE_ORDER))` 和不可修改包装集合。

集合或其底层状态不可序列化时，复制会抛出带解决提示的 `IllegalStateException`，避免静默转换成 `HashSet`。请在重试条件中重写 `protected Set<String> copyRetryErrorCodes()`，返回匹配行为等价且相互独立的集合。自定义集合的序列化无法保留自身语义时，也应重写此方法。条件中其他可变字段仍需重写 `copy()`、调用 `super.copy()` 并复制相应字段。

### 退避策略

退避策略定义了在重试时，每次重试之间的延迟时间。SDK 内置了默认的退避策略，用户也可以根据自己的业务需求，自定义退避策略。

> **默认**
>
> `ExponentialWithRandomJitterBackoffStrategy`

#### 内置退避策略

边界值说明：`minRetryDelay` 最小延迟时间，`maxRetryDelay` 最大延迟时间，`n` 为重试次数。

| 策略名称 | 说明 | 公式 |
|---|---|---|
| `NoBackoffStrategy` | 不使用退避。每次重试立即执行，零延时。 | `delay = 0.0` |
| `ExponentialBackoffStrategy` | 每次重试延时按 2ⁿ 级数增长，受最小/最大延时约束。可快速降低请求频率。 | `delay = min(minRetryDelay * 2ⁿ, maxRetryDelay)` |
| `ExponentialWithRandomJitterBackoffStrategy` | 在 `[base, 2·base]` 之间取值：始终 ≥ `base`，抖动幅度与基线等宽。 | `base = min(minRetryDelay · 2ⁿ, maxRetryDelay)`<br/>`delay = base + U(0, base)` |

#### 自定义退避策略

用户可以根据自己的需求，自定义退避策略。

**代码示例：**

1. 继承基类 `BackoffStrategy`，实现函数 `public long computeDelay(int retryCount)`：

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

2. 也可以复用内置退避策略 `ExponentialBackoffStrategy` 或 `ExponentialWithRandomJitterBackoffStrategy`：

    ```java
    import com.volcengine.retryer.ExponentialWithRandomJitterBackoffStrategy;

    class CustomBackoffStrategy extends ExponentialWithRandomJitterBackoffStrategy{
        public long computeDelay(int retryCount){
            long base = super.computeDelay(retryCount); // 调用父类的实现
            long minRetryDelayMs = this.minRetryDelayMs;
            long maxRetryDelayMs = this.maxRetryDelayMs;
            // ....实现自己逻辑
            return 0;
        }
    }
    ```

### 写请求与重放

重试可能重复执行服务端已经接受的操作，HTTP GET 本身不能证明业务动作幂等。非幂等动作应使用接口支持的幂等 token，或同时关闭 SDK 重试（`setAutoRetry(false)`）与传输重发（`getHttpClient().setRetryOnConnectionFailure(false)`），结果不确定时再通过业务查询确认。

---

[← 超时配置](5-Timeout-zh.md) | 重试机制[(English)](6-Retry.md) | [异常处理 →](7-ErrorHandling-zh.md)
