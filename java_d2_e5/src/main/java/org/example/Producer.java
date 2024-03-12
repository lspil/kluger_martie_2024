package org.example;

import java.util.Random;

public class Producer extends Thread {

    public Producer(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random r = new Random();

        try {
            while (true) {
                synchronized (Main.container) {
                    if (Main.container.size() < 100) {
                        int x = r.nextInt();
                        Main.container.add(x);
                        System.out.println("Producer " + getName() + " added value " + x);
                        Main.container.notifyAll();
                    } else {
                        Main.container.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    synchronized void m1() { // this
//
//    }
//
//    synchronized static void m2() { // Producer.class
//
//    }
}
