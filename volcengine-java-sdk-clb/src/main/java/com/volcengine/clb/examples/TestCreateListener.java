package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestCreateListener {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        CreateListenerRequest createListenerRequest = new CreateListenerRequest();
        createListenerRequest.setAclIds(Arrays.asList("acl-3cj44nv0jhhxc6c6rrtet****"));
        createListenerRequest.setAclStatus("on");
        createListenerRequest.setAclType("black");
        createListenerRequest.setEnabled("on");
        createListenerRequest.setEstablishedTimeout(122);
        createListenerRequest.setListenerName("mylistener");
        createListenerRequest.setLoadBalancerId("clb-bp1o94dp5i6ea****");
        createListenerRequest.setPort(12);
        createListenerRequest.setProtocol("TCP");
        createListenerRequest.setScheduler("wrr");
        createListenerRequest.setServerGroupId("rsp-bp1o94dp5i6ea****");
        
        try {
            CreateListenerResponse response = api.createListener(createListenerRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}