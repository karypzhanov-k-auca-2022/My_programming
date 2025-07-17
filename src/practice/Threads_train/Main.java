package practice.Threads_train;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Thread producerThread = new Thread();
        Thread consumerThread = new Thread();

        producerThread.start();
        consumerThread.start();

    }
}
