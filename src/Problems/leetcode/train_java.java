package Problems.leetcode;
import java.util.HashMap;
import java.util.Map;

public class train_java {
    public static void main(String[] args) {
        // Map<Integer, Integer> idByValue = new HashMap<>();
        // .keySet() - return a set view of the keys contained in this map
        // .values() - return a collection view of the values contained in this map

        // .get() -return the value to which the specified key is mapped
        // .contains() - return true if this map contains a mapping for the specified value
        // .entrySet() - return a set view of the mappings contained in this map

        Map<Integer, Integer> idByValue = new HashMap<>();
        idByValue.put(999, 1);
        idByValue.put(1, 2);
        idByValue.put(5, 50);

        // System.out.println(idByValue.get(999));

        if((idByValue.get(999)) != null) { // если конец ключа НЕ равно пустоте то вернет true 
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        if((idByValue.get(999)) != null) { // если конец ключа НЕ равно пустоте то вернет true 
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        // if(idByValue.values().contains(50)) {
        //     System.out.println("Found");
        // } else {
        //     System.out.println("Not found");
        // }

        // if(idByValue.values().contains(500)) {
        //     System.out.println("Found");
        // } else {
        //     System.out.println("Not found");
        // }

        // for(Integer key : idByValue.keySet()) {
        //     System.out.println("Key: " + key);
        // }

        // for(Integer value: idByValue.values()) {
        //     System.out.println("Value: " + value);
        // }

        // // output onlu keys
        // for(Map.Entry<Integer, Integer> entry : idByValue.entrySet()) {
        //     System.out.println("Key: " + entry.getKey());
        // }

        // // output only values
        // for(Map.Entry<Integer, Integer> entry : idByValue.entrySet()) {
        //     System.out.println("Value: " + entry.getValue());
        // }

        // System.out.println(idByValue.values());
        // System.out.println(idByValue.keySet());

        int [] numsss = {2,4,6};
        int target = 8;

        int [] result = twoSum(numsss, target);

        System.out.printf("index: %d, index: %d", result[0], result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
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
}
