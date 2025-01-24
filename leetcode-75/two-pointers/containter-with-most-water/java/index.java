class Solution {
    public int maxArea(int[] height) {
        // Topic - Array, Two Pointer, Greedy
        int l = 0;
        int r = height.length - 1;
        int maxArea = 0;

        while (l < r) {
            int minHeight = height[l] < height[r] ? height[l] : height[r];
            int width = r - l;
            int area = width * minHeight;
            maxArea = Math.max(maxArea, area);
            while (height[l] <= minHeight && r > l) {
                l++;
            }
            while (height[r] <= minHeight && r > l) {
                r--;
            }
        }
        return maxArea;
    }
}