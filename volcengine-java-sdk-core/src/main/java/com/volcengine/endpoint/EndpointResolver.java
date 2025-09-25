package com.volcengine.endpoint;

public interface EndpointResolver {

    ResolvedEndpoint endpointFor(ResolveEndpointOption option);

}
