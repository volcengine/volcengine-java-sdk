package com.volcengine;

import com.squareup.okhttp.*;
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.CredentialValue;
import com.volcengine.auth.Provider;
import com.volcengine.endpoint.*;
import com.volcengine.endpoint.EndpointValidation;
import com.volcengine.endpoint.EndpointValidationException;
import com.volcengine.interceptor.*;
import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.Assert;

/** 仅使用占位凭据；HTTP 在应用拦截器中返回内存响应。 */
public final class EndpointTestSupport {
    private EndpointTestSupport() { }

    public static List<String> maliciousInputs() {
        List<String> values = new ArrayList<>(Arrays.asList(
                "@example.invalid", "cn-beijing@example.invalid", ":443", "http://example.invalid",
                "/", "ecs/other", "ecs/get/", "ecs//", "\\", "ecs\\other", "?q=x", "#fragment",
                ".", "..", "example.invalid", " ", "cn beijing", "\t", "\n", "\r\n",
                "%40example.invalid", "%2f", "%2F", "%5c", "%00", "%252f", "%", "+", "=", "&", ";",
                "[::1]", "中文", "é", "ｅｃｓ", "\u00a0", "\u200b", "\ud83d\ude00"));
        for (char c = 0; c < 32; c++) values.add("cn" + c + "beijing");
        values.add("cn\u007fbeijing");
        return values;
    }

    public static Collection<Object[]> payloadParameters() {
        List<Object[]> result = new ArrayList<>();
        int i = 0;
        for (String value : maliciousInputs()) result.add(new Object[]{i++, value});
        return result;
    }

    // ---- 规范用例与断言（错误码、完整错误信息、原因） ----
    public static final String RULE = "must start with a letter, end with a letter or digit, "
            + "and contain only letters, digits, '-' and '_'";
    public static final String REASON_START = "must start with a letter";
    public static final String REASON_END = "must not end with '-' or '_'";

    /** Values able to change the host structure: {input, quoted input, reason}. */
    public static final String[][] INJECTION_CASES = {
            {"cn-beijing@127.0.0.1", "\"cn-beijing@127.0.0.1\"", "illegal character at index 10"},
            {"cn-beijing:443", "\"cn-beijing:443\"", "illegal character at index 10"},
            {"cn/beijing", "\"cn/beijing\"", "illegal character at index 2"},
            {"cn?beijing", "\"cn?beijing\"", "illegal character at index 2"},
            {"cn#beijing", "\"cn#beijing\"", "illegal character at index 2"},
            {"cn beijing", "\"cn beijing\"", "illegal character at index 2"},
            {"cn\tbeijing", "\"cn\\tbeijing\"", "illegal character at index 2"},
            {"cn\nbeijing", "\"cn\\nbeijing\"", "illegal character at index 2"},
            {"cn\rbeijing", "\"cn\\rbeijing\"", "illegal character at index 2"},
            {"cn\u0000beijing", "\"cn\\x00beijing\"", "illegal character at index 2"},
            {"evil.com", "\"evil.com\"", "illegal character at index 4"},
            {"cn%2fbeijing", "\"cn%2fbeijing\"", "illegal character at index 2"},
            {"cn\\beijing", "\"cn\\\\beijing\"", "illegal character at index 2"},
            {"北京", "\"北京\"", "illegal character at index 0"},
            {"cn-北京", "\"cn-北京\"", "illegal character at index 3"},
            {"cn-beijing\n", "\"cn-beijing\\n\"", "illegal character at index 10"},
    };

    /** Values only made of allowed characters but breaking the first/last character rules. */
    public static final String[][] EDGE_CASES = {
            {"1cn-beijing", "\"1cn-beijing\"", REASON_START},
            {"1", "\"1\"", REASON_START},
            {"-cn-beijing", "\"-cn-beijing\"", REASON_START},
            {"_ecs", "\"_ecs\"", REASON_START},
            {"cn-beijing-", "\"cn-beijing-\"", REASON_END},
            {"rds_mysql_", "\"rds_mysql_\"", REASON_END},
            {"-", "\"-\"", REASON_START},
            {"_", "\"_\"", REASON_START},
    };

    public static final String[] VALID = {"cn-beijing", "ap-southeast-1", "a", "rds_mysql", "Redis", "Rds_mysql-2", ""};

    public static List<String[]> invalidCases() {
        List<String[]> all = new ArrayList<>(Arrays.asList(INJECTION_CASES));
        all.addAll(Arrays.asList(EDGE_CASES));
        return all;
    }

