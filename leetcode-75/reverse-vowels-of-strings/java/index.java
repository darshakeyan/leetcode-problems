class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] arrayOfValue = s.toCharArray();
        int i, j;
        i = 0;
        j = arrayOfValue.length - 1;

        while (i < j) {

            while (i < j && vowels.indexOf(arrayOfValue[i]) == -1) {
                i++;
            }

            while (i < j && vowels.indexOf(arrayOfValue[j]) == -1) {
                j--;
            }

            char temp = arrayOfValue[i];
            arrayOfValue[i] = arrayOfValue[j];
            arrayOfValue[j] = temp;
            i++;
            j--;
        }
        String result = new String(arrayOfValue);
        return result;
    }
}