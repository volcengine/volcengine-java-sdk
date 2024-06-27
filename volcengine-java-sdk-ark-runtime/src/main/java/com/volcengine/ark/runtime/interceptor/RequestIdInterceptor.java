package com.volcengine.ark.runtime.interceptor;

import com.volcengine.ark.runtime.Const;
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

        Request request = requestBuilder.build();
        return chain.proceed(request);
    }

    private String genRequestId() {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyyMMddhhmmss");
        return dateFormat.format(date) + RandomStringUtils.randomAlphanumeric(20);
    }
}
