class Solution {
    public int maxOperations(int[] nums, int k) {
        int l;
        int r;
        int maxOperation = 0;
        Arrays.sort(nums);
        for (l = 0, r = nums.length - 1; l < r;) {
            if (nums[l] + nums[r] == k) {
                maxOperation++;
                l++;
                r--;
            } else if (nums[l] + nums[r] < k) {
                l++;
            } else {
                r--;
            }
        }
        return maxOperation;
    }
}