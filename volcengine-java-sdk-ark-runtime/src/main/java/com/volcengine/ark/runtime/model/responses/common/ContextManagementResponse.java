package com.volcengine.ark.runtime.model.responses.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContextManagementResponse {
    @JsonProperty("applied_edits")
    private List<AppliedContextManagementEdit> appliedEdits;

    public List<AppliedContextManagementEdit> getAppliedEdits() {
        return appliedEdits;
    }

    public void setAppliedEdits(List<AppliedContextManagementEdit> appliedEdits) {
        this.appliedEdits = appliedEdits;
    }

    @Override
    public String toString() {
        return "ContextManagementResponse{" +
                "appliedEdits=" + appliedEdits +
                '}';
    }
}
