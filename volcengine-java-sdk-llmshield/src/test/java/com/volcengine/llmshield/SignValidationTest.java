package com.volcengine.llmshield;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Signing exits of the llmshield client. Requests go to an in-process HTTP
 * server on the loopback interface, no external network is used.
 */
public class SignValidationTest {
    private HttpServer server;
    private final AtomicInteger requests = new AtomicInteger();
    private final List<String> authorizations = Collections.synchronizedList(new ArrayList<String>());
    private final List<String> hosts = Collections.synchronizedList(new ArrayList<String>());
    private String url;

    @Before public void startServer() throws Exception {
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/", exchange -> {
            requests.incrementAndGet();
            authorizations.add(exchange.getRequestHeaders().getFirst("Authorization"));
            hosts.add(exchange.getRequestHeaders().getFirst("Host"));
            byte[] body = "{\"ResponseMetadata\":{\"RequestId\":\"unit-test\"},\"Result\":{}}".getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().add("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, body.length);
            exchange.getResponseBody().write(body);
            exchange.close();
        });
        server.start();
        url = "http://127.0.0.1:" + server.getAddress().getPort();
    }

    @After public void stopServer() {
        server.stop(0);
    }

    private static Request plainRequest() {
        return new Request.Builder().url("https://llmshield.example/v2/moderate?Action=Moderate&Version=2025-08-31")
                .post(RequestBody.create(MediaType.parse("application/json"), "{}")).build();
    }

    private static ModerateV2Request streamRequest() {
        MessageV2 message = new MessageV2();
        message.setRole("user");
        message.setContent("hello");
        ModerateV2Request request = new ModerateV2Request();
        request.setMessage(message);
        request.setUseStream(1);
        return request;
    }

    @Test public void testDoSignRequest_invalidRegionNotSigned() {
        for (String region : ValidationCases.invalidValues()) {
            Request request = plainRequest();
            Request[] signed = {null};
            ValidationCases.assertValidationError("region", region, assertThrows(EndpointValidationException.class,
                    () -> signed[0] = new Sign().DoSignRequest(request, URI.create(request.url().toString()), "Moderate",
                            "<TEST_AK>", "<TEST_SK>", region, null)));
            assertNull(signed[0]);
            assertNull(request.header("Authorization"));
            assertNull(request.header("X-Date"));
        }
    }

    @Test public void testDoSignRequest_validRegionSigned() throws Exception {
        for (String region : new String[]{"cn-beijing", "ap-southeast-1", "Rds_mysql-2"}) {
            Request request = plainRequest();
            Request signed = new Sign().DoSignRequest(request, URI.create(request.url().toString()), "Moderate",
                    "<TEST_AK>", "<TEST_SK>", region);
            assertTrue(signed.header("Authorization").contains("/" + region + "/" + Sign.getServiceCode() + "/request"));
            assertNotNull(signed.header("X-Date"));
            assertEquals(region, signed.header("X-Top-Region"));
        }
    }

    /** Construction never fails; every request API fails before signing and sending. */
    @Test public void testClientApis_invalidRegionNoRequestSent() throws Exception {
        for (String region : ValidationCases.invalidValues()) {
            ApiClient client = ApiClient.New(url, "<TEST_AK>", "<TEST_SK>", region, 5000);
            try {
                ValidationCases.assertValidationError("region", region,
                        assertThrows(EndpointValidationException.class, () -> client.Moderate(new ModerateV2Request())));
                ModerateV2Request stream = streamRequest();
                ValidationCases.assertValidationError("region", region, assertThrows(EndpointValidationException.class,
                        () -> client.ModerateStream(stream, new ModerateV2StreamSession())));
                ValidationCases.assertValidationError("region", region,
                        assertThrows(EndpointValidationException.class, () -> client.GenerateV2Stream(new GenerateStreamV2Request())));
            } finally {
                client.Close();
            }
        }
        assertEquals(0, requests.get());
    }

    /** The JSON config constructor with AICC enabled fails during init, before any request. */
    @Test public void testJsonConfigAiccInit_invalidRegionNoRequestSent() {
        Exception e = assertThrows(Exception.class, () -> ApiClient.New(url, "<TEST_AK>", "<TEST_SK>", "cn-beijing@127.0.0.1",
                "{\"EnableAicc\":true}"));
        Throwable cause = e;
        while (cause != null && !(cause instanceof EndpointValidationException)) cause = cause.getCause();
        assertNotNull("validation error in the cause chain: " + e, cause);
        ValidationCases.assertValidationError("region", "cn-beijing@127.0.0.1", cause);
        assertEquals(0, requests.get());
    }

    /** Valid regions keep working: the request reaches the configured URL and is signed. */
    @Test public void testClientApis_validRegionRequestSentToConfiguredHost() throws Exception {
        ApiClient client = ApiClient.New(url, "<TEST_AK>", "<TEST_SK>", "cn-beijing", 5000);
        try {
            assertNotNull(client.Moderate(new ModerateV2Request()));
            assertNotNull(client.ModerateStream(streamRequest(), new ModerateV2StreamSession()));
            try (GenerateStreamV2Response ignored = client.GenerateV2Stream(new GenerateStreamV2Request())) {
                assertNotNull(ignored);
            }
        } finally {
            client.Close();
        }
        assertEquals(3, requests.get());
        for (String auth : authorizations) {
            assertTrue(auth, auth.contains("/cn-beijing/" + Sign.getServiceCode() + "/request"));
        }
        for (String host : hosts) assertEquals("127.0.0.1:" + server.getAddress().getPort(), host);
    }
}
