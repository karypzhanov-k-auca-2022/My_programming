package shapes;

public class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;

    public Triangle(String name, String color, double base, double height, double side1, double side2) {
        super(name, color);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return base + side1 + side2;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Side 1: " + side1);
        System.out.println("Side 2: " + side2);
    }

}
