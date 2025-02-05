package patterns.medium;

public class HollowNumberPyramid {
    public static void main(String[] args) {
      System.out.println("---- Number Pyramid ----");
      int rows = 5;
      for (int i=1; i<=rows;i++) {
        for (int j=1; j<=rows - i; j++) {
          System.out.print(' ');
        }
        for (int j=1; j<=i; j++) {
          // Print the number for the first or last position, or the last row
          if (j == 1 || j == i || i == rows) {
            System.out.print(j);
          } else {
            System.out.print(" ");
          }
           // Add a space after every number except the last one in the row
          if (j != i) {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
      
  }
 
}
