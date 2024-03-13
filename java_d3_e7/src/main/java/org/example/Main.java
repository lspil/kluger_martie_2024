package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        var synchList = Collections.synchronizedList(list);


        Product p1 = new Product.Builder()
                .setName("Beer")
                .build();

        Product p2 = new Product.Builder()
                .setName("Beer")
                .setColor("gold")
                .build();



        Repo service = new QueryLoggerDecorator(new MySQLRepo());
        service.doSomething();
    }
}