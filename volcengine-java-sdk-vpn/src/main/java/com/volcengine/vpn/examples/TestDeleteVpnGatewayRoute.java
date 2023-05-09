package com.volcengine.vpn.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpn.VpnApi;
import com.volcengine.vpn.model.*;

import java.util.*;


public class TestDeleteVpnGatewayRoute {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpnApi api = new VpnApi(apiClient);
        
        DeleteVpnGatewayRouteRequest deleteVpnGatewayRouteRequest = new DeleteVpnGatewayRouteRequest();
        deleteVpnGatewayRouteRequest.setVpnGatewayRouteId("vgr-7qthudw0ll6jmc****");
        
        try {
            DeleteVpnGatewayRouteResponse response = api.deleteVpnGatewayRoute(deleteVpnGatewayRouteRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}