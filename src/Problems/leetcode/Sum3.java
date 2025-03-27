package Problems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            findTripletsI(nums, i, result);
        }

        return result;
    }

    private void findTripletsI(int[] nums, int startIndex, List<List<Integer>> result) {
        int left = startIndex + 1;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[startIndex] + nums[left] + nums[right];

            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                result.add(Arrays.asList(nums[startIndex], nums[left], nums[right]));

                while (left < right && nums[left] == nums[left + 1]) {
                    left++;
                }

                while (left < right && nums[right] == nums[right - 1]) {
                    right--;
                }

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Sum3 sum = new Sum3();
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result;
        System.out.println(sum.threeSum(nums));
    }
}
