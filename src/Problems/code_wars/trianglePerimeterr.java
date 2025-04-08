package Problems.code_wars;

public class trianglePerimeterr {
    public static double trianglePerimeter(final Geometry.Triangle t) {
        double ab = Math.sqrt(Math.pow(t.a.x - t.b.x, 2) + Math.pow(t.a.y - t.b.y, 2));
        double bc = Math.sqrt(Math.pow(t.b.x - t.c.x, 2) + Math.pow(t.b.y - t.c.y, 2));
        double ca = Math.sqrt(Math.pow(t.c.x - t.a.x, 2) + Math.pow(t.c.y - t.a.y, 2));
        return ab + bc + ca;
    }
}
