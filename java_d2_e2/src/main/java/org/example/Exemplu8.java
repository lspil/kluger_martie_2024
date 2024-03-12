package org.example;

public class Exemplu8 {

    public static void main(String[] args) {

        Object o = new Product("Beer", 10);

        switch (o) {
            case Product(var name, _) ->
                System.out.println(":) " + name);

            case String s when s.equals("Beer") ->
                    System.out.println(":| " + s);

            case String s ->
                    System.out.println(":| " + s);

            default -> System.out.println(":(");
        }

    }
}

