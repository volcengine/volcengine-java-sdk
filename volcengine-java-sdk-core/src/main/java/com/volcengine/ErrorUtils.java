package com.volcengine;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.volcengine.model.ResponseMetadata;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/** Explicit diagnostics; never wraps or changes the supplied Throwable. */
public final class ErrorUtils {
    private static final String[] ID_HEADERS = {"X-Top-Requestid", "X-Top-Request-Id", "X-Tt-Logid"};
    private ErrorUtils() {}

    public static void PrintError(Writer writer, Throwable error) throws IOException {
        if (error == null) return;
        if (writer == null) throw new IOException("error output writer is null");
        writer.write(new GsonBuilder().serializeNulls().disableHtmlEscaping().setPrettyPrinting()
                .create().toJson(getErrorDetails(error).toJson()));
        writer.write('\n');
        writer.flush();
        if (writer instanceof java.io.PrintWriter && ((java.io.PrintWriter) writer).checkError()) {
            throw new IOException("failed to print error details");
        }
    }

    public static void PrintError(OutputStream stream, Throwable error) throws IOException {
        if (error == null) return;
        if (stream == null) throw new IOException("error output stream is null");
        PrintError(new OutputStreamWriter(stream, StandardCharsets.UTF_8), error);
        if (stream instanceof java.io.PrintStream && ((java.io.PrintStream) stream).checkError()) {
            throw new IOException("failed to print error details");
        }
    }

    public static ErrorDetails getErrorDetails(Throwable error) {
        return new Walk().build(error, 0);
    }

