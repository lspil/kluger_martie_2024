package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu19 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "BB", "CCCC", "D");

        Map<String, Integer> res =
            list.stream()
                    .collect(Collectors.toMap(x -> x, String::length));  // x -> x.length()


        System.out.println(res);

    }
}
