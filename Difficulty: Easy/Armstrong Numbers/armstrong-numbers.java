class Solution {
    static boolean armstrongNumber(int n) {
    
        // Negative numbers are not Armstrong numbers
        if (n < 0) {
            return false;
        }

        int original = n;
        int temp = n;
        int numDigits = 0;


        while (temp > 0) {
            numDigits++;
            temp /= 10;
        }

        temp = original;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        return sum == original;
    }
}
