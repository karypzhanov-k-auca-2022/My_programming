package Problems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class singleNumberr {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int num : nums) {
            numbers.put(num, numbers.getOrDefault(num, 0) + 1);
        }

        for(int num : nums){
            if(numbers.get(num) ==1){
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        singleNumberr test1 = new singleNumberr();

        int[] nums2 = { 4, 1, 2, 1, 2 };

        System.out.println(test1.singleNumber(nums2));

    }
}
