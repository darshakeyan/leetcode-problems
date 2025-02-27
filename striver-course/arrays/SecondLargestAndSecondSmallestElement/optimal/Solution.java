public class Solution {
    static private int getSecondLargest(int n, int []a) {
        if(n<2) return -1;
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            if (a[i] > large) {
                secondLarge = large;
                large = a[i]; 
            } else if (a[i] > secondLarge && a[i] != large) {
                secondLarge = a[i];
            }
        }
        return secondLarge;
    }
    static private int getSecondSmallest(int n, int []a) {
        if(n<2) return -1;
        int small = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            if (a[i] < small) {
                secondSmallest = small;
                small = a[i];
            } else if (a[i] < secondSmallest && a[i] != small) {
                secondSmallest = a[i];
            }
        }

        return secondSmallest;
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int[] result = new int[2]; 
        int secondLargest = getSecondLargest(n, a);
        int secondSmallest = getSecondSmallest(n, a);
        result[0] = secondLargest;
        result[1] = secondSmallest;
        return result;
    }
}