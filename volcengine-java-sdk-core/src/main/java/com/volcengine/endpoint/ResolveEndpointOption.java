package com.volcengine.endpoint;

import java.util.HashSet;
import java.util.Set;

public class ResolveEndpointOption {
    private String service;
    private String region;

    private Set<String> customBootstrapRegion = new HashSet<>();

    private Boolean useDualStack = null;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Set<String> getCustomBootstrapRegion() {
        return customBootstrapRegion;
    }

    public void setCustomBootstrapRegion(Set<String> customBootstrapRegion) {
        this.customBootstrapRegion = customBootstrapRegion;
    }

    public Boolean getUseDualStack() {
        return useDualStack;
    }

    public void setUseDualStack(Boolean useDualStack) {
        this.useDualStack = useDualStack;
    }

}
