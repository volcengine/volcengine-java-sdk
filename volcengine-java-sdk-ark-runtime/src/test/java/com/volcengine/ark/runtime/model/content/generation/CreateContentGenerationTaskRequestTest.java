package com.volcengine.ark.runtime.model.content.generation;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.ark.runtime.service.ArkService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CreateContentGenerationTaskRequestTest {

    private final ObjectMapper objectMapper = ArkService.defaultObjectMapper();

    @Test
    public void serializesOutputFormatAsTopLevelString() throws Exception {
        CreateContentGenerationTaskRequest request = CreateContentGenerationTaskRequest.builder()
                .outputFormat("mp4")
                .build();

        JsonNode json = objectMapper.readTree(objectMapper.writeValueAsString(request));

        assertTrue(json.get("output_format").isTextual());
        assertEquals("mp4", json.get("output_format").asText());
    }

    @Test
    public void omitsOutputFormatByDefault() throws Exception {
        CreateContentGenerationTaskRequest request = CreateContentGenerationTaskRequest.builder().build();

        JsonNode json = objectMapper.readTree(objectMapper.writeValueAsString(request));

        assertFalse(json.has("output_format"));
    }
}
