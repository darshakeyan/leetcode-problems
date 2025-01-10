class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxOfCandies = findMaxOfArray(candies);
        for (int i = 0; i<candies.length; i++) {
            if (candies[i] + extraCandies >= maxOfCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    private static int findMaxOfArray(int[] array) {
        int max = array[0];
        for (int i=1; i<array.length;i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}