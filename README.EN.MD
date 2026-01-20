English | [中文](README.md)

# Volcengine SDK for Java

## Table of Contents

* Requirements
* Usage
* API Docs
* Notes

### Requirements

The SDK requires **Java 1.8.0_131+**. You can download the latest version from: http://developers.sun.com/downloads/.

If your Java version is **Java 9 or later**, add `javax.annotation-api` because it was removed from JDK 9+.

```xml
<dependency>
    <groupId>javax.annotation</groupId>
    <artifactId>javax.annotation-api</artifactId>
    <version>1.3.2</version>
</dependency>
```

### Usage

* Getting Started
* Example

#### Getting Started

##### Installation

It is recommended to use Maven. Add dependencies for the modules you need.

##### Init Maven `settings.xml`

If your version is greater than **0.1.27**, you can directly use Maven Central.

If your version is **0.1.27 or earlier**, you need ByteDance Maven repository. In `conf/settings.xml`, under `<mirrors/>`, add:

```xml
<mirror>
    <id>bytedanceMaven</id>
    <mirrorOf>my-repo-id</mirrorOf>
    <name>ByteDance Maven Repository</name>
    <url>https://artifact.bytedance.com/repository/releases/</url>
</mirror>
```

##### Importing the BOM

```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>com.volcengine</groupId>
            <artifactId>volcengine-java-sdk-bom</artifactId>
            <version>1.0.3</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

##### Using SDK Maven modules

```xml
<dependencies>
    <dependency>
        <groupId>com.volcengine</groupId>
        <artifactId>volcengine-java-sdk-vpc</artifactId>
        <version>1.0.3</version>
    </dependency>
    <dependency>
        <groupId>com.volcengine</groupId>
        <artifactId>volcengine-java-sdk-ecs</artifactId>
        <version>1.0.3</version>
    </dependency>
</dependencies>
```

##### Credentials

**Import via environment variables**:

```
export VOLCENGINE_ACCESS_KEY=your ak
export VOLCENGINE_SECRET_KEY=your sk
# If using token
export VOLCENGINE_SESSION_TOKEN=token
```

**Import in code**:

```java
Credentials credentials = Credentials.getCredentials(ak, sk);
// If using token
Credentials credentials = Credentials.getCredentials(ak, sk, token);
```

##### Endpoint

To customize the SDK endpoint:

```java
ApiClient apiClient = new ApiClient()
        .setCredentials(Credentials.getCredentials(ak, sk))
        .setRegion(region).setEndpoint("ecs.cn-beijing-autodriving.volcengineapi.com");
```

Standard endpoint rules:

| Regional Service | Global Service |
|---|---|
| `{service}.{region}.volcengineapi.com` <br> e.g. `ecs.cn-beijing-autodriving.volcengineapi.com` | `{service}.volcengineapi.com` <br> e.g. `iam.volcengineapi.com` |

Note:

- If the service name contains `_`, it should be converted to `-` in the endpoint. Use lowercase for all characters.

#### SDK Example

```java
import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;
import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.DescribeVpcsRequest;
import com.volcengine.vpc.model.DescribeVpcsResponse;

import java.util.ArrayList;
import java.util.List;

public class TestVpc {
    public static void main(String[] args) throws Exception {
        String ak = "your ak";
        String sk = "your sk";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);
        VpcApi vpcApi = new VpcApi(apiClient);
        DescribeVpcsRequest request = new DescribeVpcsRequest();
        List<String> list = new ArrayList<>();
        list.add("vpc-13fpdgwk7rxfk3n6nu44wisg7");
        request.setVpcIds(list);
        try {
            DescribeVpcsResponse response = vpcApi.describeVpcs(request);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}
```

For more examples, see: [SDK Integration Guide](./SDK_Integration.md)
