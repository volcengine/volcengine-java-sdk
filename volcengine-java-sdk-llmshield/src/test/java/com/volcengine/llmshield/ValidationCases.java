package com.volcengine.llmshield;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;

/** Spec cases shared by the llmshield tests, identical to the ones of the core module. */
public final class ValidationCases {
    private ValidationCases() { }

    public static final String RULE = "must start with a letter, end with a letter or digit, "
            + "and contain only letters, digits, '-' and '_'";
    public static final String REASON_START = "must start with a letter";
    public static final String REASON_END = "must not end with '-' or '_'";

    /** {input, quoted input, reason}. */
    public static final String[][] INJECTION_CASES = {
            {"cn-beijing@127.0.0.1", "\"cn-beijing@127.0.0.1\"", "illegal character at index 10"},
            {"cn-beijing:443", "\"cn-beijing:443\"", "illegal character at index 10"},
            {"cn/beijing", "\"cn/beijing\"", "illegal character at index 2"},
            {"cn?beijing", "\"cn?beijing\"", "illegal character at index 2"},
            {"cn#beijing", "\"cn#beijing\"", "illegal character at index 2"},
            {"cn beijing", "\"cn beijing\"", "illegal character at index 2"},
            {"cn\tbeijing", "\"cn\\tbeijing\"", "illegal character at index 2"},
            {"cn\nbeijing", "\"cn\\nbeijing\"", "illegal character at index 2"},
            {"cn\rbeijing", "\"cn\\rbeijing\"", "illegal character at index 2"},
            {"cn\u0000beijing", "\"cn\\x00beijing\"", "illegal character at index 2"},
            {"evil.com", "\"evil.com\"", "illegal character at index 4"},
            {"cn%2fbeijing", "\"cn%2fbeijing\"", "illegal character at index 2"},
            {"cn\\beijing", "\"cn\\\\beijing\"", "illegal character at index 2"},
            {"北京", "\"北京\"", "illegal character at index 0"},
            {"cn-北京", "\"cn-北京\"", "illegal character at index 3"},
            {"cn-beijing\n", "\"cn-beijing\\n\"", "illegal character at index 10"},
    };

    public static final String[][] EDGE_CASES = {
            {"1cn-beijing", "\"1cn-beijing\"", REASON_START},
            {"1", "\"1\"", REASON_START},
            {"-cn-beijing", "\"-cn-beijing\"", REASON_START},
            {"_ecs", "\"_ecs\"", REASON_START},
            {"cn-beijing-", "\"cn-beijing-\"", REASON_END},
            {"rds_mysql_", "\"rds_mysql_\"", REASON_END},
            {"-", "\"-\"", REASON_START},
            {"_", "\"_\"", REASON_START},
    };

    public static final String[] VALID = {"cn-beijing", "ap-southeast-1", "a", "rds_mysql", "Redis", "Rds_mysql-2", ""};

    public static List<String[]> invalidCases() {
        List<String[]> all = new ArrayList<>(Arrays.asList(INJECTION_CASES));
        all.addAll(Arrays.asList(EDGE_CASES));
        return all;
    }

    public static List<String> invalidValues() {
        List<String> values = new ArrayList<>();
        for (String[] c : invalidCases()) values.add(c[0]);
        return values;
    }

    public static String expectedCode(String kind) {
        return "region".equals(kind) ? EndpointValidation.ERR_CODE_INVALID_REGION : EndpointValidation.ERR_CODE_INVALID_SERVICE;
    }

    public static String expectedMessage(String kind, String quoted, String reason) {
        return "invalid " + kind + " " + quoted + ": " + reason + ", " + kind + " " + RULE;
    }

    public static void assertValidationError(String kind, String value, Throwable t) {
        String[] c = null;
        for (String[] candidate : invalidCases()) if (candidate[0].equals(value)) c = candidate;
        Assert.assertNotNull("unknown case", c);
        Assert.assertTrue("unexpected " + t, t instanceof EndpointValidationException);
        EndpointValidationException e = (EndpointValidationException) t;
        String message = expectedMessage(kind, c[1], c[2]);
        Assert.assertEquals(expectedCode(kind), e.getCode());
        Assert.assertEquals(message, e.getErrorMessage());
        Assert.assertEquals(expectedCode(kind) + ": " + message, e.getMessage());
        Assert.assertEquals(e.getMessage(), e.toString());
    }
}
