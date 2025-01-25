package Lesson_20;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            Thread.sleep(500); // Simulate a long task
            return 42;
        };

        Future<Integer> future = executor.submit(task);
        System.out.println("Result: " + future.get());
        executor.shutdown();
    }
}

