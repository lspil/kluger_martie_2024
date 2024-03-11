package org.example;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Exemplu6 {

    public static void main(String[] args) {

        Random r = new Random();
        Stream.generate(() -> r.nextInt(1000))
                .limit(10)
                .forEach(System.out::println);

    }
}
