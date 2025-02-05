package patterns.strivers;

public class ProblemNo6 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i=0; i<rows; i++) {
          for (int j=1; j <= rows - i ; j++) {
            System.out.print(j);
          }
          System.out.println();
        }
    }
}

/*

Output:

12345
1234
123
12
1

 */
