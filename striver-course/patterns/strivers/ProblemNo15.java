package patterns.strivers;

public class ProblemNo15 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i=1; i<=rows; i++) {
          for (char ch='A'; ch <= 'A' + (rows-i) ; ch++) {
            System.out.print(ch + " ");
          }
          System.out.println();
        }
    }
}


/*

Output:

A B C D E 
A B C D 
A B C 
A B 
A 

 */