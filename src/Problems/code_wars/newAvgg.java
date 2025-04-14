package Problems.code_wars;

import java.util.Arrays;

public class newAvgg {
    public static long newAvg(double[] arr, double navg) {
    double sum = Arrays.stream(arr).sum();
    int n = arr.length;
    double requiredDonation = navg * (n + 1) - sum;
    if (requiredDonation <= 0) {
        throw new IllegalArgumentException("Expected New Average is too low");
    }
    return (long) Math.ceil(requiredDonation);
      }
}
