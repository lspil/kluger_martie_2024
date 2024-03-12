package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Exemplu8 {
    public static void main(String[] args) {

        List<String> list = List.of(
                "aaa", "abc", "Abcd", "ABc", "qwerty"
        );

        String res =
            list.stream()
                    .filter(s -> s.length() % 2 == 0)
                    .sorted()
                    .collect(Collectors.joining("-"));

        System.out.println(res);
    }
}