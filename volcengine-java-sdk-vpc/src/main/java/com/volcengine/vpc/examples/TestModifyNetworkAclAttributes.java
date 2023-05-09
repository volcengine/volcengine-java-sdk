package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestModifyNetworkAclAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        ModifyNetworkAclAttributesRequest modifyNetworkAclAttributesRequest = new ModifyNetworkAclAttributesRequest();
        modifyNetworkAclAttributesRequest.setDescription("testDescription");
        modifyNetworkAclAttributesRequest.setNetworkAclId("acl-bp1fg655nh68xyz9****");
        modifyNetworkAclAttributesRequest.setNetworkAclName("test-acl");
        
        try {
            ModifyNetworkAclAttributesResponse response = api.modifyNetworkAclAttributes(modifyNetworkAclAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}