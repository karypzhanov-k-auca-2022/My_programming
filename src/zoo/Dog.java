package zoo;
public class Dog extends Animal {
    public Dog(String name, int age, Color color) {
        super(name, age, color);
    }
    
    @Override
    public void voice() {
        System.out.println("Woof-woof");
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
    }
}
