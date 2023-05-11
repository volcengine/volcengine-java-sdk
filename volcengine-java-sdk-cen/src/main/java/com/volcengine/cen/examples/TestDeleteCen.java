/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.cen.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.cen.CenApi;
import com.volcengine.cen.model.*;


public class TestDeleteCen {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        CenApi api = new CenApi(apiClient);
        
        DeleteCenRequest deleteCenRequest = new DeleteCenRequest();
        deleteCenRequest.setCenId("cen-7qthudw0ll6jmc****");
        
        try {
            DeleteCenResponse response = api.deleteCen(deleteCenRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}