package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu18 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "BB", "CCCC", "D");

        ArrayList<Integer> res =
            list.stream()
                    .map(String::length)
                    .collect(Collectors.toCollection(ArrayList::new)); // () -> new ArrayList<>()

        // toList
        // toSet
        // toCollection

        System.out.println(res);

    }
}
