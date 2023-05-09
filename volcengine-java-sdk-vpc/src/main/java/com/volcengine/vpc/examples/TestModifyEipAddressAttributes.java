package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestModifyEipAddressAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        ModifyEipAddressAttributesRequest modifyEipAddressAttributesRequest = new ModifyEipAddressAttributesRequest();
        modifyEipAddressAttributesRequest.setAllocationId("eip-2zb7uj8xscd****");
        modifyEipAddressAttributesRequest.setBandwidth(10);
        
        try {
            ModifyEipAddressAttributesResponse response = api.modifyEipAddressAttributes(modifyEipAddressAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}