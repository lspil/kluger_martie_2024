package org.example;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Exemplu2 {

    public static void main(String[] args) {

        CyclicBarrier barrier = new CyclicBarrier(5);

        try {
            barrier.await();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
