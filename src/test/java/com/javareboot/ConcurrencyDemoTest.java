package com.javareboot;

import org.junit.jupiter.api.Test;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;

class ConcurrencyDemoTest {
    @Test
    void futureReturnsExpectedValue() throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> 123);
        assertEquals(123, future.get());
        executor.shutdown();
    }
}

