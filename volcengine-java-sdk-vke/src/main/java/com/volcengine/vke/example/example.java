package com.volcengine.vke.example;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;
import com.volcengine.vke.VkeApi;
import com.volcengine.vke.model.*;

public class example {

    public static void main(String[] args) throws Exception {
        String ak = "your_ak";
        String sk = "your_sk";
        String region = "your_region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region)
                .setDisableSSL(true);
        VkeApi vkeApi = new VkeApi(apiClient);

        // 1. 本示例将创建一个Fannel网络的VKE集群。并创建一个节点池，配置节点池的自动扩容策略。
        // 2. 本示例将涉及云服务器等付费产品资源的创建，请注意资源的及时释放。
        CreateFlannelVKE(vkeApi);

        // 1. 本示例将创建一个VPC-CNI网络的VKE集群。并创建一个节点池，配置节点池的自动扩容策略。
        // 2. 本示例将涉及云服务器等付费产品资源的创建，请注意资源的及时释放。
        // CreateVpcCniVKE(vkeApi);
    }

    public static void CreateFlannelVKE(VkeApi vkeApi) throws Exception {
        CreateVKE(vkeApi, PodsConfigForCreateClusterInput.PodNetworkModeEnum.FLANNEL);
    }

    public static void CreateVpcCniVKE(VkeApi vkeApi) throws Exception {
        CreateVKE(vkeApi, PodsConfigForCreateClusterInput.PodNetworkModeEnum.VPCCNISHARED);
    }

    public static void CreateVKE(VkeApi vkeApi, PodsConfigForCreateClusterInput.PodNetworkModeEnum networkMode) throws Exception {
        String clusterName = "your_cluster_name";
        String subnetID = "your_subnet_id";
        String podCidr = "your_pod_cidr"; // flannel cluster only
        String serviceCidr = "your_service_cidr";
        String nodePoolName = "your_node_pool_name";
        String instanceType = "your_instance_type";
        String password = "your_password";
        Boolean autoScaling = false;

        // 1. 创建集群
        System.out.println("creating cluster");
        String clusterID;
        try {
            clusterID = CreateCluster.Call(vkeApi, new CreateCluster.Option()
                    .setClusterName(clusterName)
                    .setPodCidr(podCidr)
                    .setServiceCidr(serviceCidr)
                    .setSubnetID(subnetID)
                    .setNetworkMode(networkMode));
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
            return;
        }

        // 2. 查询集群状态
        System.out.println("check cluster status");
        ItemForListClustersOutput cluster = null;
        while (cluster == null || cluster.getStatus().getPhase().equals(StatusForListClustersInput.PhaseEnum.CREATING.toString())) {
            try {
                cluster = GetCluster.Call(vkeApi, new GetCluster.Option().setClusterId(clusterID));
            } catch (ApiException e) {
                System.out.println(e.getResponseBody());
                return;
            } catch (GetCluster.ItemsCountException e) {
                System.out.println(e.getMessage());
                return;
            }
            if (cluster.getStatus() == null || cluster.getStatus().getPhase() == null) {
                System.out.println("cluster status or phase nil");
                return;
            }
            Thread.sleep(10 * 1000);
        }

        // 3. 创建节点池
        System.out.println("create node pool");
        String nodePoolID;
        try {
            nodePoolID = CreateNodePool.Call(vkeApi, new CreateNodePool.Option()
                    .setClusterId(clusterID)
                    .setNodePoolName(nodePoolName)
                    .setInstanceType(instanceType)
                    .setPassword(password)
                    .setSubnetID(subnetID)
            );
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
            return;
        }

        // 4. 查看节点池
        System.out.println("check node pool status");
        ItemForListNodePoolsOutput nodePool = null;
        while (nodePool == null || nodePool.getStatus().getPhase().equals(StatusForListNodePoolsInput.PhaseEnum.CREATING.toString())) {
            try {
                nodePool = GetNodePool.Call(vkeApi, new GetNodePool.Option().setNodePoolId(nodePoolID));
            } catch (ApiException e) {
                System.out.println(e.getResponseBody());
                return;
            } catch (GetNodePool.ItemsCountException e) {
                System.out.println(e.getMessage());
                return;
            }
            if (nodePool.getStatus() == null || nodePool.getStatus().getPhase() == null) {
                System.out.println("nodePool status or phase nil");
                return;
            }
            Thread.sleep(1000);
        }
        System.out.println("node pool:");
        System.out.println(nodePool);

        // 5. 查看节点列表
        System.out.println("list nodes");
        ListNodesResponse nodes;
        try {
            nodes = ListNodes.Call(vkeApi, new ListNodes.Option().setNodePoolId(nodePoolID));
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
            return;
        }
        System.out.println("node list:");
        System.out.println(nodes);

        // 6. 安装组件 & 设置节点池弹性策略
        System.out.println("install addon");
        try {
            InstallAddon.Call(vkeApi, new InstallAddon.Option().setClusterId(clusterID));
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
            return;
        }

        // 7. 修改节点数量
        System.out.println("update node number");
        try {
            UpdateNodePool.Call(vkeApi, new UpdateNodePool.Option()
                    .setClusterId(clusterID)
                    .setNodePoolId(nodePoolID)
                    .setAutoScaling(autoScaling));
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
            return;
        }

        // 8. 查看节点列表
        System.out.println("check nodes count");
        while (nodes.getItems().size() == 0) {
            try {
                nodes = ListNodes.Call(vkeApi, new ListNodes.Option().setNodePoolId(nodePoolID));
            } catch (ApiException e) {
                System.out.println(e.getResponseBody());
                return;
            }
            Thread.sleep(1000);
        }
        System.out.println("node list:");
        System.out.println(nodes);
    }
}
