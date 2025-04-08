package com.volcengine.endpoint;

public class DefaultEndpointProvider implements EndpointResolver {

    @Override
    public ResolvedEndpoint endpointFor(ResolveEndpointOption option) {
        ResolvedEndpoint result = new ResolvedEndpoint();
        result.setEndpoint("open.volcengineapi.com");
        return result;
    }
}
