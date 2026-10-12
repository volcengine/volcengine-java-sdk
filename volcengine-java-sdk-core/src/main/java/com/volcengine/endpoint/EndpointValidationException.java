package com.volcengine.endpoint;

import com.volcengine.ApiException;
import com.volcengine.model.Error;
import com.volcengine.model.ResponseMetadata;

/**
 * Thrown when a region or service can not be safely used to build an endpoint
 * host name, see {@link EndpointValidation}.
 *
 * <p>It extends {@link IllegalArgumentException} so it can be thrown from
 * {@link EndpointResolver#endpointFor(ResolveEndpointOption)}, which does not
 * declare checked exceptions. {@link #getMessage()} and {@link #toString()}
 * return {@code "Code: Message"}, callers can rely on {@link #getCode()} to
 * check the error code.
 */
public class EndpointValidationException extends IllegalArgumentException {

    private static final long serialVersionUID = 1L;

    /**
     * HTTP status code used when the error is reported through an
     * {@link ApiException}.
     */
    public static final int HTTP_STATUS_BAD_REQUEST = 400;

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

    /**
     * Converts this exception to an {@link ApiException} for the APIs that
     * report errors through it. The HTTP status code is 400, this exception is
     * the cause and the error code is also available in
     * {@code getResponseMetadata().getError().getCode()}, as for errors
     * returned by the server.
     *
     * @return the ApiException
     */
    public ApiException toApiException() {
        ApiException apiException = new ApiException(getMessage(), this, HTTP_STATUS_BAD_REQUEST, null);
        Error error = new Error();
        error.setCode(code);
        error.setMessage(errorMessage);
        ResponseMetadata metadata = new ResponseMetadata();
        metadata.setError(error);
        apiException.setResponseMetadata(metadata);
        return apiException;
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
