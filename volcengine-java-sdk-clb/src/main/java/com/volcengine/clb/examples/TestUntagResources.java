/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.clb.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;
import java.util.*;


public class TestUntagResources {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        UntagResourcesRequest untagResourcesRequest = new UntagResourcesRequest();
        untagResourcesRequest.setResourceIds(Arrays.asList("clb-273sdsdsxxxxxp8u2j****", "clb-2fe6fszjgeznk5oxruv0u****"));
        untagResourcesRequest.setResourceType(UntagResourcesRequest.ResourceTypeEnum.valueOf(UntagResourcesRequest.ResourceTypeEnum.class, "CLB"));
        untagResourcesRequest.setTagKeys(Arrays.asList("k1", "k2"));
        
        try {
            UntagResourcesResponse response = api.untagResources(untagResourcesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}