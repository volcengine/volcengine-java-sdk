package com.volcengine.cen.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.cen.CenApi;
import com.volcengine.cen.model.*;

import java.util.*;


public class TestCreateCenServiceRouteEntry {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        CenApi api = new CenApi(apiClient);
        
        CreateCenServiceRouteEntryRequest createCenServiceRouteEntryRequest = new CreateCenServiceRouteEntryRequest();
        createCenServiceRouteEntryRequest.setCenId("cen-2nim00ybaylts7trquyzt****");
        createCenServiceRouteEntryRequest.setDestinationCidrBlock("100.XX.XX.0/24");
        createCenServiceRouteEntryRequest.setServiceRegionId("cn-beijing");
        createCenServiceRouteEntryRequest.setServiceVpcId("vpc-3rlkeggyn6tc010exd32q****");
        
        try {
            CreateCenServiceRouteEntryResponse response = api.createCenServiceRouteEntry(createCenServiceRouteEntryRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}