package practice.Threads_train;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Runnable producer  = new Producer(store);
        Runnable consumer  = new Consumer(store);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

    }
}
