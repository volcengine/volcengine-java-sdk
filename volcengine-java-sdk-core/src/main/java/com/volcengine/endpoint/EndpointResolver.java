package com.volcengine.endpoint;

public interface EndpointResolver {

    public ResolvedEndpoint endpointFor(ResolveEndpointOption option);
}
