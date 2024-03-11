package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Exemplu16 {

    public static void main(String[] args) {

        List<String> list = List.of("ABGCD", "IJKLA", "EFQGH");

        list.stream() // "ABGCD", "IJKLA", "EFQGH"
                .flatMap(s -> Stream.of(s.split("")))
                .distinct()
                .sorted()
                .forEach(System.out::println);


        // A B C D E F G H I J K L Q
    }
}
