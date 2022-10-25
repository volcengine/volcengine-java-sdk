package com.volcengine.vke.example;

import com.volcengine.ApiException;
import com.volcengine.vke.VkeApi;
import com.volcengine.vke.model.FilterForListClustersInput;
import com.volcengine.vke.model.ItemForListClustersOutput;
import com.volcengine.vke.model.ListClustersRequest;
import com.volcengine.vke.model.ListClustersResponse;

import java.util.Collections;

public class GetCluster {
    public static ItemForListClustersOutput Call(VkeApi vkeApi, final Option opt) throws ApiException, ItemsCountException {
        ListClustersRequest request = new ListClustersRequest()
                .filter(new FilterForListClustersInput()
                        .ids(Collections.singletonList(opt.getClusterId())));

        ListClustersResponse response = vkeApi.listClusters(request);
        if (response.getItems().size() != 1) {
            throw new ItemsCountException("get cluster resp items must be 1");
        }
        return response.getItems().get(0);
    }

    public static class Option {
        private String clusterId;

        public String getClusterId() {
            return clusterId;
        }

        public Option setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
    }

    static class ItemsCountException extends Exception {
        public ItemsCountException(String msg) {
            super(msg);
        }
    }
}
