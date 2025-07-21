//Arrays.sort()
//Each index is a, use two pointers for b and c
//If i > 0  and nums[i] is = to precious value then skip by using continue
//Make sure to skip over b and c when found a solution 
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> threesum = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int a = i;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int b = i + 1;
            int c = nums.length - 1;
            while (b < c) {
                if (nums[a] + nums[b] + nums[c] < 0) {
                    b++;
                } else if (nums[a] + nums[b] + nums[c] > 0) {
                    c--;
                } else if (nums[a] + nums[b] + nums[c] == 0) {
                    threesum.add(Arrays.asList(nums[a], nums[b], nums[c]));
                    if (nums[b] == nums[b + 1]) {
                        b++;
                    }
                    if (nums[c] == nums[c - 1]) {
                        c--;
                    }
                    b++;
                    c--;
                }
            }  
        }
        return threesum;
    }
}
