package com.volcengine.interceptor;

import com.volcengine.ApiException;
import com.volcengine.endpoint.EndpointResolver;
import com.volcengine.endpoint.ResolveEndpointOption;
import com.volcengine.endpoint.ResolvedEndpoint;
import org.apache.commons.lang.StringUtils;

public class ResolveEndpointInterceptor implements RequestInterceptor {

    public final static String name = "volcengine-resolve-endpoint-interceptor";

    @Override
    public String name() {
        return name;
    }

    @Override
    public InterceptorContext intercept(InterceptorContext context) throws ApiException {
        boolean disableSSL = context.getApiClient().getDisableSSL();
        String host = context.getApiClient().getEndpoint();

        String schema = "https";
        if (disableSSL) {
            schema = "http";
        }
        context.getRequestContext().setSchema(schema);
        if (StringUtils.isNotBlank(host)) {
            context.getRequestContext().setHost(host);
        } else {
            EndpointResolver endpointResolver = context.getApiClient().getEndpointResolver();
            if (endpointResolver == null) {
                throw new ApiException("One of Endpoint and EndpointResolver must configured");
            }
            String path = context.getInitInterceptorContext().getPath();
            String[] param = path.split("/");
            if (param.length < 4) {
                throw new ApiException("Path Param not meet the requirements");
            }
            String service = param[3];
            ResolveEndpointOption option = new ResolveEndpointOption();
            option.setService(service);
            option.setRegion(context.getApiClient().getRegion());
            option.setCustomBootstrapRegion(context.getApiClient().getCustomBootstrapRegion());
            ResolvedEndpoint resolvedEndpoint = endpointResolver.endpointFor(option);
            context.getRequestContext().setHost(resolvedEndpoint.getEndpoint());
        }
        return context;
    }
}
