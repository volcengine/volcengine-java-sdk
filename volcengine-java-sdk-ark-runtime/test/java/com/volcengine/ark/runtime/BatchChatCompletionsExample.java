package com.volcengine.ark.runtime;

import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionRequest;
import com.volcengine.ark.runtime.model.completion.chat.ChatMessage;
import com.volcengine.ark.runtime.model.completion.chat.ChatMessageRole;
import com.volcengine.ark.runtime.service.ArkService;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BatchChatCompletionsExample {

    public static void main(String[] args) {
        // 为batch chat设置一个较大的超时时间，最小不小于10分钟
        Duration timeout = Duration.ofHours(1);
        int maxConcurrency = 5000;
        int taskNumPerWorker = 5;
        String apiKey = System.getenv("ARK_API_KEY");
        ConnectionPool connectionPool = new ConnectionPool(maxConcurrency, 10, TimeUnit.MINUTES);
        Dispatcher dispatcher = new Dispatcher();
        // 设置最大并发数
        dispatcher.setMaxRequests(maxConcurrency);
        dispatcher.setMaxRequestsPerHost(maxConcurrency);
        // 请单独为batch chat单独初始化一个service实例，且多个Endpoint间也不要复用同一个service实例，避免互相影响。单个service会根据最大并发数启动对应的线程池，会占用一定的资源
        ArkService service = ArkService.builder().dispatcher(dispatcher).timeout(timeout).connectionPool(connectionPool).apiKey(apiKey).build();

        ExecutorService executorService = Executors.newFixedThreadPool(maxConcurrency);
        CountDownLatch latch = new CountDownLatch(maxConcurrency);
        Runnable batchChatTask = () -> {
            System.out.println("Executing task in " + Thread.currentThread().getName());
            for(int i = 0; i < taskNumPerWorker; i++) {
                // 每个线程执行的任务逻辑
                try {
                    final List<ChatMessage> messages = new ArrayList<>();
                    final ChatMessage systemMessage = ChatMessage.builder().role(ChatMessageRole.SYSTEM).content("你是豆包，是由字节跳动开发的 AI 人工智能助手").build();
                    final ChatMessage userMessage = ChatMessage.builder().role(ChatMessageRole.USER).content("常见的十字花科植物有哪些？").build();
                    messages.add(systemMessage);
                    messages.add(userMessage);

                    ChatCompletionRequest batchChatCompletionRequest = ChatCompletionRequest.builder()
                            .model("${YOUR_ENDPOINT_ID}")
                            .messages(messages)
                            .build();

                    service.createBatchChatCompletion(batchChatCompletionRequest);
                    System.out.println(Thread.currentThread().getName() + ": request " + i + "succeed");
                } catch (Exception e) {
                    System.out.println(Thread.currentThread().getName() + ": request " + i + " failed "+ e.getMessage());
                }
            }
            System.out.println(Thread.currentThread().getName()+ " done");
            latch.countDown();
        };
        for (int i = 0; i < maxConcurrency; i++) {
            executorService.submit(batchChatTask);
        }
        try {
            latch.await();
        } catch (InterruptedException ignored) {}
        System.out.println("所有线程已退出");
        executorService.shutdown();
        System.out.println("线程池已退出");
        // shutdown service after all requests is finished
        service.shutdownExecutor();
    }

}
