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


public class TestDescribeAcls {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        DescribeAclsRequest describeAclsRequest = new DescribeAclsRequest();
        describeAclsRequest.setAclIds(Arrays.asList("acl-3cj44nv0jhhxc6c6rrtet****"));
        
        try {
            DescribeAclsResponse response = api.describeAcls(describeAclsRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}