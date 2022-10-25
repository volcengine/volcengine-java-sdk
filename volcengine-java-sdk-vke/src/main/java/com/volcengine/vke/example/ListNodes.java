package com.volcengine.vke.example;


import com.volcengine.ApiException;
import com.volcengine.vke.VkeApi;
import com.volcengine.vke.model.FilterForListNodesInput;
import com.volcengine.vke.model.ListNodesRequest;
import com.volcengine.vke.model.ListNodesResponse;

import java.util.Collections;

public class ListNodes {
    public static ListNodesResponse Call(VkeApi vkeApi, final Option opt) throws ApiException {
        ListNodesRequest request = new ListNodesRequest()
                .filter(new FilterForListNodesInput()
                        .nodePoolIds(Collections.singletonList(opt.getNodePoolId())));

        return vkeApi.listNodes(request);
    }

    public static class Option {
        private String nodePoolId;

        public String getNodePoolId() {
            return nodePoolId;
        }

        public Option setNodePoolId(String nodePoolId) {
            this.nodePoolId = nodePoolId;
            return this;
        }
    }
}
