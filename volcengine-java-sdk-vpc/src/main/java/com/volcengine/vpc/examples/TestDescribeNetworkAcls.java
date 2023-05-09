package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestDescribeNetworkAcls {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        DescribeNetworkAclsRequest describeNetworkAclsRequest = new DescribeNetworkAclsRequest();
        describeNetworkAclsRequest.setNetworkAclIds(Arrays.asList("acl-bp1fg655nh68xyz9****"));
        describeNetworkAclsRequest.setNetworkAclName("test-acl");
        describeNetworkAclsRequest.setPageNumber(1);
        describeNetworkAclsRequest.setPageSize(20);
        describeNetworkAclsRequest.setSubnetId("subnet-087k1y0owv0x57ku****");
        describeNetworkAclsRequest.setVpcId("vpc-bp1opxu1zkhn00gzv****");
        
        try {
            DescribeNetworkAclsResponse response = api.describeNetworkAcls(describeNetworkAclsRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}