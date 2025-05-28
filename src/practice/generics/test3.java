package practice.generics;

import java.util.ArrayList;
import java.util.List;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
}

public class test3 {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal("Lion"));
        listOfAnimals.add(new Animal("Tiger"));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog("Doggo1"));
        listOfDogs.add(new Dog("Doggo2"));

        test1(listOfAnimals);
        test1(listOfDogs);

    }

    private static void test1(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
