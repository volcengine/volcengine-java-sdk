package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestExportImage {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        ExportImageRequest exportImageRequest = new ExportImageRequest();
        exportImageRequest.setImageId("image-4431h3l7hl31a0******");
        exportImageRequest.setToSBucket("bucket-1");
        exportImageRequest.setToSPrefix("test123");
        
        try {
            ExportImageResponse response = api.exportImage(exportImageRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}