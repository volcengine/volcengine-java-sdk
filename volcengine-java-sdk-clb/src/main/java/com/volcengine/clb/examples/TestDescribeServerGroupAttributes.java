package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestDescribeServerGroupAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        DescribeServerGroupAttributesRequest describeServerGroupAttributesRequest = new DescribeServerGroupAttributesRequest();
        describeServerGroupAttributesRequest.setServerGroupId("rsp-bp1o94dp5i6ea****");
        
        try {
            DescribeServerGroupAttributesResponse response = api.describeServerGroupAttributes(describeServerGroupAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}