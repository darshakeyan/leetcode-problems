package patterns.easy;

public class SimpleInvertedStarTriangle {
    public static void main(String[] args) {
        int numberOfRows = 5;
        for (int i=1; i<=numberOfRows; i++) {
        // j starts from 1 and printing in decending order 5 to 1
          for (int j=1; j<=numberOfRows - i + 1; j++) {
            System.out.print("*");
          }
          System.out.println();
        }
    }
}

