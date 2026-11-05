package com.volcengine.endpoint;

import com.volcengine.EndpointTestSupport;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class EndpointValidationTest {
    @Parameterized.Parameters(name = "payload-{0}")
    public static Collection<Object[]> parameters() { return EndpointTestSupport.payloadParameters(); }
    private final String payload;
    public EndpointValidationTest(int index, String payload) { this.payload = payload; }

    @Test public void testValidate_rejectServiceAndRegionWithoutEchoingPayload() {
        IllegalArgumentException service = assertThrows(IllegalArgumentException.class,
                () -> EndpointValidation.validateServiceAndRegion(payload, "cn-beijing"));
        IllegalArgumentException region = assertThrows(IllegalArgumentException.class,
                () -> EndpointValidation.validateServiceAndRegion("ecs", payload));
        assertTrue(service.getMessage().startsWith("InvalidService:"));
        assertTrue(region.getMessage().startsWith("InvalidRegion:"));
        assertFalse(service.getMessage().contains("\n"));
        assertFalse(service.getMessage().contains("\r"));
        assertFalse(region.getMessage().contains("\n"));
    }

    @Test public void testProviders_rejectBeforeFallbackAndBootstrapMutation() {
        for (EndpointResolver provider : new EndpointResolver[]{new DefaultEndpointProvider(), new StandardEndpointProvider()}) {
            // StandardEndpointProvider 先做原有的非空检查，纯空白值保持原有报错。
            boolean blank = provider instanceof StandardEndpointProvider && org.apache.commons.lang.StringUtils.isBlank(payload);
            ResolveEndpointOption option = EndpointTestSupport.option(payload, "cn-beijing", false);
            java.util.Set<String> original = new java.util.HashSet<>(option.getCustomBootstrapRegion());
            assertTrue(assertThrows(IllegalArgumentException.class, () -> provider.endpointFor(option))
                    .getMessage().startsWith(blank ? "service must not be null." : "InvalidService:"));
            option.setService("ecs"); option.setRegion(payload);
            assertTrue(assertThrows(IllegalArgumentException.class, () -> provider.endpointFor(option))
                    .getMessage().startsWith(blank ? "region must not be null." : "InvalidRegion:"));
            assertEquals(original, option.getCustomBootstrapRegion());
            option.setRegion("cn-beijing");
            assertEquals("ecs.cn-beijing.volcengineapi.com", provider.endpointFor(option).getEndpoint());
        }
    }
}
