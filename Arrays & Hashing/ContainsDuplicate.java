import java.util.HashMap;
//Add values in hashmap and check if current index’s value is seen already in hashmap

class Solution {
    public boolean hasDuplicate(int[] nums) {  
        HashMap<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(nums[i]) == true) {
            return true;
        }
        map.put(nums[i], i);
       }
       return false;
    }
}
