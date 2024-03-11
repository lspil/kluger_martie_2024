package org.example;

public class Exemplu1 {
    public static void main(String[] args) {

        Func f1 = x -> 5;
        int r1 = f1.apply(10);
        System.out.println(r1);

        Func f2 = x -> 2 * x;
        int r2 = f2.apply(10);
        System.out.println(r2);


//        Func f2 = new Func() {
//            @Override
//            public int apply(int input) {
//                return 5;
//            }
//        };

    }
}