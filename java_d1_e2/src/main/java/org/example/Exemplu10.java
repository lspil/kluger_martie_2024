package org.example;

import java.util.List;
import java.util.function.BinaryOperator;

public class Exemplu10 {

    public static void main(String[] args) {
        List<String> list = List.of("ABC", "A", "AB");

//        BinaryOperator<Integer> b = (x, y) -> x + y;

        int sum =
        list.stream()
            .map(String::length)// 3 ,1 ,2
            .reduce(0, (x, y) -> x + y);

        System.out.println(sum); // 6
    }
}
