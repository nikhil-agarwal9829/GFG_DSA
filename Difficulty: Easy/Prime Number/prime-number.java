class Solution {
    static boolean isPrime(int n) {
        // Edge case: 0, 1, and negative numbers are never prime
        if (n <= 1) {
            return false;
        }
        
        // Loop from 2 up to the square root of n
        for (int i = 2; i * i <= n; i++) {
            
            // If n is evenly divisible by i, it has a factor. It is NOT prime.
            if (n % i == 0) {
                return false;
            }
        }
        
        // If we checked all the way up to the square root and found no factors, it IS prime.
        return true;
    }
}