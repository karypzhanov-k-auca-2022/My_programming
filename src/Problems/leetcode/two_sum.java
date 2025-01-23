package Problems.leetcode;
import java.util.HashMap;
import java.util.Map;

public class two_sum {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2) {
            return null;
        }
        //  value -> index
        Map<Integer, Integer> idByValue = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int curr = target - nums[i];
            
            if(idByValue.get(curr) != null) { // take the value of the key
                return new int[] {i, idByValue.get(curr)};
            }

            idByValue.put(nums[i], i);
        }

        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        int [] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }
}
