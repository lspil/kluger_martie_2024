package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu20 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "BB", "CCCC", "D", "A", "BCD", "BC");

        /*
        1 "D", "A"
        2 "BB", "BC
        3 "AAA", "BCD
        4 "CCCC"
         */

        Map<Integer, List<String>> res =
            list.stream()
                    .collect(Collectors.groupingBy(x -> x.length()));


        System.out.println(res);

    }
}
