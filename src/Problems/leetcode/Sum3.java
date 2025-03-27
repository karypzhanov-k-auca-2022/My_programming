package Problems.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Sum3 {
       public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // TODO need to delete same numbers in list
        if (nums.length < 3) {
            return result;
        }

        for(int i = 0; i < nums.length; i++ ){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        result.add(list);
                    }
                }
            }
        }

        return result;
    }
}
