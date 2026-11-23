[← 重试机制](6-Retry-zh.md) | 异常处理[(English)](7-ErrorHandling.md) | [Debug 机制 →](8-Debugging-zh.md)

---

## 异常处理

core `ApiClient` 的同步调用在 `catch (ApiException e)` 中取得异常，异步调用通过 `ApiCallback.onFailure` 取得异常。HTTP 状态码、服务端业务错误码与底层异常原因是不同的信息，应分别读取。

### 将完整错误打印为 JSON

`ErrorUtils.PrintError(Writer, Throwable)` 和 `ErrorUtils.PrintError(OutputStream, Throwable)` 输出已保存的诊断信息，不需要开启 Debug，也不会重新读取响应。输出为缩进 JSON 和结尾换行，刷新但不关闭输出流；error 为 null 时不输出。输出失败会抛出 `IOException`，也会检查 `PrintWriter` / `PrintStream` 吞掉的写入错误。

```java
import com.volcengine.ErrorUtils;
import java.io.StringWriter;

// error 可以是 ApiException、包装异常或普通 Throwable。
StringWriter output = new StringWriter();
ErrorUtils.PrintError(output, error);
logger.error(output.toString());
// 或：ErrorUtils.PrintError(System.err, error);
```

JSON 包含 `type`、`error`、可选 `code` / `message`、`response` 和可选 `causes`。`response` 包含 `status_code`、`status`、`proto`、`request_id`、`headers`、`body`、`body_encoding`、`body_captured`、`body_complete`。有效 UTF-8 字节输出文本，其他字节输出 Base64；已采集的空正文输出 `""`，未采集正文输出 null。读取失败保留已取得字节并标记 `body_complete=false`。快照不可变，响应头和字节均作防御性复制。

原因树展开 cause 和 suppressed，按对象身份检查循环，最多 64 层、256 个节点。包装错误保留外层文字，并从子错误兜底取得错误码和响应。`ErrorUtils.getErrorDetails(error)` 返回对应 DTO。客户异常可选实现 `DetailedException.getResponseDetails()`；快照为 null 时从既有 `ApiException` 字段兜底，旧正文文本无法恢复从未保存的原始字节。

既有 `ApiException` 构造函数、`toString()`、`Provider` 接口和客户异常对象身份保持兼容，VE 继续使用 checked 异常。SDK 的响应读取失败分类为 `ReadError`，解码 / 转换失败为 `SerializationError`，缺少服务错误码或非标准响应为 `UnknownError`，STS 凭证校验失败为 `InvalidCredentials`。即使没有 RequestId，也会创建包含分类的元数据；空 ID 不代表生成了替代 ID。正常业务错误保留服务端错误码。

`new ApiClient().setSimpleError(true)` 显式启用 `code: message` 显示，覆盖 HTTP 200 业务错误及绑定的内置 STS provider，包括直接使用或通过默认链使用的 CLI `ramrolearn` / `oidc` 模式，首次 STS 请求及委托重建后均生效。开关切换会更新当前内置 STS 委托，设为 `false` 恢复原有显示，快照与底层原因仍保留。TOP 调用默认拒绝业务错误，也识别根层 `errorcode` / `message`。通用调用默认保留原有成功 Map 行为，设置 `setCommonBusinessErrorEnabled(true)` 后才拒绝 HTTP 200 业务错误。既有成功返回 null 的情况保持不变。

### 既有诊断访问器

`ResponseMetadata` 与根层 `errorcode` 共存、但没有标准 `ResponseMetadata.Error` 时，保留根层错误码和描述。TOP 在严格解析元数据后拒绝该响应；通用调用仅在开启业务错误检查时拒绝。标准服务错误优先于根层字段，TOP 元数据类型非法时仍分类为 `SerializationError`。

客户重写反序列化方法或响应拦截器所返回的异常原样传递，包括精确的 `ApiException` 对象。打印可兜底组装缺失字段，但不会改写异常。包装层错误码为 null 或空字符串时，从具有非空错误码的子错误取得码和描述；循环标记也计入 256 节点预算，到达 64 层后不再遍历子节点。

