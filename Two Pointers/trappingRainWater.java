//Water at index i  = math.max(index of that left or right pointer, left or right max) - height[left or right]
//You are solving based on the minimum left or right and meeting in the middle
//Keep track of the leftmax and rightmax
class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftmax = height[left];
        int rightmax = height[right];
        int water = 0;
        while (left < right) {
            if (leftmax < rightmax) {
                left++;
                leftmax = Math.max(leftmax, height[left]);
                water += leftmax - height[left];
            } else {
                right--;
                rightmax = Math.max(rightmax, height[right]);
                water += rightmax - height[right];
            }
        }
        return water;
    }
}