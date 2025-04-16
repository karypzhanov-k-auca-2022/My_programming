package Problems.leetcode;

import java.util.*;

public class removeDuplicatess {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int index = 0;

        for (int num : set) {
            nums[index++] = num;
        }

        return set.size();
    }
}
