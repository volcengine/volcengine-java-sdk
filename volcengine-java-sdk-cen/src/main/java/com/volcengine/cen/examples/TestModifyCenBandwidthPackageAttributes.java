/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.cen.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.cen.CenApi;
import com.volcengine.cen.model.*;


public class TestModifyCenBandwidthPackageAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        CenApi api = new CenApi(apiClient);
        
        ModifyCenBandwidthPackageAttributesRequest modifyCenBandwidthPackageAttributesRequest = new ModifyCenBandwidthPackageAttributesRequest();
        modifyCenBandwidthPackageAttributesRequest.setBandwidth(100);
        modifyCenBandwidthPackageAttributesRequest.setCenBandwidthPackageId("cbp-4c2zaavbvh5fx****");
        
        try {
            ModifyCenBandwidthPackageAttributesResponse response = api.modifyCenBandwidthPackageAttributes(modifyCenBandwidthPackageAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}