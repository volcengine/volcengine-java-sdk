[← Retry](6-Retry.md) | Error Handling[(中文)](7-ErrorHandling-zh.md) | [Debugging →](8-Debugging.md)

---

## Error Handling

Synchronous core `ApiClient` calls expose failures through `catch (ApiException e)`. Asynchronous calls expose them through `ApiCallback.onFailure`. Read the HTTP status, service error code, and underlying cause separately.

### Print complete errors as JSON

`ErrorUtils.PrintError(Writer, Throwable)` and `ErrorUtils.PrintError(OutputStream, Throwable)` print saved diagnostics without enabling Debug or rereading the response. Output is indented JSON followed by a newline; the output is flushed but not closed. A null error writes nothing. Output failures, including errors swallowed by `PrintWriter` or `PrintStream`, raise `IOException`.

```java
import com.volcengine.ErrorUtils;
import java.io.StringWriter;

// error may be an ApiException, a wrapper, or an ordinary Throwable.
StringWriter output = new StringWriter();
ErrorUtils.PrintError(output, error);
logger.error(output.toString());
// Or: ErrorUtils.PrintError(System.err, error);
```

The JSON has `type`, `error`, optional `code` and `message`, `response`, and optional `causes`. `response` contains `status_code`, `status`, `proto`, `request_id`, `headers`, `body`, `body_encoding`, `body_captured`, and `body_complete`. Valid UTF-8 bytes print as text; other bytes print as Base64. Captured empty bodies print as `""`; uncaptured bodies print as null. A failed read retains delivered bytes and sets `body_complete=false`. Snapshots are immutable and defensively copy headers and bytes.

The tree expands the cause and suppressed exceptions, with identity cycle protection and limits of 64 levels and 256 nodes. Wrapped properties fall back to child error codes and responses while retaining the outer error text. `ErrorUtils.getErrorDetails(error)` provides the corresponding DTO. Optional `DetailedException.getResponseDetails()` lets customer exceptions supply diagnostics; a null snapshot falls back to existing `ApiException` fields. Legacy response-body text cannot recover bytes that were never saved.

`ApiException` constructors and `toString()`, the existing `Provider` interface, and customer exception identity remain compatible. VE keeps its checked exception base class. SDK errors use `ReadError` for response reads, `SerializationError` for decoding/conversion, `UnknownError` for missing service error codes or nonstandard responses, and `InvalidCredentials` for STS credential validation. These classifications populate metadata even when no RequestId exists; an empty ID is not an invented ID. Ordinary business errors retain their service code.

`new ApiClient().setSimpleError(true)` selects `code: message` for SDK response errors, including HTTP 200 errors and bound built-in STS providers. This includes CLI `ramrolearn` / `oidc` modes used directly or through the default chain, from the first STS request and after delegate rebuilds. Changing the setting updates the current built-in STS delegate; setting `false` restores the existing display. It changes display text only when explicitly enabled; raw snapshots and causes remain available. TOP calls reject business errors by default, including root-level `errorcode`/`message`. Common calls keep their old successful Map behavior by default; use `setCommonBusinessErrorEnabled(true)` to reject HTTP 200 business errors. Existing null-success cases remain unchanged.

### Existing diagnostic getters

When `ResponseMetadata` and a root `errorcode` coexist without a standard `ResponseMetadata.Error`, the root code/message are retained. TOP rejects this response after strict metadata decoding; common calls reject it only when business-error checking is enabled. A standard service error takes precedence over root fields, and invalid TOP metadata still yields `SerializationError`.

Customer exceptions from overridden deserializers or response interceptors pass through unchanged, including exact `ApiException` instances. Printing can derive missing fields without changing the exception. Null or empty wrapper codes fall back to a nonempty child code/message. Cycle markers count toward the 256-node budget, and child traversal stops at 64 levels.

| Error Type | Behavior | Available Information |
|---|---|---|
| Client parameters, credentials, signing, or request construction | Existing `ApiException` or runtime exception types remain | Usually no response from the target service; independent authentication-provider requests use their own error paths |
| DNS, connection, TLS, or send timeout without a response | `ApiException` with `getCode()` equal to `0` | The underlying `IOException` in `getCause()`; no response headers, service RequestId, or body |
| Non-2xx HTTP, TOP `ResponseMetadata.Error`, or nonstandard TOP response | `ApiException` with the actual HTTP status | Headers, original body, available metadata and RequestId; non-2xx messages retain the HTTP reason phrase |
| Response text / byte-array read failure, invalid or unsupported text charset, metadata or model decoding failure, reflective metadata assignment failure, or unsupported Content-Type | `ApiException`; an HTTP 200 can still represent a failed SDK call | Actual status, headers, RequestId, original TOP envelope (or common-call body), and the underlying cause when one exists |
| Retry backoff calculation or waiting failure | `ApiException`; retries stop | Current failure in `getCause()`; previous response-error diagnostics are retained and the previous exception is in `getSuppressed()`; interrupted waits restore the thread interrupt flag |

The same diagnostics cover built-in AssumeRole, OIDC, and SAML STS responses and validation failures. Other independent clients, file-download disk operations, and custom interceptors are not all covered.

### Diagnostic Fields and Fallbacks

- `getCode()` is the HTTP status. Read service error codes through `getResponseMetadata().getError().getCode()`; both metadata and `Error` may be null.
- A nonempty, decodable body `ResponseMetadata.RequestId` takes priority. Later processing preserves existing metadata before checking `X-Top-Requestid`, `X-Top-Request-Id`, and `X-Tt-Logid` in that order. Header names are matched case-insensitively; the first value of each candidate header is used. No replacement ID is generated when all sources are missing.
- `getResponseBody()` retains the original body after a successful read, including the full TOP envelope when Result / model decoding fails. Failed reads retain only bytes already obtained; the body is null when no bytes were obtained. Missing content cannot be recovered. Diagnostic fragments use the response charset, falling back to UTF-8 when it is missing, invalid, or unsupported; the original read exception remains the cause. Complete nonempty text with an invalid or unsupported charset raises `ApiException` with the charset exception as its cause and a UTF-8 diagnostic body. Empty successful bodies and successful byte-array reads do not require charset decoding.
- `getMessage()`, service `Error.Message`, and the original body are separate fields. `getCause()` retains underlying read, parsing, or reflection failures. Ordinary service errors or valid JSON without metadata do not invent a parsing cause.
- `toString()` uses `com.volcengine.ApiException: status=<HTTP status>[, requestId=<request ID>][, message=<message>][, body=<original body or received fragment>]`. Read causes and suppressed exceptions separately or print the full stack trace.

Common calls (`isCommon=true`) retain their existing response shape without requiring TOP metadata. Model parsing failures become `ApiException`; failed JSON parsing for a `String` return type still returns the original text. Asynchronous calls use the common flag from `buildCall`. Existing successful null returns remain for `returnType=null`, HTTP 204, empty 2xx bodies, TOP `Result:null`, and common JSON `null`.

### Code Example

Call this helper from a synchronous `catch (ApiException e)` or asynchronous `onFailure`. Optional fields are checked for null.

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

[← Retry](6-Retry.md) | Error Handling[(中文)](7-ErrorHandling-zh.md) | [Debugging →](8-Debugging.md)
