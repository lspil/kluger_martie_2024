package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Exemplu6 {
    public static void main(String[] args) {

        List<String> list = List.of(
                "aaa", "abc", "Abc", "ABc", "qwerty"
        );

        long c1 =
            list.stream()
                    .filter(x -> x.toLowerCase().equals(x))
                    .count();

        long c2 =
                list.stream()
                        .filter(x -> x.toLowerCase().equals(x))
                        .collect(Collectors.counting());
    }
}