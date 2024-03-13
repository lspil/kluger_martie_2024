package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Exemplu1 {

    public static void main(String[] args) {

        final String inputFolder = "input";

        try (final ExecutorService service = Executors.newVirtualThreadPerTaskExecutor()) {

            final List<Future<Long>> results =
                Files.list(Paths.get(inputFolder))
                        .map(p -> service.submit(new CountWordsTask(p)))
                        .collect(Collectors.toList());

            final var sum =
                results.stream()
                        .mapToLong(f -> getResultValue(f))
                        .sum();

            System.out.println(sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Long getResultValue(Future<Long> future) {
        try {
            return future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}