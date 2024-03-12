package org.example;

public class Exemplu2 {

    public static void main(String[] args) {

        Product p1 = new Product("Beer", 3);
        String name = p1.name();

        // SELECT NEW Product(p.name, p.price) FROM Product p ...
    }

    void doSmth(final Product p) {
        final int x = 10;
        final var y = 10;

    }
}


