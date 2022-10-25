package com.volcengine.vke.example;

import com.volcengine.ApiException;
import com.volcengine.vke.VkeApi;
import com.volcengine.vke.model.*;

import java.util.Collections;

public class CreateCluster {
    public static String Call(VkeApi vkeApi, final Option opt) throws ApiException {
        CreateClusterRequest request = new CreateClusterRequest().
                clusterConfig(new ClusterConfigForCreateClusterInput().
                        apiServerPublicAccessEnabled(false).
                        subnetIds(Collections.singletonList(opt.getSubnetID()))
                ).
                name(opt.getClusterName()).
                podsConfig(new PodsConfigForCreateClusterInput().
                        podNetworkMode(opt.getNetworkMode())).
                servicesConfig(new ServicesConfigForCreateClusterInput().
                        serviceCidrsv4(Collections.singletonList(opt.getServiceCidr())));

        if (opt.getNetworkMode() == PodsConfigForCreateClusterInput.PodNetworkModeEnum.FLANNEL) {
            request.getPodsConfig().flannelConfig(new FlannelConfigForCreateClusterInput().
                    podCidrs(Collections.singletonList(opt.getPodCidr())).
                    maxPodsPerNode(64));
        } else if (opt.getNetworkMode() == PodsConfigForCreateClusterInput.PodNetworkModeEnum.VPCCNISHARED) {
            request.getPodsConfig().vpcCniConfig(new VpcCniConfigForCreateClusterInput().
                    subnetIds(Collections.singletonList(opt.getSubnetID())));
        }

        CreateClusterResponse response = vkeApi.createCluster(request);
        return response.getId();
    }

    public static class Option {
        private String clusterName;
        private String subnetID;
        private String podCidr;
        private String serviceCidr;
        private PodsConfigForCreateClusterInput.PodNetworkModeEnum networkMode;

        public String getClusterName() {
            return clusterName;
        }

        public Option setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public String getSubnetID() {
            return subnetID;
        }

        public Option setSubnetID(String subnetID) {
            this.subnetID = subnetID;
            return this;
        }

        public String getPodCidr() {
            return podCidr;
        }

        public Option setPodCidr(String podCidr) {
            this.podCidr = podCidr;
            return this;
        }

        public String getServiceCidr() {
            return serviceCidr;
        }

        public Option setServiceCidr(String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }

        public PodsConfigForCreateClusterInput.PodNetworkModeEnum getNetworkMode() {
            return networkMode;
        }

        public Option setNetworkMode(PodsConfigForCreateClusterInput.PodNetworkModeEnum networkMode) {
            this.networkMode = networkMode;
            return this;
        }

    }
}
