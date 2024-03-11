package org.example;

import java.util.List;

public class Exemplu7 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        list.stream()
            .map(x -> x * 2)
            .forEach(System.out::println);

    }
}
