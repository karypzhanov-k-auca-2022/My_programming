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

    static void abcd(){
        count++;
    }


    

    public static void main(String[] args) {
        Human human1 = new practice().new Human("Alice", 30);
        human1.showInfo();
        Human human2 = new practice().new Human("Bob", 25);
        human2.showInfo();

        Human.showInfoo();
    }
}