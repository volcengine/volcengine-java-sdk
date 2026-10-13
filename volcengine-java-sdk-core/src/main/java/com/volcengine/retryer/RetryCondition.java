package com.volcengine.retryer;

import com.volcengine.ApiException;
import com.volcengine.ApiResponse;
import org.apache.commons.lang.SerializationException;
import org.apache.commons.lang.SerializationUtils;

import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public abstract class RetryCondition implements Cloneable {
    protected Set<String> retryErrorCodes = new HashSet<>();

    /**
     * Copy this condition, preserving its runtime type and independently copying
     * the retry error codes. Subclasses with additional mutable reference fields
     * should override this method, call {@code super.copy()}, and copy those
     * fields on the result. Override {@link #copyRetryErrorCodes()} for sets
     * requiring a custom copy mechanism.
     */
    public RetryCondition copy() {
        try {
            RetryCondition copy = (RetryCondition) super.clone();
            copy.retryErrorCodes = copyRetryErrorCodes();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /**
     * Copy the configured set without silently changing its matching semantics.
     * Sorted sets retain their comparator; ordinary hash sets retain their type.
     * Other serializable sets are copied with their backing state, including
     * map-backed and unmodifiable wrappers. Unsupported sets fail explicitly;
     * subclasses can override this hook to return an independent equivalent set.
     */
    @SuppressWarnings("unchecked")
    protected Set<String> copyRetryErrorCodes() {
        if (retryErrorCodes == null) {
            return null;
        }
        if (retryErrorCodes instanceof SortedSet) {
            SortedSet<String> sortedCodes = (SortedSet<String>) retryErrorCodes;
            TreeSet<String> copy = new TreeSet<String>(sortedCodes.comparator());
            copy.addAll(sortedCodes);
            return copy;
        }
        if (retryErrorCodes.getClass() == HashSet.class
                || retryErrorCodes.getClass() == LinkedHashSet.class) {
            return (Set<String>) ((HashSet<String>) retryErrorCodes).clone();
        }
        String message = "Cannot copy retryErrorCodes set " + retryErrorCodes.getClass().getName()
                + "; override RetryCondition.copyRetryErrorCodes() to preserve its semantics";
        if (retryErrorCodes instanceof Serializable) {
            try {
                return (Set<String>) SerializationUtils.clone((Serializable) retryErrorCodes);
            } catch (SerializationException e) {
                throw new IllegalStateException(message, e);
            }
        }
        throw new IllegalStateException(message);
    }

    public abstract boolean shouldRetry(ApiResponse response, ApiException apiException);

    public Set<String> getRetryErrorCodes() {
        return retryErrorCodes;
    }

    public void addRetryErrorCode(String retryErrorCode) {
        this.retryErrorCodes.add(retryErrorCode);
    }

    public void addRetryErrorCodes(Set<String> retryErrorCodes) {
        this.retryErrorCodes.addAll(retryErrorCodes);
    }

}
