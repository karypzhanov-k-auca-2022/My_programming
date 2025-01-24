package Problems.code_wars;

class square_sum {

    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i] * n[i];
        }
        return sum;
    }
}