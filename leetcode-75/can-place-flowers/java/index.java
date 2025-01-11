class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        int valid = 0;
        for (int i=0; i< length ; i = i+2) {
            if (flowerbed[i]==0) {
                if (i == length -1 || flowerbed[i+1]==0) {
                    valid++;
                } else {
                    i++;
                }
            }
        }
        return valid >= n;
    }
}

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && 
                (i == 0 || flowerbed[i-1] == 0) && 
                (i == flowerbed.length-1 || flowerbed[i+1] == 0))
            {
                count++;
                i++;
            }
            if (count >= n) {
                return true;
            }
            i++;
        }
        return false;
    }
}