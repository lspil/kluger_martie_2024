package org.example;

import java.util.List;

public class Exemplu4 {
    public static void main(String[] args) {

        List<Integer> list = List.of(2,4,7,8,9,6,3);

        int sum1 =
            list.stream()
                    .filter(x -> x % 2 == 1)
                    .limit(5)
                    .reduce(0, (x,y) -> x + y);

        int sum2 =
                list.stream()
                        .filter(x -> x % 2 == 1)
                        .limit(5)
                        .mapToInt(x -> x)
                        .sum();
    }
}