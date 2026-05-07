[← Error Handling](6-ErrorHandling.md) | Debugging[(中文)](7-Debugging-zh.md) | [Overview →](0-Overview.md)

---

## Debugging

To help with troubleshooting and debugging when handling requests, the SDK supports logging with multiple levels. Configure your logging settings based on your needs to get detailed request/response information and improve observability.

## Enable Debug Mode

> **Default**
>
> - `debug`: `false`

The Java SDK uses SLF4J for logging. Configure your own logging settings based on your needs.

**Example:**

```xml
<!-- enable debug logs -->
<logger name="com.volcengine.sdkcore" level="debug"/>
```

---

[← Error Handling](6-ErrorHandling.md) | Debugging[(中文)](7-Debugging-zh.md) | [Overview →](0-Overview.md)
