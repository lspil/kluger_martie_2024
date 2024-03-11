package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu17 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "BB", "CCCC", "D");

        List<Integer> res =
            list.stream()
                    .map(String::length)
                    .collect(Collectors.toList());

        System.out.println(res);

    }
}
