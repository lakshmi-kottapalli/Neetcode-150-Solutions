//Area = (shorter bar*distance in indices)
//Two pointer, shift the bar that is shorter
//Always calculate area, and replace max area with greater value
//Math.min & Math.max
class Solution {
    public int maxArea(int[] heights) {
        int a = 0;
        int b = heights.length - 1;
        int max = 0;
            while (a < b) {
                int area = Math.min(heights[a], heights[b])*(b - a);
                max = Math.max(area, max);
                if (heights[a] <= heights[b]) {
                    a++;
                } else {
                    b--;
                }
            }
        return max;
    }
}
