# Volcengine SDK for Java

## Table of Contents
* Requirements
* Usage
* API Dosc
* Note

### Requirements ###
运行 SDK需要jdk **Java 1.7+**. 你可以下载最新的版本： http://developers.sun.com/downloads/.
如果 SDK版本 高于或者等于 **Java 9** 请依赖javax.annotation-api
由于在高于或者等于 **Java 9** 中 javax.annotation-api 被移除

请在使用中引用
```xml
<dependency>
  <groupId>javax.annotation</groupId>
  <artifactId>javax.annotation-api</artifactId>
  <version>1.3.2</version>
</dependency>
```

### Usage ###
* Getting Started
* Example

#### Getting Started ####

##### 工程使用sdk #####

建议使用Maven构建自己的项目，添加需要的相应模块的依赖，示例如下：

##### Init maven setting.xml #####
如果您使用的版本大于0.1.27 可以不进行设置 直接使用中央仓库进行依赖

如果您使用的版本小于或者等于0.1.27
需要使用字节跳动的maven仓库来完成依赖，请先到maven安装目录的conf/setting.xml
在<mirrors/>标签中增加

```xml
<mirror>
     <id>bytedanceMaven</id>
     <mirrorOf>my-repo-id</mirrorOf>
     <name>字节跳动maven仓库</name>
     <url>https://artifact.bytedance.com/repository/releases/</url>
</mirror>
```

##### Importing the pom #####

```xml
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.volcengine</groupId>
	  <artifactId>volcengine-java-sdk-bom</artifactId>
       <version>0.2.2</version>
	  <type>pom</type>
      <scope>import</scope>
    </dependency>
  </dependencies>
</dependencyManagement>
```


##### Using the SDK Maven modules #####

```xml
<dependencies>
  <dependency>
    <groupId>com.volcengine</groupId>
    <artifactId>volcengine-java-sdk-vpc</artifactId>
   <version>0.2.2</version>
  </dependency>
  <dependency>
    <groupId>com.volcengine</groupId>
    <artifactId>volcengine-java-sdk-ecs</artifactId>
   <version>0.2.2</version>
  </dependency>
</dependencies>
```

##### Credentials 配置 #####

**通过环境变量导入**:
```
export VOLCENGINE_ACCESS_KEY=your ak
export VOLCENGINE_SECRET_KEY=your sk
#如果使用token
export VOLCENGINE_SESSION_TOKEN=token
```

**代码方式引入**：

```java
Credentials credentials = Credentials.getCredentials(ak,sk);
//如果使用token
Credentials credentials = Credentials.getCredentials(ak,sk，token);
```

#### Example ####
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
  public static void main(String[] args)throws Exception {
    String ak = "your ak";
    String sk = "your sk";
    String region = "cn-beijing";

    ApiClient apiClient = new ApiClient()
            .setCredentials(Credentials.getCredentials(ak,sk))
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