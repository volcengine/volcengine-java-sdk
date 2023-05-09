package com.volcengine.vpn.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpn.VpnApi;
import com.volcengine.vpn.model.*;

import java.util.*;


public class TestSetVpnGatewayRenewal {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpnApi api = new VpnApi(apiClient);
        
        SetVpnGatewayRenewalRequest setVpnGatewayRenewalRequest = new SetVpnGatewayRenewalRequest();
        setVpnGatewayRenewalRequest.setRenewType(3);
        setVpnGatewayRenewalRequest.setVpnGatewayId("vgw-2fe7zjsz13ksg5oxruwed****");
        
        try {
            SetVpnGatewayRenewalResponse response = api.setVpnGatewayRenewal(setVpnGatewayRenewalRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}