    public static String requestId(String body, ResponseMetadata existing, Map<String, List<String>> headers) {
        JsonObject root = object(body);
        String id = string(child(root, "ResponseMetadata"), "RequestId");
        if (nonempty(id)) return id;
        if (existing != null && nonempty(existing.getRequestId())) return existing.getRequestId();
        if (headers != null) {
            for (String candidate : ID_HEADERS) {
                for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                    if (candidate.equalsIgnoreCase(entry.getKey()) && entry.getValue() != null
                            && !entry.getValue().isEmpty() && nonempty(entry.getValue().get(0))) {
                        return entry.getValue().get(0);
                    }
                }
            }
        }
        return "";
    }

    /** Tolerant diagnostics only; does not replace strict model decoding. */
    public static ResponseMetadata metadata(String body, ResponseMetadata existing,
                                            Map<String, List<String>> headers) {
        ResponseMetadata result = existing == null ? new ResponseMetadata() : existing;
        result.setRequestId(requestId(body, existing, headers));
        JsonObject root = object(body);
        JsonObject meta = child(root, "ResponseMetadata");
        JsonObject service = child(meta, "Error");
        String code = string(service, "Code");
        String message = string(service, "Message");
        if (meta == null || ((!meta.has("Error") || meta.get("Error").isJsonNull())
                && nonempty(string(root, "errorcode")))) {
            code = string(root, "errorcode");
            message = string(root, "message");
        }
        if (nonempty(code) || message != null || (meta != null && meta.has("Error") && !meta.get("Error").isJsonNull())) {
            com.volcengine.model.Error value = result.getError();
            if (value == null) value = new com.volcengine.model.Error();
            if (nonempty(code)) value.setCode(code);
            if (message != null) value.setMessage(message);
            result.setError(value);
        }
        return result;
    }

    public static boolean hasBusinessError(String body) {
        JsonObject root = object(body);
        JsonObject meta = child(root, "ResponseMetadata");
        return (meta != null && meta.has("Error") && !meta.get("Error").isJsonNull())
                || nonempty(string(root, "errorcode"));
    }

    public static ApiException responseError(String message, Throwable cause, String classification,
                                            String body, ResponseMetadata metadata, ResponseDetails details,
                                            boolean simpleError) {
        ResponseMetadata resolved = metadata(body, metadata, details == null ? null : details.getHeaders());
        com.volcengine.model.Error service = resolved.getError();
        if (service == null) service = new com.volcengine.model.Error();
        if (classification != null || !nonempty(service.getCode())) {
            service.setCode(classification == null ? "UnknownError" : classification);
            if (classification != null || service.getMessage() == null) service.setMessage(message);
        }
        resolved.setError(service);
        String display = simpleError ? service.getCode() + ": " + service.getMessage() : message;
        ApiException error = new ApiException(display, cause, details == null ? 0 : details.getStatusCode(),
                details == null ? null : details.getHeaders(), body, resolved);
        error.setResponseDetails(details == null ? null : details.withRequestId(resolved.getRequestId()));
        return error;
    }

    private static JsonObject object(String body) {
        if (body == null || body.isEmpty()) return null;
        try {
            JsonElement parsed = new JsonParser().parse(body);
            return parsed.isJsonObject() ? parsed.getAsJsonObject() : null;
        } catch (RuntimeException ignored) { return null; }
    }
    private static JsonObject child(JsonObject parent, String name) {
        JsonElement value = parent == null ? null : parent.get(name);
        return value != null && value.isJsonObject() ? value.getAsJsonObject() : null;
    }
    private static String string(JsonObject parent, String name) {
        JsonElement value = parent == null ? null : parent.get(name);
        return value != null && value.isJsonPrimitive() && value.getAsJsonPrimitive().isString()
                ? value.getAsString() : null;
    }
    private static boolean nonempty(String value) { return value != null && !value.isEmpty(); }

    private static final class Walk {
        private final Set<Throwable> path = Collections.newSetFromMap(new IdentityHashMap<Throwable, Boolean>());
        private int nodes;
        ErrorDetails build(Throwable error, int depth) {
            if (error == null || nodes >= 256) return null;
            nodes++;
            if (depth >= 64 || !path.add(error)) {
                return new ErrorDetails(error.getClass().getName(), "[cycle or error traversal limit]",
                        null, null, null, Collections.<ErrorDetails>emptyList());
            }
            try {
                String text;
                String message = null;
                String code = null;
                ResponseDetails response = null;
                try { text = error.toString(); }
                catch (RuntimeException e) { text = error.getClass().getName(); }
                try { message = error.getMessage(); } catch (RuntimeException ignored) {}
                if (error instanceof DetailedException) {
                    try { response = ((DetailedException) error).getResponseDetails(); } catch (RuntimeException ignored) {}
                }
                if (error instanceof ApiException) {
                    try {
                        ApiException api = (ApiException) error;
                        ResponseMetadata meta = api.getResponseMetadata();
                        if (meta != null && meta.getError() != null) {
                            code = meta.getError().getCode();
                            message = meta.getError().getMessage();
                        }
                        if (response == null && api.getCode() != 0) {
                            response = new ResponseDetails(api.getCode(), null, null,
                                    requestId(api.getResponseBody(), meta, api.getResponseHeaders()),
                                    api.getResponseHeaders(), api.getResponseBody() == null ? null
                                    : api.getResponseBody().getBytes(StandardCharsets.UTF_8),
                                    api.getResponseBody() != null, api.getResponseBody() != null);
                        }
                    } catch (RuntimeException ignored) {}
                }
                List<ErrorDetails> children = new ArrayList<>();
                Throwable directCause = null;
                if (depth < 63 && nodes < 256) {
                    try {
                        directCause = error.getCause();
                        if (directCause != null) children.add(build(directCause, depth + 1));
                    } catch (RuntimeException ignored) {}
                    for (Throwable suppressed : error.getSuppressed()) {
                        if (nodes >= 256) break;
                        if (suppressed != null && suppressed != directCause) children.add(build(suppressed, depth + 1));
                    }
                }
                for (ErrorDetails child : children) {
                    if (!nonempty(code) && nonempty(child.getCode())) {
                        code = child.getCode();
                        message = child.getMessage();
                    }
                    if (response == null) response = child.getResponse();
                }
                return new ErrorDetails(error.getClass().getName(), text, code, message, response, children);
            } finally { path.remove(error); }
        }
    }
}
