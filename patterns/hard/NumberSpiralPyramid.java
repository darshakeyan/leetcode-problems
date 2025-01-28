package patterns.hard;

public class NumberSpiralPyramid {
    public static void main(String[] args) {
        int rows = 10;
        for (int i=1; i<=rows; i++) {
          for (int j=1; j<=rows-i; j++) {
            System.out.print(" ");
          }
          for (int j=1; j<=(2*i)-1; j++) {
            if (j==1 || j == (2*i)-1) {
              System.out.print("1");
            } else {
              int num = Math.min(j, (2 * i - 1) - j + 1);
              System.out.print(num);
            }
            
            // if (j==1 || j == (2*i)-1) {
            //   System.out.print("1");
            // } else if (j==2 || j== (2*i)-2) {
            //   System.out.print("2");
            // } else if (j==3 || j== (2*i)-3) {
            //   System.out.print("3");
            // } else if (j==4 || j== (2*i)-4) {
            //   System.out.print("4");
            // } else if (j==5 || j== (2*i)-5) {
            //   System.out.print("5");
            // } else {
            //   System.out.print("*");
            // }
          }
          for (int j=1; j<=rows-i; j++) {
            System.out.print(" ");
          }
          System.out.println();
        }
      }
}
