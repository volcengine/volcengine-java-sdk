package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.volcengine.ark.runtime.model.responses.content.InputContentItem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(using = MessageContent.MessageContentSerializer.class)
@JsonDeserialize(using = MessageContent.MessageContentDeserializer.class)
public class MessageContent {
    private String stringValue;
    private List<InputContentItem> listValue;

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public List<InputContentItem> getListValue() {
        return listValue;
    }

    public void setListValue(List<InputContentItem> listValue) {
        this.listValue = listValue;
    }

    public static class MessageContentSerializer extends JsonSerializer<MessageContent> {
        @Override
        public void serialize(MessageContent value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            if (value.stringValue != null) {
                gen.writeString(value.stringValue);
            } else if (value.listValue != null) {
                gen.writeObject(value.listValue);
            } else {
                gen.writeNull();
            }
        }
    }

    public static class MessageContentDeserializer extends JsonDeserializer<MessageContent> {
        @Override
        public MessageContent deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            JsonNode node = p.getCodec().readTree(p);
            MessageContent result = new MessageContent();

            if (node.isTextual()) {
                result.setStringValue(node.asText());
            } else if (node.isArray()) {
                List<InputContentItem> list = new ArrayList<>();
                for (JsonNode itemNode : node) {
                    InputContentItem item = p.getCodec().treeToValue(itemNode, InputContentItem.class);
                    list.add(item);
                }
                result.setListValue(list);
            } else {
                throw new IOException("Unexpected JSON type for MessageContent");
            }

            return result;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String stringValue;
        private List<InputContentItem> listValue;

        public Builder stringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder listValue(List<InputContentItem> listValue) {
            this.listValue = listValue;
            return this;
        }

        public Builder addListItem(InputContentItem listValue) {
            if (this.listValue == null) {
                this.listValue = new ArrayList<>();
            }
            this.listValue.add(listValue);
            return this;
        }

        public MessageContent build() {
            MessageContent messageContent = new MessageContent();
            messageContent.setStringValue(stringValue);
            messageContent.setListValue(listValue);
            return messageContent;
        }
    }
}