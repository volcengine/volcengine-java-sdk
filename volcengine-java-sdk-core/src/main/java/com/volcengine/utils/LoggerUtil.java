package com.volcengine.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.spi.LocationAwareLogger;

import java.util.function.Supplier;

public class LoggerUtil {

    public static final LoggerUtil CORE_LOGGER = LoggerUtil.loggerFor("com.volcengine.sdkcore");

    private static final String FQCN = LoggerUtil.class.getName();

    private final Logger log;

    LoggerUtil(Logger log) {
        this.log = log;
    }

    /* ---------------- trace ---------------- */
    public void trace(Supplier<String> msg) {
        if (log.isTraceEnabled()) {
            doLog(LocationAwareLogger.TRACE_INT, msg, null);
        }
    }

    public void trace(Supplier<String> msg, Throwable t) {
        if (log.isTraceEnabled()) {
            doLog(LocationAwareLogger.TRACE_INT, msg, t);
        }
    }

    public void trace(String msg, Object... args) {
        if (log.isTraceEnabled()) {
            doLog(LocationAwareLogger.TRACE_INT, () -> msg, null, args);
        }
    }

    /* ---------------- debug ---------------- */
    public void debug(Supplier<String> msg) {
        if (log.isDebugEnabled()) {
            doLog(LocationAwareLogger.DEBUG_INT, msg, null);
        }
    }

    public void debug(Supplier<String> msg, Throwable t) {
        if (log.isDebugEnabled()) {
            doLog(LocationAwareLogger.DEBUG_INT, msg, t);
        }
    }

    public void debug(String msg, Object... args) {
        if (log.isDebugEnabled()) {
            doLog(LocationAwareLogger.DEBUG_INT, () -> msg, null, args);
        }
    }

    public void debug(Marker marker, String msg, Object... args) {
        if (log.isDebugEnabled()) {
            doLog(marker, LocationAwareLogger.DEBUG_INT, () -> msg, null, args);
        }
    }

    /* ---------------- info ---------------- */
    public void info(Supplier<String> msg) {
        if (log.isInfoEnabled()) {
            doLog(LocationAwareLogger.INFO_INT, msg, null);
        }
    }

    public void info(Supplier<String> msg, Throwable t) {
        if (log.isInfoEnabled()) {
            doLog(LocationAwareLogger.INFO_INT, msg, t);
        }
    }

    public void info(String msg, Object... args) {
        if (log.isInfoEnabled()) {
            doLog(LocationAwareLogger.INFO_INT, () -> msg, null, args);
        }
    }

    /* ---------------- warn ---------------- */
    public void warn(Supplier<String> msg) {
        if (log.isWarnEnabled()) {
            doLog(LocationAwareLogger.WARN_INT, msg, null);
        }
    }

    public void warn(Supplier<String> msg, Throwable t) {
        if (log.isWarnEnabled()) {
            doLog(LocationAwareLogger.WARN_INT, msg, t);
        }
    }

    public void warn(String msg, Object... args) {
        if (log.isWarnEnabled()) {
            doLog(LocationAwareLogger.WARN_INT, () -> msg, null, args);
        }
    }

    /* ---------------- error ---------------- */
    public void error(Supplier<String> msg) {
        if (log.isErrorEnabled()) {
            doLog(LocationAwareLogger.ERROR_INT, msg, null);
        }
    }

    public void error(Supplier<String> msg, Throwable t) {
        if (log.isErrorEnabled()) {
            doLog(LocationAwareLogger.ERROR_INT, msg, t);
        }
    }

    public void error(String msg, Object... args) {
        if (log.isErrorEnabled()) {
            doLog(LocationAwareLogger.ERROR_INT, () -> msg, null, args);
        }
    }

    private void doLog(int level, Supplier<String> supplier, Throwable t, Object... args) {
        doLog(null, level, supplier, t, args);
    }

    private void doLog(Marker marker, int level, Supplier<String> supplier, Throwable t, Object... args) {
        if (log instanceof LocationAwareLogger) {
            ((LocationAwareLogger) log).log(
                    marker,
                    FQCN,              // 关键：告诉实现要跳过哪一层
                    level,
                    supplier == null ? null : supplier.get(),
                    args,
                    t
            );
            return;
        }
        // 回退：实现不支持 LocationAwareLogger
        fallback(level, supplier, t, args);
    }

    private void fallback(int level, Supplier<String> supplier, Throwable t, Object... args) {
        String msg = supplier == null ? null : supplier.get();
        switch (level) {
            case LocationAwareLogger.TRACE_INT:
                if (t != null) log.trace(msg, t);
                else log.trace(msg, args);
                break;
            case LocationAwareLogger.DEBUG_INT:
                if (t != null) log.debug(msg, t);
                else log.debug(msg, args);
                break;
            case LocationAwareLogger.INFO_INT:
                if (t != null) log.info(msg, t);
                else log.info(msg, args);
                break;
            case LocationAwareLogger.WARN_INT:
                if (t != null) log.warn(msg, t);
                else log.warn(msg, args);
                break;
            case LocationAwareLogger.ERROR_INT:
                if (t != null) log.error(msg, t);
                else log.error(msg, args);
                break;
            default:
                // ignore
        }
    }

    public static LoggerUtil loggerFor(Class<?> clz) {
        return new LoggerUtil(LoggerFactory.getLogger(clz));
    }

    public static LoggerUtil loggerFor(String name) {
        return new LoggerUtil(LoggerFactory.getLogger(name));
    }

    public boolean isTraceEnabled() {
        return log.isTraceEnabled();
    }

    public boolean isDebugEnabled() {
        return log.isDebugEnabled();
    }

    public boolean isInfoEnabled() {
        return log.isInfoEnabled();
    }

    public boolean isWarnEnabled() {
        return log.isWarnEnabled();
    }

    public boolean isErrorEnabled() {
        return log.isErrorEnabled();
    }
}
