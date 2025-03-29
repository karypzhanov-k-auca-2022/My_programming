import java.util.ArrayList;
import java.util.List;

public class practice {
    class Human {
        String name;
        int age;
        static int count = 0;

        public Human(String name, int age) {
            count++;
            this.name = name;
            this.age = age;
        }

        public void showInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        public static void showInfoo() {
            System.out.println("Total number of humans: " + count);
        }

        void abc() {
            age++;
            count++;
        }

        static void abcd() {
            count++;
        }

    }

    public static void main(String[] args) {
    }
}