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
        Request request = chain.request()
                .newBuilder()
                .header(Const.CLIENT_REQUEST_HEADER, genRequestId())
                .build();
        return chain.proceed(request);
    }

    private String genRequestId() {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyyMMddhhmmss");
        return dateFormat.format(date) + RandomStringUtils.randomAlphanumeric(20);
    }
}
