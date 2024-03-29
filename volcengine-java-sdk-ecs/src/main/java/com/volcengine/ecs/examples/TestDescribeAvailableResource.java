/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.ecs.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;


public class TestDescribeAvailableResource {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        DescribeAvailableResourceRequest describeAvailableResourceRequest = new DescribeAvailableResourceRequest();
        describeAvailableResourceRequest.setDestinationResource("InstanceType");
        describeAvailableResourceRequest.setInstanceTypeId("ecs.g2i.large");
        describeAvailableResourceRequest.setZoneId("cn-*****");
        
        try {
            DescribeAvailableResourceResponse response = api.describeAvailableResource(describeAvailableResourceRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}