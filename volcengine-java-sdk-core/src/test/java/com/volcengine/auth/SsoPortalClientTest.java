package com.volcengine.auth;

import com.volcengine.ApiException;
import com.volcengine.EndpointTestSupport;
import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/** URL handler 仅存在于 Surefire 测试 JVM；不会修改系统配置或用户登录态。 */
public class SsoPortalClientTest {
    private static final AtomicInteger connections = new AtomicInteger();
    private static final List<String> hosts = new ArrayList<>();
    private static final List<String> methods = new ArrayList<>();
    private static final List<MemoryConnection> opened = new ArrayList<>();

    @BeforeClass public static void installMemoryTransport() {
        URL.setURLStreamHandlerFactory(protocol -> {
            if (!"https".equals(protocol) && !"http".equals(protocol)) return null;
            return new URLStreamHandler() {
                @Override protected URLConnection openConnection(URL url) {
                    connections.incrementAndGet();
                    hosts.add(url.getHost());
                    MemoryConnection connection = new MemoryConnection(url);
                    opened.add(connection);
                    return connection;
                }
            };
        });
    }
    @Before public void resetCounters() {
        connections.set(0); hosts.clear(); methods.clear(); opened.clear();
    }

    private static class MemoryConnection extends HttpURLConnection {
        final ByteArrayOutputStream request = new ByteArrayOutputStream();
        MemoryConnection(URL url) { super(url); }
        @Override public void connect() { }
        @Override public void disconnect() { }
        @Override public boolean usingProxy() { return false; }
        @Override public OutputStream getOutputStream() { return request; }
        @Override public int getResponseCode() { methods.add(getRequestMethod()); return 200; }
        @Override public InputStream getInputStream() {
            String body = url.getPath().equals("/token")
                    ? "{\"access_token\":\"<TEST_ACCESS_TOKEN>\",\"refresh_token\":\"<TEST_REFRESH_TOKEN>\",\"expires_in\":3600}"
                    : "{\"Result\":{\"RoleCredentials\":{\"AccessKeyId\":\"<TEST_AK>\",\"SecretAccessKey\":\"<TEST_SK>\",\"SessionToken\":\"<TEST_SESSION_TOKEN>\",\"Expiration\":4102444800}}}";
            return new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8));
        }
    }

    @Test public void testRequests_illegalRegionRejectedBeforeEitherConnection() {
        for (String payload : EndpointTestSupport.maliciousInputs()) {
            // 纯空白属于缺失值，沿用原有逻辑回落到默认 region，见 testRequests_validAndMissingRegionPreserveHosts。
            if (payload.trim().isEmpty()) continue;
            SsoPortalClient client = new SsoPortalClient(payload);
            ApiException oauth = assertThrows(ApiException.class,
                    () -> client.refreshToken("<TEST_CLIENT_ID>", "<TEST_CLIENT_SECRET>", "<TEST_REFRESH_TOKEN>"));
            assertTrue(oauth.getCause() instanceof IllegalArgumentException);
            assertTrue(oauth.getCause().getMessage().startsWith("InvalidRegion:"));
            ApiException portal = assertThrows(ApiException.class,
                    () -> client.getRoleCredentials("<TEST_ACCESS_TOKEN>", "test-account", "test-role"));
            assertTrue(portal.getCause() instanceof IllegalArgumentException);
            assertEquals(0, connections.get());
        }
    }

    /** 规范用例：错误码 InvalidRegion、完整错误信息、状态码 400，且不建立任何连接。 */
    @Test public void testRequests_specCasesExactCodeAndMessage() {
        for (String payload : EndpointTestSupport.invalidValues()) {
            SsoPortalClient client = new SsoPortalClient(payload);
            EndpointTestSupport.assertApiValidationError("region", payload, assertThrows(ApiException.class,
                    () -> client.refreshToken("<TEST_CLIENT_ID>", "<TEST_CLIENT_SECRET>", "<TEST_REFRESH_TOKEN>")));
            EndpointTestSupport.assertApiValidationError("region", payload, assertThrows(ApiException.class,
                    () -> client.getRoleCredentials("<TEST_ACCESS_TOKEN>", "test-account", "test-role")));
        }
        assertEquals(0, connections.get());
    }

    @Test public void testRequests_validAndMissingRegionPreserveHosts() throws Exception {
        for (String region : new String[]{null, "", " ", "\t", "\r\n", "cn-beijing", "cn-shanghai", "region_1", "Region-09"}) {
            resetCounters();
            SsoPortalClient client = new SsoPortalClient(region);
            String effective = region == null || region.trim().isEmpty() ? "cn-beijing" : region;
            SsoPortalClient.OAuthTokenResponse token = client.refreshToken("<TEST_CLIENT_ID>", "<TEST_CLIENT_SECRET>", "<TEST_REFRESH_TOKEN>");
            SsoPortalClient.RoleCredentialsResult credentials = client.getRoleCredentials("<TEST_ACCESS_TOKEN>", "test-account", "test-role");
            assertEquals("<TEST_ACCESS_TOKEN>", token.accessToken);
            assertEquals(3600, token.expiresIn);
            assertEquals("<TEST_AK>", credentials.accessKeyId);
            assertEquals(Arrays.asList("cloudidentity-oauth." + effective + ".volces.com", "cloudidentity-portal." + effective + ".volces.com"), hosts);
            assertEquals(Arrays.asList("POST", "GET"), methods);
            assertEquals(2, connections.get());
            assertEquals("<TEST_ACCESS_TOKEN>", opened.get(1).getRequestProperty("x-bd-cloudidentity-bearer-token"));
            assertTrue(new String(opened.get(0).request.toByteArray(), StandardCharsets.UTF_8).contains("refresh_token"));
        }
    }

    private static SsoTokenCache cache(boolean expired) {
        SsoTokenCache cache = new SsoTokenCache();
        cache.setAccessToken("<TEST_ACCESS_TOKEN>");
        cache.setRefreshToken("<TEST_REFRESH_TOKEN>");
        cache.setClientId("<TEST_CLIENT_ID>");
        cache.setClientSecret("<TEST_CLIENT_SECRET>");
        cache.setExpiresAt(expired ? "2000-01-01T00:00:00Z" : "2100-01-01T00:00:00Z");
        return cache;
    }

    @Test public void testProvider_publicCredentialGetRejectsOAuthAndPortalBeforeNetwork() throws Exception {
        for (boolean expired : new boolean[]{false, true}) {
            for (String payload : EndpointTestSupport.maliciousInputs()) {
                if (payload.trim().isEmpty()) continue;
                SsoTokenCache snapshot = cache(expired);
                CredentialProvider provider = new CredentialProvider(new SsoRefreshProvider(snapshot, "test-account", "test-role", payload, null));
                ApiException e = assertThrows(ApiException.class, provider::get);
                assertTrue(e.getMessage().contains("InvalidRegion:"));
                assertEquals("<TEST_ACCESS_TOKEN>", snapshot.getAccessToken());
                assertEquals("<TEST_REFRESH_TOKEN>", snapshot.getRefreshToken());
                assertEquals(0, connections.get());
            }
        }
    }

    @Test public void testProvider_failureDoesNotPolluteNextValidProvider() throws Exception {
        CredentialProvider bad = new CredentialProvider(new SsoRefreshProvider(cache(true), "test-account", "test-role", " cn-beijing ", null));
        assertThrows(ApiException.class, bad::get);
        assertEquals(0, connections.get());
        CredentialProvider good = new CredentialProvider(new SsoRefreshProvider(cache(true), "test-account", "test-role", null, null));
        CredentialValue value = good.get();
        assertEquals("<TEST_AK>", value.getAk());
        assertEquals(2, connections.get());
        assertSame(value, good.get());
        assertEquals(2, connections.get());
        assertEquals(Arrays.asList("cloudidentity-oauth.cn-beijing.volces.com", "cloudidentity-portal.cn-beijing.volces.com"), hosts);
    }
}
