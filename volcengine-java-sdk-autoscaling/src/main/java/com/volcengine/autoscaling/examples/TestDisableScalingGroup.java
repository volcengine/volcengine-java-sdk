/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.autoscaling.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.autoscaling.AutoScalingApi;
import com.volcengine.autoscaling.model.*;


public class TestDisableScalingGroup {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        AutoScalingApi api = new AutoScalingApi(apiClient);
        
        DisableScalingGroupRequest disableScalingGroupRequest = new DisableScalingGroupRequest();
        disableScalingGroupRequest.setScalingGroupId("scg-ybmssdnnhn5pkgyd****");
        
        try {
            DisableScalingGroupResponse response = api.disableScalingGroup(disableScalingGroupRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}