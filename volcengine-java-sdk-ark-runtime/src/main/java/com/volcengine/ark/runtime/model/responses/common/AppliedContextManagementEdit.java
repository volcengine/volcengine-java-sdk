package com.volcengine.ark.runtime.model.responses.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppliedContextManagementEdit {
    @JsonProperty("type")
    private String type;

    @JsonProperty("cleared_thinking_turns")
    private Integer clearedThinkingTurns;

    @JsonProperty("cleared_tool_uses")
    private Integer clearedToolUses;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getClearedThinkingTurns() {
        return clearedThinkingTurns;
    }

    public void setClearedThinkingTurns(Integer clearedThinkingTurns) {
        this.clearedThinkingTurns = clearedThinkingTurns;
    }

    public Integer getClearedToolUses() {
        return clearedToolUses;
    }

    public void setClearedToolUses(Integer clearedToolUses) {
        this.clearedToolUses = clearedToolUses;
    }

    @Override
    public String toString() {
        return "AppliedContextManagementEdit{" +
                "type='" + type + '\'' +
                ", clearedThinkingTurns=" + clearedThinkingTurns +
                ", clearedToolUses=" + clearedToolUses +
                '}';
    }
}
