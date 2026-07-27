class Solution {
    public static boolean isPalinArray(int[] arr) {
        // Loop through each number in the array
        for (int i = 0; i < arr.length; i++) {
            
            // If even one number is NOT a palindrome, return false immediately
            if (!isPalindrome(arr[i])) {
                return false; 
            }
        }
    
        return true;
    }
    
    // Helper method: The math logic to check a single number
    private static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes (e.g., -121 reversed is 121-)
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}