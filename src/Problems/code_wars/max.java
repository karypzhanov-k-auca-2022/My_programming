package Problems.code_wars;

public class max {
    public static int sequence(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int maxEndingHere = 0;
        int maxSoFar = 0;
        int negativeNums = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeNums++;
                if (negativeNums == arr.length) {
                    return 0;
                }
            }

            maxEndingHere = Math.max(0, maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}