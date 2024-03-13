package org.example;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8);

        long t1 = System.currentTimeMillis();
        long sum = list.stream()
                .map(i -> doSmthThatTakesTime(i))
                .reduce(0, (x,y) -> x + y);
        long t2 = System.currentTimeMillis();

        System.out.println("Total time: " + (t2 - t1) + " Sum: " + sum);
    }

    static Integer doSmthThatTakesTime(Integer x) {
        try {
            Thread.sleep(Duration.ofSeconds(1));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return 2 * x;
    }
}