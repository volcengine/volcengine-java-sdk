package com.volcengine.natgateway.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.natgateway.NatgatewayApi;
import com.volcengine.natgateway.model.*;

import java.util.*;


public class TestCreateNatGateway {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        NatgatewayApi api = new NatgatewayApi(apiClient);
        
        CreateNatGatewayRequest createNatGatewayRequest = new CreateNatGatewayRequest();
        createNatGatewayRequest.setSpec(CreateNatGatewayRequest.SpecEnum.valueOf(CreateNatGatewayRequest.SpecEnum.class, "Small"));
        createNatGatewayRequest.setSubnetId("subnet-2feypga30rgg059gp67ag****");
        createNatGatewayRequest.setVpcId("vpc-2feypfmenesqo59gp67yz****");
        
        try {
            CreateNatGatewayResponse response = api.createNatGateway(createNatGatewayRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}