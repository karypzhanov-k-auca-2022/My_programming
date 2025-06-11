package Problems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class majorityElementt {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            numbers.put(nums[i], numbers.getOrDefault(nums[i], 0) + 1);
            if (numbers.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }

        return 0;
    }
}
