/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.vpc.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;
import java.util.*;


public class TestAssignPrivateIpAddresses {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        AssignPrivateIpAddressesRequest assignPrivateIpAddressesRequest = new AssignPrivateIpAddressesRequest();
        assignPrivateIpAddressesRequest.setNetworkInterfaceId("eni-bp67acfmxazb4p****");
        assignPrivateIpAddressesRequest.setPrivateIpAddress(Arrays.asList("192.168.XX.10", "192.168.XX.12"));
        
        try {
            AssignPrivateIpAddressesResponse response = api.assignPrivateIpAddresses(assignPrivateIpAddressesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}