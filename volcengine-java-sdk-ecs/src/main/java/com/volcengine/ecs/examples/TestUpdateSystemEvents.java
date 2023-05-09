package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestUpdateSystemEvents {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        UpdateSystemEventsRequest updateSystemEventsRequest = new UpdateSystemEventsRequest();
        updateSystemEventsRequest.setEventIds(Arrays.asList("t-3ti9101aju3vj0******"));
        updateSystemEventsRequest.setStatus("Executing");
        
        try {
            UpdateSystemEventsResponse response = api.updateSystemEvents(updateSystemEventsRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}