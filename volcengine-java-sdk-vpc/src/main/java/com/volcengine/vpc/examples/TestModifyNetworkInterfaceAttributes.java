package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestModifyNetworkInterfaceAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        ModifyNetworkInterfaceAttributesRequest modifyNetworkInterfaceAttributesRequest = new ModifyNetworkInterfaceAttributesRequest();
        modifyNetworkInterfaceAttributesRequest.setNetworkInterfaceName("test");
        
        try {
            ModifyNetworkInterfaceAttributesResponse response = api.modifyNetworkInterfaceAttributes(modifyNetworkInterfaceAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}