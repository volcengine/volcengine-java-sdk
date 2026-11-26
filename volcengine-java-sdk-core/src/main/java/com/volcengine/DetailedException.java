package com.volcengine;

/**
 * Optional HTTP diagnostics for customer exceptions. Existing exception and
 * provider contracts do not require implementing this interface.
 */
public interface DetailedException {
    ResponseDetails getResponseDetails();
}
