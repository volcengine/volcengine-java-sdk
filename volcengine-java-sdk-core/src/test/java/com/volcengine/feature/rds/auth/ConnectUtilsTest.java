package com.volcengine.feature.rds.auth;

import com.squareup.okhttp.HttpUrl;
import com.volcengine.EndpointTestSupport;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConnectUtilsTest {
    private static HttpUrl queryUrl(String token) { return HttpUrl.parse("https://unit.invalid/?" + token); }

    @Test public void testBuildAuthToken_rejectsEveryIllegalRegionBeforeCredentialsAndHttp() throws Exception {
        for (String payload : EndpointTestSupport.maliciousInputs()) {
            try (EndpointTestSupport.Fixture f = new EndpointTestSupport.Fixture(payload, true)) {
                IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                        () -> ConnectUtils.buildAuthToken(f.client, "test-user", "test-instance", 900));
                // 纯空白 region 先命中 StandardEndpointProvider 原有的非空检查，保持原有报错。
                assertTrue(e.getMessage().startsWith(
                        org.apache.commons.lang.StringUtils.isBlank(payload) ? "region must not be null." : "InvalidRegion:"));
                f.assertUntouched();
            }
        }
    }

    @Test public void testBuildAuthToken_validDefaultDualstackAndRecovery() throws Exception {
        try (EndpointTestSupport.Fixture f = new EndpointTestSupport.Fixture("bad/region", false)) {
            assertThrows(IllegalArgumentException.class, () -> ConnectUtils.buildAuthToken(f.client, "test-user", "test-instance", 900));
            f.assertUntouched();
            f.client.setRegion("cn-beijing");
            HttpUrl token = queryUrl(ConnectUtils.buildAuthToken(f.client, "test-user", "test-instance", 0));
            assertEquals("https://rds-mysql.cn-beijing.volcengineapi.com", token.queryParameter("X-HOST"));
            assertEquals("900", token.queryParameter("X-Expires"));
            assertNotNull(token.queryParameter("X-Signature"));
            f.client.setUseDualStack(true).setDisableSSL(true);
            HttpUrl dual = queryUrl(ConnectUtils.buildAuthToken(f.client, "test-user", "test-instance", 120));
            assertEquals("http://rds-mysql.cn-beijing.volcengine-api.com", dual.queryParameter("X-HOST"));
            assertEquals("120", dual.queryParameter("X-Expires"));
            assertEquals(2, f.credentials.get());
            assertEquals(0, f.http.calls.get());
        }
    }

    @Test public void testBuildAuthToken_explicitEndpointAndMissingValuesPreserveContract() throws Exception {
        try (EndpointTestSupport.Fixture f = new EndpointTestSupport.Fixture("custom.region", true)) {
            f.client.setEndpoint("https://database.internal.example:8443");
            HttpUrl token = queryUrl(ConnectUtils.buildAuthToken(f.client, "test-user", "test-instance", 900));
            assertEquals("https://database.internal.example:8443", token.queryParameter("X-HOST"));
            assertNotNull(token.queryParameter("X-Signature"));
            assertEquals(1, f.credentials.get());
            assertEquals(0, f.resolverCalls.get());
            assertEquals(0, f.http.calls.get());
        }
        assertThrows(IllegalArgumentException.class, () -> ConnectUtils.buildAuthToken(null, "test-user", "test-instance", 1));
        for (String missing : new String[]{null, ""}) {
            try (EndpointTestSupport.Fixture f = new EndpointTestSupport.Fixture(missing, false)) {
                assertEquals("region must not be empty", assertThrows(IllegalArgumentException.class,
                        () -> ConnectUtils.buildAuthToken(f.client, "test-user", "test-instance", 1)).getMessage());
                f.assertUntouched();
                f.client.setRegion("cn-beijing");
                assertEquals("dbUser must not be empty", assertThrows(IllegalArgumentException.class,
                        () -> ConnectUtils.buildAuthToken(f.client, missing, "test-instance", 1)).getMessage());
                assertEquals("instanceId must not be empty", assertThrows(IllegalArgumentException.class,
                        () -> ConnectUtils.buildAuthToken(f.client, "test-user", missing, 1)).getMessage());
                f.assertUntouched();
            }
        }
    }
}
