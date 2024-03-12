package org.example;

import java.util.concurrent.*;

public class Exemplu2 {

    public static void main(String[] args) {

        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            // Runnable -> Cand nu asteptam o valoare raspuns la finalizarea threadului
            // Callable -> Cand asteptam o valoare in urma executei threadului
            // Future -> finished / not ready / exception

            Callable<Integer> task = () -> 10;

            Future<Integer> f = service.submit(task);

            // ...

            try {
                Integer res = f.get();
                System.out.println(res);
            } catch (InterruptedException e) {

            } catch (ExecutionException e) {
                // pizza s-a ars!
            }
        }

    }
}
