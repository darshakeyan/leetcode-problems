class Solution {
    public void moveZeroes(int[] nums) {
         int fast = 0;
        int slow = 0;
        int n = nums.length;
        while(fast < n){
            if(nums[fast] != 0){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        for(int i = slow; i<n; i++){
            nums[i] = 0;
        }
    }
}