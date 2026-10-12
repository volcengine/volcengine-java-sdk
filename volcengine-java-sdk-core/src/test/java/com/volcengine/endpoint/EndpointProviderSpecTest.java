package com.volcengine.endpoint;

import com.volcengine.EndpointTestSupport;
import java.lang.reflect.Constructor;
import java.util.*;
import org.junit.Assume;
import org.junit.Test;
import static com.volcengine.EndpointTestSupport.option;
import static org.junit.Assert.*;

public class EndpointProviderSpecTest {

    /** Every branch of the default resolver: unknown service, bootstrap regional, global, dual stack. */
    private static final String[] DEFAULT_SERVICES = {"ecs", "rds_mysql", "pca", "unknown_service"};

    @Test public void testDefaultProvider_invalidRegionRejectedBeforeAnyBranch() {
        DefaultEndpointProvider provider = new DefaultEndpointProvider();
        for (String region : EndpointTestSupport.invalidValues()) {
            for (String service : DEFAULT_SERVICES) {
                for (boolean dual : new boolean[]{false, true}) {
                    ResolveEndpointOption o = option(service, region, dual);
                    // The injected value is a bootstrap region, the regional branch would concatenate it.
                    o.getCustomBootstrapRegion().add(region);
                    EndpointTestSupport.assertValidationError("region", region,
                            assertThrows(EndpointValidationException.class, () -> provider.endpointFor(o)));
                }
            }
        }
    }

    @Test public void testDefaultProvider_invalidServiceRejectedBeforeAnyBranch() {
        DefaultEndpointProvider provider = new DefaultEndpointProvider();
        for (String service : EndpointTestSupport.invalidValues()) {
            for (String region : new String[]{"cn-beijing", "ap-southeast-2", "cn-guangzhou"}) {
                for (boolean dual : new boolean[]{false, true}) {
                    EndpointTestSupport.assertValidationError("service", service, assertThrows(
                            EndpointValidationException.class, () -> provider.endpointFor(option(service, region, dual))));
                }
            }
        }
    }

    @Test public void testDefaultProvider_validValuesResolveToTheSameHosts() {
        Assume.assumeTrue("bootstrap region file configured", System.getenv("VOLC_BOOTSTRAP_REGION_LIST_CONF") == null);
        DefaultEndpointProvider provider = new DefaultEndpointProvider();
        String[][] cases = {
                // service, region, dual, expected host
                {"ecs", "cn-beijing", "false", "ecs.cn-beijing.volcengineapi.com"},
                {"ecs", "cn-beijing", "true", "ecs.cn-beijing.volcengine-api.com"},
                {"rds_mysql", "ap-southeast-2", "false", "rds-mysql.ap-southeast-2.volcengineapi.com"},
                {"rds_mysql", "cn-beijing-autodriving", "true", "rds-mysql.cn-beijing-autodriving.volcengine-api.com"},
                {"pca", "cn-shanghai", "false", "pca.volcengineapi.com"},
                {"pca", "cn-shanghai", "true", "pca.volcengine-api.com"},
                {"ecs", "cn-guangzhou", "false", "open.volcengineapi.com"},
                {"unknown_service", "cn-beijing", "false", "open.volcengineapi.com"},
                {"ecs", "", "false", "open.volcengineapi.com"},
                {"", "cn-beijing", "false", "open.volcengineapi.com"},
        };
        for (String[] c : cases) {
            assertEquals(Arrays.toString(c), c[3],
                    provider.endpointFor(option(c[0], c[1], Boolean.parseBoolean(c[2]))).getEndpoint());
        }
        // A missing service keeps its previous handling.
        ResolveEndpointOption missing = option(null, "cn-beijing", false);
        assertEquals("open.volcengineapi.com", provider.endpointFor(missing).getEndpoint());
    }

    @Test public void testStandardProvider_invalidRegionAndServiceRejected() {
        StandardEndpointProvider provider = new StandardEndpointProvider();
        for (String value : EndpointTestSupport.invalidValues()) {
            for (boolean dual : new boolean[]{false, true}) {
                EndpointTestSupport.assertValidationError("region", value, assertThrows(
                        EndpointValidationException.class, () -> provider.endpointFor(option("ecs", value, dual))));
                EndpointTestSupport.assertValidationError("region", value, assertThrows(
                        EndpointValidationException.class, () -> provider.endpointFor(option("billing", value, dual))));
                EndpointTestSupport.assertValidationError("service", value, assertThrows(
                        EndpointValidationException.class, () -> provider.endpointFor(option(value, "cn-beijing", dual))));
            }
        }
    }

