package com.volcengine.endpoint;

import com.volcengine.ApiException;
import com.volcengine.EndpointTestSupport;
import java.util.regex.Pattern;
import org.junit.Test;
import static org.junit.Assert.*;

public class EndpointValidationSpecTest {
    private static final Pattern EQUIVALENT = Pattern.compile("^[A-Za-z]([A-Za-z0-9_-]*[A-Za-z0-9])?$");

    @Test public void testInvalidRegionsAndServices_exactCodeAndMessage() {
        for (String[] c : EndpointTestSupport.invalidCases()) {
            EndpointTestSupport.assertValidationError("region", c[0],
                    assertThrows(EndpointValidationException.class, () -> EndpointValidation.validateRegion(c[0])));
            EndpointTestSupport.assertValidationError("service", c[0],
                    assertThrows(EndpointValidationException.class, () -> EndpointValidation.validateService(c[0])));
        }
    }

    @Test public void testEachReason_fullMessage() {
        assertEquals("InvalidRegion: invalid region \"cn-beijing@127.0.0.1\": illegal character at index 10, "
                        + "region must start with a letter, end with a letter or digit, and contain only letters, digits, '-' and '_'",
                assertThrows(EndpointValidationException.class, () -> EndpointValidation.validateRegion("cn-beijing@127.0.0.1")).getMessage());
        assertEquals("InvalidService: invalid service \"1ecs\": must start with a letter, "
                        + "service must start with a letter, end with a letter or digit, and contain only letters, digits, '-' and '_'",
                assertThrows(EndpointValidationException.class, () -> EndpointValidation.validateService("1ecs")).getMessage());
        assertEquals("InvalidRegion: invalid region \"cn-beijing_\": must not end with '-' or '_', "
                        + "region must start with a letter, end with a letter or digit, and contain only letters, digits, '-' and '_'",
                assertThrows(EndpointValidationException.class, () -> EndpointValidation.validateRegion("cn-beijing_")).getMessage());
    }

    @Test public void testCharacterSetCheckedBeforeFirstAndLastCharacter() {
        // Breaks every rule, the character set is reported first.
        assertTrue(assertThrows(EndpointValidationException.class, () -> EndpointValidation.validateRegion("1a.-"))
                .getErrorMessage().contains(": illegal character at index 2,"));
        // Breaks both first and last character rules, the first one is reported.
        assertTrue(assertThrows(EndpointValidationException.class, () -> EndpointValidation.validateRegion("1a-"))
                .getErrorMessage().contains(": must start with a letter,"));
    }

    @Test public void testValidValuesAndMissingValues() {
        for (String value : EndpointTestSupport.VALID) {
            EndpointValidation.validateRegion(value);
            EndpointValidation.validateService(value);
            EndpointValidation.validateServiceAndRegion(value, value);
        }
        EndpointValidation.validateRegion(null);
        EndpointValidation.validateService(null);
        EndpointValidation.validateServiceAndRegion(null, null);
    }

    @Test public void testServiceValidatedBeforeRegion() {
        EndpointValidationException e = assertThrows(EndpointValidationException.class,
                () -> EndpointValidation.validateServiceAndRegion("bad.service", "bad.region"));
        assertEquals(EndpointValidation.ERR_CODE_INVALID_SERVICE, e.getCode());
        assertEquals(EndpointValidation.ERR_CODE_INVALID_REGION, assertThrows(EndpointValidationException.class,
                () -> EndpointValidation.validateServiceAndRegion("ecs", "bad.region")).getCode());
        assertEquals(EndpointValidation.ERR_CODE_INVALID_SERVICE, assertThrows(EndpointValidationException.class,
                () -> EndpointValidation.validateServiceAndRegion("bad.service", "cn-beijing")).getCode());
    }

