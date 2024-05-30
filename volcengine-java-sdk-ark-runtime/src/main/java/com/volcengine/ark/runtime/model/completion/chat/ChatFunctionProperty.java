package com.volcengine.ark.runtime.model.completion.chat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.volcengine.ark.runtime.utils.JacksonUtil;

import java.util.Set;

public class ChatFunctionProperty {

    @JsonIgnore
    String name;

    String type;

    @JsonIgnore
    Boolean required;

    String description;

    ChatFunctionProperty items;

    @JsonProperty("enum")
    Set<?> enumValues;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ChatFunctionProperty getItems() {
        return items;
    }

    public void setItems(ChatFunctionProperty items) {
        this.items = items;
    }

    public Set<?> getEnumValues() {
        return enumValues;
    }

    public void setEnumValues(Set<?> enumValues) {
        this.enumValues = enumValues;
    }

    public ChatFunctionProperty.Builder builder() {
        return new ChatFunctionProperty.Builder();
    }

    @Override
    public String toString() {
        return "ChatFunctionProperty{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", required=" + required +
                ", description='" + description + '\'' +
                ", items=" + items +
                ", enumValues=" + enumValues +
                '}';
    }

    public static final class Builder {
        private String name;
        private String type;
        private Boolean required;
        private String description;
        private ChatFunctionProperty items;
        private Set<?> enumValues;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder required(Boolean required) {
            this.required = required;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder items(ChatFunctionProperty items) {
            this.items = items;
            return this;
        }

        public Builder enumValues(Set<?> enumValues) {
            this.enumValues = enumValues;
            return this;
        }

        public ChatFunctionProperty build() {
            ChatFunctionProperty chatFunctionProperty = new ChatFunctionProperty();
            chatFunctionProperty.setName(name);
            chatFunctionProperty.setType(type);
            chatFunctionProperty.setRequired(required);
            chatFunctionProperty.setDescription(description);
            chatFunctionProperty.setItems(items);
            chatFunctionProperty.setEnumValues(enumValues);
            return chatFunctionProperty;
        }
    }
}