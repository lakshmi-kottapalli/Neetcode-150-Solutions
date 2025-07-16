//Prefix arr contains product of values before i
//Suffix arr contains product of values after i

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
            prefix[0] = 1;
            suffix[nums.length - 1] = 1;
            for (int i = 1; i < nums.length; i++) {
                prefix[i] = nums[i - 1] * prefix[i - 1];
            }
            for ( int i = nums.length - 2; i >= 0; i--) {
                suffix[i] = nums[i + 1] * suffix[i + 1];
            }
            for ( int i = 0; i < nums.length; i++) {
                product[i] = prefix[i] * suffix[i];
            }
            return product;
    }
}  
