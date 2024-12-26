package com.volcengine.ark.runtime.model.content.generation;

public class TaskStatus {

    public static final String QUEUED = "queued";
    public static final String RUNNING = "running";
    public static final String SUCCEEDED = "succeeded";
    public static final String FAILED = "failed";
    public static final String CANCELLED = "cancelled";

    private TaskStatus() {
    }
}