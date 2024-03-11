package org.example;

import java.util.List;
import java.util.function.Predicate;

public class Exemplu5 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

//        Predicate<Integer> p = x -> x % 2 == 0;

        list.stream()
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println);

    }
}
