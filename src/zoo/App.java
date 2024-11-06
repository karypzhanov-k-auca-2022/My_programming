package zoo;
import java.util.ArrayList; // Import ArrayList class

public class App {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>(); // Create a modifiable list

        Animal cat = new Cat("Murka", 3, Color.BLACK);
        Animal cat2 = new Cat("Barsik", 1, Color.GREY);
        Animal dog = new Dog("Tuzik", 5, Color.WHITE);
        Animal dog2 = new Dog("Sharik", 2, Color.BROWN);

        animals.add(cat);
        animals.add(cat2);
        animals.add(dog);
        animals.add(dog2);

        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).voice();
            animals.get(i).printInfo();
        }
    }
}