package com.volcengine.llmshield.aicc;

public final class EncryptResult {
    public final String ciphertext;

    public final ResponseKey responseKey;

    EncryptResult(String ciphertext, ResponseKey responseKey) {
        this.ciphertext = ciphertext;
        this.responseKey = responseKey;
    }
}
