package com.volcengine.auth;

import com.volcengine.ApiException;

public interface Provider {
    public boolean isExpired();

    public void refresh() throws ApiException;

    public CredentialValue retrieve() throws ApiException;
}
