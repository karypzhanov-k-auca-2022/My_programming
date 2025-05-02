package Problems.leetcode;

public class missingNumberr {
    public int missingNumber(int[] nums) {
        boolean[] seen = new boolean[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            seen[nums[i]] = true;
        }

        for (int i = 0; i < seen.length; i++) {
            if (!seen[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        missingNumberr test1 = new missingNumberr();
        int[] nums1 = { 3, 0, 1 };
        int[] nums2 = { 0, 1 };
        int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

        System.out.println(test1.missingNumber(nums1));
        System.out.println(test1.missingNumber(nums2));
        System.out.println(test1.missingNumber(nums3));

    }
}
