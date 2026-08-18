package com.volcengine.ark.runtime.model.images.generation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.ark.runtime.service.ArkService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ImageGenerationUsageTest {

    private final ObjectMapper objectMapper = ArkService.defaultObjectMapper();

    @Test
    public void inputImagesIsOptionalWhenDeserializingUsage() throws Exception {
        ImagesResponse response = objectMapper.readValue(
                "{\"usage\":{\"generated_images\":1}}", ImagesResponse.class);
        ImageGenStreamEvent event = objectMapper.readValue(
                "{\"usage\":{\"generated_images\":1}}", ImageGenStreamEvent.class);

        assertNull(response.getUsage().getInputImages());
        assertNull(event.getUsage().getInputImages());
    }

    @Test
    public void inputImagesDeserializesWhenPresent() throws Exception {
        ImagesResponse response = objectMapper.readValue(
                "{\"usage\":{\"input_images\":2}}", ImagesResponse.class);
        ImageGenStreamEvent event = objectMapper.readValue(
                "{\"usage\":{\"input_images\":2}}", ImageGenStreamEvent.class);

        assertEquals(Integer.valueOf(2), response.getUsage().getInputImages());
        assertEquals(Integer.valueOf(2), event.getUsage().getInputImages());
    }
}
