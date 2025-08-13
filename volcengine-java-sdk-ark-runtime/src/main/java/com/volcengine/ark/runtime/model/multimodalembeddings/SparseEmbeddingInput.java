package com.volcengine.ark.runtime.model.multimodalembeddings;

public class SparseEmbeddingInput {
    private String type;

    public SparseEmbeddingInput() {}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SparseEmbeddingInput{" +
                "type='" + type + '\'' +
                '}';
    }

    public static SparseEmbeddingInput.Builder builder() {
        return new SparseEmbeddingInput.Builder();
    }

    public static final class Builder {
        private String type;

        private Builder() {
        }

        public static SparseEmbeddingInput.Builder SparseEmbeddingInput() {
            return new Builder();
        }

        public SparseEmbeddingInput.Builder type(String type) {
            this.type = type;
            return this;
        }

        public SparseEmbeddingInput build() {
            SparseEmbeddingInput sparseEmbeddingInput = new SparseEmbeddingInput();
            sparseEmbeddingInput.setType(type);
            return sparseEmbeddingInput;
        }
    }
}
