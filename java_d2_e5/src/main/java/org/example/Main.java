package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    - race condition
    - deadlock
    - livelock
    - starvation
     */

    public static final List<Integer> container = new ArrayList<>(); // race condition

    public static void main(String[] args) {

        new Producer("_P1").start();
        new Producer("_P2").start();
        new Consumer("_C1").start();
        new Consumer("_C2").start();

    }

}