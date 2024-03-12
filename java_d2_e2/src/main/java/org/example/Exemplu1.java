package org.example;

public class Exemplu1 {

    public static void main(String[] args) {
        var x = 10;

        // @Query, @DisplayName
        String txt1 = """
                SELECT p FROM Product p
                WHERE p.name LIKE :name
                ORDER BY p.price DESC
                """;

        String txt2 = """
                WHEN product price is discounted
                THEN expect...
                """;
    }
}