package com.volcengine.ark.runtime.model.responses.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContextManagementEdit {
    @JsonProperty("type")
    private String type;

    @JsonProperty("keep")
    private Object keep;

    @JsonProperty("exclude_tools")
    private List<String> excludeTools;

    @JsonProperty("clear_tool_input")
    private Boolean clearToolInput;

    @JsonProperty("trigger")
    private ContextManagementTurnStrategy trigger;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getKeep() {
        return keep;
    }

    public void setKeep(Object keep) {
        this.keep = keep;
    }

    public List<String> getExcludeTools() {
        return excludeTools;
    }

    public void setExcludeTools(List<String> excludeTools) {
        this.excludeTools = excludeTools;
    }

    public Boolean getClearToolInput() {
        return clearToolInput;
    }

    public void setClearToolInput(Boolean clearToolInput) {
        this.clearToolInput = clearToolInput;
    }

    public ContextManagementTurnStrategy getTrigger() {
        return trigger;
    }

    public void setTrigger(ContextManagementTurnStrategy trigger) {
        this.trigger = trigger;
    }

    @Override
    public String toString() {
        return "ContextManagementEdit{" +
                "type='" + type + '\'' +
                ", keep=" + keep +
                ", excludeTools=" + excludeTools +
                ", clearToolInput=" + clearToolInput +
                ", trigger=" + trigger +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String type;
        private Object keep;
        private List<String> excludeTools;
        private Boolean clearToolInput;
        private ContextManagementTurnStrategy trigger;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder keep(Object keep) {
            this.keep = keep;
            return this;
        }

        public Builder excludeTools(List<String> excludeTools) {
            this.excludeTools = excludeTools;
            return this;
        }

        public Builder clearToolInput(Boolean clearToolInput) {
            this.clearToolInput = clearToolInput;
            return this;
        }

        public Builder trigger(ContextManagementTurnStrategy trigger) {
            this.trigger = trigger;
            return this;
        }

        public ContextManagementEdit build() {
            ContextManagementEdit edit = new ContextManagementEdit();
            edit.setType(type);
            edit.setKeep(keep);
            edit.setExcludeTools(excludeTools);
            edit.setClearToolInput(clearToolInput);
            edit.setTrigger(trigger);
            return edit;
        }
    }
}
