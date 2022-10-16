package com.volcengine.vke.example;

import com.volcengine.ApiException;
import com.volcengine.vke.VkeApi;
import com.volcengine.vke.model.FilterForListNodePoolsInput;
import com.volcengine.vke.model.ItemForListNodePoolsOutput;
import com.volcengine.vke.model.ListNodePoolsRequest;
import com.volcengine.vke.model.ListNodePoolsResponse;

import java.util.Collections;

public class GetNodePool {
    public static ItemForListNodePoolsOutput Call(VkeApi vkeApi, final Option opt) throws ApiException, ItemsCountException {
        ListNodePoolsRequest request = new ListNodePoolsRequest()
                .filter(new FilterForListNodePoolsInput()
                        .ids(Collections.singletonList(opt.getNodePoolId())));

        ListNodePoolsResponse response = vkeApi.listNodePools(request);
        if (response.getItems().size() != 1) {
            throw new ItemsCountException("get node pool resp items must be 1");
        }
        return response.getItems().get(0);
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

    static class ItemsCountException extends Exception {
        public ItemsCountException(String msg) {
            super(msg);
        }
    }
}
