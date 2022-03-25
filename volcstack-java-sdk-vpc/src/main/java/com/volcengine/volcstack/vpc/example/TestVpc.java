package com.volcengine.volcstack.vpc.example;

import com.volcengine.volcstack.ApiClient;
import com.volcengine.volcstack.ApiException;
import com.volcengine.volcstack.sign.Credentials;
import com.volcengine.volcstack.vpc.VpcApi;
import com.volcengine.volcstack.vpc.model.DescribeVpcsRequest;
import com.volcengine.volcstack.vpc.model.DescribeVpcsResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuyaming@bytedance.com
 * @Date: 2022/3/22 18:56
 */
public class TestVpc {
    public static void main(String[] args) {
        String ak = "";
        String sk = "";
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
