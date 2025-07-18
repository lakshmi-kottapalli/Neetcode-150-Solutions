import java.util.HashSet;
//Add array into hashset
//If ( n - 1) isn't in hashset, it can be the start of the sequence
    //Use while loop to check every “start” to see if (n + 1) is in set, and increment counter & n 

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seq = new HashSet<>();
        int maxcounter = 0;
            for (int i = 0; i < nums.length; i++) {
                seq.add(nums[i]);
            }
        for (int i : seq) {
            int counter = 1;
            if (seq.contains(i - 1) == false) { //start
                int num = i;
                while (seq.contains(num + 1)) {
                    counter++;
                    num++;
                }
            }
             if (counter > maxcounter) {
                 maxcounter = counter;
              }
        }
        return maxcounter;
    }
}
