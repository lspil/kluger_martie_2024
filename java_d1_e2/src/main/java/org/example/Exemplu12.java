package org.example;

import java.util.List;
import java.util.Optional;

public class Exemplu12 {

    public static void main(String[] args) {
        List<String> list = List.of("ABC", "A", "AB");

//        BinaryOperator<Integer> b = (x, y) -> x + y;

        Optional<Integer> sum =
            list.stream()
                .map(String::length)// 3 ,1 ,2
                .reduce((x, y) -> x + y);

        System.out.println(sum.orElse(0)); // 6
    }
}
