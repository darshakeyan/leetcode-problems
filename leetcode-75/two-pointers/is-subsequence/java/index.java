class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean isSequence = true;
        for (int i=0; i<s.length();i++) {
            int index = t.indexOf(s.charAt(i));
            if (index != -1) {
                t = t.substring(index + 1);
            } else {
               isSequence = false;
            }
        }
        return isSequence;
    }
}