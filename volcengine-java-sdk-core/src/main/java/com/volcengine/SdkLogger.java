package com.volcengine;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class SdkLogger {
    private final Logger logger;

    private static final String LOGGER_LEVEL_DEBUG = "DEBUG";
    private static final String LOGGER_LEVEL_ERROR = "ERROR";


    private static final String LOGGER_NAME_PREFIX = "com.volcengine";

    private SdkLogger(Class<?> clazz) {
        this.logger = Logger.getLogger(clazz.getName());
    }

    public static SdkLogger getLogger(Class<?> clazz) {
        return new SdkLogger(clazz);
    }

    public void debug(String message) {
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(message);
        }
    }

    public void info(String message) {
        if (logger.isLoggable(Level.INFO)) {
            logger.info(message);
        }
    }

    public void warn(String message) {
        if (logger.isLoggable(Level.WARNING)) {
            logger.warning(message);
        }
    }

    public void error(String message) {
        if (logger.isLoggable(Level.SEVERE)) {
            logger.severe(message);
        }
    }

    public static void enableConsoleOutput(Level level) {
        enableOutput(level, new ConsoleHandler());
    }

    public static void enableFileOutput(String filePath, Level level) throws IOException {
        enableOutput(level, new FileHandler(filePath, true));
    }

    private static void enableOutput(Level level, Handler newHandler) {
        Logger logger = Logger.getLogger(LOGGER_NAME_PREFIX);
        logger.setUseParentHandlers(false);

        for (Handler handler : logger.getHandlers()) {
            logger.removeHandler(handler);
            handler.close();
        }

        newHandler.setLevel(level);
        newHandler.setFormatter(new LineNumberFormatter());
        logger.addHandler(newHandler);
        logger.setLevel(level);
    }

    public static void enableConsoleAndFileOutput(String filePath, Level level) throws IOException {
        enableConsoleOutput(level);
        enableFileOutput(filePath, level);
    }


    private static class LineNumberFormatter extends Formatter {

        @Override
        public String format(LogRecord record) {
            // 获取堆栈信息
            StackTraceElement[] stack = Thread.currentThread().getStackTrace();

            String location = "Unknown";
            for (StackTraceElement element : stack) {
                String className = element.getClassName();
                if (className.startsWith("java.util.logging")
                        || className.startsWith("sun.reflect")
                        || className.equals(Thread.class.getName())
                        || className.contains("SdkLogger") // 过滤你自定义 SdkLogger 相关栈帧
                ) {
                    continue; // 这些跳过
                }

                // 第一个真正的业务调用栈
                location = String.format("%s.%s(%s:%d)",
                        element.getClassName(),
                        element.getMethodName(),
                        element.getFileName(),
                        element.getLineNumber());
                break;
            }

            return String.format("[%s] [%s] [%s] %s%n",
                    getLogLevel(record.getLevel()),
                    location,
                    Thread.currentThread().getName(),
                    record.getMessage());
        }

        private String getLogLevel(Level level) {
            if (level == Level.FINE) {
                return LOGGER_LEVEL_DEBUG;
            }

            if (level == Level.SEVERE) {
                return LOGGER_LEVEL_ERROR;
            }

            return level.getName();
        }
    }


}
