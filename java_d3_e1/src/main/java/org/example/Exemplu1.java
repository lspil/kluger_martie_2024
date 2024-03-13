package org.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exemplu1 {


    public static void main(String[] args) {

        try(ExecutorService service = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        )) {
            Runnable task = () -> System.out.println(":|");

            Future<?> future = service.submit(task);

            try {
                future.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                // Ce s-a intamplat?
            }
        }

    }


}