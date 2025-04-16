package Problems.leetcode;

import java.util.ArrayList;

public class removeElementt {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                list.add(nums[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}
