package math.SumOfAllDivisors;

public class Solution {
    // helper function to calculate the sum of divison for a single number
    public static int sumOfDivisors(int n) {
      if (n <= 0) return 0;
      int sum = 0;
      for (int i=1; i*i <= n; i++) {
          if (n%i == 0) {
              if (i == (n/i)) {
                  sum += i;
              } else {
                  sum += i + (n/i);
              }
          }
      }
      return sum;
    }
    public static int sumOfAllDivisors(int n){
     int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += sumOfDivisors(i);
        }
        return totalSum;
    }
}
