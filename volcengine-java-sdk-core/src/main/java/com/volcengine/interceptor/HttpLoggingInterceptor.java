package com.volcengine.interceptor;

import com.squareup.okhttp.Connection;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.internal.http.HttpEngine;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import com.volcengine.utils.LoggerUtil;
import okio.Buffer;
import okio.BufferedSource;
import static com.volcengine.utils.ConstantsUtil.NEW_LINE;

public final class HttpLoggingInterceptor implements Interceptor {

    private static final LoggerUtil REQUEST_LOGGER = LoggerUtil.loggerFor("com.volcengine.request");
    private static final LoggerUtil REQUEST_ID_LOGGER = LoggerUtil.loggerFor("com.volcengine.request.requestId");
    private static final String HEAD_LOG_ID = "X-Tt-Logid";

    private static final Charset UTF8 = Charset.forName("UTF-8");

    public HttpLoggingInterceptor() {

    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        // 打印请求的日志
        logRequestLog(chain);
        Request request = chain.request();
        long startNs = System.nanoTime();
        Response response = chain.proceed(request);
        long tookMs = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startNs);
        // 打印响应的日志
        logResponseLog(response, tookMs);
        return response;
    }

    private void logResponseLog(Response response, long tookMs) throws IOException {
        Headers headers = response.headers();
        if (REQUEST_ID_LOGGER.isDebugEnabled()){
            String responseState = response.isSuccessful() ? "successful" : "failed";
            REQUEST_ID_LOGGER.debug("Received " + responseState + " response: " + response.code() + ", " + "RequestId: " + headers.get(HEAD_LOG_ID));
        }

        if (REQUEST_LOGGER.isDebugEnabled() || REQUEST_LOGGER.isTraceEnabled()) {
            StringBuilder responseInfo = new StringBuilder();
            ResponseBody responseBody = response.body();
            responseInfo.append(NEW_LINE + "<-- " + protocol(response.protocol()) + ' ' + response.code() + ' '
                    + response.message() + " (" + tookMs + "ms"
                    +  ", " + responseBody.contentLength() + "-byte body"  + ')');

            for (int i = 0, count = headers.size(); i < count; i++) {
                responseInfo.append(NEW_LINE + headers.name(i) + ": " + headers.value(i));
            }

            if (!REQUEST_LOGGER.isTraceEnabled() || !HttpEngine.hasBody(response)) {
                responseInfo.append(NEW_LINE + "<-- END HTTP");
            } else if (bodyEncoded(response.headers())) {
                responseInfo.append(NEW_LINE + "<-- END HTTP (encoded body omitted)");
            } else {
                BufferedSource source = responseBody.source();
                source.request(Long.MAX_VALUE); // Buffer the entire body.
                Buffer buffer = source.buffer();

                Charset charset = UTF8;
                MediaType contentType = responseBody.contentType();
                if (contentType != null) {
                    charset = contentType.charset(UTF8);
                }

                if (responseBody.contentLength() != 0) {
                    responseInfo.append(NEW_LINE + "ResponseBody: ");
                    responseInfo.append(buffer.clone().readString(charset));
                }

                responseInfo.append(NEW_LINE + "<-- END HTTP (" + buffer.size() + "-byte body)");
            }
            REQUEST_LOGGER.debug(responseInfo::toString);
            REQUEST_LOGGER.trace(responseInfo::toString);
        }

    }

    private void logRequestLog(Chain chain) throws IOException {

        REQUEST_ID_LOGGER.debug(()->{
            Request request = chain.request();
            Connection connection = chain.connection();
            Protocol protocol = connection != null ? connection.getProtocol() : Protocol.HTTP_1_1;
            return request.method() + ' ' + request.httpUrl() + ' ' + protocol(protocol);
        });

        if (REQUEST_LOGGER.isDebugEnabled()){
            Request request = chain.request();
            RequestBody requestBody = request.body();
            boolean hasRequestBody = requestBody != null;
            Connection connection = chain.connection();
            Protocol protocol = connection != null ? connection.getProtocol() : Protocol.HTTP_1_1;
            StringBuilder requestLog = new StringBuilder();
            requestLog.append("--> " + request.method() + ' ' + request.httpUrl() + ' ' + protocol(protocol));
            if (hasRequestBody) {
                requestLog.append(" (" + requestBody.contentLength() + "-byte body)");
            }

            if (hasRequestBody) {
                // Request body headers are only present when installed as a network interceptor. Force
                // them to be included (when available) so there values are known.
                if (requestBody.contentType() != null) {
                    requestLog.append(NEW_LINE + "Content-Type: " + requestBody.contentType());
                }
                if (requestBody.contentLength() != -1) {
                    requestLog.append(NEW_LINE + "Content-Length: " + requestBody.contentLength());
                }
            }

            Headers headers = request.headers();
            for (int i = 0, count = headers.size(); i < count; i++) {
                String name = headers.name(i);
                // Skip headers from the request body as they are explicitly logged above.
                if (!"Content-Type".equalsIgnoreCase(name) && !"Content-Length".equalsIgnoreCase(name)) {
                    requestLog.append(NEW_LINE + ": " + headers.value(i));
                }
            }

            if (!hasRequestBody) {
                requestLog.append(NEW_LINE + "--> END " + request.method());
            } else if (bodyEncoded(request.headers())) {
                requestLog.append(NEW_LINE + "--> END " + request.method() + " (encoded body omitted)");
            } else {
                Buffer buffer = new Buffer();
                requestBody.writeTo(buffer);

                Charset charset = UTF8;
                MediaType contentType = requestBody.contentType();
                if (contentType != null) {
                    contentType.charset(UTF8);
                }

                requestLog.append("");
                requestLog.append(buffer.readString(charset));

                requestLog.append("--> END " + request.method()
                        + " (" + requestBody.contentLength() + "-byte body)");
            }
            REQUEST_LOGGER.debug(requestLog.toString());
        }
    }

    private boolean bodyEncoded(Headers headers) {
        String contentEncoding = headers.get("Content-Encoding");
        return contentEncoding != null && !contentEncoding.equalsIgnoreCase("identity");
    }

    private static String protocol(Protocol protocol) {
        return protocol == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1";
    }
}
