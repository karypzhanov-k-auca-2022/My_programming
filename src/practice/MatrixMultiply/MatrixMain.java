package practice.MatrixMultiply;

public class MatrixMain {
    public static void main(String[] args) {
        try {
            MatrixCreator creator = new MatrixCreator();
            Matrix p = new Matrix(2, 3);
            creator.fillRandomized(p, 2, 8);
            System.out.println("Matrix first is: " + p);
            Matrix q = new Matrix(3, 4);
            creator.fillRandomized(q, 2, 7);
            System.out.println("Matrix second is: " + q);
            Multiplicator multiplicator = new Multiplicator();
            Matrix result = multiplicator.multiply(p, q);
            System.out.println("Matrices product is " + result);
        } catch (MatrixException e) {
            System.err.println("Error of creating matrix " + e);
        }
    }
}
