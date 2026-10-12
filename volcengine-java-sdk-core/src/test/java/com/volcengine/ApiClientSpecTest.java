package com.volcengine;

import com.volcengine.EndpointTestSupport.Fixture;
import com.volcengine.EndpointTestSupport.Resolver;
import com.volcengine.EndpointTestSupport.ResultCallback;
import com.volcengine.endpoint.StandardEndpointProvider;
import com.volcengine.interceptor.InterceptorContext;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApiClientSpecTest {

    private static Map<String, Object> body() {
        Map<String, Object> body = new HashMap<>();
        body.put("RoleSessionName", "unit-test");
        return body;
    }

    /** Generated client, sync and async: no resolver, no credentials, no signing, no HTTP call. */
    @Test public void testGeneratedClient_invalidRegionFailsBeforeSigningAndSending() throws Exception {
        for (String region : EndpointTestSupport.invalidValues()) {
            for (Resolver resolver : new Resolver[]{Resolver.DEFAULT, Resolver.FAILING}) {
                try (Fixture f = new Fixture(region, resolver)) {
                    FakeGeneratedStsApi api = new FakeGeneratedStsApi(f.client);
                    EndpointTestSupport.assertApiValidationError("region", region,
                            assertThrows(ApiException.class, () -> api.assumeRole(body())));
                    ResultCallback callback = new ResultCallback();
                    api.assumeRoleAsync(body(), callback);
                    callback.await();
                    assertEquals(1, callback.failures.get());
                    assertEquals(0, callback.successes.get());
                    // 回调状态码与原有行为一致（未收到响应为 0），400 由 ApiException.getCode() 携带。
                    assertEquals(0, callback.status);
                    EndpointTestSupport.assertApiValidationError("region", region, callback.error);
                    f.assertUntouched();
                    assertEquals(0, f.resolverCalls.get());
                }
            }
        }
    }

    @Test public void testInvalidServiceFailsBeforeCustomResolver() throws Exception {
        for (String service : EndpointTestSupport.invalidValues()) {
            // A '/' changes how the path is split, raw service names are covered by UniversalApiTest.
            if (service.contains("/")) continue;
            try (Fixture f = new Fixture("cn-beijing", Resolver.FAILING)) {
                EndpointTestSupport.assertApiValidationError("service", service,
                        assertThrows(ApiException.class, () -> f.client.execute(f.call(service), Map.class)));
                ResultCallback callback = new ResultCallback();
                f.client.executeAsync(f.call(service), Map.class, callback);
                callback.await();
                // 回调状态码与原有行为一致（未收到响应为 0），400 由 ApiException.getCode() 携带。
                    assertEquals(0, callback.status);
                EndpointTestSupport.assertApiValidationError("service", service, callback.error);
                f.assertUntouched();
                assertEquals(0, f.resolverCalls.get());
            }
        }
    }

    /**
     * Calls the internal request pipeline directly with a built request: the
     * signing headers are never added. The same request with a valid region is
     * signed, proving the pipeline does sign when it is reached.
     */
    @Test public void testInvalidRegionNeverSignsTheRequest() throws Exception {
        for (String region : new String[]{"cn-beijing@127.0.0.1", "evil.com", "cn-beijing-"}) {
            try (Fixture f = new Fixture(region, Resolver.DEFAULT)) {
                InterceptorContext context = f.call("ecs");
                context.setApiClient(f.client);
                EndpointTestSupport.assertApiValidationError("region", region,
                        assertThrows(ApiException.class, () -> EndpointTestSupport.chain(f.client).executeRequest(context)));
                Map<String, String> headers = context.getRequestContext().getHeaderParams();
                if (headers != null) {
                    assertFalse(headers.containsKey("Authorization"));
                    assertFalse(headers.containsKey("X-Date"));
                }
                assertNull(context.getRequestContext().getRequest());
                assertNull(context.getRequestContext().getHost());
                f.assertUntouched();
            }
        }
        try (Fixture f = new Fixture("cn-beijing", Resolver.DEFAULT)) {
            InterceptorContext context = f.call("ecs");
            context.setApiClient(f.client);
            EndpointTestSupport.chain(f.client).executeRequest(context);
            assertTrue(context.getRequestContext().getHeaderParams().get("Authorization").startsWith("HMAC-SHA256"));
            assertNotNull(context.getRequestContext().getHeaderParams().get("X-Date"));
            assertNotNull(context.getRequestContext().getRequest().header("Authorization"));
            assertEquals("ecs.cn-beijing.volcengineapi.com", context.getRequestContext().getRequest().httpUrl().host());
            assertEquals(1, f.credentials.get());
            assertEquals(0, f.http.calls.get());
        }
    }

    /** The client is built with a valid region, then changed to an invalid one and back. */
    @Test public void testDeferredErrorAfterSetRegionAndRecovery() throws Exception {
        try (Fixture f = new Fixture("cn-beijing", Resolver.DEFAULT)) {
            FakeGeneratedStsApi api = new FakeGeneratedStsApi(f.client);
            // Generated clients unwrap the "Result" member.
            assertEquals(Boolean.TRUE, api.assumeRole(body()).get("ok"));
            assertEquals("sts.cn-beijing.volcengineapi.com", f.http.lastRequest.httpUrl().host());
            f.assertSigned(1);

            f.client.setRegion("cn-beijing@127.0.0.1");
            EndpointTestSupport.assertApiValidationError("region", "cn-beijing@127.0.0.1",
                    assertThrows(ApiException.class, () -> api.assumeRole(body())));
            f.assertSigned(1);

            f.client.setRegion("cn-beijing");
            api.assumeRole(body());
            assertEquals("sts.cn-beijing.volcengineapi.com", f.http.lastRequest.httpUrl().host());
            assertTrue(f.http.lastRequest.header("Authorization").contains("/cn-beijing/sts/request"));
            f.assertSigned(2);
        }
    }

    /** Construction never fails, whatever the region. */
    @Test public void testClientConstructionNeverFails() throws Exception {
        for (String region : EndpointTestSupport.invalidValues()) {
            ApiClient client = new ApiClient().setRegion(region);
            assertEquals(region, client.getRegion());
            new FakeGeneratedStsApi(client);
            new UniversalApi(client);
        }
    }

    /** Explicit endpoints are used as is, the region is not validated by the host building step. */
    @Test public void testExplicitEndpointKeepsHostAndIsNotValidated() throws Exception {
        try (Fixture f = new Fixture("custom.region", Resolver.FAILING)) {
            f.client.setEndpoint("custom.internal.example:8443");
            new FakeGeneratedStsApi(f.client).assumeRole(body());
            assertEquals("custom.internal.example", f.http.lastRequest.httpUrl().host());
            assertEquals(8443, f.http.lastRequest.httpUrl().port());
            ResultCallback callback = new ResultCallback();
            f.client.executeAsync(f.call("ecs"), Map.class, callback);
            callback.await();
            assertEquals(1, callback.successes.get());
            assertEquals(0, f.resolverCalls.get());
            f.assertSigned(2);
        }
    }

    @Test public void testRejectedWithAutomaticRetriesEnabled() throws Exception {
        try (Fixture f = new Fixture("cn-beijing@127.0.0.1", Resolver.DEFAULT)) {
            f.client.setAutoRetry(true).setNumMaxRetries(3);
            assertThrows(ApiException.class, () -> f.client.execute(f.call("ecs"), Map.class));
            ResultCallback callback = new ResultCallback();
            f.client.executeAsync(f.call("ecs"), Map.class, callback);
            callback.await();
            assertEquals(1, callback.failures.get());
            f.assertUntouched();
        }
    }

    @Test public void testSharedResolverIsolation() throws Exception {
        StandardEndpointProvider shared = new StandardEndpointProvider();
        try (Fixture bad = new Fixture("cn-beijing@127.0.0.1", Resolver.DEFAULT);
             Fixture good = new Fixture("cn-shanghai", Resolver.DEFAULT)) {
            bad.client.setEndpointResolver(shared);
            good.client.setEndpointResolver(shared);
            assertThrows(ApiException.class, () -> bad.client.execute(bad.call("ecs"), Map.class));
            bad.assertUntouched();
            good.client.execute(good.call("ecs"), Map.class);
            assertEquals("ecs.cn-shanghai.volcengineapi.com", good.http.lastRequest.httpUrl().host());
            good.assertSigned(1);
        }
    }

    /** Valid values keep working through the custom resolver, which receives them unchanged. */
    @Test public void testValidValuesReachCustomResolver() throws Exception {
        for (String region : new String[]{"cn-beijing", "ap-southeast-1", "a", "Rds_mysql-2"}) {
            try (Fixture f = new Fixture(region, Resolver.RECORDING)) {
                f.client.execute(f.call("rds_mysql"), Map.class);
                assertEquals("unit.internal.example", f.http.lastRequest.httpUrl().host());
                assertEquals(1, f.resolverCalls.get());
                f.assertSigned(1);
            }
        }
    }
}
