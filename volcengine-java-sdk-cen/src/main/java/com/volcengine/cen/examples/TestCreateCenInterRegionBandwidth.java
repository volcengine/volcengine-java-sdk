package com.volcengine.cen.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.cen.CenApi;
import com.volcengine.cen.model.*;

import java.util.*;


public class TestCreateCenInterRegionBandwidth {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        CenApi api = new CenApi(apiClient);
        
        CreateCenInterRegionBandwidthRequest createCenInterRegionBandwidthRequest = new CreateCenInterRegionBandwidthRequest();
        createCenInterRegionBandwidthRequest.setBandwidth(1000);
        createCenInterRegionBandwidthRequest.setCenId("cen-7qthudw0ll6jmc****");
        createCenInterRegionBandwidthRequest.setLocalRegionId("cn-beijing");
        createCenInterRegionBandwidthRequest.setPeerRegionId("cn-nantong");
        
        try {
            CreateCenInterRegionBandwidthResponse response = api.createCenInterRegionBandwidth(createCenInterRegionBandwidthRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}