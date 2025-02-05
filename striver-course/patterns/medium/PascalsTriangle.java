package patterns.medium;

public class PascalsTriangle {
     public static void main(String[] args) {
      int rows = 5;
      for (int i=0; i<rows; i++) {
        for (int j=0; j< rows - i - 1; j++) {
          System.out.print(" ");
        }
        
        for (int j=0; j<=i; j++) {
          System.out.print(binomialCoefficient(i, j) + " ");
        }
        
        System.out.println();
      }
    }
    // Helper method to calculate binomial coefficient (nCr)
    private static int binomialCoefficient(int n, int r) {
        int result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1);
        }
        return result;
    }
}
