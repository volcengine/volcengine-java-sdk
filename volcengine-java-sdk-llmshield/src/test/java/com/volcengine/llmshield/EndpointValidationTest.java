package com.volcengine.llmshield;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import org.junit.Assume;
import org.junit.Test;
import static org.junit.Assert.*;

public class EndpointValidationTest {
    private static final Pattern EQUIVALENT = Pattern.compile("^[A-Za-z]([A-Za-z0-9_-]*[A-Za-z0-9])?$");

    @Test public void testInvalidValues_exactCodeAndMessage() {
        for (String[] c : ValidationCases.invalidCases()) {
            ValidationCases.assertValidationError("region", c[0],
                    assertThrows(EndpointValidationException.class, () -> EndpointValidation.validateRegion(c[0])));
            ValidationCases.assertValidationError("service", c[0],
                    assertThrows(EndpointValidationException.class, () -> EndpointValidation.validateService(c[0])));
        }
    }

    @Test public void testEachReason_fullMessage() {
        assertEquals("InvalidRegion: invalid region \"cn-beijing@127.0.0.1\": illegal character at index 10, "
                        + "region must start with a letter, end with a letter or digit, and contain only letters, digits, '-' and '_'",
                assertThrows(EndpointValidationException.class, () -> EndpointValidation.validateRegion("cn-beijing@127.0.0.1")).getMessage());
        assertEquals("InvalidService: invalid service \"1llmshield\": must start with a letter, "
                        + "service must start with a letter, end with a letter or digit, and contain only letters, digits, '-' and '_'",
                assertThrows(EndpointValidationException.class, () -> EndpointValidation.validateService("1llmshield")).getMessage());
        assertEquals("InvalidRegion: invalid region \"cn-beijing_\": must not end with '-' or '_', "
                        + "region must start with a letter, end with a letter or digit, and contain only letters, digits, '-' and '_'",
                assertThrows(EndpointValidationException.class, () -> EndpointValidation.validateRegion("cn-beijing_")).getMessage());
    }

    @Test public void testValidValuesAndNull() {
        for (String v : ValidationCases.VALID) EndpointValidation.validateServiceAndRegion(v, v);
        EndpointValidation.validateServiceAndRegion(null, null);
        // Built-in service codes.
        EndpointValidation.validateService("llmshield");
        EndpointValidation.validateService("llmshield_dev");
        EndpointValidation.validateService("sts");
        EndpointValidation.validateService(Sign.getServiceCode());
    }

    @Test public void testServiceValidatedBeforeRegion() {
        assertEquals("InvalidService", assertThrows(EndpointValidationException.class,
                () -> EndpointValidation.validateServiceAndRegion("bad.service", "bad.region")).getCode());
    }

    /** Every one and two character string over the first 256 code points behaves as the regular expression. */
    @Test public void testExhaustivelyEquivalentToRegularExpression() {
        for (char a = 0; a < 256; a++) {
            assertEquivalent(String.valueOf(a));
            for (char b = 0; b < 256; b++) assertEquivalent(new String(new char[]{a, b}));
        }
        for (String s : new String[]{"écs", "ec١", "ｅcs", "a😀", "a--b", "a__1", "1ab"}) assertEquivalent(s);
    }

    private static void assertEquivalent(String s) {
        boolean expected = EQUIVALENT.matcher(s).matches();
        try {
            EndpointValidation.validateRegion(s);
            assertTrue("accepted " + EndpointValidation.quote(s), expected);
        } catch (EndpointValidationException e) {
            assertFalse("rejected " + EndpointValidation.quote(s), expected);
        }
    }

    @Test public void testQuoteEscapesLikeGo() {
        assertEquals("\"a\\\"b\\\\c\"", EndpointValidation.quote("a\"b\\c"));
        assertEquals("\"\\a\\b\\f\\n\\r\\t\\v\"", EndpointValidation.quote("\u0007\b\f\n\r\t\u000b"));
        assertEquals("\"\\x00\\x1f\\x7f\"", EndpointValidation.quote("\u0000\u001f\u007f"));
        assertEquals("\"\\u0080\\u00a0\\u200b\"", EndpointValidation.quote("\u0080\u00a0\u200b"));
        assertEquals("\"北京😀\"", EndpointValidation.quote("北京😀"));
    }

    /**
     * This module can not depend on the core module, the implementation is a
     * copy that must stay identical to the core one (only the package and the
     * class comment differ).
     */
    @Test public void testImplementationIdenticalToCore() throws Exception {
        Path core = Paths.get("../volcengine-java-sdk-core/src/main/java/com/volcengine/endpoint/EndpointValidation.java");
        Path local = Paths.get("src/main/java/com/volcengine/llmshield/EndpointValidation.java");
        Assume.assumeTrue("core sources not available", Files.isRegularFile(core) && Files.isRegularFile(local));
        assertEquals(body(core), body(local));
    }

    private static String body(Path p) throws Exception {
        String s = new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
        return s.substring(s.indexOf("public final class EndpointValidation"));
    }
}
