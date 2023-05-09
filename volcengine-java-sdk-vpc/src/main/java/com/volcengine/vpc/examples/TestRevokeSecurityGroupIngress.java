package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestRevokeSecurityGroupIngress {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest = new RevokeSecurityGroupIngressRequest();
        revokeSecurityGroupIngressRequest.setCidrIp("10.XX.XX.0/8");
        revokeSecurityGroupIngressRequest.setPolicy("accept");
        revokeSecurityGroupIngressRequest.setPortEnd(22);
        revokeSecurityGroupIngressRequest.setPortStart(22);
        revokeSecurityGroupIngressRequest.setPriority(1);
        revokeSecurityGroupIngressRequest.setProtocol("tcp");
        revokeSecurityGroupIngressRequest.setSecurityGroupId("sg-bp67acfmxazb4p****");
        
        try {
            RevokeSecurityGroupIngressResponse response = api.revokeSecurityGroupIngress(revokeSecurityGroupIngressRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}