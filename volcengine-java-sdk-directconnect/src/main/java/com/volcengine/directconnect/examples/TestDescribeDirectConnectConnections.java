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


public class TestDescribeDirectConnectConnections {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        DirectconnectApi api = new DirectconnectApi(apiClient);
        
        DescribeDirectConnectConnectionsRequest describeDirectConnectConnectionsRequest = new DescribeDirectConnectConnectionsRequest();
        describeDirectConnectConnectionsRequest.setDirectConnectConnectionIds(Arrays.asList("dcc-7qthudw0ll6jmc****"));
        describeDirectConnectConnectionsRequest.setPageNumber(1);
        describeDirectConnectConnectionsRequest.setPageSize(20);
        
        try {
            DescribeDirectConnectConnectionsResponse response = api.describeDirectConnectConnections(describeDirectConnectConnectionsRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}