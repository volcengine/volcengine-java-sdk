package com.volcengine;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.*;

/**
 * Same shape as a generated service client (see StsApi#assumeRole): the call
 * is built with a constant path carrying the service name and executed through
 * the ApiClient pipeline.
 */
public class FakeGeneratedStsApi {
    private final ApiClient apiClient;

    public FakeGeneratedStsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public com.squareup.okhttp.Call assumeRoleCall(Map<String, Object> body) throws ApiException {
        String localVarPath = "/AssumeRole/2018-01-01/sts/post/application_x-www-form-urlencoded/";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String localVarAccept = apiClient.selectHeaderAccept(new String[]{"application/json"});
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        localVarHeaderParams.put("Content-Type", apiClient.selectHeaderContentType(new String[]{"text/plain"}));
        String[] localVarAuthNames = new String[]{"volcengineSign"};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body,
                localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    public Map<String, Object> assumeRole(Map<String, Object> body) throws ApiException {
        Type localVarReturnType = new TypeToken<Map<String, Object>>() { }.getType();
        ApiResponse<Map<String, Object>> resp = apiClient.execute(assumeRoleCall(body), localVarReturnType);
        return resp.getData();
    }

    public com.squareup.okhttp.Call assumeRoleAsync(Map<String, Object> body, ApiCallback<Map<String, Object>> callback) throws ApiException {
        com.squareup.okhttp.Call call = assumeRoleCall(body);
        Type localVarReturnType = new TypeToken<Map<String, Object>>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
