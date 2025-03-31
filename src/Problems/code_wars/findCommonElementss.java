package Problems.code_wars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class findCommonElementss {
    public static List<Integer> findCommonElements(int[] arrA, int[] arrB, int[] rng, String wanted) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> countA = new HashMap<>();
        Map<Integer, Integer> countB = new HashMap<>();
        Set<Integer> commonElements = new HashSet<>();

        boolean isEven = wanted.equalsIgnoreCase("even");

        for (int num : arrA) {
            countA.put(num, countA.getOrDefault(num, 0) + 1);
        }

        for (int num : arrB) {
            countB.put(num, countB.getOrDefault(num, 0) + 1);
        }

        for (int num : countA.keySet()) {
            if (countA.getOrDefault(num, 0) >= 2 && countB.getOrDefault(num, 0) >= 2) {
                commonElements.add(num);
            }
        }

        for (int num : commonElements) {
            if (num >= rng[0] && num <= rng[1]) {
                if ((isEven && num % 2 == 0) || (!isEven && num % 2 != 0)) {
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
