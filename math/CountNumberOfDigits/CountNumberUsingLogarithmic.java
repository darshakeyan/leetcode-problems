package math.CountNumberOfDigits;
import java.util.*;


public class CountNumberUsingLogarithmic {
    public static int countDigit(int n) {
        int count = (int) Math.log10(n) + 1;
        return count;
    }
    public static void main(String[] str) {
        System.out.print(countDigit(7789));
    }
}
