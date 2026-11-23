[← 异常处理](7-ErrorHandling-zh.md) | Debug 机制[(English)](8-Debugging.md) | [概览 →](0-Overview-zh.md)

---

## Debug 机制

为便于客户在处理请求时进行问题排查和调试，SDK 支持日志功能，并提供多种日志级别设置。客户可根据实际需求配置日志级别，获取详细的请求与响应信息，以提升排障效率和系统可观测性。

响应日志不在 SDK 或客户消费前预读正文。开启 Debug 时旁路记录实际读取的字节并标记未完成正文，日志字符集解码失败不会替换原始读取异常。关闭 Debug 时，默认日志掩码也不会影响 HTTP 状态、响应头、实收字节和完整性诊断的保存。

### 无需 Debug，主动打印已保存错误

响应正文日志包装保留原 `ResponseBody.close()` 的资源清理，包括客户资源和关闭异常。未读或部分读取时关闭也会释放原正文，不额外预读，重复关闭包装不会重复清理。

在 catch 或 `ApiCallback.onFailure` 中调用 `com.volcengine.ErrorUtils.PrintError(System.err, error)`，或传入 `StringWriter` 后将 JSON 写入日志。无需开启 Debug 或调整 SLF4J 级别；JSON 包含服务错误码 / 描述、HTTP 状态、RequestId、响应头、UTF-8 或 Base64 原始正文、读取完整性以及 cause / suppressed 原因树。打印时刷新但不关闭输出，写入失败抛出 `IOException`。示例、客户可选快照和采集边界见[异常处理](7-ErrorHandling-zh.md)。

STS 正文不完整时，先检查 `ReadError`、底层读取原因与 `body_complete=false`，再判断已保存片段的 JSON 内容；包装码兜底和原因遍历边界见异常处理。

### 开启 Debug 模式

> **默认**
>
> - `debugging` - `false`（表示不开启 debug 模式）

Java SDK 日志使用的是 SLF4J，需要依赖客户的配置文件，客户可以根据自己的需求，配置日志级别。

**配置示例：**

```xml
<!--开启debug日志-->
<logger name="com.volcengine.sdkcore" level="debug"/>
```

---

[← 异常处理](7-ErrorHandling-zh.md) | Debug 机制[(English)](8-Debugging.md) | [概览 →](0-Overview-zh.md)
