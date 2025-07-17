package practice.Threads_train;

public class Store {
    private boolean hasProduct = false;

    public synchronized void produce() {
        while (hasProduct) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }

        System.out.println("Товар создан");
        hasProduct = true;
        notify();
    }

    public synchronized void consume(){
        while(!hasProduct){
            try{
                wait();
            }catch (InterruptedException e){
                e.getMessage();
            }
        }
        
        System.out.println("Товар забрал");
        hasProduct = false;
        notify();
    }
}
