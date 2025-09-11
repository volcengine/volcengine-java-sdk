package com.volcengine.ark.runtime.model.responses.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.volcengine.ark.runtime.model.responses.item.InputItem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(using = ResponsesInput.ResponsesInputSerializer.class)
public class ResponsesInput {
    private String stringValue;
    private List<InputItem> listValue;

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public List<InputItem> getListValue() {
        return listValue;
    }

    public void setListValue(List<InputItem> listValue) {
        this.listValue = listValue;
    }

    public static class ResponsesInputSerializer extends JsonSerializer<ResponsesInput> {
        @Override
        public void serialize(ResponsesInput value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            if (value.stringValue != null) {
                gen.writeString(value.stringValue);
            } else if (value.listValue != null) {
                gen.writeObject(value.listValue);
            } else {
                gen.writeNull();
            }
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String stringValue;
        private List<InputItem> listValue;

        public Builder stringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder listValue(List<InputItem> listValue) {
            this.listValue = listValue;
            return this;
        }

        public Builder addListItem(InputItem listItem) {
            if (this.listValue == null) {
                this.listValue = new ArrayList<>();
            }
            this.listValue.add(listItem);
            return this;
        }

        public ResponsesInput build() {
            ResponsesInput responsesInput = new ResponsesInput();
            responsesInput.setStringValue(stringValue);
            responsesInput.setListValue(listValue);
            return responsesInput;
        }
    }
}