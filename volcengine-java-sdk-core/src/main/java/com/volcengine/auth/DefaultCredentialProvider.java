package com.volcengine.auth;

import com.volcengine.ApiException;

import java.util.ArrayList;
import java.util.List;

/**
 * Default provider chain. Walks a fixed list of providers on refresh,
 * selecting the first provider that successfully obtains credentials.
 *
 * <p>Follows the {@link Provider} CQS contract:
 * <ul>
 *   <li>{@link #isExpired()} / {@link #retrieve()} are pure reads.</li>
 *   <li>{@link #refresh()} is the only method that mutates state.
 *       It either refreshes the last successful provider (when
 *       {@code reuseLastProviderEnabled} is true) or walks the chain
 *       and sets {@code lastSuccessProvider} on the first success.</li>
 * </ul>
 *
 * <p>Intended to be wrapped in a {@link CredentialProvider}, which serializes
 * refresh through a {@link java.util.concurrent.locks.ReadWriteLock} and
 * guarantees the {@code isExpired → refresh → retrieve} sequence. Direct use
 * (without wrapping) is not a supported mode.
 */
public class DefaultCredentialProvider implements Provider {

    private static final String PROVIDER_NAME = "DefaultCredentialProvider";

    private final List<Provider> providers;
    private final boolean reuseLastProviderEnabled;
    private Provider lastSuccessProvider;

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
        return lastSuccessProvider == null || lastSuccessProvider.isExpired();
    }

    @Override
    public void refresh() throws ApiException {
        // Fast path: reuse last successful provider
        if (reuseLastProviderEnabled && lastSuccessProvider != null) {
            try {
                lastSuccessProvider.refresh();
                return;
            } catch (Exception e) {
                // Fall through to full chain traversal
                lastSuccessProvider = null;
            }
        }

        // Full chain traversal: pick the first provider that refreshes successfully
        List<String> errors = new ArrayList<>();
        for (Provider provider : providers) {
            try {
                provider.refresh();
                lastSuccessProvider = provider;
                return;
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

    @Override
    public CredentialValue retrieve() throws ApiException {
        Provider last = lastSuccessProvider;
        if (last == null) {
            throw new ApiException(PROVIDER_NAME + ": not refreshed; call refresh() first or use CredentialProvider");
        }
        return last.retrieve();
    }

    private static List<Provider> buildProviderChain(String roleName) {
        List<Provider> chain = new ArrayList<>();

        // Step 1: Environment variables (AK/SK/STS)
        chain.add(new EnvironmentVariableCredentialProvider());

        // Step 2: OIDC from environment variables
        chain.add(new OidcEnvProviderWrapper());

        // Step 3: CLI config.json
        chain.add(new CLIConfigCredentialProvider());

        // Step 4: ECS Role (IMDS) — skipped entirely when
        // VOLCENGINE_ECS_METADATA_DISABLED=true. The provider's constructor
        // also enforces this kill-switch so that direct
        // `new EcsRoleCredentialProvider(...)` fails fast in the same way.
        if (!EcsRoleCredentialProvider.isDisabledByEnv()) {
            chain.add(new EcsRoleProviderWrapper(roleName));
        }

        return chain;
    }

    /**
     * Wrapper for OidcCredentialProvider that defers construction until
     * the first refresh (when the relevant environment variables are
     * known to be set). Follows the same CQS contract as the outer chain.
     */
    private static class OidcEnvProviderWrapper implements Provider {
        private Provider delegate;

        @Override
        public boolean isExpired() {
            return delegate == null || delegate.isExpired();
        }

        @Override
        public void refresh() throws ApiException {
            if (delegate == null) {
                delegate = OidcCredentialProvider.fromEnvironment();
            }
            delegate.refresh();
        }

        @Override
        public CredentialValue retrieve() throws ApiException {
            return delegate.retrieve();
        }
    }

    /**
     * Wrapper for EcsRoleCredentialProvider that defers construction until
     * the first refresh (to honour the IMDS-disabled env check without
     * throwing at chain build time). Follows the same CQS contract as the
     * outer chain.
     */
    private static class EcsRoleProviderWrapper implements Provider {
        private final String roleName;
        private Provider delegate;

        EcsRoleProviderWrapper(String roleName) {
            this.roleName = roleName;
        }

        @Override
        public boolean isExpired() {
            return delegate == null || delegate.isExpired();
        }

        @Override
        public void refresh() throws ApiException {
            if (delegate == null) {
                delegate = EcsRoleCredentialProvider.create(roleName);
            }
            delegate.refresh();
        }

        @Override
        public CredentialValue retrieve() throws ApiException {
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
