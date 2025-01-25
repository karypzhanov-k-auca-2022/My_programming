package shapes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        Triangle triangle = new Triangle("Triangle", "Red", 5, 6, 7, 8);
        Triangle triangle2 = new Triangle("Triangle2", "Blue", 6, 7, 8, 9);
        Triangle triangle3 = new Triangle("Triangle3", "Green", 7, 8, 9, 10);
        Triangle triangle4 = new Triangle("Triangle4", "Yellow", 8, 9, 10, 11);
        Triangle triangle5 = new Triangle("Triangle5", "Orange", 9, 10, 11, 12);

        Circle circle = new Circle("Circle", "Red", 5);
        Circle circle2 = new Circle("Circle2", "Blue", 6);
        Circle circle3 = new Circle("Circle3", "Green", 7);
        Circle circle4 = new Circle("Circle4", "Yellow", 8);
        Circle circle5 = new Circle("Circle5", "Orange", 9);

        Square square = new Square("Square", "Red", 5);
        Square square2 = new Square("Square2", "Blue", 6);
        Square square3 = new Square("Square3", "Green", 7);
        Square square4 = new Square("Square4", "Yellow", 8);
        Square square5 = new Square("Square5", "Orange", 9);

        shapes.add(triangle);
        shapes.add(triangle2);
        shapes.add(triangle3);
        shapes.add(triangle4);
        shapes.add(triangle5);

        shapes.add(circle);
        shapes.add(circle2);
        shapes.add(circle3);
        shapes.add(circle4);
        shapes.add(circle5);

        shapes.add(square);
        shapes.add(square2);
        shapes.add(square3);
        shapes.add(square4);
        shapes.add(square5);

        for (Shape shape : shapes) {
            shape.calculateArea();
            shape.calculatePerimeter();
            shape.printInfo();
            System.out.println("--------------------");
        }

        System.out.println("Total number of shapes: " + Shape.getCount());
    }
}
