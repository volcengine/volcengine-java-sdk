/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.vpc.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;
import java.util.*;


public class TestUpdateNetworkAclEntries {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        EgressAclEntryForUpdateNetworkAclEntriesInput reqEgressAclEntries = new EgressAclEntryForUpdateNetworkAclEntriesInput();
        reqEgressAclEntries.setDescription("ThisisEgressAclEntries01.");
        reqEgressAclEntries.setDestinationCidrIp("10.XX.XX.0/24");
        reqEgressAclEntries.setNetworkAclEntryId("nae-2zecs97e0brcge46****");
        reqEgressAclEntries.setNetworkAclEntryName("acl-01");
        reqEgressAclEntries.setPolicy("accept");
        reqEgressAclEntries.setPort("-1/-1");
        reqEgressAclEntries.setProtocol("all");
        
        EgressAclEntryForUpdateNetworkAclEntriesInput reqEgressAclEntries1 = new EgressAclEntryForUpdateNetworkAclEntriesInput();
        reqEgressAclEntries1.setDescription("ThisisEgressAclEntries02.");
        reqEgressAclEntries1.setDestinationCidrIp("10.XX.XX.0/24");
        reqEgressAclEntries1.setNetworkAclEntryId("nae-0iswk4d88jvds****");
        reqEgressAclEntries1.setNetworkAclEntryName("acl-02");
        reqEgressAclEntries1.setPolicy("accept");
        reqEgressAclEntries1.setPort("80/80");
        reqEgressAclEntries1.setProtocol("icmp");
        
        IngressAclEntryForUpdateNetworkAclEntriesInput reqIngressAclEntries = new IngressAclEntryForUpdateNetworkAclEntriesInput();
        reqIngressAclEntries.setDescription("ThisisIngressAclEntries01.");
        reqIngressAclEntries.setNetworkAclEntryId("nae-2zepn32de59j8m4****");
        reqIngressAclEntries.setNetworkAclEntryName("acl-3***");
        reqIngressAclEntries.setPolicy("accept");
        reqIngressAclEntries.setPort("22/22");
        reqIngressAclEntries.setProtocol("all");
        reqIngressAclEntries.setSourceCidrIp("10.XX.XX.0/24");
        
        IngressAclEntryForUpdateNetworkAclEntriesInput reqIngressAclEntries1 = new IngressAclEntryForUpdateNetworkAclEntriesInput();
        reqIngressAclEntries1.setDescription("ThisisIngressAclEntries02.");
        reqIngressAclEntries1.setNetworkAclEntryId("nae-xyz2dmndek90e****");
        reqIngressAclEntries1.setNetworkAclEntryName("acl-es***");
        reqIngressAclEntries1.setPolicy("");
        reqIngressAclEntries1.setPort("80/80");
        reqIngressAclEntries1.setProtocol("tcp");
        reqIngressAclEntries1.setSourceCidrIp("10.XX.XX.0/24");
        
        UpdateNetworkAclEntriesRequest updateNetworkAclEntriesRequest = new UpdateNetworkAclEntriesRequest();
        updateNetworkAclEntriesRequest.setEgressAclEntries(Arrays.asList(reqEgressAclEntries, reqEgressAclEntries1));
        updateNetworkAclEntriesRequest.setIngressAclEntries(Arrays.asList(reqIngressAclEntries, reqIngressAclEntries1));
        updateNetworkAclEntriesRequest.setNetworkAclId("nacl-bp1fg655nh68xyz9****");
        updateNetworkAclEntriesRequest.setUpdateEgressAclEntries(false);
        updateNetworkAclEntriesRequest.setUpdateIngressAclEntries(false);
        
        try {
            UpdateNetworkAclEntriesResponse response = api.updateNetworkAclEntries(updateNetworkAclEntriesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}