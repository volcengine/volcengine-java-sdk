package com.volcengine.interceptor;

import com.volcengine.ApiException;
import com.volcengine.endpoint.EndpointResolver;
import com.volcengine.endpoint.EndpointValidation;
import com.volcengine.endpoint.EndpointValidationException;
import com.volcengine.endpoint.ResolveEndpointOption;
import com.volcengine.endpoint.ResolvedEndpoint;
import org.apache.commons.lang.StringUtils;

import static com.volcengine.observability.debugger.SdkDebugLog.SDK_CORE_LOGGER;

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
            option.setUseDualStack(context.getApiClient().getUseDualStack());
            ResolvedEndpoint resolvedEndpoint;
            try {
                // 自定义 resolver 同样只能接收安全的主机名组成部分。
                EndpointValidation.validateServiceAndRegion(option.getService(), option.getRegion());
                resolvedEndpoint = endpointResolver.endpointFor(option);
            } catch (EndpointValidationException e) {
                // 保留错误码，状态码为 400。
                throw e.toApiException();
            } catch (IllegalArgumentException e) {
                // 同步调用返回 ApiException，异步调用走 onFailure，均在签名和发送前终止。
                throw new ApiException(e);
            }
            SDK_CORE_LOGGER.debugEndpoint("Using endpoint: {}", resolvedEndpoint.getEndpoint());
            context.getRequestContext().setHost(resolvedEndpoint.getEndpoint());
        }
        return context;
    }
}
