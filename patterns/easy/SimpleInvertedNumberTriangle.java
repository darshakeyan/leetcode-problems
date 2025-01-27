package patterns.easy;

public class SimpleInvertedNumberTriangle {
    public static void main(String[] args) {
        int numberOfRows = 5;
        for (int i=1; i<=numberOfRows; i++) {
          for (int j=1; j<=numberOfRows - i + 1; j++) {
            System.out.print(j); // just change to j to print number
          }
          System.out.println();
        }
    }
}
