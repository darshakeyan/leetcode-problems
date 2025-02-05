package patterns.easy;

public class DiamondStars {
    public static void main(String[] args) {
        int rows = 5;
        // upper pyramid
        for (int i=1; i<=rows; i++) { // this loop controls the rows
          for (int j=1; j<=rows-i; j++) { // this loop controls the rows space
            System.out.print(" ");
          }
          for (int k=1; k <=(i*2)-1; k++) {
            if(k % 2 == 0) {
              System.out.print(" ");
            } else {
              System.out.print("*");
            }
          }
          System.out.println();
        }
        
        // lower pyramid
        for (int i=1; i<rows; i++) {
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
