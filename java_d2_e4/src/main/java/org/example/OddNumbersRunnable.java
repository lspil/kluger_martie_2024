package org.example;

import java.time.Duration;

public class OddNumbersRunnable implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 1; i < 20; i += 2) {
                long t1 = System.currentTimeMillis();
                System.out.println(i);
                Thread.sleep(Duration.ofSeconds(1));
                long t2 = System.currentTimeMillis();
                System.out.println("Time taken: " + (t2 - t1));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
