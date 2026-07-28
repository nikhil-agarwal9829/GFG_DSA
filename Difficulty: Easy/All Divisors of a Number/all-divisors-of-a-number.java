import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> firstHalf = new ArrayList<>();
        ArrayList<Integer> secondHalf = new ArrayList<>();
        
        // Loop only up to the square root of n
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                firstHalf.add(i); // Add the smaller divisor
                
                // Add the paired larger divisor, but avoid duplicates (like when n=36 and i=6)
                if (i != n / i) {
                    secondHalf.add(n / i);
                }
            }
        }
        
        // Add the second half in reverse order so everything remains perfectly sorted
        for (int i = secondHalf.size() - 1; i >= 0; i--) {
            firstHalf.add(secondHalf.get(i));
        }
        
        return firstHalf;
    }
}