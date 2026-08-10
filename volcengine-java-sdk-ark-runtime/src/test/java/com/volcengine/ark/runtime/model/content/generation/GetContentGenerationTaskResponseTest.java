package com.volcengine.ark.runtime.model.content.generation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.ark.runtime.service.ArkService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetContentGenerationTaskResponseTest {

    private final ObjectMapper objectMapper = ArkService.defaultObjectMapper();

    @Test
    public void deserializesOutputFormat() throws Exception {
        GetContentGenerationTaskResponse response = objectMapper.readValue(
                "{\"output_format\":\"mp4\"}",
                GetContentGenerationTaskResponse.class);

        assertEquals("mp4", response.getOutputFormat());
    }

    @Test
    public void deserializesFractionalDuration() throws Exception {
        GetContentGenerationTaskResponse response = objectMapper.readValue(
                "{\"duration\":5.5}",
                GetContentGenerationTaskResponse.class);

        assertEquals(Double.valueOf(5.5), response.getDuration());
    }

    @Test
    public void deserializesIntegralDurationAsDouble() throws Exception {
        GetContentGenerationTaskResponse response = objectMapper.readValue(
                "{\"duration\":5}",
                GetContentGenerationTaskResponse.class);

        assertEquals(Double.valueOf(5.0), response.getDuration());
    }
}
