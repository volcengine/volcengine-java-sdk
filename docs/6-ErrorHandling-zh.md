[← 重试机制](5-Retry-zh.md) | 异常处理[(English)](6-ErrorHandling.md) | [Debug 机制 →](7-Debugging-zh.md)

---

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

---

[← 重试机制](5-Retry-zh.md) | 异常处理[(English)](6-ErrorHandling.md) | [Debug 机制 →](7-Debugging-zh.md)
