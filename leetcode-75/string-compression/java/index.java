class Solution {
    public int compress(char[] chars) {
        int i = 1;
        int j = 0;
        int count = 1;

        for (i = 1; i <= chars.length; i++) {
             if (i == chars.length || chars[i] != chars[i - 1]) {
                chars[j++] = chars[i - 1];
                if (count >= 2) {
                    for (char digit : Integer.toString(count).toCharArray() ) {
                        chars[j++] = digit;
                    }
                }
                count = 0;
            }
            count++;
        }
        return j;
    }
}