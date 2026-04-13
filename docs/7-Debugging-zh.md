[← 异常处理](6-ErrorHandling-zh.md) | Debug 机制[(English)](7-Debugging.md) | [概览 →](0-Overview-zh.md)

---

# Debug机制

为便于客户在处理请求时进行问题排查和调试，SDK 支持日志功能，并提供多种日志级别设置。客户可根据实际需求配置日志级别，获取详细的请求与响应信息，以提升排障效率和系统可 observability（可观测性）。

## 开启Debug模式

> **默认**
> * `debug` - `false` (表示不开启debug模式)

Java SDK日志使用的是slf4j，需要依赖客户的配置文件，客户可以根据自己的需求，配置日志级别。

**配置示例：**

```xml
<!--开启debug日志-->
<logger name="com.volcengine.sdkcore" level="debug"/>
```

---

[← 异常处理](6-ErrorHandling-zh.md) | Debug 机制[(English)](7-Debugging.md) | [概览 →](0-Overview-zh.md)
