package com.volcengine.vke.example;


import com.volcengine.ApiException;
import com.volcengine.vke.VkeApi;
import com.volcengine.vke.model.*;

import java.util.Collections;

public class CreateNodePool {
    public static String Call(VkeApi vkeApi, final Option opt) throws ApiException {
        CreateNodePoolRequest request = new CreateNodePoolRequest().
                clusterId(opt.getClusterId()).
                name(opt.getNodePoolName()).
                nodeConfig(new NodeConfigForCreateNodePoolInput().
                        systemVolume(new SystemVolumeForCreateNodePoolInput().
                                size(40).
                                type(SystemVolumeForCreateNodePoolInput.TypeEnum.ESSD_PL0)).
                        instanceTypeIds(Collections.singletonList(opt.getInstanceType())).
                        security(new SecurityForCreateNodePoolInput().
                                login(new LoginForCreateNodePoolInput().password(opt.getPassword()))).
                        subnetIds(Collections.singletonList(opt.getSubnetID())));

        CreateNodePoolResponse response = vkeApi.createNodePool(request);
        return response.getId();
    }

    public static class Option {
        private String clusterId;
        private String nodePoolName;
        private String instanceType;
        private String password;
        private String subnetID;

        public String getClusterId() {
            return clusterId;
        }

        public Option setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        public String getNodePoolName() {
            return nodePoolName;
        }

        public Option setNodePoolName(String nodePoolName) {
            this.nodePoolName = nodePoolName;
            return this;
        }

        public String getInstanceType() {
            return instanceType;
        }

        public Option setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public Option setPassword(String password) {
            this.password = password;
            return this;
        }

        public String getSubnetID() {
            return subnetID;
        }

        public Option setSubnetID(String subnetID) {
            this.subnetID = subnetID;
            return this;
        }
    }
}
