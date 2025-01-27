package patterns.medium;

public class HollowDiamond {
    public static void main(String[] args) {
        int rows = 5;
        // upper pyramind
        for (int i=1; i<=rows; i++) {
          // spacing component 
          for (int j=1; j<=rows - i; j++) {
            System.out.print(' ');
          }
          // printing stars
          for (int j=1; j<= (2*i)-1;j++) {
            if (j == 1) {
              System.out.print('*');
            } else if (j == (2 * i) - 1) {
              System.out.print('*');
            } else {
              System.out.print(' ');
            }
          }
          // spacing component 
          for (int j=1; j<=rows - i; j++) {
            System.out.print(' ');
          }
          System.out.println();
        }
        
        for (int i=1; i<rows; i++) {
          // spacing component
          for (int j=1; j<=i; j++) {
            System.out.print(' ');
          }
          for (int j=1; j<= 2 * (rows - i) - 1; j++) {
            if (j == 1) {
              System.out.print('*');
            } else if (j == 2 * (rows - i) - 1) {
              System.out.print('*');
            } else {
              System.out.print(' ');
            }          }
          // spacing component
          for (int j=1; j<=i; j++) {
            System.out.print(' ');
          }
          System.out.println();
        } 
    } 
}
