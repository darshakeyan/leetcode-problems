package patterns.strivers;

public class ProblemNo8 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i=0; i<rows; i++) {
          for (int j=1; j<=i; j++) {
            System.out.print(' ');
          }
          for (int j=1; j<= (2*(rows-i)-1);j++) {
            System.out.print("*");
          }
          System.out.println();
        }
    }
}


/*

 Output:

*********
 *******
  *****
   ***
    *
    
 */