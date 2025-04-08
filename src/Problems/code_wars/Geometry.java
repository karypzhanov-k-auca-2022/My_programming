package Problems.code_wars;

public class Geometry {
    public static class Point {
        public double x;
        public double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static class Triangle {
        public Point a;
        public Point b;
        public Point c;

        public Triangle(Point a, Point b, Point c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
