[← Timeout](5-Timeout.md) | Retry[(中文)](6-Retry-zh.md) | [Error Handling →](7-ErrorHandling.md)

---

## Retries

> **Default**
>
> - `autoRetry`: `true`
> - `minRetryDelayMs`: `300`
> - `maxRetryDelayMs`: `300 * 1000`
> - `retryCondition`: `com.volcengine.retryer.DefaultRetryCondition`
> - `backoffStrategy`: `com.volcengine.retryer.ExponentialWithRandomJitterBackoffStrategy`
> - `retryErrorCode`: empty custom set (built-in codes still apply)

The SDK retries recognized network, throttling, timeout, and expired-credential failures. Ordinary parameter or response-format errors are not retried without another explicit retry condition.

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

The cause chain is checked through wrappers and nested `ApiException` objects, with identity cycle protection and a 256-node limit. Timeout, DNS, connection, and socket causes are recognized. `ReadError` and `SerializationError` require a recognized cause or an independently retryable HTTP status; a generic `IOException` or JSON-format error alone does not retry. A `RequestError` with a cause also requires a recognized cause. Suppressed errors are printed for diagnostics and do not trigger retry.

Built-in codes are `RequestError`, `RequestTimeout`, `ResponseTimeout`, `RequestTimeoutException`, `ProvisionedThroughputExceededException`, `Throttling`, `ThrottlingException`, `RequestLimitExceeded`, `RequestThrottled`, `RequestThrottledException`, `TooManyRequestsException`, `PriorRequestNotComplete`, `TransactionInProgressException`, `ExpiredToken`, `ExpiredTokenException`, `RequestExpired`, and `InvalidAccessKey`. Custom `retryErrorCodes` extend these defaults. String root-level common `errorcode` also participates in matching.

Before an allowed retry for an expired-credential code, the SDK-owned STS cache used to sign that request is invalidated, even if the client is rebound while the request is in flight. This covers direct AssumeRole/OIDC/SAML providers, default-chain OIDC, and the built-in CLI provider's STS delegate, directly or through the default chain. CLI refresh rereads its config and rebuilds the delegate. The next signing attempt refreshes credentials; failed refreshes retain the previous cache and keep the refresh requirement. The public `Provider` interface, custom providers, and provider subclasses retain their existing refresh behavior. Synchronous and asynchronous calls follow the same rule. OIDC/SAML form requests retain their existing all-5xx/429 policy and also recognize business codes and nested network causes.

The default retry condition `DefaultRetryCondition` includes the following:

1. Retry on network errors.
2. Retry on server throttling errors.
3. Retry on user-specified error codes (`retryErrorCodes`). Missing error codes are not matched against the set; a null set disables custom-code matching without disabling status-code or network retries. Common-call Map error codes are matched only when `ResponseMetadata.Error.Code` is a string; other types are ignored without changing the returned Map.

The default condition retries HTTP `429`, `500`, `502`, `503`, and `504`, including HTML or nonstandard JSON error bodies. The final thrown `ApiException` (or asynchronous `onFailure` exception) retains the last failure's status, headers, original body / received fragment, available metadata and RequestId, and underlying cause. `ErrorUtils.PrintError` exposes the saved snapshot, including a previously decoded successful response when backoff later fails, without rereading its body.

If backoff calculation or waiting fails, retries stop and `getCause()` exposes that current failure. Previous response-error diagnostics are retained, with the previous exception available through `getSuppressed()`. For a successfully decoded response that triggers a retry, its status, headers, and available metadata are retained, including `AbstractResponse` metadata or decodable `ResponseMetadata` in a common-call Map. A nonempty body RequestId takes priority over headers; failed diagnostic metadata conversion does not replace the backoff cause. The consumed successful body is not read again and `getResponseBody()` is null. Without a response, the status remains `0`. Interrupted waits restore the current thread's interrupt flag. Both synchronous and asynchronous calls expose the current backoff failure.

#### Custom Retry Conditions

Users can customize retry conditions based on their business needs.

The base `RetryCondition` initializes an empty mutable `retryErrorCodes` set. A subclass only needs to implement `shouldRetry` to be installed through `setRetryCondition`; previously configured error codes are added to the condition.

**Code Example:**

1. Extend the base class `RetryCondition` and implement `boolean shouldRetry(ApiResponse response, ApiException error)`:

    ```java
    import com.volcengine.retryer.RetryCondition;
    import com.volcengine.ApiException;
    import com.volcengine.ApiResponse;

    public abstract class CustomRetryCondition extends RetryCondition {
        @Override
        public boolean shouldRetry(ApiResponse response, ApiException error) {
            // Implement your own logic
            return false;
        }
    }
    ```

2. Reuse the default `DefaultRetryCondition` logic:

    ```java
    import com.volcengine.retryer.DefaultRetryCondition;
    import com.volcengine.ApiException;
    import com.volcengine.ApiResponse;

    public class CustomRetryCondition extends DefaultRetryCondition{
        @Override
        public boolean shouldRetry(ApiResponse response, ApiException error) {
            boolean shouldRetry = super.shouldRetry(response, error);
            // Implement your own logic
            return false;
        }

    }
    ```

### Copying Retry Error Code Sets

`RetryCondition.copy()`, including copies made when binding an AssumeRole provider, isolates `retryErrorCodes`. `SortedSet` copies retain their comparator, including case-insensitive matching; ordinary `HashSet` and `LinkedHashSet` copies retain their types and iteration behavior. Other serializable sets are copied through Java serialization with their backing state, such as `Collections.newSetFromMap(new TreeMap<>(String.CASE_INSENSITIVE_ORDER))` and unmodifiable wrappers.

For nonserializable sets or sets with nonserializable backing state, copying throws `IllegalStateException` with an actionable message instead of silently converting to `HashSet`. Override `protected Set<String> copyRetryErrorCodes()` in your retry condition to return an independent set with equivalent matching behavior. Also use this hook if a custom set's serialization does not preserve its semantics. Additional mutable fields in the condition still require overriding `copy()`, calling `super.copy()`, and copying those fields.

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
    import com.volcengine.retryer.ExponentialWithRandomJitterBackoffStrategy;

    class CustomBackoffStrategy extends ExponentialWithRandomJitterBackoffStrategy{
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

[← Timeout](5-Timeout.md) | Retry[(中文)](6-Retry-zh.md) | [Error Handling →](7-ErrorHandling.md)
