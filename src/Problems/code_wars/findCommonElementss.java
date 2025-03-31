package Problems.code_wars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findCommonElementss {
    static List<Integer> findCommonElements(int[] arrA, int[] arrB, int[] rng, String wanted) {
        List<Integer> result = new ArrayList<>();
        boolean isEven = wanted.equals("even");

        Set<Integer> setA = new HashSet<>();
        for (int num : arrA) {
            setA.add(num);
        }

        Set<Integer> commonElements = new HashSet<>();
        for (int num : arrB) {
            if (setA.contains(num)) {
                commonElements.add(num);
            }
        }

        for (int num : commonElements) {
            if (num >= rng[0] && num <= rng[1]) {
                if (isEven && num % 2 == 0) {
                    result.add(num);
                } else if (!isEven && num % 2 != 0) {
                    result.add(num);
                }
            }
        }

        result.sort(null);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> result2 = new ArrayList<>(List.of(5, 3, 8, 1, 9, 2, 7));
        System.out.println("До сортировки: " + result2);

        result2.sort(null);
        System.out.println("После сортировки: " + result2);
    }
}
