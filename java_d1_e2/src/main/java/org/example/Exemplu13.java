package org.example;

import java.util.Comparator;
import java.util.List;

public class Exemplu13 {

    public static void main(String[] args) {
        // String -> Comparable
        List<String> list = List.of("BB", "AAA", "CCCC");

        Comparator<String> c = Comparator.reverseOrder();

        list.stream()
                .sorted(c)
                .forEach(System.out::println);

    }
}
