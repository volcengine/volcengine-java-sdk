package com.volcengine.vke.example;

import com.volcengine.ApiException;
import com.volcengine.vke.VkeApi;
import com.volcengine.vke.model.AutoScalingForUpdateNodePoolConfigInput;
import com.volcengine.vke.model.UpdateNodePoolConfigRequest;

public class UpdateNodePool {
    public static void Call(VkeApi vkeApi, final Option opt) throws ApiException {
        Integer num = opt.autoScaling ? 0 : 1;
        vkeApi.updateNodePoolConfig(new UpdateNodePoolConfigRequest().
                clusterId(opt.getClusterId()).
                id(opt.getNodePoolId()).
                autoScaling(new AutoScalingForUpdateNodePoolConfigInput().
                        enabled(opt.isAutoScaling()).
                        desiredReplicas(num)));
    }

    public static class Option {
        private String clusterId;
        private String nodePoolId;
        private Boolean autoScaling;

        public String getClusterId() {
            return clusterId;
        }

        public Option setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        public String getNodePoolId() {
            return nodePoolId;
        }

        public Option setNodePoolId(String nodePoolId) {
            this.nodePoolId = nodePoolId;
            return this;
        }

        public Boolean isAutoScaling() {
            return autoScaling;
        }

        public Option setAutoScaling(Boolean autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }
    }
}
