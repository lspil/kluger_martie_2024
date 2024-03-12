package org.example;

public class Exemplu4 {

    public static void main(String[] args) {

        int x = 10;

        switch (x) {
            case 100,200,500 -> System.out.println(":)");
            case 600 -> System.out.println(":(");
            default -> System.out.println(":|");
        }

    }
}
