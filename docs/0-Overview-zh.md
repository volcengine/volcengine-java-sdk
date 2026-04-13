中文 | [English](0-Overview.md)

---

# 集成SDK

在调用接口时，推荐在项目中集成 SDK 的方式进行接入。通过使用 SDK，不仅可以简化开发流程、加快功能集成速度，还能有效降低后期的维护成本。火山引擎 SDK 的集成主要包括以下三个步骤：引入 SDK、配置访问凭证，以及编写接口调用代码。

# 环境要求

- 运行 SDK需要jdk **Java 1.8.0_131+**. 你可以下载最新的版本： http://developers.sun.com/downloads/.
- 如果 SDK版本 高于或者等于 **Java 9** 请依赖javax.annotation-api由于在高于或者等于 **Java 9** 中 javax.annotation-api 被移除

# 目录

1. [访问凭据](1-Credentials-zh.md) — AK/SK、STS、AssumeRole、OIDC、SAML、ECS 角色、默认凭证链
2. [Endpoint 配置](2-Endpoint-zh.md) — 自定义 Endpoint、RegionId、自动化寻址
3. [Transport](3-Transport-zh.md) — HTTP 连接池、HTTPS Scheme、SSL 验证、HTTP(S) 代理
4. [超时配置](4-Timeout-zh.md) — 全局超时设置
5. [重试策略](5-Retry-zh.md) — 重试策略、退避策略
6. [错误处理](6-ErrorHandling-zh.md) — 异常处理
7. [调试模式](7-Debugging-zh.md) — Debug 模式

---

中文 | [English](0-Overview.md)
