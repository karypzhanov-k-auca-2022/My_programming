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

    // extra method to create a 2D array with random values
    public int[][] createArray(int n, int m, int minValue, int maxValue){
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (int) (Math.random() * (maxValue - minValue) + minValue);
            }
        }
        return array;
    }
}
