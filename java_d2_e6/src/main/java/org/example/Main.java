package org.example;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        // platform thread  -> wrapper peste un kernel thread

        // apps -> operatii blocante (natura externa) -> I/O call, DBA

        /*
        1. Deserializare param (in-memory)
        2. Query read (block)
        3. Update / Insert (block)
        4. Call REST (service) (block)
        5. Send email (block)
        6. Add message on Kafka queue (block)
        7. Serializare return (in-memory)

        700ms -> 650ms idle (kernel thread sa poata fi folosit de altcineva)
         */

        // virtual threads (fibers)

//        Runnable r = () -> System.out.println(":)");
//        Thread.ofPlatform().start(r);

        Runnable r = () -> System.out.println(":)");  // daemon
        Thread.ofVirtual().start(r);

        try {
            Thread.sleep(Duration.ofSeconds(3));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}