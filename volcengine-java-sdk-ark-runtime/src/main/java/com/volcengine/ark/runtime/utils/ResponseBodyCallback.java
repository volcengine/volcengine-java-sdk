package com.volcengine.ark.runtime.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.ark.runtime.Const;
import com.volcengine.ark.runtime.exception.ArkAPIError;
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
import java.util.Base64;

public class ResponseBodyCallback implements Callback<ResponseBody> {
    private static final ObjectMapper mapper = ArkService.defaultObjectMapper();

    private FlowableEmitter<SSE> emitter;
    private boolean emitDone;
    private byte[] key;
    private byte[] nonce;
    private boolean isEncrypted;

    public ResponseBodyCallback(FlowableEmitter<SSE> emitter, boolean emitDone) {
        this(emitter, emitDone, null, null, false);
    }

    public ResponseBodyCallback(FlowableEmitter<SSE> emitter, boolean emitDone, byte[] key, byte[] nonce, boolean isEncrypted) {
        this.emitter = emitter;
        this.emitDone = emitDone;
        this.key = key != null ? key.clone() : null;
        this.nonce = nonce != null ? nonce.clone() : null;
        this.isEncrypted = isEncrypted;
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
            Headers responseHeaders = response.raw().headers();
            String encryptedHeader = responseHeaders.get("X-Is-Encrypted");
            if ("true".equals(encryptedHeader)) {
                this.isEncrypted = true;

                String keyHeader = responseHeaders.get("X-Decryption-Key");
                if (keyHeader != null) {
                    this.key = Base64.getDecoder().decode(keyHeader);
                }

                String nonceHeader = responseHeaders.get("X-Decryption-Nonce");
                if (nonceHeader != null) {
                    this.nonce = Base64.getDecoder().decode(nonceHeader);
                }
            }
        } catch (Exception ignored) {
            // 忽略解密参数读取错误，保持原有配置
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
                    continue;
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

                    if (data.startsWith("[DONE]")) {
                        break;
                    }

                    // 解密数据（如果需要）
                    String processedData = data;
                    if (isEncrypted && key != null && nonce != null) {
                        try {
                            processedData = ResponseDecryptUtil.decryptStreamChunk(data, key, nonce);

                        } catch (Exception ignored) {
                            // 如果解密失败，使用原始数据
                        }
                    }
                    sse = new SSE(processedData);
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
