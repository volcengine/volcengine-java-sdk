package com.volcengine.ark.runtime.utils;

import java.time.Duration;
import java.time.LocalDateTime;

public class ModelBreaker {
    private LocalDateTime allowTime;

    public ModelBreaker() {
        this.allowTime = LocalDateTime.now();
    }

    public boolean Allow() {
        return LocalDateTime.now().isAfter(allowTime);
    }

    public void Reset(Duration duration) {
        this.allowTime = LocalDateTime.now().plusSeconds(duration.getSeconds());
    }

    public Duration GetAllowedDuration() {
        Duration allowDuration = Duration.between(LocalDateTime.now(), this.allowTime);
        if (allowDuration.isNegative()) {
            return Duration.ZERO;
        }
        return allowDuration;
    }
}
