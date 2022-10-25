package com.volcengine.vke.example;


import com.volcengine.ApiException;
import com.volcengine.vke.VkeApi;
import com.volcengine.vke.model.CreateAddonRequest;

public class InstallAddon {
    public static void Call(VkeApi vkeApi, final Option opt) throws ApiException, InterruptedException {
        vkeApi.createAddon(new CreateAddonRequest().
                clusterId(opt.clusterId).
                name("metrics-server"));
        Thread.sleep(5 * 1000);
        vkeApi.createAddon(new CreateAddonRequest().
                clusterId(opt.clusterId).
                name("core-dns"));
        Thread.sleep(5 * 1000);
        vkeApi.createAddon(new CreateAddonRequest().
                clusterId(opt.clusterId).
                name("cluster-autoscaler").
                config("{\"Expander\":\"random\"}"));
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
}
