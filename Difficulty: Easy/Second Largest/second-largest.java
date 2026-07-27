class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] > largest) {
                // The current largest gets pushed down to second largest
                secondLargest = largest;
                largest = arr[i];
                
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                // We found a new second largest
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
    }
}
