package sample;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class RateLimiter {

    private final int maxRequests;
    private final long windowMillis;

    private final Map<String, RequestInfo> requests = new HashMap<>();

    public RateLimiter(int maxRequests, long windowMillis) {
        if (maxRequests <= 0 || windowMillis <= 0) {
            throw new IllegalArgumentException("Invalid configuration");
        }
        this.maxRequests = maxRequests;
        this.windowMillis = windowMillis;
    }

    public synchronized boolean allowRequest(String userId) {

        if (userId == null || userId.isBlank()) {
            throw new IllegalArgumentException("Invalid userId");
        }

        long now = Instant.now().toEpochMilli();

        RequestInfo info = requests.get(userId);

        if (info == null) {
            requests.put(userId, new RequestInfo(1, now));
            return true;
        }

        if (now - info.windowStart > windowMillis) {
            info.windowStart = now;
            info.count = 1;
            return true;
        }

        if (info.count >= maxRequests) {
            return false;
        }

        info.count++;
        return true;
    }

    public int getRequestCount(String userId) {
        RequestInfo info = requests.get(userId);
        return info == null ? 0 : info.count;
    }

    private static class RequestInfo {
        int count;
        long windowStart;

        RequestInfo(int count, long windowStart) {
            this.count = count;
            this.windowStart = windowStart;
        }
    }
}