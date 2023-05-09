package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestCreateDeploymentSet {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        CreateDeploymentSetRequest createDeploymentSetRequest = new CreateDeploymentSetRequest();
        createDeploymentSetRequest.setDeploymentSetName("testDeploymentSetName");
        createDeploymentSetRequest.setGranularity("host");
        createDeploymentSetRequest.setStrategy("Availability");
        
        try {
            CreateDeploymentSetResponse response = api.createDeploymentSet(createDeploymentSetRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}