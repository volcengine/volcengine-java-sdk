package com.bytedance.jeddak_secure_channel;

import java.security.SecureRandom;

public interface NonceSource {
    int NONCE_LEN = AesKey.NONCE_LEN;

    byte[] getNonce();

    class Random implements NonceSource {
        @Override
        public byte[] getNonce() {
            return new SecureRandom().generateSeed(NONCE_LEN);
        }
    }

    class UserProvided implements NonceSource {
        private final byte[] nonce;

        public UserProvided(byte[] nonce) {
            if (nonce.length != NONCE_LEN) {
                throw new IllegalArgumentException();
            }
            this.nonce = nonce;
        }

        @Override
        public byte[] getNonce() {
            return nonce;
        }
    }
}