    /**
     * Custom services are looked up by name and the name is rendered into the
     * host: an unknown, user-defined service must be validated as well.
     */
    @Test public void testStandardProvider_customServiceBranchValidated() throws Exception {
        Map<String, Object> custom = new HashMap<>();
        for (String value : EndpointTestSupport.invalidValues()) custom.put(value, serviceInfo(value, false));
        custom.put("my_svc", serviceInfo("my_svc", false));
        custom.put("my_global", serviceInfo("my_global", true));
        StandardEndpointProvider provider = newStandardProvider(custom);
        for (String value : EndpointTestSupport.invalidValues()) {
            EndpointTestSupport.assertValidationError("service", value, assertThrows(
                    EndpointValidationException.class, () -> provider.endpointFor(option(value, "cn-beijing", false))));
        }
        assertEquals("my-svc.cn-beijing.volcengineapi.com", provider.endpointFor(option("my_svc", "cn-beijing", false)).getEndpoint());
        assertEquals("my-global.volcengine-api.com", provider.endpointFor(option("my_global", "cn-beijing", true)).getEndpoint());
    }

    @Test public void testStandardProvider_validValuesResolveToTheSameHosts() {
        StandardEndpointProvider provider = new StandardEndpointProvider();
        assertEquals("ecs.cn-beijing.volcengineapi.com", provider.endpointFor(option("ecs", "cn-beijing", false)).getEndpoint());
        assertEquals("rds-mysql.ap-southeast-1.volcengine-api.com", provider.endpointFor(option("rds_mysql", "ap-southeast-1", true)).getEndpoint());
        assertEquals("billing.volcengineapi.com", provider.endpointFor(option("billing", "cn-beijing", false)).getEndpoint());
        // Missing values keep their previous handling.
        assertEquals("region must not be null.", assertThrows(IllegalArgumentException.class,
                () -> provider.endpointFor(option("ecs", null, false))).getMessage());
        assertEquals("service must not be null.", assertThrows(IllegalArgumentException.class,
                () -> provider.endpointFor(option("", "cn-beijing", false))).getMessage());
        // Values matching the rule but unknown to the resolver keep the previous errors.
        assertTrue(assertThrows(IllegalArgumentException.class, () -> provider.endpointFor(option("ecs", "Redis", false)))
                .getMessage().startsWith("InvalidRegion: invalid region [Redis] for standard endpoint resolver"));
        assertTrue(assertThrows(IllegalArgumentException.class, () -> provider.endpointFor(option("not_a_service", "cn-beijing", false)))
                .getMessage().startsWith("ServiceNotFound:"));
    }

    /** Blank values keep the errors reported before the change. */
    @Test public void testStandardProvider_blankValuesKeepPreviousErrors() {
        StandardEndpointProvider provider = new StandardEndpointProvider();
        for (String blank : new String[]{null, "", "   ", "\t", "\r\n"}) {
            assertEquals("region must not be null.", assertThrows(IllegalArgumentException.class,
                    () -> provider.endpointFor(option("ecs", blank, false))).getMessage());
            assertEquals("service must not be null.", assertThrows(IllegalArgumentException.class,
                    () -> provider.endpointFor(option(blank, "cn-beijing", false))).getMessage());
        }
    }

    @Test public void testStandardProvider_failedResolutionDoesNotAffectNextOne() {
        StandardEndpointProvider shared = new StandardEndpointProvider();
        assertThrows(EndpointValidationException.class, () -> shared.endpointFor(option("ecs", "cn-beijing@127.0.0.1", false)));
        assertThrows(EndpointValidationException.class, () -> shared.endpointFor(option("evil.com#", "cn-beijing", false)));
        assertEquals("ecs.cn-shanghai.volcengineapi.com", shared.endpointFor(option("ecs", "cn-shanghai", false)).getEndpoint());
    }

    static Object serviceInfo(String service, boolean global) throws Exception {
        Class<?> type = Class.forName("com.volcengine.endpoint.StandardEndpointProvider$ServiceInfo");
        Constructor<?> constructor = type.getDeclaredConstructor(String.class, boolean.class);
        constructor.setAccessible(true);
        return constructor.newInstance(service, global);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    static StandardEndpointProvider newStandardProvider(Map<String, Object> custom) {
        return new StandardEndpointProvider(StandardEndpointProvider.DEFAULT_FORMAT,
                StandardEndpointProvider.SiteStackVolcIPv4, new HashMap<>(), (Map) custom);
    }
}
