package com.volcengine.vpc.example;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;
import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.DescribeVpcsRequest;
import com.volcengine.vpc.model.DescribeVpcsResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * xuyaming@bytedance.com
 * 2022/3/22 18:56
 */
public class TestVpc {
    public static void main(String[] args)throws Exception {
        String ak = "your ak";
        String sk = "your sk";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak,sk))
                .setRegion(region);
        VpcApi vpcApi = new VpcApi(apiClient);
        DescribeVpcsRequest request = new DescribeVpcsRequest();
        List<String> list = new ArrayList<>();
        list.add("vpc-13fpdgwk7rxfk3n6nu44wisg7");
        request.setVpcIds(list);
        try {
            DescribeVpcsResponse response = vpcApi.describeVpcs(request);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}
