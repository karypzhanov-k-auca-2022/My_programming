package practice.MatrixMultiply;

public class MatrixCreator {
    public void fillRandomized(Matrix matrix, int minValue, int maxValue) {
        int v = matrix.getVerticalSize();
        int h = matrix.getHorizontalSize();

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                try {
                    int value = (int) (Math.random() * (maxValue - minValue) + minValue);
                    matrix.setElement(i, j, value);
                } catch (MatrixException e) {
                    System.out.println("Error in fillRandomized: " + e.getMessage());
                }
            }
        }
    }
}
