import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //use hashmap to know frequency of each value
        //array will have each index(freq) have another array holding which
        //value corresponds to the frequency
       HashMap<Integer, Integer> count = new HashMap<>();//value, freq
       List<Integer>[] freq = new List[nums.length + 1];
            for (int i = 0; i < freq.length; i++) {
                freq[i] = new ArrayList<>();
            }
        for (int j = 0; j < nums.length; j++) {
            count.put(nums[j], count.getOrDefault(nums[j], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }
        //now make a list to return of top k frequent values
        int[] ret = new int[k];
        int index = 0;  //index < k
        //start at highest and decrease
            for (int i = freq.length - 1; i> 0 && index < k; i--) {
                for (int n : freq[i]) {
                    ret[index++] = n;
                    if (index == k) {
                        return ret;
                      }
            }
        }
        return ret;
    }
}
