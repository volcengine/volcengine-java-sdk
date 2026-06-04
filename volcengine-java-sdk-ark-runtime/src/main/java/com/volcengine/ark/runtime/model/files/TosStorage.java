package com.volcengine.ark.runtime.model.files;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TosStorage {

    @JsonProperty(value = "bucket")
    private String bucket;

    @JsonProperty(value = "prefix")
    private String prefix;

    @JsonProperty(value = "object_key")
    private String objectKey;

    public TosStorage() {
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    @Override
    public String toString() {
        return "TosStorage{" +
                "bucket='" + bucket + '\'' +
                ", prefix='" + prefix + '\'' +
                ", objectKey='" + objectKey + '\'' +
                '}';
    }

    public static TosStorageBuilder builder() {
        return new TosStorageBuilder();
    }

    public static final class TosStorageBuilder {
        private String bucket;
        private String prefix;
        private String objectKey;

        private TosStorageBuilder() {
        }

        public TosStorageBuilder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        public TosStorageBuilder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public TosStorageBuilder objectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }

        public TosStorage build() {
            TosStorage tosStorage = new TosStorage();
            tosStorage.setBucket(bucket);
            tosStorage.setPrefix(prefix);
            tosStorage.setObjectKey(objectKey);
            return tosStorage;
        }
    }
}
