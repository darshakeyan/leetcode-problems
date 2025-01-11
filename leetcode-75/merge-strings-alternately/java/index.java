class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergeResult = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                mergeResult.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                mergeResult.append(word2.charAt(i));
            }
            i++;
        }
        return mergeResult.toString();
    }
}


class Solution {
    public String mergeAlternately(String word1, String word2) {
        // Converting string to char of array 
        char[] word1Array = word1.toCharArray(); // [a, b, c]
        char[] word2Array = word2.toCharArray(); // [p, q, r]

        // Char array to store the merge string (Size should be summation of both string)
        char[] mergedArray = new char[word1Array.length + word2Array.length];

        int p1 = 0; // starting point of word1 array 
        int p2 = 0; // starting point of word2 array
        int i = 0; // staring point of merged array

        while (p1 < word1Array.length || p2 < word2Array.length) {
            if (p1 < word1Array.length) {
                mergedArray[i] = word1Array[p1];
                p1++;
                i++;
            }
            if (p2 < word2Array.length) {
                mergedArray[i] = word2Array[p2];
                p2++;
                i++;
            }
        }
        return new String(mergedArray);
    }
}