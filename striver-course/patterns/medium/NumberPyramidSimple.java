package patterns.medium;

public class NumberPyramidSimple {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int rows = 5;
        for (int i=1; i<=rows; i++) {
          for (int j=1; j<=rows - i; j++) {
            System.out.print(' ');
          }
          for (int j=1; j<=i; j++) {
            System.out.print(j + " ");
          }
          for (int j=1; j<=rows - i; j++) {
            System.out.print(' ');
          }
          System.out.println();
        }
    }
}
