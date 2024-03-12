package org.example;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exemplu9 {

    public static void main(String[] args) {

        List<Product> list = List.of(
                new Product("Beer", 3),
                new Product("abcd", 5),
                new Product("Chocolate",  2),
                new Product("Candy", 3)
        );

        Map<Integer, List<Product>> res0 =
                list.stream()
                        .collect(Collectors.groupingBy(p -> p.getName().length()));

        Map<Integer, Double> res1 =
                list.stream()
                        .collect(Collectors.groupingBy(p -> p.getName().length(),
                                Collectors.averagingDouble(x -> x.getPrice())));

        Map<Integer, List<Double>> res2 =
                list.stream()
                        .collect(
                                Collectors.groupingBy(p -> p.getName().length(),
                                        Collectors.mapping(p -> p.getPrice(),
                                                Collectors.toList())));

        Map<Integer, Double> res3 =
                list.stream()
                        .collect(
                                Collectors.groupingBy(p -> p.getName().length(),
                                    Collectors.mapping(p -> p.getPrice(),
                                            Collectors.averagingDouble(x -> x))));

        // Collectors.averagingDouble(p -> p.getPrice())

        System.out.println(res0);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);


        List<Double> prices =
            list.stream()
                    .map(p -> p.getPrice())
                    .collect(Collectors.toList());


    }


}

class Product {

    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}