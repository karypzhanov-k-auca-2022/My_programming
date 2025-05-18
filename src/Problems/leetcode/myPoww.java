package Problems.leetcode;

public class myPoww {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;

        if (n > 0) {
            return ppow(x, n);
        } else {
            return 1 / ppow(x, -n);
        }
    }

    private double ppow(double x, int n) {
        if (n == 0)
            return 1;

        if (n % 2 == 0) {
            double half = ppow(x, n / 2);
            return half * half;
        } else {
            return x * ppow(x, n - 1);
        }
    }
}
