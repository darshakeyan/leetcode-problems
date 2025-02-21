class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1)) {
            return "";
        }
        int gcd = gcd(str1.length(), str2.length());
        System.out.println(gcd);
        return str2.substring(0, gcd);
    }

    // create greatest common factor function by using math concepts Euclidean algorithm
    private int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p%q);
    }
}