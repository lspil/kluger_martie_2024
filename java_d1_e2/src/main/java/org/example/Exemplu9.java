package org.example;

import java.util.List;

public class Exemplu9 {

    public static void main(String[] args) {
        List<String> list = List.of("ABC", "A", "AB");

        // Stream, IntStream, LongStream, DoubleStream
        // mapToInt(), mapToDouble(), mapToLong()
        // Optional, OptionalLong, OptionalInt, OptionalDouble

        int sum =
        list.stream()
            .mapToInt(String::length)
            .sum();

        System.out.println(sum);
    }
}
