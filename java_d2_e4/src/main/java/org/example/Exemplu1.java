package org.example;

public class Exemplu1 {
    public static void main(String[] args) {
        // Runnable / Callable

        Runnable r = () -> System.out.println(":)");

        Thread t1 = new Thread(r);

        t1.start();

        System.out.println(":(");
    }
}