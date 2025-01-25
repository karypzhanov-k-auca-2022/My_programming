package shapes;

public class Square extends Shape {
    private double side;

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Side: " + side);
    }
}
