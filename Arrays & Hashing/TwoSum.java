import java.util.HashMap;
import java.util.Map;
//Create a Integer Hashmap and check to see if the difference (target - nums[i]) exists in Hashmap
//First calculate difference, check if map contains, THEN put in hashmap
//Key is value, then index because we are comparing with key and obtain/return the index 


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference) == true) {
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{} ;
    }
}

