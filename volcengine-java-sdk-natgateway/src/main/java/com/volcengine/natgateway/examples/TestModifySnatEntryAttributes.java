/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.natgateway.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.natgateway.NatgatewayApi;
import com.volcengine.natgateway.model.*;


public class TestModifySnatEntryAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        NatgatewayApi api = new NatgatewayApi(apiClient);
        
        ModifySnatEntryAttributesRequest modifySnatEntryAttributesRequest = new ModifySnatEntryAttributesRequest();
        modifySnatEntryAttributesRequest.setEipId("eip-2feaac9wtccn459gp67qe****");
        modifySnatEntryAttributesRequest.setSnatEntryId("snat-2fedi096gdiww59gp680r****");
        
        try {
            ModifySnatEntryAttributesResponse response = api.modifySnatEntryAttributes(modifySnatEntryAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}