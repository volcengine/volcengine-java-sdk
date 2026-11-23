[← Error Handling](7-ErrorHandling.md) | Debugging[(中文)](8-Debugging-zh.md) | [Overview →](0-Overview.md)

---

## Debugging

To help with troubleshooting and debugging when handling requests, the SDK supports logging with multiple levels. Configure your logging settings based on your needs to get detailed request/response information and improve observability.

Response logging does not read the body ahead of the SDK or caller. With Debug enabled, body logs observe actual consumer reads and mark incomplete bodies; charset errors in logging do not replace the original read failure. With Debug disabled, the default log mask still leaves status, headers, delivered bytes, and read-completeness diagnostics available.

### Print saved errors without Debug

The response-body logging wrapper preserves the original body's `close()` cleanup, including custom resources and close exceptions. Closing an unread or partially read body releases it without reading ahead; repeated wrapper closes do not repeat cleanup.

Use `com.volcengine.ErrorUtils.PrintError(System.err, error)` from a catch block or `ApiCallback.onFailure`, or pass a `StringWriter` and write its JSON to your logger. Debug and SLF4J level configuration are not required. The JSON includes service code/message, HTTP status, RequestId, headers, original body bytes as UTF-8 or Base64, read-completeness flags, and cause/suppressed trees. Printing flushes but does not close the output; output failures raise `IOException`. See [Error Handling](7-ErrorHandling.md) for examples, optional customer snapshots, and capture boundaries.

For an incomplete STS body, inspect `ReadError`, its read cause, and `body_complete=false` before treating the retained fragment as JSON. Wrapper code fallback and cause traversal are bounded as described in Error Handling.

### Enable Debug Mode

> **Default**
>
> - `debugging`: `false`

The Java SDK uses SLF4J for logging. Configure your own logging settings based on your needs.

**Example:**

```xml
<!-- enable debug logs -->
<logger name="com.volcengine.sdkcore" level="debug"/>
```

---

[← Error Handling](7-ErrorHandling.md) | Debugging[(中文)](8-Debugging-zh.md) | [Overview →](0-Overview.md)
