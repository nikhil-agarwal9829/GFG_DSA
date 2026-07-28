class Solution {
    static int largestPrimeFactor(int n) {
        int maxPrime = -1;

        // Step 1: Remove all factors of 2
        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }

        // Step 2: Remove all odd prime factors up to the square root of the remaining n
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i; // Shrink n to remove this prime factor completely
            }
        }

        // Step 3: If n is still greater than 2, the remaining n itself is a prime!
        if (n > 2) {
            maxPrime = n;
        }

        return maxPrime;
    }
}