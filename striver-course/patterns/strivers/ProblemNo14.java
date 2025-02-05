package patterns.strivers;

public class ProblemNo14 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i=1; i<=rows; i++) {
          for (char ch='A'; ch < 'A' + i ; ch++) {
            System.out.print(ch + " ");
          }
          System.out.println();
        }
       
    } 
}

/*
 
Output:

A 
A B 
A B C 
A B C D 
A B C D E 

 */