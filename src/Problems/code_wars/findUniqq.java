package Problems.code_wars;

import java.util.Arrays;
import java.util.Map;

public class findUniqq {
    public static double findUniq(double arr[]) {
        double res = 0;
        if (arr.length == 0) {
            return 0;
        }
        if (arr.length < 3) {
            return 0;
        }

        Map<Double, Integer> map = new java.util.HashMap<>();
        for (double num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                res = entry.getKey();
                break;
            }
        }
        return res;
    }

    // Alternative solution using sorting
    public static double findUniq2(double arr[]) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }

    public static void main(String[] args) {
        double[] arr = {1, 1, 2, 1, 1};
        System.out.println(findUniq(arr)); // Output: 2.0
    }
}
