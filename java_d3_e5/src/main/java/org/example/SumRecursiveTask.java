package org.example;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SumRecursiveTask extends RecursiveTask<Integer> {

    private final List<Integer> input;

    public SumRecursiveTask(List<Integer> input) {
        this.input = input;
    }

    @Override
    protected Integer compute() {
        if (input.size() < 3) {
            return input.stream().reduce(0, (x,y) -> x + y);
        }

        final int mid = input.size() / 2;
        final List<Integer> list1 = input.subList(0, mid);
        final List<Integer> list2 = input.subList(mid, input.size());

        final SumRecursiveTask task1 = new SumRecursiveTask(list1);
        final SumRecursiveTask task2 = new SumRecursiveTask(list2);

        task2.fork();

        return task1.compute() + task2.join(); // task2.join() + task1.compute()
    }
}
