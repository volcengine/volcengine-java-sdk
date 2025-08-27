package com.volcengine.ark.runtime.model.responses.tool;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(using = ResponsesToolChoice.ResponsesToolChoiceSerializer.class)
public class ResponsesToolChoice {
    private String mode;
    private FunctionToolChoice functionToolChoice;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public FunctionToolChoice getFunctionToolChoice() {
        return functionToolChoice;
    }

    public void setFunctionToolChoice(FunctionToolChoice functionToolChoice) {
        this.functionToolChoice = functionToolChoice;
    }

    @Override
    public String toString() {
        return "ResponsesToolChoice{" +
                "mode='" + mode + '\'' +
                ", functionToolChoice=" + functionToolChoice +
                '}';
    }

    public static class ResponsesToolChoiceSerializer extends JsonSerializer<ResponsesToolChoice> {
        @Override
        public void serialize(ResponsesToolChoice value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            if (value.mode != null) {
                gen.writeString(value.mode);
            } else if (value.functionToolChoice != null) {
                gen.writeObject(value.functionToolChoice);
            } else {
                gen.writeNull();
            }
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String mode;
        private FunctionToolChoice functionToolChoice;

        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        public Builder functionToolChoice(FunctionToolChoice functionToolChoice) {
            this.functionToolChoice = functionToolChoice;
            return this;
        }

        public ResponsesToolChoice build() {
            ResponsesToolChoice responsesToolChoice = new ResponsesToolChoice();
            responsesToolChoice.setMode(mode);
            responsesToolChoice.setFunctionToolChoice(functionToolChoice);
            return responsesToolChoice;
        }
    }
}