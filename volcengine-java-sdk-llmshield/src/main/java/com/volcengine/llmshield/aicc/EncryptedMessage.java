package com.bytedance.jeddak_secure_channel;

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;

import org.jspecify.annotations.Nullable;

import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.Base64;

final class EncryptedMessage {
    private static final Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(ByteBuffer.class, new ByteBufferAdapter())
                    .create();

    @SerializedName("nonce")
    final ByteBuffer nonce;

    @SerializedName("mac")
    final ByteBuffer mac;

    @SerializedName("key")
    final @Nullable ByteBuffer key;

    @SerializedName("ciphertext")
    final @Nullable ByteBuffer ciphertext;

    EncryptedMessage(
            ByteBuffer nonce,
            ByteBuffer mac,
            @Nullable ByteBuffer key,
            @Nullable ByteBuffer ciphertext) {
        this.nonce = nonce;
        this.mac = mac;
        this.key = key;
        this.ciphertext = ciphertext;
    }

    static EncryptedMessage deserialize(Reader reader) {
        return gson.fromJson(reader, EncryptedMessage.class);
    }

    String serialize() {
        return gson.toJson(this);
    }

    private static final class ByteBufferAdapter
            implements JsonSerializer<ByteBuffer>, JsonDeserializer<ByteBuffer> {
        @Override
        public ByteBuffer deserialize(
                JsonElement json, Type typeOfT, JsonDeserializationContext context)
                throws JsonParseException {
            return ByteBuffer.wrap(Base64.getDecoder().decode(json.getAsString()));
        }

        // Serializes ByteBuffer as Base64 string. Pure method: the original ByteBuffer is not
        // modified.
        @Override
        public JsonElement serialize(
                ByteBuffer src, Type typeOfSrc, JsonSerializationContext context) {
            ByteBuffer bytes = Base64.getEncoder().encode(src);
            return new JsonPrimitive(Utils.bytesToString(bytes));
        }
    }
}
