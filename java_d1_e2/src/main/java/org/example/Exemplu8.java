package org.example;

import java.util.List;

public class Exemplu8 {

    public static void main(String[] args) {
        List<String> list = List.of("ABC", "A", "AB");

        list.stream()
            .map(String::length) // x -> x.length()
            .forEach(System.out::println);

    }
}
