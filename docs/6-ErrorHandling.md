[← Retry](5-Retry.md) | Error Handling[(中文)](6-ErrorHandling-zh.md) | [Debugging →](7-Debugging.md)

---

# Error Handling

When calling APIs, different types of errors may be returned. You can adopt targeted handling strategies based on the specific error type and error code. For example, network errors can be retried, while business logic errors should be addressed by adjusting parameters or fixing business logic based on the error message. This improves system robustness and user experience.

Error Classification:

| Error Type | Description | Exception Type | Notes |
|---|---|---|---|
| 1. Client Error | Request did not reach the server; parameter validation failed | ApiException | See code example below |
| 2. Network/Timeout Error | DNS resolution error or request timeout | `SocketTimeoutException` `UnknownHostException` <br/> `UnknownServiceException` `SocketException` | See code example below |
| 3. Server Error | Request reached the server; business logic error returned | ApiException | A requestId is available for troubleshooting; see code example below |
| 4. Other Errors | Any other errors not covered above | Exception | See code example below |

**Code Example:**

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
            System.out.println("1. Client error: " + e.getMessage());
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
                    System.out.println("1. Client error: " + e.getMessage());
                }
            }else {
                if (cause instanceof SocketTimeoutException ||
                    cause instanceof UnknownHostException ||
                    cause instanceof UnknownServiceException ||
                    cause instanceof SocketException
                ) {
                    System.out.println("2. Network/timeout error: " + cause.getMessage());
                }else {
                    System.out.println("4. Other error: " + cause.getMessage());
                }
            }

            if (e.getResponseMetadata() != null && e.getResponseMetadata().getError()!= null) {
                Error error = e.getResponseMetadata().getError();
                System.out.println("3. Server error: code: " + error.getCode() + ", message: " + error.getMessage() + ", requestId: " + e.getResponseMetadata().getRequestId());
            }

        } catch (Exception e){
            System.out.println("4. Other error: " + e.getMessage());
        }

    }

}
```

---

[← Retry](5-Retry.md) | Error Handling[(中文)](6-ErrorHandling-zh.md) | [Debugging →](7-Debugging.md)
