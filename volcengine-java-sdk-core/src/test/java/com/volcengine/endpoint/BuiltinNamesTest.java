package com.volcengine.endpoint;

import com.volcengine.ApiClient;
import com.volcengine.EndpointTestSupport;
import com.volcengine.Pair;
import com.volcengine.auth.StsAssumeRoleProvider;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.junit.Assume;
import org.junit.Test;
import static com.volcengine.EndpointTestSupport.option;
import static org.junit.Assert.*;

/**
 * Every built-in service and region must pass the validation, and the endpoints
 * resolved for them must be the ones the resolvers produced before.
 */
public class BuiltinNamesTest {

    private static Object staticField(Class<?> type, String name) throws Exception {
        Field f = type.getDeclaredField(name);
        f.setAccessible(true);
        return f.get(null);
    }

    private static Object field(Object target, String name) throws Exception {
        Field f = target.getClass().getDeclaredField(name);
        f.setAccessible(true);
        return f.get(target);
    }

    private static Map<?, ?> defaultEndpointMap() throws Exception {
        return (Map<?, ?>) staticField(DefaultEndpointProvider.class, "DEFAULT_ENDPOINT_MAP");
    }

    private static Map<?, ?> standardServiceInfos() throws Exception {
        return (Map<?, ?>) staticField(StandardEndpointProvider.class, "SERVICE_INFOS");
    }

    private static Set<String> builtinServices() throws Exception {
        Set<String> services = new TreeSet<>();
        for (Map.Entry<?, ?> e : defaultEndpointMap().entrySet()) {
            services.add((String) e.getKey());
            services.add((String) field(e.getValue(), "service"));
        }
        for (Map.Entry<?, ?> e : standardServiceInfos().entrySet()) {
            services.add((String) e.getKey());
            services.add((String) field(e.getValue(), "service"));
        }
        services.add((String) staticField(com.volcengine.feature.rds.auth.ConnectUtils.class, "SERVICE_NAME"));
        services.addAll(generatedApiServices());
        return services;
    }

    @SuppressWarnings("unchecked")
    private static Set<String> builtinRegions() throws Exception {
        Set<String> regions = new TreeSet<>();
        for (Field f : DefaultEndpointProvider.class.getDeclaredFields()) {
            if (Modifier.isStatic(f.getModifiers()) && f.getName().startsWith("REGION_CODE_")) {
                regions.add((String) f.get(null));
            }
        }
        regions.addAll((Set<String>) staticField(DefaultEndpointProvider.class, "BOOTSTRAP_REGION"));
        Object matcher = staticField(StandardEndpointProvider.class, "REGION_MATCHER");
        regions.addAll(((Map<String, ?>) field(matcher, "whiteRegions")).keySet());
        // Default instances.
        regions.add(new StsAssumeRoleProvider("<TEST_AK>", "<TEST_SK>", "role", "account").getRegion());
        regions.add("cn-beijing"); // SsoPortalClient and CLI config default
        return regions;
    }

    /**
     * Service names of the generated API clients of every module: the third
     * segment of each {@code localVarPath}. Skipped when the sources of the
     * other modules are not available.
     */
    static Set<String> generatedApiServices() throws IOException {
        Path root = Paths.get("..").toAbsolutePath().normalize();
        Set<String> services = new TreeSet<>();
        if (!Files.isDirectory(root.resolve("volcengine-java-sdk-ecs"))) return services;
        Pattern path = Pattern.compile("localVarPath = \"/[^/\"]*/[^/\"]*/([^/\"]*)/");
        try (Stream<Path> files = Files.walk(root, 12)) {
            for (Path p : (Iterable<Path>) files::iterator) {
                String name = p.toString();
                if (!name.endsWith("Api.java") || !name.contains("/src/main/java/")) continue;
                Matcher m = path.matcher(new String(Files.readAllBytes(p), StandardCharsets.UTF_8));
                while (m.find()) services.add(m.group(1));
            }
        }
        return services;
    }

    @Test public void testAllBuiltinNamesPassValidation() throws Exception {
        Set<String> services = builtinServices();
        Set<String> regions = builtinRegions();
        assertTrue("services: " + services.size(), services.size() >= 100);
        assertTrue("regions: " + regions.size(), regions.size() >= 50);
        for (String s : services) EndpointValidation.validateService(s);
        for (String r : regions) EndpointValidation.validateRegion(r);
        Set<String> generated = generatedApiServices();
        Assume.assumeFalse("generated API sources not available", generated.isEmpty());
        assertTrue("generated services: " + generated.size(), generated.size() >= 100);
    }

