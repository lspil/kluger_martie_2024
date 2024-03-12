package org.example;

import java.util.List;

public class Exemplu3 {
    public static void main(String[] args) {

        List<Integer> list = List.of(2,4,7,8,9,6,3);

        list.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

    }
}