package com.volcengine.ark.runtime.model.multimodalembeddings;

public class SparseEmbedding {
    private Integer index;
    private Double value;

    public SparseEmbedding() {}

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SparseEmbedding{" +
                "index=" + index +
                ", value=" + value +
                '}';
    }
    public static SparseEmbedding.Builder builder() {
        return new SparseEmbedding.Builder();
    }
    public static final class Builder {
        private Integer index;
        private Double value;
        private Builder() {
        }
        public static SparseEmbedding.Builder SparseEmbedding() {
            return new SparseEmbedding.Builder();
        }
        public SparseEmbedding.Builder index(Integer index) {
            this.index = index;
            return this;
        }
        public SparseEmbedding.Builder value(Double value) {
            this.value = value;
            return this;
        }
        public SparseEmbedding build() {
            SparseEmbedding sparseEmbedding = new SparseEmbedding();
            sparseEmbedding.setIndex(index);
            sparseEmbedding.setValue(value);
            return sparseEmbedding;
        }
    }
}
