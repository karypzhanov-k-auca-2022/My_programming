package practice.trash;

import Human.Bicycle;
import Inheritance.Vehicle;

public class Demo extends Bicycle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Bicycle bicycle = new Bicycle();
        Demo demo = new Demo();

        System.out.println(demo.maxSpeed);
    }
}
