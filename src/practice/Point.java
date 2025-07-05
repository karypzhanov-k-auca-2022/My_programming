package practice;

public class Point {
    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    public static void main(String[] arg) {
        Point point1 = new Point(5, -5);
        Point point2 = point1;
        Point point3 = new Point(5, -5);
        Point point4 = new Point(5, 5);
        System.out.println(point1.equals(point2));
        System.out.println(point1.equals(point3));
        System.out.println(point1.equals(point4));

        // System.out.println(point1.hashCode());
        // System.out.println(point2.hashCode());
        // System.out.println(point3.hashCode());
        // System.out.println(point4.hashCode());
    }
}
