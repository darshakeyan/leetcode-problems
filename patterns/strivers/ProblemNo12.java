package patterns.strivers;

public class ProblemNo12 {
    public static void main(String[] args) {
        int rows = 4;
        for (int i=1; i<=rows; i++) {
          for (int j=1; j<=i;j++) {
            System.out.print(j);
          }
          for (int j=1; j<=(rows-i)*2; j++) {
            System.out.print(' ');
          }
          for (int j=i; j>0 ;j--) {
            System.out.print(j);
          }
          System.out.println();
        }
    }
}

/*

1      1
12    21
123  321
12344321

 */
