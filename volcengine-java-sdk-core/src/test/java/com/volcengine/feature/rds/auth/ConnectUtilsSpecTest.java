package com.volcengine.feature.rds.auth;

import com.squareup.okhttp.HttpUrl;
import com.volcengine.EndpointTestSupport;
import com.volcengine.EndpointTestSupport.Fixture;
import com.volcengine.EndpointTestSupport.Resolver;
import com.volcengine.endpoint.EndpointValidationException;
import org.junit.Test;
import static org.junit.Assert.*;

/** RDS IAM token: a presigned URL built from the resolved endpoint. */
public class ConnectUtilsSpecTest {
    private static HttpUrl queryUrl(String token) { return HttpUrl.parse("https://unit.invalid/?" + token); }

    @Test public void testInvalidRegionNoPresignedUrl() throws Exception {
        for (String region : EndpointTestSupport.invalidValues()) {
            try (Fixture f = new Fixture(region, Resolver.FAILING)) {
                String[] token = {null};
                EndpointValidationException e = assertThrows(EndpointValidationException.class,
                        () -> token[0] = ConnectUtils.buildAuthToken(f.client, "test-user", "test-instance", 900));
                EndpointTestSupport.assertValidationError("region", region, e);
                assertNull(token[0]);
                // Credentials are only read when signing.
                f.assertUntouched();
            }
        }
    }

    @Test public void testValidRegionDualStackAndRecovery() throws Exception {
        try (Fixture f = new Fixture("cn-beijing/x", Resolver.FAILING)) {
            assertThrows(EndpointValidationException.class, () -> ConnectUtils.buildAuthToken(f.client, "test-user", "test-instance", 900));
            f.assertUntouched();
            f.client.setRegion("cn-beijing");
            HttpUrl token = queryUrl(ConnectUtils.buildAuthToken(f.client, "test-user", "test-instance", 0));
            assertEquals("https://rds-mysql.cn-beijing.volcengineapi.com", token.queryParameter("X-HOST"));
            assertEquals("900", token.queryParameter("X-Expires"));
            assertTrue(token.queryParameter("X-Credential").contains("/cn-beijing/rds_mysql/request"));
            assertNotNull(token.queryParameter("X-Signature"));
            f.client.setUseDualStack(true).setDisableSSL(true);
            HttpUrl dual = queryUrl(ConnectUtils.buildAuthToken(f.client, "test-user", "test-instance", 120));
            assertEquals("http://rds-mysql.cn-beijing.volcengine-api.com", dual.queryParameter("X-HOST"));
            assertEquals(2, f.credentials.get());
            assertEquals(0, f.http.calls.get());
            assertEquals(0, f.resolverCalls.get());
        }
    }

    @Test public void testExplicitEndpointAndMissingValues() throws Exception {
        try (Fixture f = new Fixture("custom.region", Resolver.FAILING)) {
            f.client.setEndpoint("https://database.internal.example:8443");
            HttpUrl token = queryUrl(ConnectUtils.buildAuthToken(f.client, "test-user", "test-instance", 900));
            assertEquals("https://database.internal.example:8443", token.queryParameter("X-HOST"));
            assertNotNull(token.queryParameter("X-Signature"));
            assertEquals(1, f.credentials.get());
        }
        for (String missing : new String[]{null, ""}) {
            try (Fixture f = new Fixture(missing, Resolver.FAILING)) {
                assertEquals("region must not be empty", assertThrows(IllegalArgumentException.class,
                        () -> ConnectUtils.buildAuthToken(f.client, "test-user", "test-instance", 1)).getMessage());
                f.assertUntouched();
            }
        }
    }
}