    /** Every one and two character string over the first 256 code points behaves as the regular expression. */
    @Test public void testExhaustivelyEquivalentToRegularExpression() {
        int checked = 0;
        for (char a = 0; a < 256; a++) {
            assertEquivalent(String.valueOf(a));
            checked++;
            for (char b = 0; b < 256; b++) {
                assertEquivalent(new String(new char[]{a, b}));
                checked++;
            }
        }
        assertEquals(256 + 256 * 256, checked);
        // Longer values, including non ASCII letters and digits that Character.isLetterOrDigit accepts.
        for (String s : new String[]{"abc", "a-b", "a_b", "a--b", "a__1", "ab-", "ab_", "1ab", "écs", "ec١",
                "ｅcs", "ecs ", "a😀", "rds_mysql", "cn-beijing-autodriving"}) {
            assertEquivalent(s);
        }
    }

    private static void assertEquivalent(String s) {
        boolean expected = EQUIVALENT.matcher(s).matches();
        for (String kind : new String[]{"region", "service"}) {
            try {
                if ("region".equals(kind)) EndpointValidation.validateRegion(s);
                else EndpointValidation.validateService(s);
                assertTrue("accepted " + EndpointValidation.quote(s), expected);
            } catch (EndpointValidationException e) {
                assertFalse("rejected " + EndpointValidation.quote(s), expected);
                assertEquals(EndpointTestSupport.expectedCode(kind), e.getCode());
                String reason = e.getErrorMessage().substring(
                        ("invalid " + kind + " " + EndpointValidation.quote(s) + ": ").length(),
                        e.getErrorMessage().length() - (", " + kind + " " + EndpointTestSupport.RULE).length());
                assertEquals(expectedReason(s), reason);
            }
        }
    }

    /** Independent definition of the reason, used to cross-check the implementation. */
    private static String expectedReason(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!String.valueOf(s.charAt(i)).matches("[A-Za-z0-9_-]")) return "illegal character at index " + i;
        }
        if (!String.valueOf(s.charAt(0)).matches("[A-Za-z]")) return EndpointTestSupport.REASON_START;
        return EndpointTestSupport.REASON_END;
    }

    @Test public void testQuoteEscapesLikeGo() {
        assertEquals("\"\"", EndpointValidation.quote(""));
        assertEquals("\"a\\\"b\\\\c\"", EndpointValidation.quote("a\"b\\c"));
        assertEquals("\"\\a\\b\\f\\n\\r\\t\\v\"", EndpointValidation.quote("\u0007\b\f\n\r\t\u000b"));
        assertEquals("\"\\x00\\x1f\\x7f\"", EndpointValidation.quote("\u0000\u001f\u007f"));
        assertEquals("\"\\u0080\\u00a0\\u200b\\u2028\"", EndpointValidation.quote("\u0080\u00a0\u200b\u2028"));
        assertEquals("\"\u5317\u4eac \u00e9\ud83d\ude00\"", EndpointValidation.quote("\u5317\u4eac \u00e9\ud83d\ude00"));
        assertEquals("\"\\U000e0001\"", EndpointValidation.quote(new String(Character.toChars(0xe0001))));
    }

    @Test public void testExceptionContract() {
        EndpointValidationException e = assertThrows(EndpointValidationException.class, () -> EndpointValidation.validateRegion("a.b"));
        assertTrue(e instanceof IllegalArgumentException);
        assertEquals("InvalidRegion", e.getCode());
        String message = EndpointTestSupport.expectedMessage("region", "\"a.b\"", "illegal character at index 1");
        assertEquals(message, e.getErrorMessage());
        assertEquals("InvalidRegion: " + message, e.getMessage());
        assertEquals("InvalidRegion: " + message, e.toString());

        ApiException api = e.toApiException();
        assertEquals(400, api.getCode());
        assertSame(e, api.getCause());
        assertEquals(e.getMessage(), api.getMessage());
        assertEquals("InvalidRegion", api.getResponseMetadata().getError().getCode());
        assertEquals(message, api.getResponseMetadata().getError().getMessage());
    }
}
