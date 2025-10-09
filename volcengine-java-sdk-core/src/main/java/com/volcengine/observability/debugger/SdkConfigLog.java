package com.volcengine.observability.debugger;

import com.volcengine.endpoint.EndpointResolver;
import com.volcengine.retryer.BackoffStrategy;
import com.volcengine.retryer.RetryCondition;
import com.volcengine.version.Version;

import java.util.Set;

import static com.volcengine.utils.ConstantsUtil.NEW_LINE;
import static com.volcengine.observability.debugger.SdkDebugLog.SDK_CORE_LOGGER;

public class SdkConfigLog {

    private String logBuffer = "";

    /****SDK版本****/
    private String sdkVersion = Version.SDK_VERSION;

    /****连接池配置****/
    private int maxIdleConns;
    private long keepAliveDurationMs;

    /****ssl设置****/
    private boolean disableSSL;
    private boolean verifyingSsl;

    /****代理设置****/
    private String httpProxy;
    private String httpsProxy;

    /****超时设置****/
    private int connectTimeout;
    private int readTimeout;
    private int writeTimeout;

    /****重试设置****/
    private boolean autoRetry;
    private long minRetryDelayMs;
    private long maxRetryDelayMs;
    private RetryCondition retryCondition;
    private BackoffStrategy backoffStrategy;
    private Set<String> retryErrorCode;

    /****endpointResolver设置****/
    private String region;
    private String endpoint;
    private Boolean useDualStack;
    private Set<String> customBootstrapRegion;
    private EndpointResolver endpointResolver;

    /**
     * 输出sdk配置信息
     */
    public void log(){
        if (logBuffer!=null && !logBuffer.isEmpty()){
            SDK_CORE_LOGGER.debugConfig(logBuffer);
            return;
        }

        synchronized (this) {

            if (logBuffer!=null && !logBuffer.isEmpty()){
                SDK_CORE_LOGGER.debugConfig(logBuffer);
                return;
            }

            StringBuilder sb = new StringBuilder();
            sb.append("========================= SDK CONFIGURATION =========================").append(NEW_LINE);
            sb.append("SDK Version        : ").append(sdkVersion).append(NEW_LINE);

            // 连接池配置
            sb.append("[Connection Pool]").append(NEW_LINE);
            sb.append("  Max Idle Conns   : ").append(maxIdleConns).append(NEW_LINE);
            sb.append("  KeepAlive (ms)   : ").append(keepAliveDurationMs).append(NEW_LINE);

            // SSL 设置
            sb.append("[SSL]").append(NEW_LINE);
            sb.append("  Disable SSL      : ").append(disableSSL).append(NEW_LINE);
            sb.append("  Verifying SSL    : ").append(verifyingSsl).append(NEW_LINE);

            // 代理设置（隐藏部分信息避免敏感泄露）
            sb.append("[Proxy]").append(NEW_LINE);
            sb.append("  HTTP Proxy       : ").append(httpProxy).append(NEW_LINE);
            sb.append("  HTTPS Proxy      : ").append(httpsProxy).append(NEW_LINE);

            // 超时设置
            sb.append("[Timeout]").append(NEW_LINE);
            sb.append("  Connect Timeout(ms)  : ").append(connectTimeout).append(NEW_LINE);
            sb.append("  Read Timeout(ms)     : ").append(readTimeout).append(NEW_LINE);
            sb.append("  Write Timeout(ms)    : ").append(writeTimeout).append(NEW_LINE);

            // 重试设置
            sb.append("[Retry]").append(NEW_LINE);
            sb.append("  Auto Retry       : ").append(autoRetry).append(NEW_LINE);
            sb.append("  Min Delay (ms)   : ").append(minRetryDelayMs).append(NEW_LINE);
            sb.append("  Max Delay (ms)   : ").append(maxRetryDelayMs).append(NEW_LINE);
            sb.append("  Retry Condition  : ").append(retryCondition != null ? retryCondition.getClass().getSimpleName() : "null").append(NEW_LINE);
            sb.append("  Backoff Strategy : ").append(backoffStrategy != null ? backoffStrategy.getClass().getSimpleName() : "null").append(NEW_LINE);
            sb.append("  Retry ErrorCodes : ").append(retryErrorCode).append(NEW_LINE);

            // Endpoint Resolver 设置
            sb.append("[Endpoint Resolver]").append(NEW_LINE);
            sb.append("  Region           : ").append(region).append(NEW_LINE);
            sb.append("  Endpoint         : ").append(endpoint).append(NEW_LINE);
            sb.append("  Use DualStack    : ").append(useDualStack).append(NEW_LINE);
            sb.append("  Bootstrap Region : ").append(customBootstrapRegion).append(NEW_LINE);
            sb.append("  Resolver Class   : ").append(endpointResolver != null ? endpointResolver.getClass().getSimpleName() : "null").append(NEW_LINE);

            sb.append("====================================================================").append(NEW_LINE);

            this.logBuffer = sb.toString();
            SDK_CORE_LOGGER.debugConfig(this.logBuffer);
        }

    }

    public void setMaxIdleConns(int maxIdleConns) {
        this.maxIdleConns = maxIdleConns;
    }

    public void setKeepAliveDurationMs(long keepAliveDurationMs) {
        this.keepAliveDurationMs = keepAliveDurationMs;
    }

    public void setDisableSSL(boolean disableSSL) {
        this.disableSSL = disableSSL;
    }

    public void setVerifyingSsl(boolean verifyingSsl) {
        this.verifyingSsl = verifyingSsl;
    }

    public void setHttpProxy(String httpProxy) {
        this.httpProxy = httpProxy;
    }

    public void setHttpsProxy(String httpsProxy) {
        this.httpsProxy = httpsProxy;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public void setWriteTimeout(int writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    public void setAutoRetry(boolean autoRetry) {
        this.autoRetry = autoRetry;
    }

    public void setMinRetryDelayMs(long minRetryDelayMs) {
        this.minRetryDelayMs = minRetryDelayMs;
    }

    public void setMaxRetryDelayMs(long maxRetryDelayMs) {
        this.maxRetryDelayMs = maxRetryDelayMs;
    }

    public void setRetryCondition(RetryCondition retryCondition) {
        this.retryCondition = retryCondition;
    }

    public void setBackoffStrategy(BackoffStrategy backoffStrategy) {
        this.backoffStrategy = backoffStrategy;
    }

    public void setRetryErrorCode(Set<String> retryErrorCode) {
        this.retryErrorCode = retryErrorCode;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public void setUseDualStack(Boolean useDualStack) {
        this.useDualStack = useDualStack;
    }

    public void setCustomBootstrapRegion(Set<String> customBootstrapRegion) {
        this.customBootstrapRegion = customBootstrapRegion;
    }

    public void setEndpointResolver(EndpointResolver endpointResolver) {
        this.endpointResolver = endpointResolver;
    }
}
