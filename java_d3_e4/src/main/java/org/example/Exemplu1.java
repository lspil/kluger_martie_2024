package org.example;

import java.util.concurrent.Semaphore;

public class Exemplu1 {

    public static void main(String[] args) {

        Semaphore s = new Semaphore(10);

        try {
            s.acquire();
            // blocul sincronizat
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            s.release();
        }

    }

}