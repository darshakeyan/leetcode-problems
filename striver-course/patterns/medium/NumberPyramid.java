package patterns.medium;

public class NumberPyramid {
    public static void main(String[] args) {
        System.out.println("---- Number Pyramid ----");
        int rows = 5;
        for (int i=1; i<=rows;i++) {
          for (int j=1; j<=rows - i; j++) {
            System.out.print(' ');
          }
          for (int j=1; j<= (2*i) - 1; j++) {
            if (j % 2 == 0) {
              System.out.print(' ');
            } else {
              if (j==3) {
                System.out.print('2');
              } else if (j==5) {
                System.out.print('3');
              } else if (j==7) {
                System.out.print('4');
              } else if (j==9) {
                System.out.print('5');
              } else {
                System.out.print(j);
              }
            }
          }
          System.out.println();
        }
    }
}
