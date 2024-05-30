package com.volcengine.ark.runtime;

//https://github.com/volcengine/volcengine-java-sdk
import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.ark.ArkApi;
import com.volcengine.ark.model.GetApiKeyRequest;
import com.volcengine.ark.model.GetApiKeyResponse;
import com.volcengine.sign.Credentials;

import java.util.ArrayList;
import java.util.List;

public class GetApiKeyExample {
    public static void main(String[] args) {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak,sk))
                .setRegion(region);
        ArkApi arkApi = new ArkApi(apiClient);
        GetApiKeyRequest r = new GetApiKeyRequest();
        r.durationSeconds(30*24*3600);
        r.resourceType("endpoint");
        List<String> list = new ArrayList<>();
        list.add("${YOUR_ENDPOINT_ID}");

        r.resourceIds(list);
        try {
            GetApiKeyResponse response = arkApi.getApiKey(r);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }

}