| 错误类型 | 返回行为 | 可取得的信息 |
|---|---|---|
| 客户端参数、凭证、签名、请求构建错误 | 保留原有 `ApiException` 或运行时异常类型 | 通常没有目标业务服务的响应；鉴权 provider 的独立请求按自身异常链路处理 |
| DNS、连接、TLS、发送超时等无响应的网络错误 | `ApiException`，`getCode()` 为 `0` | `getCause()` 保留底层 `IOException`；没有响应头、服务端 RequestId 或正文 |
| HTTP 非 2xx、TOP `ResponseMetadata.Error`、非标准 TOP 响应 | `ApiException`，`getCode()` 为实际 HTTP 状态码 | 响应头、原始正文、可解析的元数据及 RequestId；非 2xx 的 message 保留 HTTP reason phrase |
| 响应文本 / 字节数组读取失败，文本 charset 非法或不受支持，元数据或目标模型解析失败，元数据反射回填失败，不支持的 Content-Type | `ApiException`，即使 HTTP 是 200 也可能表示调用失败 | 实际 HTTP 状态码、响应头、RequestId、原始 TOP envelope（或通用调用原文）；有底层异常时保留 `getCause()` |
| 重试退避计算 / 等待失败 | `ApiException`，终止重试 | 当前失败在 `getCause()` 中；前次响应错误的诊断字段保留，前次异常在 `getSuppressed()` 中；等待中断会恢复线程中断标记 |

上述诊断也覆盖内置 AssumeRole、OIDC、SAML 的 STS 响应与凭证校验失败；其他独立客户端、文件下载落盘和客户自定义拦截器并非全部覆盖。

### 诊断字段与兜底

- `getCode()` 是 HTTP 状态码。服务端业务错误码从 `getResponseMetadata().getError().getCode()` 读取，元数据与 `Error` 都可能为 null。
- RequestId 优先使用响应正文中可解析的非空 `ResponseMetadata.RequestId`；后续处理保留已有元数据，再依次检查 `X-Top-Requestid`、`X-Top-Request-Id`、`X-Tt-Logid`。响应头名称忽略大小写，各候选头取第一个值；全部缺失时不生成替代 ID。
- 正文成功读取时，`getResponseBody()` 保留原文，TOP 的 Result / 模型解析失败也保留完整 envelope。读取失败时只保存已经取得的片段；未取得任何字节时正文为 null，无法恢复未读内容。诊断片段按响应 charset 解码，缺失、非法或不受支持时使用 UTF-8，并保留原始读取异常作为 cause。完整的非空文本遇到非法或不受支持的 charset 时返回 `ApiException`，cause 为字符集异常，诊断正文使用 UTF-8。成功的空正文和字节数组读取无需解析 charset。
- `getMessage()` 与服务端 `Error.Message`、原始正文相互独立。`getCause()` 保存读取、解析或反射失败的底层异常；正常的业务错误或缺少元数据的合法 JSON 不会凭空产生解析 cause。
- `toString()` 保持原有运行时类名，正文非 null 时才追加 `: <响应正文>`，不额外添加 HTTP 状态、RequestId 或 message。完整诊断从访问器或 `ErrorUtils.PrintError` 获取；显式启用的简化错误文字可从 `getMessage()` 读取。

HTML 或其他格式不合法的非标准错误正文解析失败时分类为 `SerializationError`，504 等独立 HTTP 状态规则仍可触发重试。诊断元数据提取允许忽略无关字段的类型错误，TOP 模型解析仍严格校验。继承响应 / 反序列化方法以及重写后调用 `super` 均保留快照；客户重写保持原有分派和异常对象身份。

通用调用 `isCommon=true` 保留原有响应形状，不要求 TOP 元数据；模型解析失败也封装为 `ApiException`，`String` 类型解析 JSON 失败时仍返回原文。异步调用沿用 `buildCall` 的 common 标记。`returnType=null`、HTTP 204、2xx 空正文、TOP `Result:null` 和通用 JSON `null` 保留原有成功返回 null 的行为。

### 代码示例

以下辅助类可在同步 `catch (ApiException e)` 或异步 `onFailure` 中调用。示例对可选字段作 null 检查。

```java
import com.volcengine.ApiException;
import com.volcengine.model.ResponseMetadata;
import com.volcengine.model.Error;

public final class SdkDiagnostics {
    public static void print(ApiException e) {
        ResponseMetadata metadata = e.getResponseMetadata();
        Error error = metadata == null ? null : metadata.getError();
        System.out.println("httpStatus=" + e.getCode());
        System.out.println("requestId=" + (metadata == null ? null : metadata.getRequestId()));
        System.out.println("errorCode=" + (error == null ? null : error.getCode()));
        System.out.println("errorMessage=" + (error == null ? null : error.getMessage()));
        System.out.println("message=" + e.getMessage());
        System.out.println("headers=" + e.getResponseHeaders());
        System.out.println("responseBody=" + e.getResponseBody());
        System.out.println("cause=" + e.getCause());
        for (Throwable previous : e.getSuppressed()) {
            System.out.println("previousFailure=" + previous);
        }
    }
}
```

---

[← 重试机制](6-Retry-zh.md) | 异常处理[(English)](7-ErrorHandling.md) | [Debug 机制 →](8-Debugging-zh.md)
