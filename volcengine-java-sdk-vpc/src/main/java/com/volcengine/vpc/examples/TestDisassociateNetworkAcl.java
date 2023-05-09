package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestDisassociateNetworkAcl {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        ResourceForDisassociateNetworkAclInput reqResource0 = new ResourceForDisassociateNetworkAclInput();
        reqResource0.setResourceId("subnet-67acfmxazb4p****");
        
        ResourceForDisassociateNetworkAclInput reqResource1 = new ResourceForDisassociateNetworkAclInput();
        reqResource1.setResourceId("subnet-g655nh68xyz9****");
        
        DisassociateNetworkAclRequest disassociateNetworkAclRequest = new DisassociateNetworkAclRequest();
        disassociateNetworkAclRequest.setNetworkAclId("nacl-bp1fg655nh68xyz9****");
        disassociateNetworkAclRequest.setResource(Arrays.asList(reqResource0, reqResource1));
        
        try {
            DisassociateNetworkAclResponse response = api.disassociateNetworkAcl(disassociateNetworkAclRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}