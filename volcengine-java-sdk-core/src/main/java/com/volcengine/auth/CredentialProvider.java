package com.volcengine.auth;

import com.volcengine.ApiException;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CredentialProvider {
    private Provider provider;

    private ReadWriteLock readWriteLock;

    public CredentialProvider(Provider provider) {
        this.provider = provider;
        readWriteLock = new ReentrantReadWriteLock();
    }

    public Provider getProvider() {
        return provider;
    }

    /**
     * Bind only SDK-owned implementations. Custom providers keep their original
     * identity and synchronization contract.
     */
    public CredentialProvider bind(String httpProxy, String httpsProxy) {
        readWriteLock.writeLock().lock();
        try {
            Provider copy;
            if (provider.getClass() == StsAssumeRoleProvider.class) {
                copy = ((StsAssumeRoleProvider) provider).bind(httpProxy, httpsProxy);
            } else if (provider.getClass() == OidcCredentialProvider.class) {
                copy = ((OidcCredentialProvider) provider).bind(httpProxy, httpsProxy);
            } else if (provider.getClass() == SamlCredentialProvider.class) {
                copy = ((SamlCredentialProvider) provider).bind(httpProxy, httpsProxy);
            } else {
                return this;
            }
            return new CredentialProvider(copy);
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public CredentialValue get() throws ApiException {
        try {
            readWriteLock.readLock().lock();
            if (!provider.isExpired()) {
                return provider.retrieve();
            }
        } finally {
            readWriteLock.readLock().unlock();
        }

        try {
            readWriteLock.writeLock().lock();
            if (provider.isExpired()) {
                provider.refresh();
            }
            return provider.retrieve();

        } finally {
            readWriteLock.writeLock().unlock();
        }
    }
}
