/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.cen.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.cen.CenApi;
import com.volcengine.cen.model.*;


public class TestDeleteCenBandwidthPackage {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        CenApi api = new CenApi(apiClient);
        
        DeleteCenBandwidthPackageRequest deleteCenBandwidthPackageRequest = new DeleteCenBandwidthPackageRequest();
        deleteCenBandwidthPackageRequest.setCenBandwidthPackageId("cbp-4c2zaavbvh5f42****");
        
        try {
            DeleteCenBandwidthPackageResponse response = api.deleteCenBandwidthPackage(deleteCenBandwidthPackageRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}