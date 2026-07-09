package com.volcengine.llmshield.aicc;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.spec.MGF1ParameterSpec;
import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * Java 7 crypto compatibility layer for the AICC wire protocol.
 *
 * <p>The protocol still requires AES-GCM-256 and RSA-OAEP with SHA-256/MGF1-SHA-256. Some Java 7
 * runtimes do not provide those algorithms through the default JCE providers, so this class keeps
 * the protocol parameters in one place and uses BouncyCastle only as a compatibility provider.
 */
public final class CryptoCompat {
    private static final String AES_GCM_TRANSFORMATION = "AES/GCM/NoPadding";
    private static final String RSA_OAEP_TRANSFORMATION = "RSA/ECB/OAEPPadding";
    private static final OAEPParameterSpec RSA_OAEP_SHA256_SPEC =
            new OAEPParameterSpec(
                    "SHA-256",
                    "MGF1",
                    new MGF1ParameterSpec("SHA-256"),
                    PSource.PSpecified.DEFAULT);
    private static final Provider BOUNCY_CASTLE_PROVIDER = new BouncyCastleProvider();

    private static volatile boolean runtimeChecked;

    private CryptoCompat() {}

    static Cipher newAesGcmCipher(int mode, Key key, byte[] nonce) {
        // Keep the original AES-GCM-256 parameters; provider handling is the only compatibility
        // concern here.
        installBouncyCastleProviderIfAllowed();
        GCMParameterSpec params = new GCMParameterSpec(AesKey.MAC_LEN * Byte.SIZE, nonce);
        RuntimeException defaultFailure = null;
        try {
            Cipher cipher = Cipher.getInstance(AES_GCM_TRANSFORMATION);
            cipher.init(mode, key, params);
            return cipher;
        } catch (NoSuchAlgorithmException e) {
            defaultFailure = unsupported("AES-GCM-256", e);
        } catch (NoSuchPaddingException e) {
            defaultFailure = unsupported("AES-GCM-256", e);
        } catch (InvalidKeyException e) {
            defaultFailure = new RuntimeException(e);
        } catch (InvalidAlgorithmParameterException e) {
            defaultFailure = new RuntimeException(e);
        }

        try {
            Cipher cipher = Cipher.getInstance(AES_GCM_TRANSFORMATION, BOUNCY_CASTLE_PROVIDER);
            cipher.init(mode, key, params);
            return cipher;
        } catch (NoSuchAlgorithmException e) {
            throw unsupported("AES-GCM-256", e, defaultFailure);
        } catch (NoSuchPaddingException e) {
            throw unsupported("AES-GCM-256", e, defaultFailure);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        } catch (InvalidAlgorithmParameterException e) {
            throw new RuntimeException(e);
        }
    }

