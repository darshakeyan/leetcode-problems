package patterns.master;

public class MatrixDiagonals {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int rows = 10;
        for (int i=1; i<=rows; i++) {
          for (int j=1; j<=rows; j++) {
            if (i==j) {
              System.out.print("1 ");
            } else {
              System.out.print("0 ");
            }
          }
          System.out.println();
        }
    }
}
