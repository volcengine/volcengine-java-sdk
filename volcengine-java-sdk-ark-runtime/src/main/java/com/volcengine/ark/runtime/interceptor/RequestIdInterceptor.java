package com.volcengine.ark.runtime.interceptor;

import com.volcengine.ark.runtime.Const;
import com.volcengine.ark.runtime.exception.ArkAPIError;
import com.volcengine.ark.runtime.exception.ArkException;
import com.volcengine.ark.runtime.exception.ArkHttpException;
import com.volcengine.version.Version;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang.RandomStringUtils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class RequestIdInterceptor implements Interceptor {

    public RequestIdInterceptor() {}

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder requestBuilder = chain.request().newBuilder();

        if (chain.request().header(Const.CLIENT_REQUEST_HEADER) == null || chain.request().header(Const.CLIENT_REQUEST_HEADER).length() == 0) {
            requestBuilder = requestBuilder.header(Const.CLIENT_REQUEST_HEADER, genRequestId());
        }
        requestBuilder.header("User-Agent", getUserAgent());

        Request request = requestBuilder.build();

        try {
            return chain.proceed(request);
        } catch (Exception e) {
            String requestId = request.header(Const.CLIENT_REQUEST_HEADER);
            ArkAPIError arkAPIError = new ArkAPIError(new ArkAPIError.ArkErrorDetails(e.getMessage(), "", "", ""));
            throw new ArkHttpException(arkAPIError, e, ArkHttpException.INTERNAL_SERVICE_CODE, requestId);
        }
    }

    private String genRequestId() {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyyMMddhhmmss");
        return dateFormat.format(date) + RandomStringUtils.randomAlphanumeric(20);
    }

    private static String getUserAgent() {
        String format = "%s/%s/(%s;%s;%s)";

        String osInfo = System.getProperty("os.name") + "-" + System.getProperty("os.version");
        String jdkInfo = "java-" + System.getProperty("java.version");
        String arch = System.getProperty("os.arch");

        return String.format(format, Version.SDK_NAME, Version.SDK_VERSION, jdkInfo, osInfo, arch);
    }
}
