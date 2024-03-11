package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exemplu4 {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        list.stream()
//                .forEach(x -> System.out.println(x));
                .forEach(System.out::println);

        Consumer<Integer> c1 = x -> System.out.println(x);
        Consumer<Integer> c2 = System.out::println;

        // S -> T


//        List<Number> list1 = new ArrayList<Number>();

//        List<? extends Number> list2 = new ArrayList<Integer>();
//        list2.add(10); //10.0  --> ClassCastException
//
//        List<? super Integer> list3 = new ArrayList<Number>();
//        list3.add(10);  // Object o = 10; Number n = 10;


    }


}
