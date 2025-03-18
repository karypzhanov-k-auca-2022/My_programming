public class practice {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = car1;

        System.out.println(car1.color);
        System.out.println(car1.maxSpeed);
        System.out.println("-----------------");
        System.out.println(car2.color);
        System.out.println(car2.maxSpeed);
    }

    static class Car {
        String color = "red";
        int maxSpeed = 100;
    }
}