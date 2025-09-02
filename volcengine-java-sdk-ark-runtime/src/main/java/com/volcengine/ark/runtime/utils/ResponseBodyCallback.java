package com.volcengine.ark.runtime.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.ark.runtime.Const;
import com.volcengine.ark.runtime.exception.ArkAPIError;
import com.volcengine.ark.runtime.exception.ArkException;
import com.volcengine.ark.runtime.exception.ArkHttpException;
import com.volcengine.ark.runtime.SSEFormatException;
import com.volcengine.ark.runtime.service.ArkService;
import io.reactivex.FlowableEmitter;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ResponseBodyCallback implements Callback<ResponseBody> {
    private static final ObjectMapper mapper = ArkService.defaultObjectMapper();

    private FlowableEmitter<SSE> emitter;
    private boolean emitDone;

    public ResponseBodyCallback(FlowableEmitter<SSE> emitter, boolean emitDone) {
        this.emitter = emitter;
        this.emitDone = emitDone;
    }

    @Override
    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        BufferedReader reader = null;

        String requestId = "";
        try {
            Headers headers = response.raw().request().headers();
            requestId = headers.get(Const.CLIENT_REQUEST_HEADER);
        } catch (Exception ignored) {

        }

        try {
            if (!response.isSuccessful()) {
                HttpException e = new HttpException(response);
                ResponseBody errorBody = response.errorBody();

                if (errorBody == null) {
                    throw e;
                } else {
                    try {
                        ArkAPIError error = mapper.readValue(
                                errorBody.string(),
                                ArkAPIError.class
                        );
                        throw new ArkHttpException(error, e, e.code(), requestId);
                    } catch (ArkHttpException httpException) {
                        throw httpException;
                    } catch (Exception ignore) {
                        throw new ArkHttpException(new ArkAPIError(new ArkAPIError.ArkErrorDetails(e.getMessage(), "", "", "InternalServiceError")), e, e.code(), requestId);
                    }
                }
            }

            InputStream in = response.body().byteStream();
            reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
            String line;
            SSE sse = null;

            while (!emitter.isCancelled() && (line = reader.readLine()) != null) {
                if (line.startsWith("event:")) {
                    // do nothing
                } else if (line.startsWith("data:")) {
                    String data = line.substring(5).trim();
                    try {
                        ArkAPIError err = mapper.readValue(data, ArkAPIError.class);
                        if (err.getError() != null) {
                            throw new ArkHttpException(err, null, -1, requestId);
                        }
                    } catch (ArkHttpException e) {
                        throw e;
                    } catch (Exception ignored) {
                    }

                    sse = new SSE(data);
                } else if (line.equals("") && sse != null) {
                    if (sse.isDone()) {
                        if (emitDone) {
                            emitter.onNext(sse);
                        }
                        break;
                    }

                    emitter.onNext(sse);
                    sse = null;
                } else {
                    throw new SSEFormatException("Invalid sse format! " + line);
                }
            }

            emitter.onComplete();

        } catch (Throwable t) {
            onFailure(call, t);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    // do nothing
                }
            }
        }
    }

    @Override
    public void onFailure(Call<ResponseBody> call, Throwable t) {
        emitter.onError(t);
    }
}
