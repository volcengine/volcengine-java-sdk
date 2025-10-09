package com.volcengine.retryer;

import com.volcengine.ApiException;
import com.volcengine.ApiResponse;
import com.volcengine.model.AbstractResponse;
import com.volcengine.model.ResponseMetadata;

import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static com.volcengine.observability.debugger.SdkDebugLog.SDK_CORE_LOGGER;

public class DefaultRetryCondition extends RetryCondition{

    private static final Set<Integer> RETRY_STATUS_CODES =  Collections.unmodifiableSet(
            new HashSet<>(Arrays.asList(429, 500, 502, 503, 504)));

    public DefaultRetryCondition() {
        this.retryErrorCodes = new HashSet<>();
    }

    protected DefaultRetryCondition(Set<String> retryErrorCodes) {
        this.retryErrorCodes = retryErrorCodes != null ? retryErrorCodes : new HashSet<String>();
    }

    @Override
    public boolean shouldRetry(ApiResponse response, ApiException apiException) {

        int statusCode = -1;
        String errorCode = null;

        if (apiException != null) {
            Throwable cause =  apiException.getCause();
            if (cause instanceof SocketTimeoutException ||
                    cause instanceof UnknownHostException ||
                    cause instanceof ConnectException ||
                    cause instanceof UnknownServiceException ||
                    cause instanceof SocketException
            ) {
                SDK_CORE_LOGGER.debugRetry("Retry triggered by network exception: {}, message: {}", cause.getClass().getName(), cause.getMessage());
                return true;
            }

            statusCode = apiException.getCode();
            errorCode = getErrorCode(apiException.getResponseMetadata());
        }

        if (response != null) {
            statusCode = response.getStatusCode();
            if (response.getData() != null) {
                SDK_CORE_LOGGER.debugRetry("Response data type: {}", response.getData().getClass().getName());
                if (response.getData() instanceof AbstractResponse) {
                    AbstractResponse abstractResponse = (AbstractResponse)response.getData();
                    errorCode = getErrorCode(abstractResponse.getResponseMetadata());
                }

                if (response.getData() instanceof Map){
                    Map<String, Object> map = (Map<String, Object>)response.getData();
                    errorCode = getErrorCodeFromMap(map, String.class,"ResponseMetadata", "Error", "Code");
                }

            }
        }

        if (RETRY_STATUS_CODES.contains(statusCode)) {
            SDK_CORE_LOGGER.debugRetry("Retry triggered by status code: {}", statusCode);
            return true;
        }

        if (retryErrorCodes.contains(errorCode)) {
            SDK_CORE_LOGGER.debugRetry("Retry triggered by error code: {}", errorCode);
            return true;
        }

        SDK_CORE_LOGGER.debugRetry("No retry condition met. StatusCode: {}, ErrorCode: {}", statusCode, errorCode);

        return false;
    }

    private <T> T getErrorCodeFromMap(Map<String, Object> map, Class<T> responseType, String ... keys) {
        if (map == null || keys == null || keys.length == 0) {
            return null;
        }

        SDK_CORE_LOGGER.debugRetry("Try to get error code from map, keys: {}", Arrays.toString(keys));

        Map<String, Object> currentMap = map;
        for (int i = 0; i < keys.length; i++) {
            String key = keys[i];
            if (!currentMap.containsKey(key)){
                SDK_CORE_LOGGER.debugRetry("Key '{}' not found in map.", key);
                break;
            }
            Object value = currentMap.get(key);
            if (i < keys.length - 1) {      // 还没到最后一层
                if (!(value instanceof Map)){
                    SDK_CORE_LOGGER.debugRetry("Value for key '{}' is not a map.", key);
                    return null;
                }
                currentMap = (Map<String, Object>) value;
            }else {
                SDK_CORE_LOGGER.debugRetry("Found value for keys '{}', value: {}", Arrays.toString(keys), value);
                return responseType.cast(value);
            }
        }

        SDK_CORE_LOGGER.debugRetry("Error code not found with keys: {}", Arrays.toString(keys));

        return null;
    }

    private String getErrorCode(ResponseMetadata responseMetadata) {
        if (responseMetadata != null && responseMetadata.getError() != null ) {
            return responseMetadata.getError().getCode();
        }

        SDK_CORE_LOGGER.debugRetry("Failed to get error code, response metadata or error is null.");

        return null;
    }

}
