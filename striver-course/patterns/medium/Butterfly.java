package patterns.medium;

public class Butterfly {
    public static void main(String[] args) {
        System.out.println("---- Butterfly Pattern ----");
        int rows = 5; 
        for (int i=1; i<=rows; i++) {
          for (int j=1; j<=i; j++) {
            System.out.print('*');
          }
          for (int j=1; j<=2*(rows-i); j++) {
            System.out.print(' ');
          }
          for (int j=1; j<=i; j++) {
            System.out.print('*');
          }
          System.out.println();
        }
        
        for (int i=1; i<rows; i++) {
          for (int j=1; j<=rows-i; j++) {
            System.out.print('*');
          }
          for (int j=1; j<=2*i; j++) {
            System.out.print(' ');
          }
          for (int j=1; j<=rows-i; j++) {
            System.out.print('*');
          }
          System.out.println();
        }
    }
}
