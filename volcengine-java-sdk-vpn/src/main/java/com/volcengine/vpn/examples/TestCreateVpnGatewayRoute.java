/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.vpn.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpn.VpnApi;
import com.volcengine.vpn.model.*;


public class TestCreateVpnGatewayRoute {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpnApi api = new VpnApi(apiClient);
        
        CreateVpnGatewayRouteRequest createVpnGatewayRouteRequest = new CreateVpnGatewayRouteRequest();
        createVpnGatewayRouteRequest.setDestinationCidrBlock("172.XX.XX.0/24");
        createVpnGatewayRouteRequest.setNextHopId("vgc-7qthudw0ll6jmc****");
        createVpnGatewayRouteRequest.setVpnGatewayId("vgw-12bfa2du7fojk17q7y1rk****");
        
        try {
            CreateVpnGatewayRouteResponse response = api.createVpnGatewayRoute(createVpnGatewayRouteRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}