/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.clb.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;


public class TestDescribeRules {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        DescribeRulesRequest describeRulesRequest = new DescribeRulesRequest();
        describeRulesRequest.setListenerId("lsn-2fea4ayvu2g3k5oxruuz****");
        
        try {
            DescribeRulesResponse response = api.describeRules(describeRulesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}