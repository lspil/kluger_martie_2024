package org.example;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class Exemplu24 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "BB", "CCCC", "D", "A", "BCD", "BC");

        /*
        1 "D", "A"
        2 "BB", "BC
        3 "AAA", "BCD
        4 "CCCC"
         */

        // DOWNSTREAMING
        Map<Boolean, Long> res =
            list.stream()
                    .collect(
                            Collectors.partitioningBy(x -> x.length() % 2 == 0,
                                    Collectors.counting()));


        System.out.println(res);
    }
}
