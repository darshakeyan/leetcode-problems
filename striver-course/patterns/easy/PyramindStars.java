package patterns.easy;

public class PyramindStars {
    public static void main(String[] args) {
        int numberOfRows = 5;
        for (int i=1; i<=numberOfRows; i++) {
          // spacing component
          for (int j=1; j<=numberOfRows - i; j++) {
            System.out.print(' ');
          }
          // displaying * component
          for (int j=0; j<= (2*i)-1;j++) {
            if (j % 2 == 0) {
              System.out.print(' ');
            } else {
              System.out.print('*');
            }
          }
          // spacing last component 
          for (int j=1; j<=numberOfRows - i; j++) {
            System.out.print(' ');
          }
          System.out.println();
        }
    }
}
