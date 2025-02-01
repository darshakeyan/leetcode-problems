package math.PrintAllDivisors;




import java.util.*;  

public class Solution{
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer> result = new ArrayList<Integer>();
        for (int i=1; i*i <= n; i++) {
            if (n%i == 0) {
                result.add(i);
                if ((n/i) != i) {
                    result.add(n/i);
                }
            }
        }  
        Collections.sort(result);
        return result;
    }
}