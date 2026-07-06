package com.volcengine.ark.runtime.model.responses.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContextManagement {
    @JsonProperty("edits")
    private List<ContextManagementEdit> edits;

    public List<ContextManagementEdit> getEdits() {
        return edits;
    }

    public void setEdits(List<ContextManagementEdit> edits) {
        this.edits = edits;
    }

    @Override
    public String toString() {
        return "ContextManagement{" +
                "edits=" + edits +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private List<ContextManagementEdit> edits;

        public Builder edits(List<ContextManagementEdit> edits) {
            this.edits = edits;
            return this;
        }

        public Builder addEdit(ContextManagementEdit edit) {
            if (this.edits == null) {
                this.edits = new ArrayList<>();
            }
            this.edits.add(edit);
            return this;
        }

        public ContextManagement build() {
            ContextManagement contextManagement = new ContextManagement();
            contextManagement.setEdits(edits);
            return contextManagement;
        }
    }
}
