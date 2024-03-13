package org.example;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable r = () -> System.out.println(":)");

//        service.schedule(r, 5, TimeUnit.SECONDS);
//        service.scheduleAtFixedRate(r, 0, 5, TimeUnit.SECONDS);
//        service.scheduleWithFixedDelay(r, 0, 5, TimeUnit.SECONDS);

        try {
            Thread.sleep(Duration.ofSeconds(20));
            service.shutdown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}