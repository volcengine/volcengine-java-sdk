package com.volcengine.endpoint;

import com.volcengine.EndpointTestSupport;
import java.util.*;
import java.util.concurrent.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class EndpointProviderTest {
    @Test public void testValidate_allAllowedAsciiAndMissingValues() {
        EndpointValidation.validateServiceAndRegion("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_0123456789", "aZ_-09");
        EndpointValidation.validateServiceAndRegion(null, null);
        EndpointValidation.validateServiceAndRegion("", "");
    }

    @Test public void testProviders_compatibilityMatrix() {
        for (EndpointResolver provider : new EndpointResolver[]{new DefaultEndpointProvider(), new StandardEndpointProvider()}) {
            assertEquals("ecs.cn-beijing.volcengineapi.com", provider.endpointFor(EndpointTestSupport.option("ecs", "cn-beijing", false)).getEndpoint());
            assertEquals("ecs.cn-shanghai.volcengine-api.com", provider.endpointFor(EndpointTestSupport.option("ecs", "cn-shanghai", true)).getEndpoint());
            assertEquals("iam.volcengineapi.com", provider.endpointFor(EndpointTestSupport.option("iam", "cn-beijing", false)).getEndpoint());
            assertEquals("rds-mysql.cn-beijing.volcengineapi.com", provider.endpointFor(EndpointTestSupport.option("rds_mysql", "cn-beijing", false)).getEndpoint());
            assertEquals(provider instanceof DefaultEndpointProvider ? "open.volcengineapi.com" : "ecs-ops.volcengineapi.com", provider.endpointFor(EndpointTestSupport.option("ecs_ops", "cn-beijing", false)).getEndpoint());
        }
    }

    @Test public void testDefault_fallbackAndBootstrapArePreserved() {
        DefaultEndpointProvider provider = new DefaultEndpointProvider();
        assertEquals("open.volcengineapi.com", provider.endpointFor(EndpointTestSupport.option("unknown_9", "cn-beijing", false)).getEndpoint());
        ResolveEndpointOption option = EndpointTestSupport.option("ecs", "cn-beijing", false);
        option.setCustomBootstrapRegion(Collections.emptySet());
        assertEquals("open.volcengineapi.com", provider.endpointFor(option).getEndpoint());
        option.setRegion("cn-beijing-autodriving");
        assertEquals("ecs.cn-beijing-autodriving.volcengineapi.com", provider.endpointFor(option).getEndpoint());
        for (String missing : new String[]{null, ""}) {
            assertEquals("open.volcengineapi.com", provider.endpointFor(EndpointTestSupport.option(missing, "cn-beijing", false)).getEndpoint());
            if (missing == null) {
                // 基线已知服务的 null region 会在 bootstrap 判定解引用；保留原有规则。
                assertThrows(NullPointerException.class, () -> provider.endpointFor(EndpointTestSupport.option("ecs", null, false)));
            } else {
                assertEquals("open.volcengineapi.com", provider.endpointFor(EndpointTestSupport.option("ecs", missing, false)).getEndpoint());
            }
        }
    }

    @Test public void testStandard_missingUnknownAndInternalTemplate() {
        StandardEndpointProvider provider = new StandardEndpointProvider();
        for (String missing : new String[]{null, ""}) {
            assertEquals("service must not be null.", assertThrows(IllegalArgumentException.class,
                    () -> provider.endpointFor(EndpointTestSupport.option(missing, "cn-beijing", false))).getMessage());
            assertEquals("region must not be null.", assertThrows(IllegalArgumentException.class,
                    () -> provider.endpointFor(EndpointTestSupport.option("ecs", missing, false))).getMessage());
        }
        assertTrue(assertThrows(IllegalArgumentException.class,
                () -> provider.endpointFor(EndpointTestSupport.option("unknown_9", "cn-beijing", false))).getMessage().startsWith("ServiceNotFound:"));
        assertTrue(assertThrows(IllegalArgumentException.class,
                () -> provider.endpointFor(EndpointTestSupport.option("ecs", "invalid", false))).getMessage().startsWith("InvalidRegion:"));
        StandardEndpointProvider internal = new StandardEndpointProvider("${Service}${Region}.${Zone}", "ignored",
                Collections.singletonMap("Zone", "internal.example"), null);
        assertEquals("rds-mysql.cn-beijing.internal.example", internal.endpointFor(EndpointTestSupport.option("rds_mysql", "cn-beijing", false)).getEndpoint());
        StandardEndpointProvider emptyFormat = new StandardEndpointProvider("", null, null, null);
        assertEquals("ecs.cn-beijing.volcengineapi.com", emptyFormat.endpointFor(EndpointTestSupport.option("ecs", "cn-beijing", false)).getEndpoint());
    }

    @Test(timeout = 20000) public void testStandard_sharedResolverHasNoCrossRequestState() throws Exception {
        final StandardEndpointProvider provider = new StandardEndpointProvider();
        final String[] services = {"ecs", "iam", "rds_mysql", "ecs_ops"};
        final String[] expectedServices = {"ecs", "iam", "rds-mysql", "ecs-ops"};
        final String[] regions = {"cn-beijing", "cn-shanghai", "ap-southeast-1", "cn-beijing-autodriving"};
        ExecutorService pool = Executors.newFixedThreadPool(4);
        CyclicBarrier barrier = new CyclicBarrier(4);
        List<Future<?>> futures = new ArrayList<>();
        try {
            for (int worker = 0; worker < 4; worker++) {
                final int index = worker;
                futures.add(pool.submit(() -> {
                    for (int iteration = 0; iteration < 300; iteration++) {
                        barrier.await(5, TimeUnit.SECONDS);
                        boolean dual = (iteration % 2) == 0;
                        String expected = expectedServices[index] + (index % 2 == 0 ? "." + regions[index] : "")
                                + (dual ? ".volcengine-api.com" : ".volcengineapi.com");
                        assertEquals(expected, provider.endpointFor(EndpointTestSupport.option(services[index], regions[index], dual)).getEndpoint());
                        assertThrows(IllegalArgumentException.class,
                                () -> provider.endpointFor(EndpointTestSupport.option("ecs/other", regions[index], false)));
                    }
                    return null;
                }));
            }
            for (Future<?> future : futures) future.get(15, TimeUnit.SECONDS);
        } finally {
            pool.shutdownNow();
            assertTrue(pool.awaitTermination(5, TimeUnit.SECONDS));
        }
        assertEquals("ecs.cn-beijing.volcengineapi.com", provider.endpointFor(EndpointTestSupport.option("ecs", "cn-beijing", false)).getEndpoint());
    }
}
