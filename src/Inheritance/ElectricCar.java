package Inheritance;

class Car {
    private String name;

    void setName(String name) {
        this.name = name;
    }

    static void show() {
        System.out.println("Helllloo");
    }
}

public class ElectricCar extends Car {


 

    public static void main(String[] args) {
        Car.show();

        ElectricCar.show();
    }
}
