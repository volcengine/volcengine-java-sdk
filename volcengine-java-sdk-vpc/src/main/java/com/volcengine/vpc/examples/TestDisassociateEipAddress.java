/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.vpc.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;


public class TestDisassociateEipAddress {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        DisassociateEipAddressRequest disassociateEipAddressRequest = new DisassociateEipAddressRequest();
        disassociateEipAddressRequest.setAllocationId("eip-2ze7ujxscd****");
        
        try {
            DisassociateEipAddressResponse response = api.disassociateEipAddress(disassociateEipAddressRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}