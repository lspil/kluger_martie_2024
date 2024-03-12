package org.example;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Exemplu5 {
    public static void main(String[] args) {

        List<Integer> list = List.of(2,4,7,8,9,6,3);

        OptionalDouble res1 =
            list.stream()
                    .filter(x -> x > 10)
                    .filter(x -> x < 100)
                    .mapToInt(x -> x)
                    .average();

        Double res2 =
            list.stream()
                    .filter(x -> x > 10)
                    .filter(x -> x < 100)
                    .collect(Collectors.averagingInt(x -> x));
    }
}