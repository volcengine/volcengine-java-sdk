package com.volcengine.endpoint;

import com.volcengine.EndpointTestSupport;
import org.junit.Test;
import static org.junit.Assert.*;

/** 同一个断言用于修复版本和隔离基线的反证执行。 */
public class EndpointSecurityRegressionTest {
    @Test public void testDefaultProvider_rejectsRegionAuthorityInjection() {
        ResolveEndpointOption option = EndpointTestSupport.option("ecs", "cn-beijing@127.0.0.1/#", false);
        option.getCustomBootstrapRegion().add(option.getRegion());
        assertTrue(assertThrows(IllegalArgumentException.class,
                () -> new DefaultEndpointProvider().endpointFor(option)).getMessage().startsWith("InvalidRegion:"));
    }
    @Test public void testDefaultProvider_rejectsServicePathInjectionBeforeFallback() {
        assertTrue(assertThrows(IllegalArgumentException.class,
                () -> new DefaultEndpointProvider().endpointFor(EndpointTestSupport.option("ecs/get/", "cn-beijing", false)))
                .getMessage().startsWith("InvalidService:"));
    }
}
