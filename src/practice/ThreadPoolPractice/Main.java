package practice.ThreadPoolPractice;

import java.util.concurrent.*;

class VegetableChopper implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is chopping vegetables.");
    }
}

class HowManyVegetables implements Callable {

    @Override
    public Integer call() throws Exception {
        System.out.println("Person 2 is counting vegetables...");
        int seconds = 5;
        Thread.sleep(5 * 1000); // Simulate time taken to count vegetables
        return 42; // Just a dummy value
    }

}

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // int processors = Runtime.getRuntime().availableProcessors();
        // System.out.println("Available processors: " + processors);
        // ExecutorService pool = Executors.newFixedThreadPool(processors);

        // for (int i = 0; i < 100; i++) {
        // VegetableChopper vegetableChopper = new VegetableChopper();
        // pool.submit(vegetableChopper);
        // }

        // pool.shutdown();

        System.out.println("Person 1 is chopping vegetables...");
        ExecutorService pool = Executors.newSingleThreadExecutor();
        pool.submit(new VegetableChopper());
        
        Future result = pool.submit(new HowManyVegetables());
        System.out.println("Person 1 is waiting for the vegetable count...");
        System.out.println("Vegetable count: " + result.get());
        pool.shutdown();
    }
}
