/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.directconnect.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.directconnect.DirectconnectApi;
import com.volcengine.directconnect.model.*;
import java.util.*;


public class TestDescribeBgpPeers {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        DirectconnectApi api = new DirectconnectApi(apiClient);
        
        DescribeBgpPeersRequest describeBgpPeersRequest = new DescribeBgpPeersRequest();
        describeBgpPeersRequest.setBgpPeerIds(Arrays.asList("bgp-2752hz4teko3k7f4c****"));
        describeBgpPeersRequest.setPageNumber(1);
        describeBgpPeersRequest.setPageSize(20);
        
        try {
            DescribeBgpPeersResponse response = api.describeBgpPeers(describeBgpPeersRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}