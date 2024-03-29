/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.storageebs.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.storageebs.StorageEbsApi;
import com.volcengine.storageebs.model.*;


public class TestDetachVolume {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        StorageEbsApi api = new StorageEbsApi(apiClient);
        
        DetachVolumeRequest detachVolumeRequest = new DetachVolumeRequest();
        detachVolumeRequest.setInstanceId("i-3tir90q84q3vj0x1****");
        detachVolumeRequest.setVolumeId("vol-3tir92lne23vj0x1****");
        
        try {
            DetachVolumeResponse response = api.detachVolume(detachVolumeRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}