    private static String std(String service) {
        return service.toLowerCase().replaceAll("_", "-");
    }

    /** Endpoint the default resolver produced before the change, for a bootstrap region. */
    private static String expectedDefault(Object info, String service, String region, boolean bootstrap, boolean dual) throws Exception {
        if (info == null || !bootstrap) return "open.volcengineapi.com";
        String suffix = dual ? ".volcengine-api.com" : ".volcengineapi.com";
        if ((Boolean) field(info, "isGlobal")) {
            String global = (String) field(info, "globalEndpoint");
            return global.isEmpty() ? std(service) + suffix : global;
        }
        Map<?, ?> regional = (Map<?, ?>) field(info, "regionEndpointMap");
        if (regional != null && regional.get(region) != null) return (String) regional.get(region);
        return std(service) + "." + region + suffix;
    }

    @Test public void testBuiltinNamesResolveToTheSameHosts() throws Exception {
        Assume.assumeTrue("bootstrap region file configured", System.getenv("VOLC_BOOTSTRAP_REGION_LIST_CONF") == null);
        Set<String> regions = builtinRegions();
        DefaultEndpointProvider defaults = new DefaultEndpointProvider();
        Map<?, ?> map = defaultEndpointMap();
        Set<String> services = builtinServices();
        int checked = 0;
        for (String service : services) {
            for (String region : regions) {
                for (boolean dual : new boolean[]{false, true}) {
                    for (boolean bootstrap : new boolean[]{false, true}) {
                        ResolveEndpointOption o = option(service, region, dual);
                        o.setCustomBootstrapRegion(bootstrap ? Collections.singleton(region) : Collections.<String>emptySet());
                        boolean isBootstrap = bootstrap || ((Set<?>) staticField(DefaultEndpointProvider.class, "BOOTSTRAP_REGION")).contains(region);
                        assertEquals(service + "/" + region, expectedDefault(map.get(service), service, region, isBootstrap, dual),
                                defaults.endpointFor(o).getEndpoint());
                        checked++;
                    }
                }
            }
        }
        StandardEndpointProvider standard = new StandardEndpointProvider();
        Object matcher = staticField(StandardEndpointProvider.class, "REGION_MATCHER");
        @SuppressWarnings("unchecked")
        Set<String> white = ((Map<String, ?>) field(matcher, "whiteRegions")).keySet();
        for (Map.Entry<?, ?> e : standardServiceInfos().entrySet()) {
            String service = (String) e.getKey();
            boolean global = (Boolean) field(e.getValue(), "isGlobal");
            for (String region : white) {
                for (boolean dual : new boolean[]{false, true}) {
                    String expected = std(service) + (global ? "" : "." + region) + (dual ? ".volcengine-api.com" : ".volcengineapi.com");
                    assertEquals(expected, standard.endpointFor(option(service, region, dual)).getEndpoint());
                    checked++;
                }
            }
        }
        assertTrue(checked > 10000);
    }

    /** End to end: requests of every generated service still go to the configured host and are signed. */
    @Test public void testGeneratedServicesRequestsUnchanged() throws Exception {
        Assume.assumeTrue("bootstrap region file configured", System.getenv("VOLC_BOOTSTRAP_REGION_LIST_CONF") == null);
        Set<String> generated = generatedApiServices();
        Assume.assumeFalse("generated API sources not available", generated.isEmpty());
        Map<?, ?> map = defaultEndpointMap();
        try (EndpointTestSupport.Fixture f = new EndpointTestSupport.Fixture("cn-beijing", EndpointTestSupport.Resolver.DEFAULT)) {
            int n = 0;
            for (String service : generated) {
                f.client.execute(f.call(service), Map.class);
                n++;
                assertEquals(service, expectedDefault(map.get(service), service, "cn-beijing", true, false),
                        f.http.lastRequest.httpUrl().host());
                assertTrue(f.http.lastRequest.header("Authorization").contains("/cn-beijing/" + service + "/request"));
            }
            f.assertSigned(n);
        }
    }
}
