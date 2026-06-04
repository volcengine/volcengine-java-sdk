package com.bytedance.jeddak_secure_channel;

import org.jspecify.annotations.Nullable;

import java.io.*;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.*;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

final class AesKey {
    static final int KEY_LEN = 32;

    static final int NONCE_LEN = 12;

    static final int MAC_LEN = 16;

    private final SecretKey key;

    private NonceSource nonceSource;

    private AesKey(SecretKey key) {
        this.key = key;
        this.nonceSource = new NonceSource.Random();
    }

    static AesKey generate() {
        KeyGenerator keyGenerator;
        try {
            keyGenerator = KeyGenerator.getInstance("AES");
        } catch (NoSuchAlgorithmException e) {
            throw new UnsupportedOperationException(e);
        }
        keyGenerator.init(KEY_LEN * Byte.SIZE);
        SecretKey key = keyGenerator.generateKey();
        return new AesKey(key);
    }

    static AesKey from(byte[] key) {
        SecretKeySpec spec = new SecretKeySpec(key, "AES");
        return new AesKey(spec);
    }

    NonceSource getNonceSource() {
        return nonceSource;
    }

    void setNonceSource(NonceSource nonceSource) {
        this.nonceSource = nonceSource;
    }

    byte[] getEncoded() {
        return key.getEncoded();
    }

