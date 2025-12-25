package com.volcengine.ark.runtime.model.responses.tool;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.common.UserLocation;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.tool.doubaoapp.DoubaoAppFeature;

public class ToolDoubaoApp extends ResponsesTool {

    @JsonProperty("feature")
    private DoubaoAppFeature feature;

    @JsonProperty("user_location")
    private UserLocation userLocation;

    public DoubaoAppFeature getFeature() {
        return feature;
    }

    public void setFeature(DoubaoAppFeature feature) {
        this.feature = feature;
    }

    public UserLocation getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(UserLocation userLocation) {
        this.userLocation = userLocation;
    }

    public ToolDoubaoApp() {
        super(ResponsesConstants.TOOL_TYPE_DOUBAO_APP);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private DoubaoAppFeature feature;
        private UserLocation userLocation;

        public Builder feature(DoubaoAppFeature feature) {
            this.feature = feature;
            return this;
        }

        public Builder userLocation(UserLocation userLocation) {
            this.userLocation = userLocation;
            return this;
        }

        public ToolDoubaoApp build() {
            ToolDoubaoApp toolDoubaoApp = new ToolDoubaoApp();
            toolDoubaoApp.setFeature(feature);
            toolDoubaoApp.setUserLocation(userLocation);
            return toolDoubaoApp;
        }
    }

    @Override
    public String toString() {
        return "ToolDoubaoApp{" +
                "type='" + getType() + '\'' +
                ", feature=" + feature +
                ", userLocation=" + userLocation +
                '}';
    }
}
