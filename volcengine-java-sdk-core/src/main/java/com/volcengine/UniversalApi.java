package com.volcengine;

import com.google.gson.reflect.TypeToken;

import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * xuyaming@bytedance.com
 * 2022/12/23 15:21
 */
public class UniversalApi {
    private ApiClient apiClient;

    public UniversalApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public UniversalApi() {
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public Map<String, Object> doCall(UniversalRequest info, Map<String, Object> input) throws ApiException {
        ApiResponse<Map<String, Object>> resp = doCallWithHttpInfo(info, input);
        return resp.getData();
    }

    public ApiResponse<Map<String, Object>> doCallWithHttpInfo(@NotNull UniversalRequest info, @NotNull Map<String, Object> input) throws ApiException {
        com.squareup.okhttp.Call call = doCallValidateBeforeCall(info, input, null, null);
        Type localVarReturnType = new TypeToken<Map<String, Object>>() {
        }.getType();
        ApiResponse<Map<String, Object>> obj = apiClient.execute(call, localVarReturnType,true);
        processNumber(obj.getData());
        return obj;
    }

    @SuppressWarnings("unchecked")
    private void processNumber(Map<String,Object> map){
        for (Map.Entry<String,Object> entry:map.entrySet()){
            if (entry.getValue()!= null && entry.getValue() instanceof Map){
                processNumber((Map<String,Object>)entry.getValue());
            }
            if (entry.getValue()!=null  && isNumeric(entry.getValue().toString()) && entry.getValue().toString().contains(".") && entry.getValue().toString().endsWith(".0")){
                entry.setValue(Double.valueOf(entry.getValue().toString()).longValue());
            }
        }
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    private com.squareup.okhttp.Call doCallValidateBeforeCall(UniversalRequest info, Map<String, Object> input, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (input == null) {
            throw new ApiException("Missing the required parameter 'input' when calling doCall(Async)");
        }
        com.squareup.okhttp.Call call = doCall(info, input, progressListener, progressRequestListener);
        return call;
    }

    private com.squareup.okhttp.Call doCall(UniversalRequest info, Map<String, Object> input, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // create path and map variables
        String localVarPath = String.format("/%s/%s/%s/%s/",info.getAction(),info.getVersion(),info.getServiceName(),info.getHttpMethod().GetMethod().toLowerCase());
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        localVarHeaderParams.put("Accept", "application/json");

        if (info.getContentType().GetType().equals("")){
            localVarHeaderParams.put("Content-Type", "text/plain");
        }else{
            localVarHeaderParams.put("Content-Type", info.getContentType().GetType());
        }

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "volcengineSign" };
        return apiClient.buildCall(localVarPath, info.getHttpMethod().GetMethod(), new ArrayList<Pair>(), new ArrayList<Pair>(), input, localVarHeaderParams,  new HashMap<String, Object>(), localVarAuthNames, progressRequestListener,true);
    }
}
