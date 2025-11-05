package com.volcengine.ark.runtime.utils;

/**
 * 日志工具类，支持通过环境变量控制调试级别
 */
public class LoggerUtil {
    private static final String ENABLE_DEBUG_ENV = "IS_ENABLE_LOGGER_DEBUG";
    private static final String DEBUG_LEVEL_ENV = "LOGGER_DEBUG_LEVEL";

    private static final boolean IS_DEBUG_ENABLED = getBooleanEnv(ENABLE_DEBUG_ENV, false);
    private static final String DEBUG_LEVEL = getStringEnv(DEBUG_LEVEL_ENV, "debug");

    // 日志级别常量
    public static final String LEVEL_DEBUG = "debug";
    public static final String LEVEL_INFO = "info";
    public static final String LEVEL_WARN = "warn";
    public static final String LEVEL_ERROR = "error";

    private static boolean getBooleanEnv(String envName, boolean defaultValue) {
        String value = System.getenv(envName);
        if (value == null) {
            return defaultValue;
        }
        return "true".equalsIgnoreCase(value) || "1".equals(value);
    }

    private static String getStringEnv(String envName, String defaultValue) {
        String value = System.getenv(envName);
        return value != null ? value.toLowerCase() : defaultValue;
    }

    /**
     * 检查是否应该打印指定级别的日志
     */
    private static boolean shouldLog(String level) {
        if (!IS_DEBUG_ENABLED) {
            return false; // 调试模式关闭时，不打印任何调试日志
        }

        // 根据配置的级别决定是否打印
        switch (DEBUG_LEVEL) {
            case LEVEL_DEBUG:
                return true; // debug级别打印所有日志
            case LEVEL_INFO:
                return !LEVEL_DEBUG.equals(level); // info级别不打印debug
            case LEVEL_WARN:
                return LEVEL_WARN.equals(level) || LEVEL_ERROR.equals(level);
            case LEVEL_ERROR:
                return LEVEL_ERROR.equals(level);
            default:
                return true; // 默认打印所有
        }
    }

    /**
     * 调试日志
     */
    public static void debug(String message) {
        if (shouldLog(LEVEL_DEBUG)) {
            System.out.println("[DEBUG] " + message);
        }
    }

    /**
     * 信息日志
     */
    public static void info(String message) {
        if (shouldLog(LEVEL_INFO)) {
            System.out.println("[INFO] " + message);
        }
    }

    /**
     * 警告日志
     */
    public static void warn(String message) {
        if (shouldLog(LEVEL_WARN)) {
            System.out.println("[WARN] " + message);
        }
    }

    /**
     * 错误日志
     */
    public static void error(String message) {
        if (shouldLog(LEVEL_ERROR)) {
            System.err.println("[ERROR] " + message);
        }
    }

    /**
     * 错误日志（带异常）
     */
    public static void error(String message, Throwable throwable) {
        if (shouldLog(LEVEL_ERROR)) {
            System.err.println("[ERROR] " + message);
            if (throwable != null) {
                throwable.printStackTrace();
            }
        }
    }

    /**
     * 获取当前日志配置信息
     */
    public static String getLogConfig() {
        return String.format("DebugEnabled: %s, DebugLevel: %s", IS_DEBUG_ENABLED, DEBUG_LEVEL);
    }
}