    public static List<String> invalidValues() {
        List<String> values = new ArrayList<>();
        for (String[] c : invalidCases()) values.add(c[0]);
        return values;
    }

    /** Full expected message, without the code. */
    public static String expectedMessage(String kind, String quoted, String reason) {
        return "invalid " + kind + " " + quoted + ": " + reason + ", " + kind + " " + RULE;
    }

    public static String expectedCode(String kind) {
        return "region".equals(kind) ? EndpointValidation.ERR_CODE_INVALID_REGION : EndpointValidation.ERR_CODE_INVALID_SERVICE;
    }

    public static String[] caseOf(String value) {
        for (String[] c : invalidCases()) if (c[0].equals(value)) return c;
        throw new IllegalArgumentException("unknown case " + value);
    }

    public static void assertValidationError(String kind, String value, Throwable t) {
        String[] c = caseOf(value);
        Assert.assertTrue("unexpected " + t, t instanceof EndpointValidationException);
        EndpointValidationException e = (EndpointValidationException) t;
        String message = expectedMessage(kind, c[1], c[2]);
        Assert.assertEquals(expectedCode(kind), e.getCode());
        Assert.assertEquals(message, e.getErrorMessage());
        Assert.assertEquals(expectedCode(kind) + ": " + message, e.getMessage());
    }

    /** ApiException produced from a validation error: status 400, cause and metadata carry the code. */
    public static void assertApiValidationError(String kind, String value, ApiException e) {
        Assert.assertEquals(400, e.getCode());
        assertValidationError(kind, value, e.getCause());
        Assert.assertEquals(e.getCause().getMessage(), e.getMessage());
        Assert.assertNotNull(e.getResponseMetadata());
        Assert.assertEquals(expectedCode(kind), e.getResponseMetadata().getError().getCode());
        Assert.assertEquals(((EndpointValidationException) e.getCause()).getErrorMessage(),
                e.getResponseMetadata().getError().getMessage());
    }

    public static ResolveEndpointOption option(String service, String region, boolean dual) {
        ResolveEndpointOption option = new ResolveEndpointOption();
        option.setService(service);
        option.setRegion(region);
        option.setUseDualStack(dual);
        option.setCustomBootstrapRegion(new HashSet<>(Arrays.asList("cn-beijing", "cn-shanghai", "cn-test")));
        return option;
    }

    public enum Resolver { DEFAULT, RECORDING, FAILING }

    /** 请求流水线是私有字段，没有公开访问方式。 */
    public static InterceptorChain chain(ApiClient client) throws Exception {
        Field field = ApiClient.class.getDeclaredField("interceptorChain");
        field.setAccessible(true);
        return (InterceptorChain) field.get(client);
    }

