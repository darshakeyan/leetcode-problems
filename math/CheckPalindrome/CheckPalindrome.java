package math.CheckPalindrome;

public class CheckPalindrome {
    
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int reverse = 0;
        int dup = n;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse*10)+lastDigit;
            n = n / 10;
        }
        if (dup == reverse) {
            return true;
        }
        return false;
    }
}