    static Cipher newRsaOaepSha256Cipher(int mode, Key key) {
        // Do not downgrade to SHA-1 OAEP or PKCS1Padding. Java 7 compatibility is handled by the
        // provider choice, not by changing protocol parameters.
        installBouncyCastleProviderIfAllowed();
        RuntimeException defaultFailure = null;
        try {
            Cipher cipher = Cipher.getInstance(RSA_OAEP_TRANSFORMATION);
            cipher.init(mode, key, RSA_OAEP_SHA256_SPEC);
            return cipher;
        } catch (NoSuchAlgorithmException e) {
            defaultFailure = unsupported("RSA-OAEP-SHA256", e);
        } catch (NoSuchPaddingException e) {
            defaultFailure = unsupported("RSA-OAEP-SHA256", e);
        } catch (InvalidKeyException e) {
            defaultFailure = new RuntimeException(e);
        } catch (InvalidAlgorithmParameterException e) {
            defaultFailure = new RuntimeException(e);
        }

        try {
            Cipher cipher = Cipher.getInstance(RSA_OAEP_TRANSFORMATION, BOUNCY_CASTLE_PROVIDER);
            cipher.init(mode, key, RSA_OAEP_SHA256_SPEC);
            return cipher;
        } catch (NoSuchAlgorithmException e) {
            throw unsupported("RSA-OAEP-SHA256", e, defaultFailure);
        } catch (NoSuchPaddingException e) {
            throw unsupported("RSA-OAEP-SHA256", e, defaultFailure);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        } catch (InvalidAlgorithmParameterException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ensureRuntimeSupported() {
        if (runtimeChecked) {
            return;
        }
        synchronized (CryptoCompat.class) {
            if (runtimeChecked) {
                return;
            }
            installBouncyCastleProviderIfAllowed();
            checkAesGcm256();
            checkRsaOaepSha256();
            runtimeChecked = true;
        }
    }

    private static void checkAesGcm256() {
        byte[] keyBytes = new byte[AesKey.KEY_LEN];
        byte[] nonce = new byte[AesKey.NONCE_LEN];
        byte[] plaintext = new byte[] {1, 2, 3, 4};

        SecretKey key = new SecretKeySpec(keyBytes, "AES");
        Cipher encryptCipher = newAesGcmCipher(Cipher.ENCRYPT_MODE, key, nonce);
        ByteBuffer encrypted = ByteBuffer.allocate(encryptCipher.getOutputSize(plaintext.length));
        try {
            encryptCipher.doFinal(ByteBuffer.wrap(plaintext), encrypted);
        } catch (IllegalBlockSizeException e) {
            throw unsupported("AES-GCM-256", e);
        } catch (BadPaddingException e) {
            throw unsupported("AES-GCM-256", e);
        } catch (ShortBufferException e) {
            throw unsupported("AES-GCM-256", e);
        }

        encrypted.flip();
        Cipher decryptCipher = newAesGcmCipher(Cipher.DECRYPT_MODE, key, nonce);
        ByteBuffer decrypted = ByteBuffer.allocate(decryptCipher.getOutputSize(encrypted.remaining()));
        try {
            decryptCipher.doFinal(encrypted, decrypted);
        } catch (IllegalBlockSizeException e) {
            throw unsupported("AES-GCM-256", e);
        } catch (BadPaddingException e) {
            throw unsupported("AES-GCM-256", e);
        } catch (ShortBufferException e) {
            throw unsupported("AES-GCM-256", e);
        }
        decrypted.flip();
        if (!Arrays.equals(Utils.unwrapBytesBuffer(decrypted), plaintext)) {
            throw new IllegalStateException("AES-GCM-256 precheck returned invalid plaintext");
        }
    }

    private static void checkRsaOaepSha256() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            byte[] plaintext = new byte[AesKey.KEY_LEN];

            Cipher encryptCipher =
                    newRsaOaepSha256Cipher(Cipher.ENCRYPT_MODE, keyPair.getPublic());
            byte[] ciphertext = encryptCipher.doFinal(plaintext);

            Cipher decryptCipher =
                    newRsaOaepSha256Cipher(Cipher.DECRYPT_MODE, keyPair.getPrivate());
            byte[] decrypted = decryptCipher.doFinal(ciphertext);
            if (!Arrays.equals(decrypted, plaintext)) {
                throw new IllegalStateException("RSA-OAEP-SHA256 precheck returned invalid plaintext");
            }
        } catch (NoSuchAlgorithmException e) {
            throw unsupported("RSA-OAEP-SHA256", e);
        } catch (IllegalBlockSizeException e) {
            throw unsupported("RSA-OAEP-SHA256", e);
        } catch (BadPaddingException e) {
            throw unsupported("RSA-OAEP-SHA256", e);
        }
    }

    private static UnsupportedOperationException unsupported(String capability, Throwable cause) {
        return new UnsupportedOperationException(
                "Current Java runtime does not support "
                        + capability
                        + " required by LLMShield AICC. java.version="
                        + System.getProperty("java.version")
                        + ", provider="
                        + BOUNCY_CASTLE_PROVIDER.getName(),
                cause);
    }

    private static void installBouncyCastleProviderIfAllowed() {
        // Best effort: registering BC makes normal Cipher.getInstance(...) calls succeed on Java 7.
        // If a restricted runtime rejects global provider registration, explicit local-provider
        // fallback in the cipher factory methods still keeps AICC usable.
        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) != null) {
            return;
        }
        synchronized (CryptoCompat.class) {
            if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) != null) {
                return;
            }
            try {
                Security.addProvider(BOUNCY_CASTLE_PROVIDER);
            } catch (SecurityException e) {
                // Some restricted runtimes disallow global provider registration. In that case
                // the explicit local-provider fallback below still keeps AICC crypto usable.
            }
        }
    }

    private static UnsupportedOperationException unsupported(
            String capability, Throwable cause, RuntimeException defaultFailure) {
        String defaultMessage =
                defaultFailure == null ? "" : "; default provider failure=" + defaultFailure.getMessage();
        return new UnsupportedOperationException(
                "Current Java runtime does not support "
                        + capability
                        + " required by LLMShield AICC"
                        + defaultMessage
                        + ". java.version="
                        + System.getProperty("java.version")
                        + ", fallback provider="
                        + BOUNCY_CASTLE_PROVIDER.getName(),
                cause);
    }
}
