package com.bytedance.jeddak_secure_channel;

public final class EncryptResult {
    public final String ciphertext;

    public final ResponseKey responseKey;

    EncryptResult(String ciphertext, ResponseKey responseKey) {
        this.ciphertext = ciphertext;
        this.responseKey = responseKey;
    }
}
