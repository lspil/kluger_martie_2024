package org.example;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();

        /*
        ForkJoinTask
            RecursiveTask<T> -->  Callable<T>
            RecursiveAction  -->  Runnable
         */

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        var result = pool.invoke(new SumRecursiveTask(list));

        System.out.println(result);
    }
}