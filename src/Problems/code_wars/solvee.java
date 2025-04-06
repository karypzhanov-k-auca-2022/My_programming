package Problems.code_wars;

import java.util.Arrays;

public class solvee {
    public static int[] solve(int[] arr) {
        int[] res = new int[arr.length];
        Arrays.sort(arr);
        int leftI = 0;
        int rightI = arr.length - 1;

        int indexToWrite = 0;
        while (leftI <= rightI) {
            res[indexToWrite++] = arr[rightI--];
            
            if (leftI <= rightI) {
                res[indexToWrite++] = arr[leftI++];
            }
        }
        
        return res;
    }
}
