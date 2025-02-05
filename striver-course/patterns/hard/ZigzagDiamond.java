package patterns.hard;

public class ZigzagDiamond {
    public static void main(String[] args) {
        int rows = 15;
        int num = 1;
        for (int i=1; i<=rows; i++) {
          for(int j=1; j<=rows-i; j++) {
            System.out.print(' ');
          }
          for(int j=1; j<=(2*i)-1;j++) {
            if (j==1) {
              System.out.print("1");
            } else if (j == (2*i)-1) {
              System.out.print(num);
            } else {
              System.out.print(" ");
            }
          }
          num++;
          System.out.println();
        }
        num = rows - 1;
        for (int i=1; i<rows; i++) {
          for (int j=1; j<=i; j++) {
            System.out.print(' ');
          }
          for (int j=1; j<=(2*(rows-i)-1); j++) {
            if (j == 1) {
              System.out.print("1");
            } else if (j == (2 * (rows - i) - 1)) {
              System.out.print(num); 
            } else {
              System.out.print(" ");
            }
          }
          num--;
          System.out.println();
        }
      }
}
