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


public class TestTagResources {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        TagForTagResourcesInput reqTags = new TagForTagResourcesInput();
        reqTags.setKey("k1");
        reqTags.setValue("v1");
        
        TagForTagResourcesInput reqTags1 = new TagForTagResourcesInput();
        reqTags1.setKey("k2");
        reqTags1.setValue("v2");
        
        TagResourcesRequest tagResourcesRequest = new TagResourcesRequest();
        tagResourcesRequest.setResourceIds(Arrays.asList("clb-273sdsdsxxxxxp8u2j****", "clb-2fe6fszjgeznk5oxruv0u****"));
        tagResourcesRequest.setResourceType(TagResourcesRequest.ResourceTypeEnum.valueOf(TagResourcesRequest.ResourceTypeEnum.class, "CLB"));
        tagResourcesRequest.setTags(Arrays.asList(reqTags, reqTags1));
        
        try {
            TagResourcesResponse response = api.tagResources(tagResourcesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}