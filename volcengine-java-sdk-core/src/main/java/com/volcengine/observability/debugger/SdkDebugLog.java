package com.volcengine.observability.debugger;

import com.volcengine.utils.LoggerUtil;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SdkDebugLog {
    private static final String SDK_LOGGER_NAME = "com.volcengine.sdkcore";
    private static final LoggerUtil CORE_LOGGER = LoggerUtil.loggerFor(SDK_LOGGER_NAME);
    public static final SdkDebugLog SDK_CORE_LOGGER = new SdkDebugLog();

    private static long logLevel = LogLevel.LOG_DEBUG_ALL.mask();

    private static final Marker ENDPOINT_MARKER = MarkerFactory.getMarker("[Endpoint]");
    private static final Marker RETRY_MARKER = MarkerFactory.getMarker("[Retry]");
    private static final Marker CONFIG_MARKER = MarkerFactory.getMarker("[Config]");
    private static final Marker REQUEST_MARKER = MarkerFactory.getMarker("[Request]");
    private static final Marker RESPONSE_MARKER = MarkerFactory.getMarker("[Response]");
    private static final Marker SIGN_MARKER = MarkerFactory.getMarker("[Sign]");
    private static final Marker DEFAULT_MARKER = MarkerFactory.getMarker("");
    private static final Map<LogLevel, Marker> LOG_LEVEL_MARKER_MAP  = new HashMap<>();
    static {
        LOG_LEVEL_MARKER_MAP.put(LogLevel.LOG_DEBUG_WITH_ENDPOINT, ENDPOINT_MARKER);
        LOG_LEVEL_MARKER_MAP.put(LogLevel.LOG_DEBUG_WITH_REQUEST_RETRIES, RETRY_MARKER);
        LOG_LEVEL_MARKER_MAP.put(LogLevel.LOG_DEBUG_WITH_CONFIG, CONFIG_MARKER);
        LOG_LEVEL_MARKER_MAP.put(LogLevel.LOG_DEBUG_WITH_REQUEST, REQUEST_MARKER);
        LOG_LEVEL_MARKER_MAP.put(LogLevel.LOG_DEBUG_WITH_REQUEST_BODY, REQUEST_MARKER);
        LOG_LEVEL_MARKER_MAP.put(LogLevel.LOG_DEBUG_WITH_RESPONSE, RESPONSE_MARKER);
        LOG_LEVEL_MARKER_MAP.put(LogLevel.LOG_DEBUG_WITH_RESPONSE_BODY, RESPONSE_MARKER);
        LOG_LEVEL_MARKER_MAP.put(LogLevel.LOG_DEBUG_WITH_REQUEST_ID, RESPONSE_MARKER);
        LOG_LEVEL_MARKER_MAP.put(LogLevel.LOG_DEBUG_WITH_SIGNING, SIGN_MARKER);

    }

    public long getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(long logLevel) {
        this.logLevel = logLevel;
    }

    public boolean matches(LogLevel logLevelEnum) {
        return logLevelEnum.matches(logLevel);
    }

    public void debug(LogLevel logLevelEnum, String msg, Object... args) {
        if (CORE_LOGGER.isDebugEnabled() && logLevelEnum.matches(logLevel)) {
            CORE_LOGGER.debug(LOG_LEVEL_MARKER_MAP.getOrDefault(logLevelEnum, DEFAULT_MARKER), msg, args);
        }
    }

    public void debugEndpoint(String msg, Object... args) {
        debug(LogLevel.LOG_DEBUG_WITH_ENDPOINT, msg, args);
    }

    public void debugRetry(String msg, Object... args) {
        debug(LogLevel.LOG_DEBUG_WITH_REQUEST_RETRIES, msg, args);
    }

    public void debugConfig(String msg, Object... args) {
        debug(LogLevel.LOG_DEBUG_WITH_CONFIG, msg, args);
    }

    public void debugRequest(String msg, Object... args) {
        debug(LogLevel.LOG_DEBUG_WITH_REQUEST, msg, args);
    }

    public void debugRequestBody(String msg, Object... args) {
        debug(LogLevel.LOG_DEBUG_WITH_REQUEST_BODY, msg, args);
    }

    public void debugRequestID(String msg, Object... args) {
        debug(LogLevel.LOG_DEBUG_WITH_REQUEST_ID, msg, args);
    }

    public void debugResponse(String msg, Object... args) {
        debug(LogLevel.LOG_DEBUG_WITH_RESPONSE, msg, args);
    }

    public void debugResponseBody(String msg, Object... args) {
        debug(LogLevel.LOG_DEBUG_WITH_RESPONSE_BODY, msg, args);
    }

    public void debugSign(String msg, Object... args) {
        debug(LogLevel.LOG_DEBUG_WITH_SIGNING, msg, args);
    }


    public void error(Supplier<String> msg, Throwable t) {
        CORE_LOGGER.error(msg, t);
    }

    public boolean isDebugEnabled() {
        return CORE_LOGGER.isDebugEnabled();
    }
}
