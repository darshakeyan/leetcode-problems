package math.CountNumberOfDigits;

public class CountNumberOfDigits {
    public static int numberOfDigit(int n) {
        int count = 0;
        while (n > 0) {
          count++;
          n = n / 10;
        }
        return count;
      }
      public static void main(String[] args) {
        System.out.println(numberOfDigit(7789545));
    }
}


/*

 Time Complexity 

 O(n) - Iternation will run n times
 
 */