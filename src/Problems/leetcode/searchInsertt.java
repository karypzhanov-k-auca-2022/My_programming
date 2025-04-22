package Problems.leetcode;

public class searchInsertt {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        searchInsertt s = new searchInsertt();
        int[] nums = { 1, 3, 5, 6, 55, 67, 100 };
        int target = 5;
        System.out.println(s.searchInsert(nums, target)); // Output: 2

        target = 2;
        System.out.println(s.searchInsert(nums, target)); // Output: 1

        target = 7;
        System.out.println(s.searchInsert(nums, target)); // Output: 4

        target = 0;
        System.out.println(s.searchInsert(nums, target)); // Output: 0
    }
}
