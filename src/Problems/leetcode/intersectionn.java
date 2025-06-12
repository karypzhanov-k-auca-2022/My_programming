package Problems.leetcode;

import java.util.HashSet;
import java.util.Set;

public class intersectionn {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        
        int[] result = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            result[index++] = num;
        }
        
        return result;
    }

    public static void main(String[] args) {
        intersectionn inter = new intersectionn();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = inter.intersection(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
