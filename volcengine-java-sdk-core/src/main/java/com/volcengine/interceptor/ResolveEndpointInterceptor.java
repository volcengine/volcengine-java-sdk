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
            // region 和 service 会拼进 endpoint 主机名，在调用任何 resolver（包括自定义 resolver）、
            // 签名和发送之前校验，防止注入其他主机（SSRF）。校验失败转为 ApiException，保留错误码，状态码为 400。
            try {
                EndpointValidation.validateServiceAndRegion(service, context.getApiClient().getRegion());
            } catch (EndpointValidationException e) {
                throw e.toApiException();
            }
            ResolveEndpointOption option = new ResolveEndpointOption();
            option.setService(service);
            option.setRegion(context.getApiClient().getRegion());
            option.setCustomBootstrapRegion(context.getApiClient().getCustomBootstrapRegion());
            option.setUseDualStack(context.getApiClient().getUseDualStack());
            // resolver 自身抛出的异常保持原样（与 master 一致），不做包装。
            ResolvedEndpoint resolvedEndpoint = endpointResolver.endpointFor(option);
            SDK_CORE_LOGGER.debugEndpoint("Using endpoint: {}", resolvedEndpoint.getEndpoint());
            context.getRequestContext().setHost(resolvedEndpoint.getEndpoint());
        }
        return context;
    }
}
