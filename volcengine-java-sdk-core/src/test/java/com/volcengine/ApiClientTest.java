package com.volcengine;

import com.volcengine.endpoint.StandardEndpointProvider;
import com.volcengine.interceptor.InterceptorContext;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApiClientTest {
    @Test public void testExecute_syncAndAsyncRejectBeforeCredentialsSigningAndHttp() throws Exception {
        for (String payload : EndpointTestSupport.maliciousInputs()) {
            for (boolean custom : new boolean[]{false, true}) {
                try (EndpointTestSupport.Fixture f = new EndpointTestSupport.Fixture(payload, custom)) {
                    InterceptorContext sync = f.call("ecs");
                    assertNull(sync.getRequestContext().getRequest());
                    ApiException e = assertThrows(ApiException.class, () -> f.client.execute(sync, Map.class));
                    assertTrue(e.getCause() instanceof IllegalArgumentException);
                    assertTrue(e.getCause().getMessage().startsWith("InvalidRegion:"));
                    EndpointTestSupport.ResultCallback callback = new EndpointTestSupport.ResultCallback();
                    f.client.executeAsync(f.call("ecs"), Map.class, callback);
                    callback.await();
                    assertEquals(1, callback.failures.get());
                    assertEquals(0, callback.successes.get());
                    assertEquals(0, callback.status);
                    assertTrue(callback.error.getCause() instanceof IllegalArgumentException);
                    f.assertUntouched();
                }
            }
        }
    }

    @Test public void testExecute_invalidServiceRejectedBeforeCustomResolver() throws Exception {
        // 原始 slash 服务名由 UniversalApi 参数化用例验证；此处路径契约只接受单个 service 段。
        for (String payload : EndpointTestSupport.maliciousInputs()) {
            if (payload.contains("/")) continue;
            try (EndpointTestSupport.Fixture f = new EndpointTestSupport.Fixture("cn-beijing", true)) {
                ApiException e = assertThrows(ApiException.class, () -> f.client.execute(f.call(payload), Map.class));
                assertTrue(e.getCause().getMessage().startsWith("InvalidService:"));
                EndpointTestSupport.ResultCallback callback = new EndpointTestSupport.ResultCallback();
                f.client.executeAsync(f.call(payload), Map.class, callback);
                callback.await();
                assertEquals(1, callback.failures.get());
                assertEquals(0, callback.successes.get());
                f.assertUntouched();
            }
        }
    }

    @Test public void testExecute_recoveryAndOtherClientIsolationWithSharedResolver() throws Exception {
        StandardEndpointProvider shared = new StandardEndpointProvider();
        try (EndpointTestSupport.Fixture bad = new EndpointTestSupport.Fixture("cn-beijing@example.invalid", false);
             EndpointTestSupport.Fixture good = new EndpointTestSupport.Fixture("cn-shanghai", false)) {
            bad.client.setEndpointResolver(shared);
            good.client.setEndpointResolver(shared);
            assertThrows(ApiException.class, () -> bad.client.execute(bad.call("ecs"), Map.class));
            bad.assertUntouched();
            ApiResponse<Map> response = good.client.execute(good.call("ecs"), Map.class);
            assertEquals(200, response.getStatusCode());
            assertEquals("ecs.cn-shanghai.volcengineapi.com", good.http.lastRequest.httpUrl().host());
            good.assertSigned(1);
            bad.client.setRegion("cn-beijing");
            EndpointTestSupport.ResultCallback callback = new EndpointTestSupport.ResultCallback();
            bad.client.executeAsync(bad.call("rds_mysql"), Map.class, callback);
            callback.await();
            assertEquals(0, callback.failures.get());
            assertEquals(1, callback.successes.get());
            assertEquals(200, callback.status);
            assertEquals("rds-mysql.cn-beijing.volcengineapi.com", bad.http.lastRequest.httpUrl().host());
            bad.assertSigned(1);
            assertEquals("cn-shanghai", good.client.getRegion());
        }
    }

    @Test public void testUniversal_successCustomInternalEndpointAndRecovery() throws Exception {
        try (EndpointTestSupport.Fixture f = new EndpointTestSupport.Fixture("bad/region", true)) {
            UniversalApi api = new UniversalApi(f.client);
            UniversalRequest request = new UniversalRequest("ecs", "DescribeInstances", "2020-04-01");
            assertThrows(ApiException.class, () -> api.doCall(request, Collections.emptyMap()));
            f.assertUntouched();
            f.client.setRegion("cn-beijing");
            assertThrows(ApiException.class, () -> api.doCall(new UniversalRequest("ecs/get/", "DescribeInstances", "2020-04-01"), Collections.emptyMap()));
            f.assertUntouched();
            Map<String, Object> result = api.doCall(request, Collections.emptyMap());
            assertEquals(Boolean.TRUE, ((Map<?, ?>) result.get("Result")).get("ok"));
            assertEquals(1L, ((Map<?, ?>) result.get("Result")).get("count"));
            assertEquals("unit.internal.example", f.http.lastRequest.httpUrl().host());
            assertEquals("DescribeInstances", f.http.lastRequest.httpUrl().queryParameter("Action"));
            assertEquals(1, f.resolverCalls.get());
            f.assertSigned(1);
        }
    }

    @Test public void testExecute_explicitInternalEndpointBypassesAutomaticRegionValidation() throws Exception {
        try (EndpointTestSupport.Fixture f = new EndpointTestSupport.Fixture("custom.region", true)) {
            f.client.setEndpoint("custom.internal.example:8443");
            UniversalApi api = new UniversalApi(f.client);
            assertEquals(Boolean.TRUE, ((Map<?, ?>) api.doCall(new UniversalRequest("ecs", "DescribeInstances", "2020-04-01"), Collections.emptyMap()).get("Result")).get("ok"));
            EndpointTestSupport.ResultCallback callback = new EndpointTestSupport.ResultCallback();
            f.client.executeAsync(f.call("ecs"), Map.class, callback);
            callback.await();
            assertEquals(1, callback.successes.get());
            assertEquals(0, callback.failures.get());
            assertEquals(0, f.resolverCalls.get());
            assertEquals("custom.internal.example", f.http.lastRequest.httpUrl().host());
            assertEquals(8443, f.http.lastRequest.httpUrl().port());
            f.assertSigned(2);
        }
    }

    @Test public void testExecute_rejectsEvenWithAutomaticRetriesEnabled() throws Exception {
        try (EndpointTestSupport.Fixture f = new EndpointTestSupport.Fixture("cn-beijing@example.invalid", true)) {
            f.client.setAutoRetry(true).setNumMaxRetries(3);
            assertThrows(ApiException.class, () -> f.client.execute(f.call("ecs"), Map.class));
            EndpointTestSupport.ResultCallback callback = new EndpointTestSupport.ResultCallback();
            f.client.executeAsync(f.call("ecs"), Map.class, callback);
            callback.await();
            assertEquals(1, callback.failures.get());
            f.assertUntouched();
        }
    }
}
