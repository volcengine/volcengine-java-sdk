package com.volcengine.llmshield.aicc;

import com.google.gson.JsonObject;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/** TOP requests of the AICC module, served by an in-process HTTP server on the loopback interface. */
public class TopValidationTest {
    private HttpServer server;
    private final AtomicInteger requests = new AtomicInteger();
    private final List<String> authorizations = Collections.synchronizedList(new ArrayList<String>());
    private String url;

    @Before public void startServer() throws Exception {
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/", exchange -> {
            requests.incrementAndGet();
            authorizations.add(exchange.getRequestHeaders().getFirst("Authorization"));
            byte[] body = "{\"Result\":{\"ok\":true}}".getBytes(StandardCharsets.UTF_8);
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

    private TopInfo topInfo(String service, String region, boolean sts) {
        TopInfo info = TopInfo.deserialize(new StringReader("{\"ak\":\"<TEST_AK>\",\"sk\":\"<TEST_SK>\",\"url\":\"" + url + "\"}"));
        info.service = service;
        info.region = region;
        // With aicc_saas_trn an STS request (fixed public host) would be sent first: it must not happen.
        info.aiccSaasTrn = sts ? "trn:iam::2100000000:role/unit-test" : "";
        return info;
    }

    private static byte[] body() {
        return "{}".getBytes(StandardCharsets.UTF_8);
    }

    @Test public void testInvalidRegionRejectedBeforeStsAndTop() {
        for (String region : com.volcengine.llmshield.ValidationCases.invalidValues()) {
            for (boolean sts : new boolean[]{false, true}) {
                TopInfo info = topInfo("pcc", region, sts);
                IOException e = assertThrows(IOException.class, () -> Top.requestTop(info, "ListJscKey", null, body()));
                com.volcengine.llmshield.ValidationCases.assertValidationError("region", region, e.getCause());
                assertEquals(e.getCause().getMessage(), e.getMessage());
                assertEquals("<TEST_AK>", info.ak);
            }
        }
        assertEquals(0, requests.get());
    }

    @Test public void testInvalidServiceRejected() {
        for (String service : com.volcengine.llmshield.ValidationCases.invalidValues()) {
            for (boolean sts : new boolean[]{false, true}) {
                TopInfo info = topInfo(service, "cn-beijing", sts);
                IOException e = assertThrows(IOException.class, () -> Top.requestTop(info, "ListJscKey", null, body()));
                com.volcengine.llmshield.ValidationCases.assertValidationError("service", service, e.getCause());
            }
        }
        assertEquals(0, requests.get());
    }

    @Test public void testValidValuesSignedAndSent() throws Exception {
        JsonObject result = Top.requestTop(topInfo("pcc", "cn-beijing", false), "ListJscKey", null, body());
        assertTrue(result.get("ok").getAsBoolean());
        assertEquals(1, requests.get());
        assertTrue(authorizations.get(0).contains("/cn-beijing/pcc/request"));
        // Default region of the configuration is kept.
        TopInfo defaults = TopInfo.deserialize(new StringReader("{\"ak\":\"<TEST_AK>\",\"sk\":\"<TEST_SK>\",\"service\":\"pcc\",\"url\":\"" + url + "\"}"));
        assertEquals("cn-beijing", defaults.region);
        Top.requestTop(defaults, "ListJscKey", null, body());
        assertEquals(2, requests.get());
    }
}
