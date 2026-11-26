package com.volcengine;

import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Structured error properties and a bounded tree of underlying causes. */
public final class ErrorDetails {
    private final String type;
    private final String error;
    private final String code;
    private final String message;
    private final ResponseDetails response;
    private final List<ErrorDetails> causes;

    ErrorDetails(String type, String error, String code, String message,
                 ResponseDetails response, List<ErrorDetails> causes) {
        this.type = type;
        this.error = error;
        this.code = code;
        this.message = message;
        this.response = response;
        this.causes = Collections.unmodifiableList(new ArrayList<>(causes));
    }

    public String getType() { return type; }
    public String getError() { return error; }
    public String getCode() { return code; }
    public String getMessage() { return message; }
    public ResponseDetails getResponse() { return response; }
    public List<ErrorDetails> getCauses() { return causes; }

    JsonObject toJson() {
        JsonObject result = new JsonObject();
        result.addProperty("type", type);
        result.addProperty("error", error);
        if (code != null) result.addProperty("code", code);
        if (message != null) result.addProperty("message", message);
        result.add("response", response == null ? JsonNull.INSTANCE : response.toJson());
        if (!causes.isEmpty()) {
            JsonArray children = new JsonArray();
            for (ErrorDetails cause : causes) children.add(cause.toJson());
            result.add("causes", children);
        }
        return result;
    }
}
