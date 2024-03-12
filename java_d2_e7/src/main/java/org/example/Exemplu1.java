package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplu1 {


    public static void main(String[] args) {
        // Runnable, Callable, Future

        // Executor, ExecutorService, ScheduledExecutorService

        // Executors.newSingleThreadExecutor()

        try (ExecutorService service = Executors.newFixedThreadPool(4)) {

            service.submit(() -> System.out.println(":) " + Thread.currentThread().getName()));
            service.submit(() -> System.out.println(":) " + Thread.currentThread().getName()));
            service.submit(() -> System.out.println(":) " + Thread.currentThread().getName()));
            service.submit(() -> System.out.println(":) " + Thread.currentThread().getName()));
            service.submit(() -> System.out.println(":) " + Thread.currentThread().getName()));

        }


    }
}