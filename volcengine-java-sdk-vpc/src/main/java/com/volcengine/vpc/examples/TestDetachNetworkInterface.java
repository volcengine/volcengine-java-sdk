/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.vpc.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;


public class TestDetachNetworkInterface {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        DetachNetworkInterfaceRequest detachNetworkInterfaceRequest = new DetachNetworkInterfaceRequest();
        detachNetworkInterfaceRequest.setInstanceId("i-wijfn35c****");
        detachNetworkInterfaceRequest.setNetworkInterfaceId("eni-bp1fgn8xyz9****");
        
        try {
            DetachNetworkInterfaceResponse response = api.detachNetworkInterface(detachNetworkInterfaceRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}