package zoo;
public class Cat extends Animal {
    public Cat(String name, int age, Color color) {
        super(name, age, color);
    }
    
    @Override
    public void voice() {
        System.out.println("Meow-meow");
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
    }
}
    
