package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestRevokeSecurityGroupEgress {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest = new RevokeSecurityGroupEgressRequest();
        revokeSecurityGroupEgressRequest.setCidrIp("10.XX.XX.0/8");
        revokeSecurityGroupEgressRequest.setPolicy("accept");
        revokeSecurityGroupEgressRequest.setPortEnd(22);
        revokeSecurityGroupEgressRequest.setPortStart(22);
        revokeSecurityGroupEgressRequest.setPriority(1);
        revokeSecurityGroupEgressRequest.setProtocol("tcp");
        revokeSecurityGroupEgressRequest.setSecurityGroupId("sg-bp67acfmxazb4p****");
        
        try {
            RevokeSecurityGroupEgressResponse response = api.revokeSecurityGroupEgress(revokeSecurityGroupEgressRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}