/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.autoscaling.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.autoscaling.AutoScalingApi;
import com.volcengine.autoscaling.model.*;
import java.util.*;


public class TestCreateScalingConfiguration {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        AutoScalingApi api = new AutoScalingApi(apiClient);
        
        VolumeForCreateScalingConfigurationInput reqVolumes = new VolumeForCreateScalingConfigurationInput();
        reqVolumes.setSize(20);
        reqVolumes.setVolumeType("PTSSD");
        
        CreateScalingConfigurationRequest createScalingConfigurationRequest = new CreateScalingConfigurationRequest();
        createScalingConfigurationRequest.setImageId("image-ybmhzqo8u4l8j1ii****");
        createScalingConfigurationRequest.setInstanceName("instance-test");
        createScalingConfigurationRequest.setInstanceTypes(Arrays.asList("ecs.g1.2xlarge"));
        createScalingConfigurationRequest.setPassword("root@123");
        createScalingConfigurationRequest.setScalingConfigurationName("scaling-config-test");
        createScalingConfigurationRequest.setScalingGroupId("scg-ybmssdnnhn5pkgyd****");
        createScalingConfigurationRequest.setSecurityGroupIds(Arrays.asList("sg-3ti78x9h8t4bw*****"));
        createScalingConfigurationRequest.setVolumes(Arrays.asList(reqVolumes));
        createScalingConfigurationRequest.setZoneId("cn-beijing-a");
        
        try {
            CreateScalingConfigurationResponse response = api.createScalingConfiguration(createScalingConfigurationRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}