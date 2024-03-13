package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Exemplu2 {

    public static void main(String[] args) {

        final String inputFolder = "input";

        try (final ExecutorService service = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        )) {

            final List<Path> files = Files.list(Paths.get(inputFolder))
                    .collect(Collectors.toList());

            final List<Future> futures = new ArrayList<>();
            for (final var file : files) {
                final Future<Long> future = service.submit(new CountWordsTask(file));
                futures.add(future);
            }

            Long sum = 0L;

            for (final Future<Long> future : futures) {
                sum += future.get();
            }

            System.out.println(sum);
        } catch (IOException | InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}