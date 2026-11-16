package com.volcengine.auth;

import com.volcengine.ApiException;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CredentialProvider {
    private Provider provider;

    private ReadWriteLock readWriteLock;
    private boolean invalidated;

    /** Apply diagnostics configuration only to SDK-owned provider implementations. */
    public void setSimpleError(boolean enabled) {
        readWriteLock.writeLock().lock();
        try {
            if (provider.getClass() == StsAssumeRoleProvider.class) {
                ((StsAssumeRoleProvider) provider).setSimpleError(enabled);
            } else if (provider.getClass() == OidcCredentialProvider.class) {
                ((OidcCredentialProvider) provider).setSimpleError(enabled);
            } else if (provider.getClass() == SamlCredentialProvider.class) {
                ((SamlCredentialProvider) provider).setSimpleError(enabled);
            } else if (provider.getClass() == CLIConfigCredentialProvider.class) {
                ((CLIConfigCredentialProvider) provider).setSimpleError(enabled);
            } else if (provider.getClass() == DefaultCredentialProvider.class) {
                ((DefaultCredentialProvider) provider).setSimpleError(enabled);
            }
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    static boolean usesStsCredentials(Provider provider) {
        return provider != null && (provider.getClass() == StsAssumeRoleProvider.class
                || provider.getClass() == OidcCredentialProvider.class
                || provider.getClass() == SamlCredentialProvider.class
                || (provider.getClass() == CLIConfigCredentialProvider.class
                    && ((CLIConfigCredentialProvider) provider).usesStsCredentials())
                || (provider.getClass() == DefaultCredentialProvider.class
                    && ((DefaultCredentialProvider) provider).usesStsCredentials()));
    }

    /** Mark only built-in STS caches for refresh after a service expiry error. */
    public void invalidate() {
        readWriteLock.writeLock().lock();
        try {
            if (usesStsCredentials(provider)) invalidated = true;
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

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
            if (!invalidated && !provider.isExpired()) {
                return provider.retrieve();
            }
        } finally {
            readWriteLock.readLock().unlock();
        }

        try {
            readWriteLock.writeLock().lock();
            if (invalidated || provider.isExpired()) {
                provider.refresh();
                invalidated = false;
            }
            return provider.retrieve();

        } finally {
            readWriteLock.writeLock().unlock();
        }
    }
}
