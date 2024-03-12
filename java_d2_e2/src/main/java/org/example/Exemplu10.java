package org.example;

public class Exemplu10 {

    public static void main(String[] args) {
        // RAW, STR, FMT

        String name = "Tom";

        String sentence = STR."""
                My name is \{name}
        """;

        System.out.println(sentence);

        /*
         1. Custom templates
         2. Many more provided by JDK

         PreparedStatement
         JsonObject
         */
    }
}
