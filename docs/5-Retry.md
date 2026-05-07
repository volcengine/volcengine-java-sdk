[← Timeout](4-Timeout.md) | Retry[(中文)](5-Retry-zh.md) | [Error Handling →](6-ErrorHandling.md)

---

## Retries

> **Default**
>
> - `autoRetry`: `true`
> - `minRetryDelayMs`: `300`
> - `maxRetryDelayMs`: `300 * 1000`
> - `retryCondition`: `com.volcengine.retryer.DefaultRetryCondition`
> - `backoffStrategy`: `com.volcengine.retryer.ExponentialBackoffStrategy`
> - `retryErrorCode`: empty set

The SDK retries on network errors and throttling. Business logic errors are not retried.

### Retry Code Configuration

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

### Retry Conditions

Retry conditions define which situations should trigger a retry. The SDK includes a default retry condition, and users can also customize retry conditions based on their business needs.

#### Default Retry Conditions

The default retry condition `DefaultRetryCondition` includes the following:

1. Retry on network errors.
2. Retry on server throttling errors.
3. Retry on user-specified error codes (`retryErrorCodes`).

#### Custom Retry Conditions

Users can customize retry conditions based on their business needs.

**Code Example:**

1. Extend the base class `RetryCondition` and implement `boolean shouldRetry(ApiResponse response, Exception error)`:

    ```java
    import com.volcengine.retryer.RetryCondition;

    public abstract class CustomRetryCondition extends RetryCondition {
        @Override
        public boolean shouldRetry(ApiResponse response, Exception error) {
            // Implement your own logic
            return false;
        }
    }
    ```

2. Reuse the default `DefaultRetryCondition` logic:

    ```java
    import com.volcengine.retryer.DefaultRetryCondition;

    public class CustomRetryCondition extends DefaultRetryCondition{
        @Override
        public boolean shouldRetry(ApiResponse response, Exception error) {
            boolean shouldRetry = super.shouldRetry(response, error);
            // Implement your own logic
            return false;
        }

    }
    ```

### Backoff Strategy

The backoff strategy defines the delay between each retry attempt. The SDK includes built-in backoff strategies, and users can also customize their own based on their needs.

> **Default**
>
> `ExponentialWithRandomJitterBackoffStrategy`

#### Built-in Strategies

Boundary values: `minRetryDelay` (min delay), `maxRetryDelay` (max delay), `n` is the retry count.

| Name | Description | Formula |
|---|---|---|
| `NoBackoffStrategy` | No backoff, retry immediately. | `delay = 0.0` |
| `ExponentialBackoffStrategy` | Exponential backoff with bounds. | `delay = min(minRetryDelay * 2ⁿ, maxRetryDelay)` |
| `ExponentialWithRandomJitterBackoffStrategy` | Exponential with jitter; value lies in `[base, 2·base]`. | `base = min(minRetryDelay · 2ⁿ, maxRetryDelay)`<br/>`delay = base + U(0, base)` |

#### Custom Backoff Strategy

Users can customize their own backoff strategy based on their needs.

**Code Example:**

1. Extend the base class `BackoffStrategy` and implement `public long computeDelay(int retryCount)`:

    ```java
    import com.volcengine.retryer.BackoffStrategy;

    class CustomBackoffStrategy extends BackoffStrategy {
        public long computeDelay(int retryCount){
            long minRetryDelayMs = this.minRetryDelayMs;
            long maxRetryDelayMs = this.maxRetryDelayMs;
            // Implement your own logic
            return 0;
        }
    }
    ```

2. You can also reuse a built-in backoff strategy such as `ExponentialBackoffStrategy` or `ExponentialWithRandomJitterBackoffStrategy`:

    ```java
    import com.volcengine.retryer.ExponentialWithDecayBackoffStrategy;

    class CustomBackoffStrategy extends ExponentialWithDecayBackoffStrategy{
        public long computeDelay(int retryCount){
            long base = super.computeDelay(retryCount); // Call the parent implementation
            long minRetryDelayMs = this.minRetryDelayMs;
            long maxRetryDelayMs = this.maxRetryDelayMs;
            // Implement your own logic
            return 0;
        }
    }
    ```

---

[← Timeout](4-Timeout.md) | Retry[(中文)](5-Retry-zh.md) | [Error Handling →](6-ErrorHandling.md)
