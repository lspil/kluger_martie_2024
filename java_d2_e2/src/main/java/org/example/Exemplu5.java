package org.example;

public class Exemplu5 {

    public static void main(String[] args) {

        int x = 10;

        int y = x > 10 ? 100 : 200;

        int z1 = switch (x) {
            case 100,200,500 -> someDescName();
            case 600 -> 20;
            default -> 30;
        };

        int z2 = switch (x) {
            case 100,200,500 -> 10;
            case 600 -> 20;
            default -> throw new RuntimeException();
        };

    }

    static int someDescName() {
        // do smth
        return  10;
    }
}
