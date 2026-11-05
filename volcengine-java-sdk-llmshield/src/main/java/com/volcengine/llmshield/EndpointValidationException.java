package com.volcengine.llmshield;

/**
 * Thrown when a region or service can not be safely used to sign a request,
 * see {@link EndpointValidation}.
 *
 * <p>It extends {@link IllegalArgumentException}, as the other argument checks
 * of this module. {@link #getMessage()} and {@link #toString()} return
 * {@code "Code: Message"}, callers can rely on {@link #getCode()} to check the
 * error code.
 */
public class EndpointValidationException extends IllegalArgumentException {

    private static final long serialVersionUID = 1L;

    private final String code;
    private final String errorMessage;

    public EndpointValidationException(String code, String errorMessage) {
        super(code + ": " + errorMessage);
        this.code = code;
        this.errorMessage = errorMessage;
    }

    /**
     * @return the error code, {@link EndpointValidation#ERR_CODE_INVALID_REGION}
     * or {@link EndpointValidation#ERR_CODE_INVALID_SERVICE}
     */
    public String getCode() {
        return code;
    }

    /**
     * @return the error message without the error code
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
