package patterns.easy;

public class SimpleStarTriangle {
    public static void main(String[] args) {
      // optimised solution 
      int n = 5;
      for (int i=0; i<=n; i++) {
        System.out.println("* ".repeat(i));
      }
    }
    public void loopSolution() {
        for (int i=0; i<=5; i++) {
          for (int j=0 ; j<i ; j++) {
            System.out.print("*");
          }
          System.out.println();
        }
    }
}
