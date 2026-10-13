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
> - `retryErrorCode` - `empty set`

请求的处理逻辑内置了网络异常重试逻辑，即当遇到网络异常问题或限流错误时，系统会自动尝试重新发起请求，以确保服务的稳定性和可靠性。若请求因业务逻辑错误而报错，例如参数错误、资源不存在等情况，SDK 将不会执行重试操作，这是因为业务层面的错误通常需要应用程序根据具体的错误信息做出相应的处理或调整，而非简单地重复尝试。

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

默认重试条件 `DefaultRetryCondition`，其中包含以下重试条件：

1. 网络错误会进行重试。
2. 服务端限流错误会进行重试。
3. 包含客户自定义的错误码 `retryErrorCodes`。响应没有错误码时不查询该集合；集合为 null 时仅禁用自定义错误码匹配，不影响状态码和网络异常重试。

#### 自定义重试条件

用户可以根据自己的业务需求，自定义重试条件。

**代码示例：**

1. 继承基类 `RetryCondition`，实现 `boolean shouldRetry(ApiResponse response, Exception error)`：

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

2. 复用默认 `DefaultRetryCondition` 逻辑：

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

---

[← 超时配置](5-Timeout-zh.md) | 重试机制[(English)](6-Retry.md) | [异常处理 →](7-ErrorHandling-zh.md)
