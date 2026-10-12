package com.volcengine.llmshield;

/**
 * Validates the region and service used to sign llmshield requests.
 *
 * <p>The region and the service are written into the credential scope of the
 * signature ({@code date/region/service/request}) and into request headers. A
 * value such as {@code cn-beijing@127.0.0.1}, {@code cn/beijing} or
 * {@code cn-beijing\n} is rejected before the request is signed and sent.
 *
 * <p>This module does not depend on volcengine-java-sdk-core, the rules, error
 * codes and error messages are the same as
 * {@code com.volcengine.endpoint.EndpointValidation} in the core module and
 * must be kept in sync with it.
 *
 * <p>A valid value matches {@code ^[A-Za-z]([A-Za-z0-9_-]*[A-Za-z0-9])?$}:
 * <ul>
 *     <li>it only contains ASCII letters, digits, '-' and '_'</li>
 *     <li>it starts with a letter</li>
 *     <li>it does not end with '-' or '_'</li>
 * </ul>
 * A {@code null} or empty value is considered valid, the caller keeps its
 * existing handling of missing values.
 *
 * <p>Explicitly configured URLs are not restricted by this class.
 */
public final class EndpointValidation {

    /**
     * Error code used when a region is not valid.
     */
    public static final String ERR_CODE_INVALID_REGION = "InvalidRegion";

    /**
     * Error code used when a service is not valid.
     */
    public static final String ERR_CODE_INVALID_SERVICE = "InvalidService";

    /**
     * Describes the accepted format, used in error messages.
     */
    private static final String ENDPOINT_LABEL_RULE = "must start with a letter, end with a letter or digit, "
            + "and contain only letters, digits, '-' and '_'";

    private EndpointValidation() {
    }

    /**
     * Checks that region is safe to be used when building an endpoint host
     * name. A {@code null} or empty region is allowed and left to the caller.
     *
     * @param region the region
     * @throws EndpointValidationException with code {@link #ERR_CODE_INVALID_REGION}
     */
    public static void validateRegion(String region) {
        String reason = validateEndpointLabel(region);
        if (reason != null) {
            throw new EndpointValidationException(ERR_CODE_INVALID_REGION,
                    "invalid region " + quote(region) + ": " + reason + ", region " + ENDPOINT_LABEL_RULE);
        }
    }

    /**
     * Checks that service is safe to be used when building an endpoint host
     * name. A {@code null} or empty service is allowed and left to the caller.
     *
     * @param service the service
     * @throws EndpointValidationException with code {@link #ERR_CODE_INVALID_SERVICE}
     */
    public static void validateService(String service) {
        String reason = validateEndpointLabel(service);
        if (reason != null) {
            throw new EndpointValidationException(ERR_CODE_INVALID_SERVICE,
                    "invalid service " + quote(service) + ": " + reason + ", service " + ENDPOINT_LABEL_RULE);
        }
    }

    /**
     * Validates service first, then region.
     *
     * @param service the service
     * @param region  the region
     * @throws EndpointValidationException if either of them is not valid
     */
    public static void validateServiceAndRegion(String service, String region) {
        validateService(service);
        validateRegion(region);
    }

    private static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    /**
     * Only ASCII letters, digits, '-' and '_' are allowed. Anything else, such
     * as '@', ':', '/', '?', '#', '.', white spaces, control characters or non
     * ASCII characters, could change the structure of the resolved host.
     */
    private static boolean isEndpointLabelChar(char c) {
        return isLetter(c) || isDigit(c) || c == '-' || c == '_';
    }

    /**
     * Returns {@code null} if s is a valid endpoint label, or the reason why it
     * is not. The character set is checked first, then the first and the last
     * character.
     *
     * <p>Every non ASCII character is rejected, so all the characters before
     * the reported index are ASCII and the index is the same as the byte index
     * in the UTF-8 encoding of s.
     */
    private static String validateEndpointLabel(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!isEndpointLabelChar(s.charAt(i))) {
                return "illegal character at index " + i;
            }
        }
        if (!isLetter(s.charAt(0))) {
            return "must start with a letter";
        }
        char last = s.charAt(s.length() - 1);
        if (last == '-' || last == '_') {
            return "must not end with '-' or '_'";
        }
        return null;
    }

    /**
     * Returns s as a double-quoted string literal, escaping it the same way as
     * Go's {@code %q} verb (strconv.Quote), so that control characters and other
     * non printable characters are never written as is into messages or logs.
     */
    static String quote(String s) {
        StringBuilder sb = new StringBuilder(s.length() + 2);
        sb.append('"');
        for (int i = 0; i < s.length(); ) {
            int cp = s.codePointAt(i);
            i += Character.charCount(cp);
            switch (cp) {
                case '"':
                    sb.append("\\\"");
                    continue;
                case '\\':
                    sb.append("\\\\");
                    continue;
                case 0x07:
                    sb.append("\\a");
                    continue;
                case '\b':
                    sb.append("\\b");
                    continue;
                case '\f':
                    sb.append("\\f");
                    continue;
                case '\n':
                    sb.append("\\n");
                    continue;
                case '\r':
                    sb.append("\\r");
                    continue;
                case '\t':
                    sb.append("\\t");
                    continue;
                case 0x0b:
                    sb.append("\\v");
                    continue;
                default:
                    break;
            }
            if (isPrint(cp)) {
                sb.appendCodePoint(cp);
            } else if (cp < ' ' || cp == 0x7f) {
                appendHex(sb, "\\x", cp, 2);
            } else if (cp < 0x10000) {
                appendHex(sb, "\\u", cp, 4);
            } else {
                appendHex(sb, "\\U", cp, 8);
            }
        }
        sb.append('"');
        return sb.toString();
    }

    private static void appendHex(StringBuilder sb, String prefix, int value, int width) {
        String hex = Integer.toHexString(value);
        sb.append(prefix);
        for (int i = hex.length(); i < width; i++) {
            sb.append('0');
        }
        sb.append(hex);
    }

    /**
     * Same definition as Go's strconv.IsPrint: letters, marks, numbers,
     * punctuation, symbols and the ASCII space.
     */
    private static boolean isPrint(int cp) {
        if (cp == ' ') {
            return true;
        }
        switch (Character.getType(cp)) {
            case Character.UPPERCASE_LETTER:
            case Character.LOWERCASE_LETTER:
            case Character.TITLECASE_LETTER:
            case Character.MODIFIER_LETTER:
            case Character.OTHER_LETTER:
            case Character.NON_SPACING_MARK:
            case Character.ENCLOSING_MARK:
            case Character.COMBINING_SPACING_MARK:
            case Character.DECIMAL_DIGIT_NUMBER:
            case Character.LETTER_NUMBER:
            case Character.OTHER_NUMBER:
            case Character.CONNECTOR_PUNCTUATION:
            case Character.DASH_PUNCTUATION:
            case Character.START_PUNCTUATION:
            case Character.END_PUNCTUATION:
            case Character.INITIAL_QUOTE_PUNCTUATION:
            case Character.FINAL_QUOTE_PUNCTUATION:
            case Character.OTHER_PUNCTUATION:
            case Character.MATH_SYMBOL:
            case Character.CURRENCY_SYMBOL:
            case Character.MODIFIER_SYMBOL:
            case Character.OTHER_SYMBOL:
                return true;
            default:
                return false;
        }
    }
}
