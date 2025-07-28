package practice.ThreadPoolPractice;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("Available processors: " + processors);
        ExecutorService pool = Executors.newFixedThreadPool(processors);

        for (int i = 0; i < 100; i++) {
            VegetableChopper vegetableChopper = new VegetableChopper();
            pool.submit(vegetableChopper);
        }

        pool.shutdown();
    }
}
