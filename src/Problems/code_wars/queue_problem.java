package Problems.code_wars;

import java.util.Arrays;
import java.util.PriorityQueue;

public class queue_problem {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        PriorityQueue<Integer> waiters = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            waiters.add(0);
        }

        for (int customer : customers) {
            int earliest = waiters.poll();
            earliest += customer;
            waiters.add(earliest);
        }

        int max = 0;
        for (int time : waiters) {
            if (max < time) {
                max = time;
            }
        }

        return max;
    }

    public static int solveSuperMarketQueue2(int[] customers, int n) {
        int[] result = new int[n];
        for (int i = 0; i < customers.length; i++) {
            result[0] += customers[i];
            Arrays.sort(result);
        }
        return result[n - 1];
    }
}