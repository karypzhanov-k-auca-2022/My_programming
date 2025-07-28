package practice.ThreadPoolPractice;

public class VegetableChopper implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is chopping vegetables.");
    }


}
