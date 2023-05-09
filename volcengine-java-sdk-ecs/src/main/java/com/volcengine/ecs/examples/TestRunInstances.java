package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestRunInstances {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        NetworkInterfaceForRunInstancesInput reqNetworkInterfaces0 = new NetworkInterfaceForRunInstancesInput();
        reqNetworkInterfaces0.setSecurityGroupIds(Arrays.asList("sg-3ti78x9h8t4bw*****"));
        reqNetworkInterfaces0.setSubnetId("subnet-3tispp1nai4e8i****");
        
        VolumeForRunInstancesInput reqVolumes0 = new VolumeForRunInstancesInput();
        reqVolumes0.setSize(40);
        reqVolumes0.setVolumeType("ESSD_PL0");
        
        RunInstancesRequest runInstancesRequest = new RunInstancesRequest();
        runInstancesRequest.setCount(1);
        runInstancesRequest.setImageId("image-3tefr6wgx63vj0******");
        runInstancesRequest.setInstanceName("instance-test");
        runInstancesRequest.setInstanceTypeId("ecs.g1ie.xlarge");
        runInstancesRequest.setNetworkInterfaces(Arrays.asList(reqNetworkInterfaces0));
        runInstancesRequest.setPassword("password@123");
        runInstancesRequest.setVolumes(Arrays.asList(reqVolumes0));
        runInstancesRequest.setZoneId("cn-beijing-a");
        
        try {
            RunInstancesResponse response = api.runInstances(runInstancesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}