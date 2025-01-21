class Solution {
    public boolean increasingTriplet(int[] nums) {
        boolean checkTriplet = false;
        if (nums == null || nums.length < 3) {
            checkTriplet = false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <=a) {
                a = num;
            } else if (num <= b) {
                b = num;
            } else {
                checkTriplet = true;
            }
        }
        return checkTriplet;
    }
}