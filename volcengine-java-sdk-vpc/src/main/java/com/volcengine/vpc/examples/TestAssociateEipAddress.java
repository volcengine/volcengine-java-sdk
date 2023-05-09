package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestAssociateEipAddress {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        AssociateEipAddressRequest associateEipAddressRequest = new AssociateEipAddressRequest();
        associateEipAddressRequest.setAllocationId("eip-2zeewb7ujxscd****");
        associateEipAddressRequest.setInstanceId("i-2zebbhyczzaweeval****");
        associateEipAddressRequest.setInstanceType(AssociateEipAddressRequest.InstanceTypeEnum.valueOf(AssociateEipAddressRequest.InstanceTypeEnum.class, "EcsInstance"));
        
        try {
            AssociateEipAddressResponse response = api.associateEipAddress(associateEipAddressRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}