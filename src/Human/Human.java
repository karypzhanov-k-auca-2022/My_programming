package Human;

class Human {
    String name;
    Car car;
    BankAccount account;
    int salary;

    void info() {
        System.out.println("Name: " + name + "\nCar: " + car.color + "\nAccount: " + account.balance + "\nSalary: " + salary);
    }

    void increaseSalary() {
        this.salary *= 2;
        salary = salary * 2;
    }

    static class HumanTest1 {
        public static void main(String[] args) {
            Human h1 = new Human();
            h1.name = "Sanya";
            h1.car = new Car("Yellow", "V8");
            h1.salary = 10000;
            h1.account = new BankAccount(222, 20000);
            h1.info();
            h1.increaseSalary();
            h1.info();

            Human h2 = new Human();
            h2.name = "Vanya";
            h2.car = new Car("Yellow", "V8");
            h2.salary = 22000;
            h2.account = new BankAccount(222, 20000);
            h2.info();
            h2.increaseSalary();
            h2.info();
        }
    }

}

class BankAccount {
    int id;
    int balance;

    BankAccount(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
}


