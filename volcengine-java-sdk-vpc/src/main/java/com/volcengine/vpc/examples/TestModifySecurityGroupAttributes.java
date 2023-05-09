package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestModifySecurityGroupAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        ModifySecurityGroupAttributesRequest modifySecurityGroupAttributesRequest = new ModifySecurityGroupAttributesRequest();
        modifySecurityGroupAttributesRequest.setSecurityGroupId("sg-bp67acfmxazb4p****");
        modifySecurityGroupAttributesRequest.setSecurityGroupName("test");
        
        try {
            ModifySecurityGroupAttributesResponse response = api.modifySecurityGroupAttributes(modifySecurityGroupAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}