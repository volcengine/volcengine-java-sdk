package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestDescribeSecurityGroups {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        DescribeSecurityGroupsRequest describeSecurityGroupsRequest = new DescribeSecurityGroupsRequest();
        describeSecurityGroupsRequest.setVpcId("vpc-bp67acfmxazb4p****");
        
        try {
            DescribeSecurityGroupsResponse response = api.describeSecurityGroups(describeSecurityGroupsRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}