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
                return true;
            }

            statusCode = apiException.getCode();
            errorCode = getErrorCode(apiException.getResponseMetadata());
        }

        if (response != null) {
            statusCode = response.getStatusCode();
            if (response.getData() != null) {
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
            return true;
        }

        if (retryErrorCodes.contains(errorCode)) {
            return true;
        }

        return false;
    }

    private <T> T getErrorCodeFromMap(Map<String, Object> map, Class<T> responseType, String ... keys) {
        if (map == null || keys == null || keys.length == 0) {
            return null;
        }
        Map<String, Object> currentMap = map;
        for (int i = 0; i < keys.length; i++) {
            String key = keys[i];
            if (!currentMap.containsKey(key)){
                break;
            }
            Object value = currentMap.get(key);
            if (i < keys.length - 1) {      // 还没到最后一层
                if (!(value instanceof Map)){
                    return null;
                }
                currentMap = (Map<String, Object>) value;
            }else {
                return responseType.cast(value);
            }
        }
        return null;
    }

    private String getErrorCode(ResponseMetadata responseMetadata) {
        if (responseMetadata != null && responseMetadata.getError() != null ) {
            return responseMetadata.getError().getCode();
        }
        return null;
    }

}
