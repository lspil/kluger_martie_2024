package org.example;

import java.util.Comparator;
import java.util.List;

public class Exemplu14 {

    public static void main(String[] args) {
        // String -> Comparable
        List<String> list = List.of("BB", "AAA", "CCCC", "AAA");

        list.stream()
                .distinct()
                .forEach(System.out::println);

    }
}
