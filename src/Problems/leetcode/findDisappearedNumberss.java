package Problems.leetcode;

import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumberss {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();

        int[] seen = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            seen[nums[i]] = nums[i];
        }

        for (int i = 1; i < seen.length; i++) {
            if (seen[i] == 0) {
                res.add(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        findDisappearedNumberss test1 = new findDisappearedNumberss();

        int[] nums1 = { 4, 3, 2, 7, 8, 2, 3, 1 };
        int[] nums2 = { 1, 1 };

        System.out.println(test1.findDisappearedNumbers(nums1));
        System.out.println(test1.findDisappearedNumbers(nums2));

    }
}
