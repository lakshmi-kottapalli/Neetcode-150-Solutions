import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//Again count frequency of the strings letters
//Turn that frequency array into a string
//If key isnt present in map already, then add it
//Add the actual string (word) into the corresponding key

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
            for (int i = 0; i < strs.length; i++) {
                int[] num = new int[26];
                for (int j = 0; j < strs[i].length(); j++) {
                    num[strs[i].charAt(j) - 'a']++;
                }
                String key = Arrays.toString(num);
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(strs[i]);
            }
        return new ArrayList<>(map.values());
    }
}