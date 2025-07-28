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
        Thread.sleep(seconds * 1000); // Simulate time taken to count vegetables
        return 42; // Just a dummy value
    }
}

class RecursiveSum extends RecursiveTask<Long> {
    private long lo, hi;

    public RecursiveSum(long lo, long hi) {
        this.lo = lo;
        this.hi = hi;
    }

    @Override
    protected Long compute() {
        if (hi - lo <= 100_000) { // base case
            long total = 0;
            for (long i = lo; i <= hi; i++) {
                total += i;
            }
            return total;
        } else {
            long mid = lo + (hi - lo) / 2;
            RecursiveSum left = new RecursiveSum(lo, mid);
            RecursiveSum right = new RecursiveSum(mid + 1, hi);

            left.fork();
            long rightRes = right.compute();
            long leftRes = left.compute();

            return leftRes + rightRes;
        }

    }

}

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 1
        // int processors = Runtime.getRuntime().availableProcessors();
        // System.out.println("Available processors: " + processors);
        // ExecutorService pool = Executors.newFixedThreadPool(processors);

        // for (int i = 0; i < 100; i++) {
        // VegetableChopper vegetableChopper = new VegetableChopper();
        // pool.submit(vegetableChopper);
        // }

        // pool.shutdown();

        // 2
        // System.out.println("Person 1 is chopping vegetables...");
        // ExecutorService pool = Executors.newSingleThreadExecutor();
        // pool.submit(new VegetableChopper());

        // Future result = pool.submit(new HowManyVegetables());
        // System.out.println("Person 1 is waiting for the vegetable count...");
        // System.out.println("Vegetable count: " + result.get());
        // pool.shutdown();

        // 3
        ForkJoinPool pool = ForkJoinPool.commonPool();
        pool.invoke(new RecursiveSum(0, 1_000_000_00));
    }
}
