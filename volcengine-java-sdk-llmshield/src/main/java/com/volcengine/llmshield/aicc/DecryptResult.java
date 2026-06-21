package com.volcengine.llmshield.aicc;

import java.nio.ByteBuffer;

public final class DecryptResult {
    public final ResponseKey responseKey;

    private final ByteBuffer plaintext;

    private String plaintextString = null;

    DecryptResult(ByteBuffer plaintext, ResponseKey responseKey) {
        this.plaintext = plaintext;
        this.responseKey = responseKey;
    }

    public ByteBuffer getBytes() {
        return plaintext;
    }

    public String getString() {
        if (plaintextString != null) {
            return plaintextString;
        }
        plaintextString = Utils.bytesToString(plaintext);
        return plaintextString;
    }
}
