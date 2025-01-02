package com.volcengine.ark.runtime;

public class Const {

    public static final String ACCESS_KEY = "VOLC_ACCESSKEY";
    public static final String SECRET_KEY = "VOLC_SECRETKEY";
    public static final String CLIENT_REQUEST_HEADER = "X-Client-Request-Id";
    public static final String SERVER_REQUEST_HEADER = "X-Request-Id";
    public static final String REQUEST_MODEL = "X-Request-Model";
    public static final String REQUEST_BOT = "X-Request-Bot";
    public static final String RETRY_AFTER = "Retry-After";
    public static final String REQUEST_BOT_ID = "botId";
    public static final Integer DEFAULT_MANDATORY_REFRESH_TIMEOUT = 10 * 60;  // 10 min
    public static final Integer DEFAULT_ADVISORY_REFRESH_TIMEOUT = 30 * 60;  // 30 min
    public static final Integer DEFAULT_STS_TIMEOUT = 7 * 24 * 60 * 60;  // 7 days

    public static final String RESOURCE_TYPE_BOT = "bot";
    public static final String RESOURCE_TYPE_ENDPOINT = "endpoint";

    public static final String CONTEXT_MODE_SESSION = "session";
    public static final String CONTEXT_MODE_COMMON_PREFIX = "common_prefix";
    public static final String TRUNCATION_STRATEGY_TYPE_LAST_HISTORY_TOKENS = "last_history_tokens";
    public static final String TRUNCATION_STRATEGY_TYPE_ROLLING_TOKENS = "rolling_tokens";

    public static final String BATCH_CHAT_PATH = "/api/v3/batch/chat/completions";
    public static final int MAX_RETRY_TIMES = 259200;
}
