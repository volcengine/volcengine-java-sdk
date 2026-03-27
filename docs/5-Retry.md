[← Timeout](4-Timeout.md) | Retry[(中文)](5-Retry-zh.md) | [Error Handling →](6-ErrorHandling.md)

---

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

---

[← Timeout](4-Timeout.md) | Retry[(中文)](5-Retry-zh.md) | [Error Handling →](6-ErrorHandling.md)
