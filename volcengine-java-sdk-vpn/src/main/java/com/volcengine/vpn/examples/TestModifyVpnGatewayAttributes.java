package com.volcengine.vpn.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpn.VpnApi;
import com.volcengine.vpn.model.*;

import java.util.*;


public class TestModifyVpnGatewayAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpnApi api = new VpnApi(apiClient);
        
        ModifyVpnGatewayAttributesRequest modifyVpnGatewayAttributesRequest = new ModifyVpnGatewayAttributesRequest();
        modifyVpnGatewayAttributesRequest.setBandwidth(10);
        modifyVpnGatewayAttributesRequest.setDescription("test");
        modifyVpnGatewayAttributesRequest.setVpnGatewayId("vgw-12bfa2du7fojk17q7y1rk****");
        modifyVpnGatewayAttributesRequest.setVpnGatewayName("test");
        
        try {
            ModifyVpnGatewayAttributesResponse response = api.modifyVpnGatewayAttributes(modifyVpnGatewayAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}