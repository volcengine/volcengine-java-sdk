/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.natgateway.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.natgateway.NatgatewayApi;
import com.volcengine.natgateway.model.*;


public class TestCreateSnatEntry {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        NatgatewayApi api = new NatgatewayApi(apiClient);
        
        CreateSnatEntryRequest createSnatEntryRequest = new CreateSnatEntryRequest();
        createSnatEntryRequest.setEipId("eip-2feaac9wtccn459gp67****");
        createSnatEntryRequest.setNatGatewayId("ngw-2fedgzyvtzaio59gp675****");
        createSnatEntryRequest.setSnatEntryName("snat-01");
        createSnatEntryRequest.setSubnetId("subnet-2fe1vklp295a859gp6766****");
        
        try {
            CreateSnatEntryResponse response = api.createSnatEntry(createSnatEntryRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}