/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.natgateway.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.natgateway.NatgatewayApi;
import com.volcengine.natgateway.model.*;


public class TestModifyDnatEntryAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        NatgatewayApi api = new NatgatewayApi(apiClient);
        
        ModifyDnatEntryAttributesRequest modifyDnatEntryAttributesRequest = new ModifyDnatEntryAttributesRequest();
        modifyDnatEntryAttributesRequest.setDnatEntryId("dnat-342abc3bc3****");
        modifyDnatEntryAttributesRequest.setInternalIp("192.XX.XX.88");
        
        try {
            ModifyDnatEntryAttributesResponse response = api.modifyDnatEntryAttributes(modifyDnatEntryAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}