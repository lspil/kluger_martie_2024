package org.example;

import java.util.List;

public class Exemplu15 {

    public static void main(String[] args) {
        // String -> Comparable
        List<List<Integer>> list =
                List.of(
                        List.of(1,2,3,4),
                        List.of(5,6,7,8),
                        List.of(7,8,9,0)
                );

        // map(x -> y)
        // flatMap(x -> stream(x))

        list.stream() // [1,2,3,4] [5,6...] [] []
                .flatMap(x -> x.stream()) // 1,2,3,4,5
                .forEach(System.out::println);
    }
}