    public static final class CountingHttpClient extends OkHttpClient {
        public final AtomicInteger calls = new AtomicInteger();
        public final AtomicInteger responses = new AtomicInteger();
        public volatile Request lastRequest;
        public CountingHttpClient() {
            setConnectionPool(new ConnectionPool(1, 1000));
            setDispatcher(new Dispatcher(Executors.newSingleThreadExecutor()));
            getDispatcher().setMaxRequests(1);
            getDispatcher().setMaxRequestsPerHost(1);
            interceptors().add(chain -> {
                responses.incrementAndGet();
                return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1)
                        .code(200).message("OK").header("Content-Type", "application/json")
                        .body(ResponseBody.create(MediaType.parse("application/json"),
                                "{\"ResponseMetadata\":{\"RequestId\":\"unit-test\"},\"Result\":{\"ok\":true,\"count\":1}}"))
                        .build();
            });
        }
        @Override public Call newCall(Request request) {
            calls.incrementAndGet();
            lastRequest = request;
            return super.newCall(request);
        }
    }

    public static final class Fixture implements AutoCloseable {
        public final AtomicInteger credentials = new AtomicInteger();
        public final AtomicInteger beforeSign = new AtomicInteger();
        public final AtomicInteger resolverCalls = new AtomicInteger();
        public final CountingHttpClient http = new CountingHttpClient();
        public final ApiClient client;
        public Fixture(String region, boolean custom) throws Exception {
            this(region, custom ? Resolver.RECORDING : Resolver.DEFAULT, false);
        }
        /** 固定双栈和 bootstrap 配置，不依赖环境变量；FAILING 解析器一被调用就让测试失败。 */
        public Fixture(String region, Resolver resolver) throws Exception {
            this(region, resolver, true);
        }
        private Fixture(String region, Resolver resolver, boolean isolated) throws Exception {
            client = new ApiClient().setRegion(region).setAutoRetry(false).setHttpClient(http);
            if (isolated) {
                client.setUseDualStack(false);
                client.setCustomBootstrapRegion(new HashSet<>(Collections.singletonList("cn-beijing")));
            }
            // master 新增的 CredentialProvider.bind() 会解引用 provider，这里用计数 Provider。
            client.setCredentialProvider(new CredentialProvider(new Provider() {
                @Override public CredentialValue retrieve() {
                    credentials.incrementAndGet();
                    return new CredentialValue("<TEST_AK>", "<TEST_SK>", "", "unit-test");
                }
                @Override public boolean isExpired() { return false; }
                @Override public void refresh() { }
            }));
            if (resolver == Resolver.RECORDING) client.setEndpointResolver(option -> {
                resolverCalls.incrementAndGet();
                ResolvedEndpoint endpoint = new ResolvedEndpoint();
                endpoint.setEndpoint("unit.internal.example");
                return endpoint;
            });
            if (resolver == Resolver.FAILING) client.setEndpointResolver(option -> {
                resolverCalls.incrementAndGet();
                throw new AssertionError("endpoint resolver must not be called, service="
                        + option.getService() + " region=" + option.getRegion());
            });
            // SDK 未公开链注入入口，仅取现有链插入观测器，保留所有真实生产拦截器。
            Field field = ApiClient.class.getDeclaredField("interceptorChain");
            field.setAccessible(true);
            InterceptorChain chain = (InterceptorChain) field.get(client);
            chain.insertRequestInterceptor(new RequestInterceptor() {
                @Override public String name() { return "unit-test-before-sign"; }
                @Override public InterceptorContext intercept(InterceptorContext context) {
                    beforeSign.incrementAndGet();
                    return context;
                }
            }, BuildRequestInterceptor.name);
        }
        public InterceptorContext call(String service) throws ApiException {
            return client.buildCall("/DescribeInstances/2020-04-01/" + service + "/get/", "GET",
                    new ArrayList<>(), new ArrayList<>(), null, new HashMap<>(), new HashMap<>(),
                    new String[]{"volcengineSign"}, null);
        }
        public InterceptorContext call(String service, Map<String, String> headers) throws ApiException {
            return client.buildCall("/DescribeInstances/2020-04-01/" + service + "/get/", "GET",
                    new ArrayList<>(), new ArrayList<>(), null, headers, new HashMap<>(),
                    new String[]{"volcengineSign"}, null);
        }
        public void assertUntouched() {
            Assert.assertEquals(0, credentials.get());
            Assert.assertEquals(0, beforeSign.get());
            Assert.assertEquals(0, http.calls.get());
            Assert.assertEquals(0, http.responses.get());
            Assert.assertEquals(0, resolverCalls.get());
        }
        public void assertSigned(int expected) {
            Assert.assertEquals(expected, credentials.get());
            Assert.assertEquals(expected, beforeSign.get());
            Assert.assertEquals(expected, http.calls.get());
            Assert.assertEquals(expected, http.responses.get());
            Assert.assertNotNull(http.lastRequest.header("Authorization"));
            Assert.assertTrue(http.lastRequest.header("Authorization").startsWith("HMAC-SHA256"));
        }
        @Override public void close() throws Exception {
            http.getDispatcher().getExecutorService().shutdownNow();
            Assert.assertTrue(http.getDispatcher().getExecutorService().awaitTermination(5, TimeUnit.SECONDS));
            http.getConnectionPool().evictAll();
        }
    }

    public static final class ResultCallback implements ApiCallback<Map<String, Object>> {
        public final CountDownLatch done = new CountDownLatch(1);
        public final AtomicInteger successes = new AtomicInteger();
        public final AtomicInteger failures = new AtomicInteger();
        public volatile ApiException error;
        public volatile int status;
        public volatile Map<String, Object> result;
        @Override public void onFailure(ApiException e, int code, Map<String, List<String>> headers) {
            error = e; status = code; failures.incrementAndGet(); done.countDown();
        }
        @Override public void onSuccess(Map<String, Object> value, int code, Map<String, List<String>> headers) {
            result = value; status = code; successes.incrementAndGet(); done.countDown();
        }
        @Override public void onUploadProgress(long written, long length, boolean complete) { }
        @Override public void onDownloadProgress(long read, long length, boolean complete) { }
        public void await() throws InterruptedException { Assert.assertTrue(done.await(5, TimeUnit.SECONDS)); }
    }
}
