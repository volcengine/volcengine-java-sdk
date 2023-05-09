package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestDescribeListeners {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        DescribeListenersRequest describeListenersRequest = new DescribeListenersRequest();
        describeListenersRequest.setListenerIds(Arrays.asList("lsn-2fek3rgsxhrsw5oxr****"));
        describeListenersRequest.setListenerName("test");
        describeListenersRequest.setLoadBalancerId("clb-bp1o94dp5i6ea****");
        describeListenersRequest.setPageNumber(1);
        describeListenersRequest.setPageSize(20);
        
        try {
            DescribeListenersResponse response = api.describeListeners(describeListenersRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}