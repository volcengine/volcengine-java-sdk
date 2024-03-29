/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.storageebs.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.storageebs.StorageEbsApi;
import com.volcengine.storageebs.model.*;


public class TestCreateVolume {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        StorageEbsApi api = new StorageEbsApi(apiClient);
        
        CreateVolumeRequest createVolumeRequest = new CreateVolumeRequest();
        createVolumeRequest.setDescription("test");
        createVolumeRequest.setKind("data");
        createVolumeRequest.setSize("40");
        createVolumeRequest.setVolumeName("test");
        createVolumeRequest.setVolumeType("PTSSD");
        createVolumeRequest.setZoneId("cn-beijing-a");
        
        try {
            CreateVolumeResponse response = api.createVolume(createVolumeRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}