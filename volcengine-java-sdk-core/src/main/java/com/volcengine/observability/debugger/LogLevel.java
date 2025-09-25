package com.volcengine.observability.debugger;

public enum LogLevel {
    // 基础位（从低位 0 开始）
    LOG_DEBUG_OFF(0),
    LOG_DEBUG_WITH_REQUEST(1),
    LOG_DEBUG_WITH_REQUEST_BODY(2, LOG_DEBUG_WITH_REQUEST),
    LOG_DEBUG_WITH_REQUEST_ID(3, LOG_DEBUG_WITH_REQUEST),
    LOG_DEBUG_WITH_RESPONSE(4, LOG_DEBUG_WITH_REQUEST),
    LOG_DEBUG_WITH_RESPONSE_BODY(5, LOG_DEBUG_WITH_RESPONSE),
    LOG_DEBUG_WITH_SIGNING(6, LOG_DEBUG_WITH_REQUEST),
    LOG_DEBUG_WITH_ENDPOINT(7, LOG_DEBUG_WITH_REQUEST),
    LOG_DEBUG_WITH_REQUEST_RETRIES(8, LOG_DEBUG_WITH_REQUEST),
    LOG_DEBUG_WITH_CONFIG(9, LOG_DEBUG_WITH_REQUEST),
    // 特殊：代表“包含所有调试项”，mask 会在静态块里动态赋值
    LOG_DEBUG_ALL(-1);

    private final int bitIndex;
    private long mask; // 包含其自身 + 父级（若有）

    LogLevel(int bitIndex, LogLevel... parents) {
        this.bitIndex = bitIndex;
        if (bitIndex >= 0){
            long m = 1L << bitIndex;
            if (parents != null) {
                for (LogLevel p : parents) {
                    m |= p.mask; // 递归包含父级的 mask
                }
            }
            this.mask = m;
        }
    }

    /** 在类加载时计算 ALL 的 mask */
    static {
        long all = 0L;
        for (LogLevel l : values()) {
            if (l != LOG_DEBUG_OFF && l != LOG_DEBUG_ALL) {
                all |= l.mask;
            }
        }
        LOG_DEBUG_ALL.mask = all;
    }

    public long mask() {
        return mask;
    }

    /** 组合多个模式为 flags */
    public static long combine(LogLevel... modes) {
        if (modes.length == 0) {
            return LogLevel.LOG_DEBUG_OFF.mask;
        }
        long f = 0L;
        for (LogLevel m : modes) {
            f |= m.mask;
        }
        return f;
    }

    /** 判断当前模式是否包含某个标志位 */
    public boolean matches(long flags) {
        return (flags & mask) == mask;
    }

    private static class Test {
        public static void main(String[] args) {
            long flag = LogLevel.combine(LOG_DEBUG_WITH_REQUEST,LOG_DEBUG_WITH_RESPONSE, LOG_DEBUG_WITH_REQUEST_BODY);
            System.out.println(LOG_DEBUG_WITH_REQUEST.matches(flag));
            System.out.println(LOG_DEBUG_WITH_RESPONSE.matches(flag));
            System.out.println(LOG_DEBUG_WITH_REQUEST_BODY.matches(flag));

            long flag1 = LOG_DEBUG_ALL.mask;
            System.out.println(LOG_DEBUG_WITH_REQUEST.matches(flag1));
            System.out.println(LOG_DEBUG_WITH_RESPONSE.matches(flag1));
            System.out.println(LOG_DEBUG_WITH_REQUEST_BODY.matches(flag1));
        }
    }
}

