package Problems.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Happyy {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int res = 0;

            while (n != 0) {
                int last = n % 10;
                res += last * last;
                n /= 10;
            }

            n = res;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Happyy happyy = new Happyy();
        int num = 19;
        int num2 = 2;

        System.out.println(happyy.isHappy(num));
        System.out.println(happyy.isHappy(num2));

    }
}
