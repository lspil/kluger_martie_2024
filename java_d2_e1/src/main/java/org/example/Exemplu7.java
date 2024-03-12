package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu7 {
    public static void main(String[] args) {

        List<String> list = List.of(
                "aaa", "abc", "Abc", "ABc", "qwerty"
        );

        long c1 =
            list.stream()
                    .flatMap(s -> Arrays.stream(s.split("")))
                    .map(x -> x.toLowerCase())
                    .filter(s -> "aeiou".contains(s))
                    .count();
    }
}