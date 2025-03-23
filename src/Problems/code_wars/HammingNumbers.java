package Problems.code_wars;

import java.util.HashSet;
import java.util.PriorityQueue;

public class HammingNumbers {
    public static long hamming(int n) {
        PriorityQueue<Long> results = new PriorityQueue<>();
        HashSet<Long> seen = new HashSet<>();

        results.add(1L);
        seen.add(1L);

        long current = 1;

        for (int i = 0; i < n; i++) {
            current = results.poll();

            long current2 = current * 2;
            long current3 = current * 3;
            long current5 = current * 5;

            if (seen.add(current2)) {
                results.add(current2);
            }
            if (seen.add(current3)) {
                results.add(current3);
            }

            if (seen.add(current5)) {
                results.add(current5);
            }
        }
        return (int) current;
    }

}
