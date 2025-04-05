package Problems.code_wars;

public class seriesSumm {
    public static String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }

        double res = 0;

        for (int i = 0; i < n; i++) {
            res += 1.0 / (1 + 3 * i); 
        }

        return String.format("%.2f", res);
    }


    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }
}
