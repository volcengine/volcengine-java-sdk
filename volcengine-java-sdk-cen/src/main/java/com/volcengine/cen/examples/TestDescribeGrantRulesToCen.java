/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.cen.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.cen.CenApi;
import com.volcengine.cen.model.*;


public class TestDescribeGrantRulesToCen {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        CenApi api = new CenApi(apiClient);
        
        DescribeGrantRulesToCenRequest describeGrantRulesToCenRequest = new DescribeGrantRulesToCenRequest();
        describeGrantRulesToCenRequest.setCenId("cen-uf6o8d1dj8sjwxi6o****");
        
        try {
            DescribeGrantRulesToCenResponse response = api.describeGrantRulesToCen(describeGrantRulesToCenRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}