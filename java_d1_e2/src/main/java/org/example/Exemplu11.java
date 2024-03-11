package org.example;

import java.util.Optional;

public class Exemplu11 {

    public static void main(String[] args) {

        Optional<String> o = Optional.of("Hello");

        String str = o.orElse("World!");

        String str2 = o.isPresent() ? o.get() : "World!";

        String str3 = null;
        if (o.isPresent()) {
            str3 = o.get();
        } else {
            str3 = "World!";
        }

        System.out.println(str);

        Integer n =
                o.filter(x -> x.length() < 10)
                    .map(String::length)
                    .orElse(-1);

//        o.stream()
    }
}
