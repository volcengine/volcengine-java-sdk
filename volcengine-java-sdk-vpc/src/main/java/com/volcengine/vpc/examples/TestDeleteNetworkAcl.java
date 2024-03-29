/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.vpc.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;


public class TestDeleteNetworkAcl {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        DeleteNetworkAclRequest deleteNetworkAclRequest = new DeleteNetworkAclRequest();
        deleteNetworkAclRequest.setNetworkAclId("acl-bp1fg655nh68xyz9****");
        
        try {
            DeleteNetworkAclResponse response = api.deleteNetworkAcl(deleteNetworkAclRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}