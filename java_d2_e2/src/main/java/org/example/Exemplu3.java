package org.example;

public class Exemplu3 {

    public static void main(String[] args) {

        int x = 10;

        switch (x) { // int, char, String (Java 7), enum
            case 100,200,500:
                System.out.println(":)");
                break;

            case 600:
                System.out.println(":(");
                break;

            default:
                System.out.println(":|");
        }

    }
}
