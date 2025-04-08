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
