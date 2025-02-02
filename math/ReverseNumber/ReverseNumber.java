package math.ReverseNumber;

public class ReverseNumber {
    public static long reverseNumber(long n) {
		// Write your code here
		long reverse = 0;
		while (n > 0) {
			long lastDigit = n % 10;
			reverse = (reverse*10) + lastDigit;
			n /= 10;
		}
		return reverse;
	}
}




