package com.javareboot.concurrency;

import java.util.concurrent.*;

// Concurrency is the ability of a program to execute multiple tasks simultaneously or in overlapping time periods.
// In Java, concurrency is achieved using threads, which are lightweight units of execution managed by the JVM.
// Proper concurrency enables better resource utilization and responsiveness, but requires careful management to avoid issues like race conditions and deadlocks.
//
// Theory:
// - Thread: The smallest unit of execution. Each thread has its own call stack.
// - ExecutorService: Manages a pool of threads, allowing you to submit tasks for execution without managing threads directly.
// - Future: Represents the result of an asynchronous computation. You can check if it's done, wait for it, or cancel it.
// - CompletableFuture: A modern API for asynchronous programming, supporting chaining and combining tasks.
//
// Why use concurrency?
// - To perform multiple operations at once (e.g., handling many client requests, background processing).
// - To keep applications responsive (e.g., UI remains active while loading data).
// - To utilize multi-core processors efficiently.
//
// Implementation details:
// - Thread creation can be manual (new Thread) or managed (ExecutorService).
// - Always shut down ExecutorService to avoid resource leaks.
// - CompletableFuture enables non-blocking, event-driven programming.
public class ConcurrencyDemo {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("== Concurrency Demo ==");

        // Thread: the basic unit of concurrent execution in Java.
        // Here, we create and start a thread using a lambda expression (Runnable).
        Thread thread = new Thread(() -> System.out.println("Hello from a thread!"));
        thread.start();

        // ExecutorService: a higher-level API for managing thread pools.
        // Executors help manage multiple threads efficiently, abstracting away manual thread creation.
        ExecutorService executor = Executors.newSingleThreadExecutor();
        // Future: represents the result of an asynchronous computation.
        // submit() schedules a task and returns a Future to retrieve the result later.
        Future<Integer> future = executor.submit(() -> 42);
        try {
            // get() blocks until the computation is complete and returns the result.
            System.out.println("Future result: " + future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Always shut down executors to release resources and avoid memory leaks.
        executor.shutdown();

        // CompletableFuture: a modern API for asynchronous programming.
        // supplyAsync() runs a task asynchronously, thenAccept() processes the result.
        // join() waits for the completion of the asynchronous computation.
        CompletableFuture.supplyAsync(() -> "Async result")
                .thenAccept(System.out::println)
                .join(); // Waits for completion
    }
}
