package patterns.strivers;

public class ProblemNo5 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i=1; i<=rows; i++) {
          for (int j=rows; j >= i ; j--) {
            System.out.print("* ");
          }
          System.out.println();
        }
    }
}

/* 

Output:

* * * * * 
* * * * 
* * * 
* * 
*  

*/