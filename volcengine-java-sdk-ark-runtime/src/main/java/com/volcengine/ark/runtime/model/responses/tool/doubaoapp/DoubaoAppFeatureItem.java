package com.volcengine.ark.runtime.model.responses.tool.doubaoapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

public class DoubaoAppFeatureItem {

    @JsonProperty("type")
    private String type;

    @JsonProperty("role_description")
    private String roleDescription;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public DoubaoAppFeatureItem() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String type;
        private String roleDescription;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder roleDescription(String roleDescription) {
            this.roleDescription = roleDescription;
            return this;
        }

        public DoubaoAppFeatureItem build() {
            DoubaoAppFeatureItem featureItem = new DoubaoAppFeatureItem();
            featureItem.setType(type);
            featureItem.setRoleDescription(roleDescription);
            return featureItem;
        }
    }

    @Override
    public String toString() {
        return "DoubaoAppFeatureItem{" +
                "type='" + type + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                '}';
    }
}
