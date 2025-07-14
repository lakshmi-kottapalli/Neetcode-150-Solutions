//Create a Integer Hashmap and check to see if the difference (target - nums[i[) exists in Hashmap
//First calculate difference, check if map contains, THEN put in hashmap
//Key is value, then index because we are comparing with key and obtain/return the index 

class Solution {
    public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) {
        return false;
       }
       int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
            num[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
