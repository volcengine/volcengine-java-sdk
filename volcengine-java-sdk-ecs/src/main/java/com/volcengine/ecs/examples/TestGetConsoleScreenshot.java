/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.ecs.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;


public class TestGetConsoleScreenshot {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        GetConsoleScreenshotRequest getConsoleScreenshotRequest = new GetConsoleScreenshotRequest();
        getConsoleScreenshotRequest.setInstanceId("i-3tiefmkskq3vj0******");
        
        try {
            GetConsoleScreenshotResponse response = api.getConsoleScreenshot(getConsoleScreenshotRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}