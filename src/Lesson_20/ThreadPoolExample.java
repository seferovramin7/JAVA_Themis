package Lesson_20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 4; i++) {
            executor.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " is working");
            });
        }
        executor.shutdown();
    }
}

