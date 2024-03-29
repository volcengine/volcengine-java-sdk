/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.directconnect.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.directconnect.DirectconnectApi;
import com.volcengine.directconnect.model.*;


public class TestDeleteBgpPeer {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        DirectconnectApi api = new DirectconnectApi(apiClient);
        
        DeleteBgpPeerRequest deleteBgpPeerRequest = new DeleteBgpPeerRequest();
        deleteBgpPeerRequest.setBgpPeerId("bgp-2752hz4teko3k7fap8u4c****");
        
        try {
            DeleteBgpPeerResponse response = api.deleteBgpPeer(deleteBgpPeerRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}