package patterns.strivers;

public class ProblemNo21 {
    public static void main(String[] args) {
        int rows = 4;
        for (int i=1; i<=rows; i++) {
          for (int j=1; j<=rows; j++) {
            if (j==1 || i==1 || i==rows || j == rows) {
              System.out.print("* ");
            } else {
              System.out.print("  ");
            }
          }
          System.out.println();
          System.out.println();
        }
     }
}


/* 

Output:

* * * * 

*     * 

*     * 

* * * * 

*/