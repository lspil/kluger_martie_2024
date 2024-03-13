package org.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class CountWordsTask implements Callable<Long> {

    private final Path inputFile;

    public CountWordsTask(Path inputFile) {
        this.inputFile = inputFile;
    }

    @Override
    public Long call() throws Exception {
        return Files.readAllLines(inputFile)
                .stream()
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .count();
    }
}
