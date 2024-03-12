package org.example;

public class Exemplu2 {

    public static void main(String[] args) {

        Thread t1 = new Thread(new OddNumbersRunnable());
        t1.start();

    }
}
