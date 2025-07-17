package practice.Threads_train;

public class Consumer implements Runnable{
    private Store store;

    public Consumer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            store.consume();
        }
    }
}
