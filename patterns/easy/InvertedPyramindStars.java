package patterns.easy;

public class InvertedPyramindStars {
    public static void main(String[] args) {
        int rows = 5;
        // lower pyramid
        for (int i=0; i<rows; i++) {
          for (int j=1; j<=i; j++) {
            System.out.print(" ");
          }
          for (int j = 1; j <= 2 * (rows - i) - 1; j++) { 
            if(j % 2 == 0) {
              System.out.print(" ");
            } else {
              System.out.print("*");
            }
          }
          System.out.println();
        }
        
    }
}
