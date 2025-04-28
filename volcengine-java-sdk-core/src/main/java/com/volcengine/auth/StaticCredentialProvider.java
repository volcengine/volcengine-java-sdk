package com.volcengine.auth;

public class StaticCredentialProvider implements Provider {

    // 存储凭证值的对象
    private CredentialValue credentials;

    // 构造函数，用于初始化 StaticCredentialProvider 对象
    public StaticCredentialProvider(String accessKeyId, String secretAccessKey, String sessionToken) {
        // 创建 CredentialValue 对象并赋值给 credentials 字段
        this.credentials = new CredentialValue(accessKeyId, secretAccessKey, sessionToken, "StaticCredentialProvider");
    }


    // 实现 Provider 接口的 retrieve 方法，用于获取凭证值
    @Override
    public CredentialValue retrieve() {
        return this.credentials;
    }

    // 实现 Provider 接口的 isExpired 方法，静态凭证永远不会过期
    @Override
    public boolean isExpired() {
        return false;
    }

    // 实现 Provider 接口的 refresh 方法，静态凭证无需刷新
    @Override
    public void refresh() {
        // 此方法为空，不执行任何操作
    }

}
