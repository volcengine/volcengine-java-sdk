package com.volcengine;

import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class UniversalApiTest {
    @Parameterized.Parameters(name = "payload-{0}")
    public static Collection<Object[]> parameters() { return EndpointTestSupport.payloadParameters(); }
    private final String payload;
    public UniversalApiTest(int index, String payload) { this.payload = payload; }

    @Test public void testDoCall_rawServiceRejectedBeforePathSplitting() throws Exception {
        try (EndpointTestSupport.Fixture f = new EndpointTestSupport.Fixture("cn-beijing", true)) {
            UniversalApi api = new UniversalApi(f.client);
            UniversalRequest request = new UniversalRequest(payload, "DescribeInstances", "2020-04-01");
            ApiException e = assertThrows(ApiException.class, () -> api.doCall(request, Collections.emptyMap()));
            assertTrue(e.getCause() instanceof IllegalArgumentException);
            assertTrue(e.getCause().getMessage().startsWith("InvalidService:"));
            f.assertUntouched();
            assertEquals("cn-beijing", f.client.getRegion());
            assertEquals(payload, request.getServiceName());
        }
    }

    @Test public void testDoCall_regionRejectedWithoutConstructorFailure() throws Exception {
        try (EndpointTestSupport.Fixture f = new EndpointTestSupport.Fixture(payload, true)) {
            UniversalApi api = new UniversalApi(f.client);
            assertEquals(payload, f.client.getRegion());
            ApiException e = assertThrows(ApiException.class,
                    () -> api.doCall(new UniversalRequest("ecs", "DescribeInstances", "2020-04-01"), Collections.emptyMap()));
            assertTrue(e.getCause().getMessage().startsWith("InvalidRegion:"));
            f.assertUntouched();
        }
    }
}
