package zoo;
public class Animal {
    private String name;
    private int age;
    private Color color;

    public Animal(String name, int age, Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voice() {
        System.out.println("I am an animal");
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Color: " + color);
    }
}