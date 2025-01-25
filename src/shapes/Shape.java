package shapes;

public class Shape {
    private String name;
    private String color;
    private static int count = 0;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
        count++;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0.0;
    }

    public double calculatePerimeter() {
        return 0.0;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    public static int getCount() {
        return count;
    }
}
