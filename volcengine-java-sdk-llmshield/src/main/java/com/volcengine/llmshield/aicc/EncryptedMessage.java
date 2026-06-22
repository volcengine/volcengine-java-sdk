package com.volcengine.llmshield.aicc;

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;

import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;

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
    final ByteBuffer key; // Nullable: may be absent in some AICC messages

    @SerializedName("ciphertext")
    final ByteBuffer ciphertext; // Nullable: may be absent in some AICC messages

    EncryptedMessage(
            ByteBuffer nonce,
            ByteBuffer mac,
            ByteBuffer key,
            ByteBuffer ciphertext) {
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
            return ByteBuffer.wrap(Utils.decodeBase64(json.getAsString()));
        }

        // Serializes ByteBuffer as Base64 string. Pure method: the original ByteBuffer is not
        // modified.
        @Override
        public JsonElement serialize(
                ByteBuffer src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(Utils.encodeBase64(Utils.unwrapBytesBuffer(src.duplicate())));
        }
    }
}
