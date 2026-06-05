Overview[(中文)](0-Overview-zh.md) | [Credentials →](1-Credentials.md)

---

## SDK Integration

When calling APIs, it is recommended to integrate the SDK in your project. Using the SDK simplifies development, speeds up integration, and reduces long-term maintenance costs. Volcengine SDK integration typically includes three steps: importing the SDK, configuring access credentials, and writing API call code.

## Requirements

- The SDK requires **Java 1.8.0_131+**. Download from: http://developers.sun.com/downloads/.
- If your Java version is **Java 9 or later**, add the `javax.annotation-api` dependency (it was removed from JDK 9+).

## Table of Contents

1. [Credentials](1-Credentials.md) — AK/SK, STS, AssumeRole, OIDC, SAML, ECS Role, Default Chain
2. [Endpoint Configuration](2-Endpoint.md) — Custom Endpoint, RegionId, Automatic Resolution
3. [Transport](3-Transport.md) — HTTP Connection Pool, HTTPS Scheme, SSL Verification
4. [Proxy](4-Proxy.md) — HTTP(S) Proxy Configuration
5. [Timeout](5-Timeout.md) — Global Timeouts
6. [Retry](6-Retry.md) — Retry Strategy, Backoff Strategy
7. [Error Handling](7-ErrorHandling.md) — Exception Handling
8. [Debugging](8-Debugging.md) — Debug Mode

---

Overview[(中文)](0-Overview-zh.md) | [Credentials →](1-Credentials.md)
