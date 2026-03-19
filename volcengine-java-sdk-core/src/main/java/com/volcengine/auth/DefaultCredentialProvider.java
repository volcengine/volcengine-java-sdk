package com.volcengine.auth;

import com.volcengine.ApiException;

import java.util.ArrayList;
import java.util.List;

public class DefaultCredentialProvider implements Provider {

    private static final String PROVIDER_NAME = "DefaultCredentialProvider";

    private final List<Provider> providers;
    private final boolean reuseLastProviderEnabled;
    private volatile Provider lastSuccessProvider;

    private DefaultCredentialProvider(Builder builder) {
        this.reuseLastProviderEnabled = builder.reuseLastProviderEnabled;
        this.providers = buildProviderChain(builder.roleName);
    }

    public static DefaultCredentialProvider create() {
        return builder().build();
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public boolean isExpired() {
        if (lastSuccessProvider != null) {
            return lastSuccessProvider.isExpired();
        }
        return true;
    }

    @Override
    public void refresh() throws ApiException {
        if (lastSuccessProvider != null) {
            lastSuccessProvider.refresh();
        }
    }

    @Override
    public CredentialValue retrieve() throws ApiException {
        // Fast path: reuse last successful provider
        if (reuseLastProviderEnabled && lastSuccessProvider != null) {
            try {
                CredentialValue creds = lastSuccessProvider.retrieve();
                if (creds != null) {
                    return creds;
                }
            } catch (Exception e) {
                // Clear cached provider and fall through to full chain
                lastSuccessProvider = null;
            }
        }

        // Full chain traversal
        List<String> errors = new ArrayList<>();

        for (Provider provider : providers) {
            try {
                CredentialValue creds = provider.retrieve();
                if (creds != null) {
                    if (reuseLastProviderEnabled) {
                        lastSuccessProvider = provider;
                    }
                    return creds;
                }
            } catch (Exception e) {
                errors.add(provider.getClass().getSimpleName() + ": " + e.getMessage());
            }
        }

        StringBuilder sb = new StringBuilder(PROVIDER_NAME + ": unable to find credentials from any provider in the chain. Attempted providers:\n");
        for (int i = 0; i < errors.size(); i++) {
            sb.append("  ").append(i + 1).append(". ").append(errors.get(i));
            if (i < errors.size() - 1) {
                sb.append("\n");
            }
        }
        throw new ApiException(sb.toString());
    }

    private static List<Provider> buildProviderChain(String roleName) {
        List<Provider> chain = new ArrayList<>();

        // Step 1: Environment variables (AK/SK/STS)
        chain.add(new EnvironmentVariableCredentialProvider());

        // Step 2: OIDC from environment variables
        chain.add(new OidcEnvProviderWrapper());

        // Step 3: CLI config.json
        chain.add(new CLIConfigCredentialProvider());

        // Step 4: ECS Role (IMDS)
        chain.add(new EcsRoleProviderWrapper(roleName));

        return chain;
    }

    /**
     * Wrapper for OidcCredentialProvider that handles the case where
     * environment variables are not set (returns a clear error rather than
     * failing at construction time).
     */
    private static class OidcEnvProviderWrapper implements Provider {
        private volatile Provider delegate;
        private volatile boolean initialized;
        private volatile String initError;

        @Override
        public boolean isExpired() {
            if (delegate != null) {
                return delegate.isExpired();
            }
            return true;
        }

        @Override
        public void refresh() throws ApiException {
            if (delegate != null) {
                delegate.refresh();
            }
        }

        @Override
        public CredentialValue retrieve() throws ApiException {
            if (!initialized) {
                synchronized (this) {
                    if (!initialized) {
                        try {
                            delegate = OidcCredentialProvider.fromEnvironment();
                        } catch (Exception e) {
                            initError = e.getMessage();
                        }
                        initialized = true;
                    }
                }
            }
            if (delegate == null) {
                throw new ApiException("OidcCredentialProvider: " + initError);
            }
            return delegate.retrieve();
        }
    }

    /**
     * Wrapper for EcsRoleCredentialProvider that handles IMDS disabled check
     * and defers construction to avoid blocking at chain build time.
     */
    private static class EcsRoleProviderWrapper implements Provider {
        private final String roleName;
        private volatile Provider delegate;
        private volatile boolean initialized;
        private volatile String initError;

        EcsRoleProviderWrapper(String roleName) {
            this.roleName = roleName;
        }

        @Override
        public boolean isExpired() {
            if (delegate != null) {
                return delegate.isExpired();
            }
            return true;
        }

        @Override
        public void refresh() throws ApiException {
            if (delegate != null) {
                delegate.refresh();
            }
        }

        @Override
        public CredentialValue retrieve() throws ApiException {
            if (!initialized) {
                synchronized (this) {
                    if (!initialized) {
                        try {
                            delegate = EcsRoleCredentialProvider.create(roleName);
                        } catch (Exception e) {
                            initError = e.getMessage();
                        }
                        initialized = true;
                    }
                }
            }
            if (delegate == null) {
                throw new ApiException("EcsRoleCredentialProvider: " + initError);
            }
            return delegate.retrieve();
        }
    }

    public static class Builder {
        private String roleName;
        private boolean reuseLastProviderEnabled = true;

        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        public Builder reuseLastProviderEnabled(Boolean enabled) {
            if (enabled != null) {
                this.reuseLastProviderEnabled = enabled;
            }
            return this;
        }

        public DefaultCredentialProvider build() {
            return new DefaultCredentialProvider(this);
        }
    }
}
