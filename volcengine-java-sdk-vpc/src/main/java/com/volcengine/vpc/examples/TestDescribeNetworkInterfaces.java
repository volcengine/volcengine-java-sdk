/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.vpc.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;


public class TestDescribeNetworkInterfaces {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest = new DescribeNetworkInterfacesRequest();
        describeNetworkInterfacesRequest.setPageNumber(1);
        describeNetworkInterfacesRequest.setPageSize(100);
        describeNetworkInterfacesRequest.setVpcId("vpc-bp15zckdt37pq72zv****");
        
        try {
            DescribeNetworkInterfacesResponse response = api.describeNetworkInterfaces(describeNetworkInterfacesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}