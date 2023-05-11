/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.vpc.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;


public class TestAssociateRouteTable {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        AssociateRouteTableRequest associateRouteTableRequest = new AssociateRouteTableRequest();
        associateRouteTableRequest.setRouteTableId("vtb-2fdzao4h726f45****");
        associateRouteTableRequest.setSubnetId("subnet-2fdzaou4liw3k5oxruv****");
        
        try {
            AssociateRouteTableResponse response = api.associateRouteTable(associateRouteTableRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}