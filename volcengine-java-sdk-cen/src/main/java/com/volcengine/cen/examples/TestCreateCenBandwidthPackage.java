/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.cen.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.cen.CenApi;
import com.volcengine.cen.model.*;


public class TestCreateCenBandwidthPackage {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        CenApi api = new CenApi(apiClient);
        
        CreateCenBandwidthPackageRequest createCenBandwidthPackageRequest = new CreateCenBandwidthPackageRequest();
        createCenBandwidthPackageRequest.setCenBandwidthPackageName("cbp-test");
        createCenBandwidthPackageRequest.setCenId("cen-7qthudw0ll6jmc****");
        createCenBandwidthPackageRequest.setDescription("namedesc");
        createCenBandwidthPackageRequest.setLocalGeographicRegionSetId("China");
        createCenBandwidthPackageRequest.setPeerGeographicRegionSetId("China");
        
        try {
            CreateCenBandwidthPackageResponse response = api.createCenBandwidthPackage(createCenBandwidthPackageRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}