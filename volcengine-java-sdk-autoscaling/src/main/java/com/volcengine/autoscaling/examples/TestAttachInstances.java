/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.autoscaling.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.autoscaling.AutoScalingApi;
import com.volcengine.autoscaling.model.*;
import java.util.*;


public class TestAttachInstances {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        AutoScalingApi api = new AutoScalingApi(apiClient);
        
        AttachInstancesRequest attachInstancesRequest = new AttachInstancesRequest();
        attachInstancesRequest.setInstanceIds(Arrays.asList("i-ybmike5l70l8j1ha****"));
        attachInstancesRequest.setScalingGroupId("scg-ybmssdnnhn5pkgyd****");
        
        try {
            AttachInstancesResponse response = api.attachInstances(attachInstancesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}