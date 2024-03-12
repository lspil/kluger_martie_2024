package org.example;

public class Exemplu7 {

    public static void main(String[] args) {

        int x = 10;

        int y = switch (x) {
            case 100,200,500: {

                yield 10;
            }

            case 600:
                yield 20;

            default:
                yield 30;
        };

    }
}
