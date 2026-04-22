Overview[(中文)](0-Overview-zh.md) | [Credentials →](1-Credentials.md)

---

# SDK Integration

When calling APIs, it is recommended to integrate the SDK in your project. Using the SDK simplifies development, speeds up integration, and reduces long-term maintenance costs. Volcengine SDK integration typically includes three steps: importing the SDK, configuring access credentials, and writing API call code.

# Requirements

- The SDK requires **Java 1.8.0_131+**. Download from: http://developers.sun.com/downloads/.
- If your Java version is **Java 9 or later**, add `javax.annotation-api` because it was removed from JDK 9+.

# Table of Contents

1. [Credentials](1-Credentials.md) — AK/SK, STS, AssumeRole, OIDC, SAML, ECS Role, Default Chain
2. [Endpoint Configuration](2-Endpoint.md) — Custom Endpoint, RegionId, Automatic Resolution
3. [Transport](3-Transport.md) — HTTP Connection Pool, HTTPS Scheme, SSL Verification, HTTP(S) Proxy
4. [Timeout](4-Timeout.md) — Global Timeouts
5. [Retry](5-Retry.md) — Retry Strategy, Backoff Strategy
6. [Error Handling](6-ErrorHandling.md) — Exception Handling
7. [Debugging](7-Debugging.md) — Debug Mode

---

English | [中文](0-Overview-zh.md)
