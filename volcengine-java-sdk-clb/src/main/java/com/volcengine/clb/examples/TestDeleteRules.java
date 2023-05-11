/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.clb.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;
import java.util.*;


public class TestDeleteRules {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        DeleteRulesRequest deleteRulesRequest = new DeleteRulesRequest();
        deleteRulesRequest.setListenerId("lsn-2fek3rgsxhrsw5oxruwec****");
        deleteRulesRequest.setRuleIds(Arrays.asList("rule-2fegss1cplxxc5oxruvvq****"));
        
        try {
            DeleteRulesResponse response = api.deleteRules(deleteRulesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}