package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.item.doubaoapp.DoubaoAppCallBlock;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDoubaoAppCall extends BaseItem implements OutputItem {

    @JsonProperty("id")
    private String id;

    @JsonProperty("feature")
    private String feature;

    @JsonProperty("blocks")
    private List<DoubaoAppCallBlock> blocks;

    @JsonProperty("status")
    private String status;

    public ItemDoubaoAppCall() {
        super(ResponsesConstants.ITEM_TYPE_DOUBAO_APP_CALL);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public List<DoubaoAppCallBlock> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<DoubaoAppCallBlock> blocks) {
        this.blocks = blocks;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ItemDoubaoAppCall{" +
                "type='" + getType() + '\'' +
                ", id='" + id + '\'' +
                ", feature='" + feature + '\'' +
                ", blocks=" + blocks +
                ", status='" + status + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String id;
        private String feature;
        private List<DoubaoAppCallBlock> blocks;
        private String status;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder feature(String feature) {
            this.feature = feature;
            return this;
        }

        public Builder blocks(List<DoubaoAppCallBlock> blocks) {
            this.blocks = blocks;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ItemDoubaoAppCall build() {
            ItemDoubaoAppCall itemDoubaoAppCall = new ItemDoubaoAppCall();
            itemDoubaoAppCall.setId(id);
            itemDoubaoAppCall.setFeature(feature);
            itemDoubaoAppCall.setBlocks(blocks);
            itemDoubaoAppCall.setStatus(status);
            return itemDoubaoAppCall;
        }
    }
}
