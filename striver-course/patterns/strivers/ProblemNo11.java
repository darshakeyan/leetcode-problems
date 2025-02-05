package patterns.strivers;

public class ProblemNo11 {
    public static void main(String[] args) {
        int rows = 5;
        int start = 1;
        for (int i=0; i<rows; i++) {
          if (i % 2 == 0) start = 1;
          else start = 0;
          for (int j = 0; j<=i; j++) {
            System.out.print(start);
            start = 1 - start;
          }
          System.out.println();
        }
    }
}


/*

Output:

1
01
101
0101
10101

 */