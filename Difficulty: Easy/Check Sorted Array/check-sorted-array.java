class Solution {
    public boolean isSorted(int[] arr) {
        // Start from index 1 and compare with the previous element
        for (int i = 1; i < arr.length; i++) {
            
            // If any element is smaller than the one before it, it's not sorted
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        
        // If we check the whole array and find no issues, it is sorted
        return true;
    }
}