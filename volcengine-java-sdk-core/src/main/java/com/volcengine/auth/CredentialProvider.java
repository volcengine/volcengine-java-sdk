package com.volcengine.auth;

import com.volcengine.ApiException;

public class CredentialProvider {
    private Provider provider;

    public CredentialProvider(Provider provider) {
        this.provider = provider;
    }

    public CredentialValue get() throws ApiException {
        if (provider.isExpired()) {
            // refresh if expired
            provider.refresh();
        }
        return provider.retrieve();
    }
}
