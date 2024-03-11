package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Exemplu23 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "BB", "CCCC", "D", "A", "BCD", "BC");

        /*
        1 "D", "A"
        2 "BB", "BC
        3 "AAA", "BCD
        4 "CCCC"
         */

        // DOWNSTREAMING
        Map<Integer, Set<Integer>> res =
            list.stream()
                    .collect(
                            Collectors.groupingBy(x -> x.length(), 
                                    Collectors.mapping(x -> x.length(),
                                            Collectors.toSet())));


        System.out.println(res);

    }
}