    private Encryptor getEncryptor() {
        byte[] nonce = nonceSource.getNonce();
        // There are 8 bits in a byte.
        GCMParameterSpec params = new GCMParameterSpec(MAC_LEN * 8, nonce);

        try {
            // The protocol demands we use AES-GCM-256.
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.ENCRYPT_MODE, key, params);

            return new Encryptor(nonce, cipher);

        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            // The algorithms are supposed to be supported, so these exceptions should not happen.
            throw new UnsupportedOperationException(e);
        } catch (InvalidKeyException | InvalidAlgorithmParameterException e) {
            // These exceptions imply program bug.
            throw new RuntimeException(e);
        }
    }

    EncryptResult encrypt(ByteBuffer plaintext) {
        Encryptor encryptor = getEncryptor();
        Cipher cipher = encryptor.cipher;

        ByteBuffer result;
        try {
            result = ByteBuffer.allocate(cipher.getOutputSize(plaintext.remaining()));
            cipher.doFinal(plaintext, result);

        } catch (IllegalBlockSizeException | BadPaddingException | ShortBufferException e) {
            // These exceptions imply program bug.
            throw new RuntimeException(e);
        }

        int resultLen = result.position();
        ByteBuffer ciphertext = ByteBuffer.wrap(result.array(), 0, resultLen - MAC_LEN);
        ByteBuffer mac = ByteBuffer.wrap(result.array(), resultLen - MAC_LEN, MAC_LEN);

        return new EncryptResult(ByteBuffer.wrap(encryptor.nonce), ciphertext, mac);
    }

    EncryptResult encrypt(InputStream source, OutputStream sink) throws IOException {
        return encrypt(source, sink, false);
    }

    EncryptResult encrypt(InputStream source, OutputStream sink, boolean concatted)
            throws IOException {
        Encryptor encryptor = getEncryptor();
        Cipher cipher = encryptor.cipher;

        if (concatted) {
            sink.write(encryptor.nonce);
        }

        final int SIZE = 1024;
        byte[] input = new byte[SIZE];
        byte[] output = new byte[0];
        try {
            int inputLen;
            while ((inputLen = source.read(input)) != -1) {
                int outputReserve = cipher.getOutputSize(inputLen);
                if (output.length < outputReserve) {
                    output = new byte[outputReserve];
                }
                int outputLen = cipher.update(input, 0, inputLen, output);
                sink.write(output, 0, outputLen);
            }

            int outputReserve = cipher.getOutputSize(0);
            if (output.length < outputReserve) {
                output = new byte[outputReserve];
            }
            int outputLen = cipher.doFinal(output, 0);
            if (concatted) {
                sink.write(output, 0, outputLen);
            } else {
                // The protocol demands we separate ciphertext and mac.
                if (outputLen > MAC_LEN) {
                    sink.write(output, 0, outputLen - MAC_LEN);
                }
            }

            // Allocate new array because the output temporary array is huge.
            ByteBuffer mac = ByteBuffer.allocate(MAC_LEN);
            mac.put(output, outputLen - MAC_LEN, MAC_LEN);
            mac.flip();

            return new EncryptResult(ByteBuffer.wrap(encryptor.nonce), null, mac);

        } catch (IllegalBlockSizeException
                | BadPaddingException
                | ShortBufferException
                | IndexOutOfBoundsException e) {
            // These exceptions imply program bug.
            throw new RuntimeException(e);
        }
    }

    private Cipher getDecryptor(byte[] nonce) {
        // There are 8 bits in a byte.
        GCMParameterSpec params = new GCMParameterSpec(MAC_LEN * 8, nonce);
        try {
            // The protocol demands we use AES-GCM-256.
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.DECRYPT_MODE, key, params);
            return cipher;

        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            // The algorithms are supposed to be supported, so these exceptions should not happen.
            throw new UnsupportedOperationException(e);
        } catch (InvalidKeyException | InvalidAlgorithmParameterException e) {
            // These exceptions imply program bug.
            throw new RuntimeException(e);
        }
    }

    /// @exception IllegalArgumentException If nonce, mac, or ciphertext are not correct.
    ByteBuffer decrypt(ByteBuffer nonce, ByteBuffer ciphertext, ByteBuffer mac) {
        Cipher cipher = getDecryptor(Utils.unwrapBytesBuffer(nonce));
        ByteBuffer result = ByteBuffer.allocate(ciphertext.remaining());
        try {
            cipher.update(ciphertext, result);
            cipher.doFinal(mac, result);

        } catch (IllegalBlockSizeException | BadPaddingException e) {
            // Invalid input.
            throw new IllegalArgumentException(e);
        } catch (ShortBufferException e) {
            // These exceptions imply program bug.
            throw new RuntimeException(e);
        }

        result.flip();
        return result;
    }

    /// @exception IllegalArgumentException If nonce, mac, or ciphertext are not correct.
    void decrypt(ByteBuffer nonce, ByteBuffer mac, InputStream source, OutputStream sink)
            throws IOException {
        Cipher cipher = getDecryptor(Utils.unwrapBytesBuffer(nonce));

        final int SIZE = 1024;
        byte[] input = new byte[SIZE];
        byte[] output = new byte[0];
        try {
            int inputLen;
            while ((inputLen = source.read(input)) != -1) {
                int outputReserve = cipher.getOutputSize(inputLen);
                if (output.length < outputReserve) {
                    output = new byte[outputReserve];
                }
                int outputLen = cipher.update(input, 0, inputLen, output);
                sink.write(output, 0, outputLen);
            }
            // The protocol demands we separate ciphertext and mac.
            int outputReserve = cipher.getOutputSize(mac.remaining());
            if (output.length < outputReserve) {
                output = new byte[outputReserve];
            }
            int outputLen;
            if (mac.remaining() > 0) {
                byte[] macBytes = Utils.unwrapBytesBuffer(mac.duplicate());
                outputLen = cipher.doFinal(macBytes, 0, macBytes.length, output, 0);
            } else {
                outputLen = cipher.doFinal(output, 0);
            }
            if (outputLen > 0) {
                sink.write(output, 0, outputLen);
            }
        } catch (IllegalBlockSizeException | BadPaddingException e) {
            // Invalid input.
            throw new IllegalArgumentException(e);
        } catch (ShortBufferException | IndexOutOfBoundsException e) {
            // These exceptions imply program bug
            throw new RuntimeException(e);
        }
    }

    private static final class Encryptor {
        final byte[] nonce;
        final Cipher cipher;

        Encryptor(byte[] nonce, Cipher cipher) {
            this.nonce = nonce;
            this.cipher = cipher;
        }
    }

    static final class EncryptResult {
        final ByteBuffer nonce;

        final @Nullable ByteBuffer ciphertext;

        final ByteBuffer mac;

        EncryptResult(ByteBuffer nonce, @Nullable ByteBuffer ciphertext, ByteBuffer mac) {
            this.nonce = nonce;
            this.ciphertext = ciphertext;
            this.mac = mac;
        }
    }
}
