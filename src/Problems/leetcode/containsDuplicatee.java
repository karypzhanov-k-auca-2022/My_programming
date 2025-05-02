package Problems.leetcode;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicatee {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> uniqOne = new HashSet<>();

        int prev = 0;
        for (int i = 0; i < nums.length; i++) {
            uniqOne.add(nums[i]);

            if (uniqOne.size() == prev) {
                return true;
            }
            prev++; 
        }

        return false;

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 1 };
        int[] nums2 = { 1, 2, 3, 4 };
        int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        containsDuplicatee test1 = new containsDuplicatee();

        System.out.println(test1.containsDuplicate(nums1));
        System.out.println(test1.containsDuplicate(nums2));
        System.out.println(test1.containsDuplicate(nums3));

    }
}
